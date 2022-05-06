package lab1.abstractFabric;

import lab1.Iterator.Collection;
import lab1.Iterator.Iterator;
import lab1.modal.junior.Junior;
import lab1.modal.middle.Middle;
import lab1.modal.senior.Senior;

import java.util.ArrayList;
import java.util.List;

public class LabWorkTeamFactory implements Collection, ProjectTeamFactory {

    private static volatile ProjectTeamFactory instance;
    private List<Junior> juniorList;
    private List<Middle> middleList;
    private List<Senior> seniorList;

    private String[] tasks = new String[3];


    public static ProjectTeamFactory getInstance() {
        if (instance == null) {
            synchronized (ProjectTeamFactory.class) {
                if (instance == null) {
                    instance = new LabWorkTeamFactory();
                }
            }
        }
        return instance;
    }

    private LabWorkTeamFactory() {
        juniorList = new ArrayList<>();
        middleList = new ArrayList<>();
        seniorList = new ArrayList<>();
    }

    public List<Junior> getJuniorList() {
        return juniorList;
    }

    public void setJuniorList(List<Junior> juniorList) {
        this.juniorList = juniorList;
    }

    public List<Middle> getMiddleList() {
        return middleList;
    }

    public void setMiddleList(List<Middle> middleList) {
        this.middleList = middleList;
    }

    public List<Senior> getSeniorList() {
        return seniorList;
    }

    public void setSeniorList(List<Senior> seniorList) {
        this.seniorList = seniorList;
    }

    @Override
    public String toString() {
        return "LabWorkTeamFactory{" +
                "juniorList=" + juniorList +
                ", middleList=" + middleList +
                ", seniorList=" + seniorList +
                '}';
    }

    @Override
    public void addJunior(Junior junior) {
        juniorList.add(junior);
    }

    @Override
    public void addMiddle(Middle middle) {
        middleList.add(middle);
    }

    @Override
    public void addSenior(Senior senior) {
        seniorList.add(senior);
    }

    @Override
    public void setArray(String[] array) {
        this.tasks = array;
    }

    @Override
    public List<Junior> getJuniors() {
        return juniorList;
    }

    @Override
    public List<Middle> getMiddles() {
        return middleList;
    }

    @Override
    public List<Senior> getSenior() {
        return seniorList;
    }

    @Override
    public Iterator getIterator() {
        return new TasksIterator();
    }

    private class TasksIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
