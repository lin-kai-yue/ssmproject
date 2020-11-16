package cn.itcast.domain;

public class Cartcount {
    private  Integer uid;
    private  Integer countid;
    private  double summoney;

    public Integer getUid() {
        return uid;
    }

    public Integer getCountid() {
        return countid;
    }

    public double getSummoney() {
        return summoney;
    }

    @Override
    public String toString() {
        return "Cartcount{" +
                "uid=" + uid +
                ", countid=" + countid +
                ", summoney=" + summoney +
                '}';
    }
}
