package br.com.fiap.order.service;

import br.com.fiap.order.model.OrderDTO;
import br.com.fiap.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public OrderDTO findById(Long id) {
        return orderRepository.findById(id);
    }

    public OrderDTO save(OrderDTO orderDTO){
        return orderRepository.save(orderDTO);
    }


    public OrderDTO update(Long id, OrderDTO orderDTO){

        OrderDTO orderDb = orderRepository.findById(id);

        if(orderDb == null){
            return null;
        }

        orderDTO.setId(orderDb.getId());

        return orderRepository.update(orderDTO);
    }

    public OrderDTO delete(Long id){
        return orderRepository.delete(id);
    }

    public List<OrderDTO> getOrders(){
        return orderRepository.getOrders();
    }

}
