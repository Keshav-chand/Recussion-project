public class App {
    void findoutput(int num){
        if(num<1) return;
         findoutput(num/2);
         System.out.println(num%2);
    }
}
class recussion1{
    public static void main(String[] args) {
        App c=new App();
        c.findoutput(20);
    }
}