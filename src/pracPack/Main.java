package pracPack;

public class Main {
    public static void main(String[] args) {
        Headers management = new ManagementHeader();
        management.header();
        ProjectManager projectManager = new ProjectManager();
        projectManager.employeeName();
        AccountManager accountManager = new AccountManager();
        accountManager.employeeName();
        SoftwareManager softwareManager = new SoftwareManager();
        softwareManager.employeeName();
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
        APIDeveloper apiDeveloper = new APIDeveloper();
        apiDeveloper.employeeName();
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