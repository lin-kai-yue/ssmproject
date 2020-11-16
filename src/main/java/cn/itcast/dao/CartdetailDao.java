package cn.itcast.dao;

import cn.itcast.domain.Account;
import cn.itcast.domain.Cart;
import cn.itcast.domain.Cartcount;
import cn.itcast.domain.Cartdetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartdetailDao {

    @Select("select * from cartdetail where uid = #{uid} and goodsid=#{goodsid}")
    public Cartdetail findby(Cartdetail cartdetail);

    //添加购物车
    @Insert("INSERT INTO cartdetail(uid,goodsid,num,money) VALUES (#{uid},#{goodsid},#{num},#{money})")
    public int savecart(Cartdetail cartdetail);

    //添加购物车（有此物品在购物车内时）
    @Update("update cartdetail set num=${num},money=${money} where goodsid=#{goodsid} and uid=#{uid}")
    public int updateDetail(Cartdetail cartdetail);

    //查询购物车物品
    @Select("SELECT g.*,c.uid,c.num,c.money FROM goods g join cartdetail c on c.goodsid=g.goodsid WHERE uid=#{uid}")
    @ResultType(Cart.class)
    public List<Cart> findcart(int uid);

    @Select("SELECT uid,count(id),SUM(money) FROM cartdetail WHERE uid=#{uid}")
    @ResultType(Cartcount.class)
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "countid", column = "count(id)"),
            @Result(property = "summoney", column = "SUM(money)")
    })
    public Cartcount countcart(int uid);

    @Delete("delete from  cartdetail where uid=#{uid} and goodsid=#{goodsid}")
    public int deltegood(@Param("uid") int uid,@Param("goodsid") int goodsid);

    @Delete("delete from  cartdetail where  goodsid=#{goodsid}")
    public int deltegoods(@Param("goodsid") int goodsid);

}
