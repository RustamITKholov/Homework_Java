package ООП.HOMEWORKS.Homework_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flow programmers = new Flow();
        programmers.addStudentGroup(new StudentGroup("Testers"));
        programmers.addStudentGroup(new StudentGroup("Frontend Developers"));
        programmers.addStudentGroup(new StudentGroup("Backend Developers"));
        programmers.addStudentGroup(new StudentGroup("Web Designers"));

        Flow analysts = new Flow();
        analysts.addStudentGroup(new StudentGroup("Business Analysts"));
        analysts.addStudentGroup(new StudentGroup("Product Analysts"));
        analysts.addStudentGroup(new StudentGroup("Data Analysts"));

        Flow designers = new Flow();
        designers.addStudentGroup(new StudentGroup("Graphic Designers"));
        designers.addStudentGroup(new StudentGroup("UX/UI Designers"));

        List<Flow> flows = Arrays.asList(programmers, analysts, designers);

        System.out.println("До сортировки");
        for (Flow flow : flows) {
            System.out.println("Flow with " + flow.getGroupCount() + " groups: " + flow.getStudentGroups());
        }

        FlowService flowService = new FlowService();
        flowService.sortFlows(flows);

        System.out.println("После сортировки");
        for (Flow flow : flows) {
            System.out.println("Flow with " + flow.getGroupCount() + " groups: " + flow.getStudentGroups());
        }
    }
}
