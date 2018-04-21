package java8;

public class People {

    public String Ename;
    public String Eno;
    public String City;

    @Override
    public String toString() {
        return "People{" +
                "Ename='" + Ename + '\'' +
                ", Eno='" + Eno + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public People(String ename, String eno, String city) {
        Ename = ename;
        Eno = eno;
        City = city;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEno() {
        return Eno;
    }

    public void setEno(String eno) {
        Eno = eno;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
