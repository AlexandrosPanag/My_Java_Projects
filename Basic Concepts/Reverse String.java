public class ReverseStringClass {   
    public static void main(String[] args) {
    reverse_string();
    }
    static void reverse_string(){
    String word="word";
    String result = new StringBuffer(word).reverse().toString();
    System.out.println(result);
    }
}