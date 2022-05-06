package lab1.abstractFabric;

import lab1.Iterator.Iterator;
import lab1.modal.junior.Junior;
import lab1.modal.middle.Middle;
import lab1.modal.senior.Senior;

import java.util.ArrayList;
import java.util.List;

public class CourseWorkTeamFactory implements ProjectTeamFactory {

    private List<Junior> juniorList;
    private List<Middle> middleList;
    private List<Senior> seniorList;

    private String[] news = new String[3];

    private volatile static  ProjectTeamFactory instance;

    public static ProjectTeamFactory getInstance() {
        if (instance == null) {
            synchronized (ProjectTeamFactory.class) {
                if (instance == null) {
                    instance = new CourseWorkTeamFactory();
                }
            }
        }
        return instance;
    }

    private CourseWorkTeamFactory() {
        juniorList = new ArrayList<>();
        middleList = new ArrayList<>();
        seniorList = new ArrayList<>();
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
        this.news = array;
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
        return new NewsIterator();
    }

    private class NewsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < news.length;
        }

        @Override
        public Object next() {
            return news[index++];
        }
    }
}
