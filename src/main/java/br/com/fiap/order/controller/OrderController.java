package br.com.fiap.order.controller;

import br.com.fiap.order.model.OrderDTO;
import br.com.fiap.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/order", produces = "application/json")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable(value="id") Long id){

        System.out.printf("findById %s", id);

        OrderDTO orderDTO = orderService.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(orderDTO);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody @Valid OrderDTO orderDTO){

        orderDTO = orderService.save(orderDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body("{ \"order\" : \"/order/"+orderDTO.getId()+ "\"}");
    }


    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody @Valid OrderDTO orderDTO) {

        orderDTO = orderService.update(id,orderDTO);

        return ResponseEntity.status(HttpStatus.OK).body("{ \"order\" : \"/order/"+orderDTO.getId()+ "\"}");
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }

    @GetMapping("/")
    public ResponseEntity<OrderDTO> getOrders(OrderDTO orderDTO){
        log.info("getOrders {} {}", orderDTO.getName(), orderDTO.getId());
        return new ResponseEntity<>(orderDTO, HttpStatus.OK);
    }
}
