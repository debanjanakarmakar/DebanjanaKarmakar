package houseContructionCost;


public class MainClass {

    public static void main(String[] args) {
    	
        try {
    	View viewObject=new View();
        
        ConstructionCost c=new ConstructionCost(viewObject);
        viewObject.setVisible(true);
       // System.out.println("COnscost");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

}
