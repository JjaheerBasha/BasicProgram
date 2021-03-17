public class Product {
    int i;
     String name;
    float v;
    public Product(int i, String name, float v) {
        this.i=i;
        this.name=name;
        this.v=v;
    }
    @Override
    public String toString() {
        return "Product{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", v=" + v +
                '}';
    }
}
