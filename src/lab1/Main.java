package lab1;

import lab1.Iterator.Iterator;
import lab1.abstractFabric.CourseWorkTeamFactory;
import lab1.abstractFabric.LabWorkTeamFactory;
import lab1.abstractFabric.ProjectTeamFactory;
import lab1.modal.junior.CJunior;
import lab1.modal.junior.JavaJunior;
import lab1.modal.junior.Junior;
import lab1.modal.junior.RubyJunior;
import lab1.modal.middle.CppMiddle;
import lab1.modal.middle.JsMiddle;
import lab1.modal.middle.Middle;
import lab1.modal.senior.CppSenior;
import lab1.modal.senior.JavaSenior;
import lab1.modal.senior.Senior;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory labTeamFactory = LabWorkTeamFactory.getInstance();
        String[] tasks = {"Sprint", "Coding", "Break"};
        Junior java = new JavaJunior();
        Junior ruby = new RubyJunior();
        Middle mJs = new JsMiddle();
        Middle mCpp = new CppMiddle();

        labTeamFactory.setArray(tasks);
        labTeamFactory.addJunior(java);
        labTeamFactory.addJunior(ruby);
        labTeamFactory.addMiddle(mJs);
        labTeamFactory.addMiddle(mCpp);


        Iterator taskIterator = labTeamFactory.getIterator();

        System.out.println(
                "---------------------------------LAB WORK TEAM----------------------------------------------");
        while (taskIterator.hasNext()) {
            System.out.println("Today tasks: " + taskIterator.next());
        }
        for (Junior junior : labTeamFactory.getJuniors()) {
            System.out.println("-------------------------------------------------------");
            junior.writeCode();
            junior.codeRefactor();
            junior.consultation();
        }
        for (Middle middle : labTeamFactory.getMiddles()) {
            System.out.println("-------------------------------------------------------");
            middle.helpJunior();
            middle.resolveException();
            middle.createPlan();
        }
        ProjectTeamFactory courseWorkTeamFactory = CourseWorkTeamFactory.getInstance();
        String[] news = {"good", "bad", "50/50"};
        Middle jsMiddle = new JsMiddle();
        Junior cJunior = new CJunior();
        Senior javaSenior = new JavaSenior();
        Senior cppSenior = new CppSenior();

        courseWorkTeamFactory.setArray(news);
        courseWorkTeamFactory.addMiddle(jsMiddle);
        courseWorkTeamFactory.addJunior(cJunior);
        courseWorkTeamFactory.addSenior(javaSenior);
        courseWorkTeamFactory.addSenior(cppSenior);


        Iterator newsIterator = courseWorkTeamFactory.getIterator();

        System.out.println(
                "---------------------------------COURSE WORK TEAM----------------------------------------------");
        while (newsIterator.hasNext()) {
            System.out.println("Today news: " + newsIterator.next());
        }

        for (Junior junior : courseWorkTeamFactory.getJuniors()) {
            System.out.println("-------------------------------------------------------");
            junior.writeCode();
            junior.codeRefactor();
            junior.consultation();
        }
        for (Middle middle : courseWorkTeamFactory.getMiddles()) {
            System.out.println("-------------------------------------------------------");
            middle.helpJunior();
            middle.resolveException();
            middle.createPlan();
        }
        for (Senior senior : courseWorkTeamFactory.getSenior()) {
            System.out.println("-------------------------------------------------------");
            senior.talkWithBoss();
            senior.talkWithCustomer();
            senior.approvePR();
        }
    }
}
