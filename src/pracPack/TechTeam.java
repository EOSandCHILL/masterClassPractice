package pracPack;

import java.util.ArrayList;

public interface TechTeam {
    void employeeName();
}

class UIUXDesigners implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Tina");
        names.add("Tommy");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("UI/UX Designers: " + names.get(i));
        }
    }
}

class FrontEndEngineer implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Mark");
        names.add("Tim");
        names.add("Andrea");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Front End Engineer: " + names.get(i));
        }
    }
}

class BackEndEngineer implements TechTeam {


    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Duke");
        names.add("KJ");
        names.add("Summer");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Back End Engineer: " + names.get(i));
        }
    }
}

class APIDeveloper implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Jamie");
        names.add("Becca");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("API Developer: " + names.get(i));
        }
    }
}

class DataEngineer implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Damion");
        names.add("John");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Data Engineer: " + names.get(i));
        }
    }
}

class DevOpsEngineer implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Gina");
        names.add("Nate");
        names.add("Fred");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("DevOps Engineer: " + names.get(i));
        }
    }
}

class CloudEngineer implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Mike");
        names.add("Jenny");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Cloud Engineer: " + names.get(i));
        }
    }
}

class CloudArchitect implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Cindy");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Cloud Architect: " + names.get(i));
        }
    }
}

class ProjectManager implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Marcus");
        names.add("Jacob");
        names.add("Cheryl");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Project Manager: " + names.get(i));
        }
    }
}

class AccountManager implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Jill");
        names.add("Samantha");
        names.add("Sarah");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Account Manager: " + names.get(i));
        }
    }
}

class SoftwareManager implements TechTeam {
    @Override
    public void employeeName() {
        ArrayList names = new ArrayList();
        names.add("Jerry");
        names.add("Mack");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Software Manager: " + names.get(i));
        }
    }
}


