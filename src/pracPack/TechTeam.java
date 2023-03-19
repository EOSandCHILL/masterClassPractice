package pracPack;

public interface SoftwareEngineers {
    void employeeName();
}

class FrontEndEngineer implements SoftwareEngineers {
    @Override
    public void employeeName() {
        String[] names = {"Mark", "Tim", "Andrea"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Front End Engineer: " + names[i]);
        }
    }
}

class BackEndEngineer implements SoftwareEngineers {
    @Override
    public void employeeName() {
        String[] names = {"Duke", "KJ", "Summer"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Back End Engineer: " + names[i]);
        }
    }
}

class DevOpsEngineer implements SoftwareEngineers {
    @Override
    public void employeeName() {
        String[] names = {"Gina", "Nate", "Fred"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("DevOps Engineer: " + names[i]);
        }
    }
}


