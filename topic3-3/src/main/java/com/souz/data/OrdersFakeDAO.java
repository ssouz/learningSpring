package com.souz.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;
import com.souz.models.OrderModel;


@Repository
public class OrdersFakeDAO implements OrderDataAccessInterface{

    List<OrderModel> orders = new ArrayList<>();

    public OrdersFakeDAO() {
        orders.add(new OrderModel(0L,"#1234","T-shirt",15.0f,5));
        orders.add(new OrderModel(1L,"#3456","Water bottles",1.5f,12));
        orders.add(new OrderModel(2L,"#7890","Phone case",12.99f,2));
        orders.add(new OrderModel(3L,"#6789","HDMI cables",8.50f,4));
        orders.add(new OrderModel(4L,"#0123","Protein powder",24.99f,1));
        orders.add(new OrderModel(5L,"#4567","Coffee beans",10.0f,2));
    }

    @Override
    public OrderModel getById(long id) {
       /* for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getId().equals(id)){
                res = orders.get(i);
            }
        }*/
        return orders.stream().filter(e -> e.getId().equals(id)).toList().get(0);
    }

    @Override
    public List<OrderModel> getOrders() {
        return orders;
    }

    @Override
    public List<OrderModel> searchOrders(String searchTerm) {
        /*for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getProductName().toLowerCase().contains(searchTerm.toLowerCase())){
                FoundItems.add(orders.get(i));
            }
        }*/
        //using stream api
        return orders.stream()
                     .filter(arg0 -> arg0.getProductName().toLowerCase().contains(searchTerm.toLowerCase()))
                     .collect(Collectors.toList());
    }

    @Override
    public boolean addOne(OrderModel newOrder) {
        return orders.add(newOrder);
    }

    @Override
    public boolean deleteOne(long id) {
        /*for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getId().equals(id)){
                orders.remove(i);
                return true;
            }
        }
        return false;*/
        OrderModel orderToDelete = getById(id);
        return orders.remove(orderToDelete);
        
    }

    @Override
    public void updateOne(long idToUpdate, OrderModel updatedOrder) {
        /*for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getId().equals(idToUpdate)){
                orders.set(i, updatedOrder);
                return orders.get(i);
            }
        }
        return null;*/
        OrderModel orderToUpdate = getById(idToUpdate);
        orders.set(orderToUpdate.getId().intValue(), updatedOrder);
    }
    
}
