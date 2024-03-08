public class App{
    private String country = "USA";
    private String Nationalanthem = "The star-spangled banner";
    private String touristspot = "New york";

    public String getcountry(){
        return country;

    }
    public String getNationalanthem(){
        return Nationalanthem;
    }
    public String gettouristspot(){
        return touristspot;
    }
    public void setcountry(String country){
        this.country=country;
    }
    public void setNationalanthem(String Nationalanthem){
        this.Nationalanthem=Nationalanthem;

    }
    public void settouristspot(String touristspot){
        this.touristspot=touristspot;
    }
    public static void main(String[] args) {
        App s =new App();
        System.out.println("before updating the variables");
        System.out.println("country:"+s.country);
        System.out.println("National Anthem:"+s.Nationalanthem);
        System.out.println("Tourist spot:"+s.touristspot);
        s.setcountry("India");
        s.setNationalanthem("Jana Gana Mana");
        s.settouristspot("Taj Mahal");
        System.out.println("After updating the variables:");
        System.out.println("Country:"+s.country);
        System.out.println("National anthem"+s.Nationalanthem);
        System.out.println("Tourist spot:"+s.touristspot);

    }

}
