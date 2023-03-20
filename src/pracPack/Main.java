package pracPack;

public class Main {
    public static void main(String[] args) {
        Headers frontendTeam = new FrontEndTeamHeader();
        frontendTeam.header();
        UIUXDesigners uiuxDesigners = new UIUXDesigners();
        uiuxDesigners.employeeName();
        FrontEndEngineer frontEndEngineers = new FrontEndEngineer();
        frontEndEngineers.employeeName();
        Headers backendTeam = new BackEndTeamHeader();
        backendTeam.header();
        BackEndEngineer backEndEngineers = new BackEndEngineer();
        backEndEngineers.employeeName();
        DataEngineer dataEngineers = new DataEngineer();
        dataEngineers.employeeName();
        Headers devopsTeam = new DevOpsTeamHeader();
        devopsTeam.header();
        DevOpsEngineer devOpsEngineers = new DevOpsEngineer();
        devOpsEngineers.employeeName();
        CloudEngineer cloudEngineer = new CloudEngineer();
        cloudEngineer.employeeName();
        CloudArchitect cloudArchitect = new CloudArchitect();
        cloudArchitect.employeeName();


    }
}