package lab1.abstractFabric;

import lab1.Iterator.Collection;
import lab1.modal.junior.Junior;
import lab1.modal.middle.Middle;
import lab1.modal.senior.Senior;

import java.util.List;

public interface ProjectTeamFactory extends Collection {
    void addJunior(Junior junior);
    void addMiddle(Middle middle);
    void addSenior(Senior senior);
    void setArray(String[] array);
    List<Junior> getJuniors();
    List<Middle> getMiddles();
    List<Senior> getSenior();
}
