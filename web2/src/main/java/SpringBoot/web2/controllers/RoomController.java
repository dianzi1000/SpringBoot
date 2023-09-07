package SpringBoot.web2.controllers;

import SpringBoot.web2.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;


@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static List<Room> rooms = new LinkedList<Room>();
    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room("Num:"+i,"Info:"+i,"Name:"+i,i));
        }
    }
    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("room", rooms);
        return "room123";
    }
}
