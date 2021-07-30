package DesignPatterns;

interface IDistributor {

    void ShipBook();
}

//concrete product
class EastCoastDistributor implements IDistributor {

    @Override
    public void ShipBook() {
        System.out.println("Book shipped from East Coast.");
    }
}

//concrete product
class MidWestDistributor implements IDistributor {

    @Override
    public void ShipBook() {
        System.out.println("Book shipped from Mid West.");
    }
}

//concrete product
class WestCoastDistributor implements IDistributor {

    @Override
    public void ShipBook() {
        System.out.println("Book shipped from West Coast.");
    }
}

//concrete product
class NorthWestDistributor implements IDistributor {

    @Override
    public void ShipBook() {
        System.out.println("Book shipped from North West.");
    }
}

//concrete product
class MidEastDistributor implements IDistributor {

    @Override
    public void ShipBook() {
        System.out.println("Book shipped from Mid East.");
    }
}

class BookFactory {
    //use getBookDistributor method to get object of type BookDistributor
    public static IDistributor getBookDistributor(String disType){
        if(disType == null){
            return null;
        }
        if(disType.equalsIgnoreCase("EastCoast")){
            return new EastCoastDistributor();
        } else if(disType.equalsIgnoreCase("MidWest")){
            return new MidWestDistributor();
        } else if(disType.equalsIgnoreCase("WestCoast")){
            return new WestCoastDistributor ();
        }else if (disType.equalsIgnoreCase("NorthWest")) {
            return new NorthWestDistributor();
        } else if (disType.equalsIgnoreCase("MidEast")) {
            return new MidEastDistributor();
        }
        return null;
    }

public static class BookDistributorManager {
    private static void getBook(String disType){
        IDistributor dis= BookFactory.getBookDistributor (disType);
        dis.ShipBook();
    }
    public static void main(String args[]){
        BookDistributorManager.getBook("WestCoast");
    }
}
//    public class BookDistributorManager {
//    private static void getBook(String disType) {
//
//        IDistributor dis = null;
//
//        if (disType.equalsIgnoreCase("EastCoast")) {
//            dis = new EastCoastDistributor();
//
//        } else if (disType.equalsIgnoreCase("MidWest")) {
//            dis = new MidWestDistributor();
//
//        } else if (disType.equalsIgnoreCase("WestCoast")) {
//            dis = new WestCoastDistributor();
//        } else if (disType.equalsIgnoreCase("NorthWest")) {
//            dis = new NorthWestDistributor();
//        } else if (disType.equalsIgnoreCase("MidEast")) {
//            dis = new MidEastDistributor();
//        }
//        if (dis !=null){
//            dis.ShipBook();
//        }
//    }
//
//    public static void main(String args[]) {
//        BookDistributorManager.getBook("EastCoast");
//        BookDistributorManager.getBook("MidWest");
//        BookDistributorManager.getBook("WestCoast");
//        BookDistributorManager.getBook("NorthWest");
//        BookDistributorManager.getBook("MidEast");
//    }
}

