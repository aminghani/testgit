public class Customer implements Comparable {
    String name;
    double money;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
    }
    //some useless comments
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public int compareTo(Object o) {
        Customer other = (Customer) o;
        if(this.getMoney() > other.getMoney()){
            return 1;
        }else if(this.getMoney() == other.getMoney()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "name : " + getName() + " money : " + getMoney();
    }
}
