package portfolioq1;

public class CountryNode {
    private CountryNode prev;
    private CountryNode next;
    private String name;
    private City city;
    static int count;
    
    public CountryNode() {
        count++;
    }
    
    public CountryNode(String name, String city) {
        count++;
        this.name = name;
        this.city = new City(city);
    }
    
    public void display() {
        System.out.println("There is(are) " + count + " country(ies) in the list ");
        System.out.println(name + "'s capital city is " + city.getName());
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

    public CountryNode getPrev() {
        return prev;
    }

    public void setPrev(CountryNode prev) {
        this.prev = prev;
    }

    public CountryNode getNext() {
        return next;
    }

    public void setNext(CountryNode next) {
        this.next = next;
    }
}
