package portfolioq1;

public class CountryNode {
    private CountryNode left;
    private CountryNode right;
    private String name;
    private City city;
    static int count;
    
    public CountryNode() {
        count++;
    }
    public CountryNode(String name, String city) {
        count++;
//        this.next = next;
//        this.prev = prev;
        this.name = name;
        this.city = new City(city);
    }
//    public void add(String name, String city) {
//        CountryNode temp = new CountryNode(name, city, null, tail);
//        if (tail != null)
//        
//    }
    public void display() {
        System.out.println("There is(are) " + count + " country(ies) in the list ");
    }
    
    private class City {
        private String name;
        
        public City(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public CountryNode getLeft() {
        return left;
    }

    public void setLeft(CountryNode left) {
        this.left = left;
    }

    public CountryNode getRight() {
        return right;
    }

    public void setRight(CountryNode right) {
        this.right = right;
    }
}
