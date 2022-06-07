package lesson1.orders;

import lesson1.products.Product;

import java.util.List;

public class Order {

    private Integer numOrder;

    private List<Product> productList;

    private Address address;

    public Integer getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(Integer numOrder) {
        this.numOrder = numOrder;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("numOrder=").append(numOrder);
        sb.append(", productList=").append(productList);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
