package portfolioq1;
/**
 * Portfolio Question1
 * SangJoon Lee
 * 30024165
 * 12/02/2021
 */
public class NestedClassAndLinkedList {
    public static void main(String[] args) {
//        CountryNode<String> countries = new CountryNode<String>();
        CountryNode c1 = new CountryNode("Australia", "Canberra");
        CountryNode c2 = new CountryNode("Korea", "Seoul");
        CountryNode c3 = new CountryNode("Austria", "Vienna");
        CountryNode c4 = new CountryNode("Czech", "Prague");
        
        c1.setPrev(null);
        c1.setNext(c2);
        c2.setPrev(c1);
        c2.setNext(c3);
        c3.setPrev(c2);
        c3.setNext(c4);
        c4.setPrev(c3);
        c4.setNext(null);
        
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}