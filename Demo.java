public class Demo{
    
    public static void main(String[] args)
    {
        Car bmw =new Car();
        Car audi=new Car();
        Car honda=new Car();
        
        bmw.model="A class";
        bmw.color="Black";
        bmw.cost="3000000";
        bmw.milage=12;
        
        audi.model="Q3";
        audi.color="Blue";
        audi.cost="4000000";
        audi.milage=15;
        
         honda.model="Amaze";
         honda.color="Red";
         honda.cost="1000000";
         honda.milage=22;
         
         bmw.startCar();
         bmw.stopCar();
         bmw.carDetails();
         
          audi.startCar();
          audi.stopCar();
          audi.carDetails();
         
           honda.startCar();
           honda.stopCar();
           honda.carDetails();
         
        
        
    }
}
