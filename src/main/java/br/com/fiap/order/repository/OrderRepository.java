package br.com.fiap.order.repository;

import br.com.fiap.order.model.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<OrderDTO> orders;

    public OrderRepository(){
        orders = new ArrayList<>();
    }

    public OrderDTO findById(Long id) {
        return orders.stream().filter((orderDTO) -> orderDTO.getId().equals(id)).findFirst().orElse(null);
    }


    public OrderDTO save(OrderDTO orderDTO){
        orderDTO.setId((long) (orders.size()+1));
        this.orders.add(orderDTO);
        return orderDTO;
    }


    public OrderDTO update(OrderDTO orderDTO){
        int index = orders.indexOf(orderDTO);
        orders.set(index, orderDTO);
        return orderDTO;
    }

    public OrderDTO delete(Long id){
        OrderDTO orderDTODb = findById(id);
        orders.remove(orderDTODb);
        return orderDTODb;
    }

    public List<OrderDTO> getOrders(){
        return orders;
    }
}
