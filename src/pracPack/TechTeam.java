package pracPack;

public interface TechTeam {
    void employeeName();
}

class UIUXDesigners implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Tina", "Tammy"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("UI/UX Designers: " + names[i]);
        }
    }
}

class FrontEndEngineer implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Mark", "Tim", "Andrea"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Front End Engineer: " + names[i]);
        }
    }
}

class BackEndEngineer implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Duke", "KJ", "Summer"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Back End Engineer: " + names[i]);
        }
    }
}

class DataEngineer implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Damion", "John"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Data Engineer: " + names[i]);
        }
    }
}

class DevOpsEngineer implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Gina", "Nate", "Fred"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("DevOps Engineer: " + names[i]);
        }
    }
}

class CloudEngineer implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Mike", "Jenny"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Cloud Engineer: " + names[i]);
        }
    }
}

class CloudArchitect implements TechTeam {
    @Override
    public void employeeName() {
        String[] names = {"Cindy"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Cloud Architect: " + names[i]);
        }
    }
}


