//Explore char primitive
//rachit jha
//9/10/24
public class Main {
    public static void main(String[] args) {
        char x='a';
        System.out.println((int) x);

        System.out.println('a'+'b');

        String s=Character.toString(x);
        s=s+"bcd";
        System.out.println(s);

        String y="abcd";
        System.out.println(y.charAt(1));


        int[] stuff=new int[256];
        stuff['a']=7;
        for(int i=0; i<256; i++){
            System.out.println(stuff[i]);
        }
    }
}