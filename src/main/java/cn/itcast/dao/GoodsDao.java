package cn.itcast.dao;

import cn.itcast.domain.Account;
import cn.itcast.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    // 查询所有商品信息
    @Select("select * from goods")
    public List<Goods> findAll();

    @Select("select * from goods where goodsid = #{goodsid}")
    public Goods findByid(int goodsid);

    @Select("SELECT * FROM goods WHERE type =#{type}")
    public List<Goods> findBytype(String type);

    @Select("SELECT * FROM goods WHERE goodsname like CONCAT('%',#{goodsname},'%') ")
    public List<Goods> likename(String goodsname);

    @Insert("INSERT INTO goods(goodsname,goodsprices,pictersrc,type,firmname) VALUES(#{goodsname},#{goodsprices},#{pictersrc},#{type},#{firmname})")
    public int addGoods(Goods goods);

    @Delete("delete from  goods where goodsid=#{goodsid}")
    public int deletegood(int goodsid);
}
