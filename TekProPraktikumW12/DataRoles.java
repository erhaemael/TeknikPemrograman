class DataRoles {
	public static void main(String[] args) {
        EngineerRoles EngRole = new EngineerRoles();
        ResearcherRoles ResRole = new ResearcherRoles();

        EngRole.setRole("Data Oops");
        EngRole.getRole();
        try {
        EngRole.displayRoleDesc();
        }
        catch(AssertionError e) {
        	System.out.println(e.getMessage());
        }

        ResRole.setRole("Data Engineer");
        ResRole.getRole();
        try {
        ResRole.displayRoleDesc();
        }
        catch(AssertionError e) {
        	System.out.println(e.getMessage());
        }

        EngRole.setRole("Machine Learning Engineer");
        EngRole.getRole();
        try {
        EngRole.displayRoleDesc();
        }
        catch(AssertionError e) {
        	System.out.println(e.getMessage());
        }

        EngineerTools EngTools = new EngineerTools();
        EngTools.removeDataOpsTools();
        try {
        EngTools.displayDataOpsTools();
        }
        catch(AssertionError e) {
        	System.out.println(e.getMessage());
        }
    }
}
