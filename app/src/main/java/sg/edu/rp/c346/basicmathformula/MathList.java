package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17010336 on 17/7/2018.
 */

public class MathList {
    private String name;
    private String forumla;
    private String area;

    public MathList(String name, String forumla, String area) {
        this.name = name;
        this.forumla = forumla;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForumla() {
        return forumla;
    }

    public void setForumla(String forumla) {
        this.forumla = forumla;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FormulaName{" +
                "name='" + name + '\'' +
                ", forumla='" + forumla + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}