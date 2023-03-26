package pracPack;

public interface Headers {
    void header();
}

class FrontEndTeamHeader implements Headers {
    @Override
    public void header() {
        System.out.println(
                "----------------------------"
        );
        System.out.println("      Front End Team");
        System.out.println(
                "----------------------------"
        );
    }
}

class BackEndTeamHeader implements Headers {
    @Override
    public void header() {
        System.out.println(
                "----------------------------"
        );
        System.out.println("      Back End Team");
        System.out.println(
                "----------------------------"
        );
    }
}

class DevOpsTeamHeader implements Headers {
    @Override
    public void header() {
        System.out.println(
                "----------------------------"
        );
        System.out.println("      DevOps Team");
        System.out.println(
                "----------------------------"
        );
    }
}

class ManagementHeader implements Headers {
    @Override
    public void header() {
        System.out.println(
                "----------------------------"
        );
        System.out.println("      Management Team");
        System.out.println(
                "----------------------------"
        );
    }
}
