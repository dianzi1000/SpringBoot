package SpringBoot.web2.controllers;

import SpringBoot.web2.models.Room;
import SpringBoot.web2.services.RoomService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService rs;
    public RoomRestController(RoomService roomService) {
        this.rs = roomService;
    }
    @GetMapping
    public List<Room> getAllRooms(Model model){
        return rs.getAllRooms();
    }
}
