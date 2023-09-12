package SpringBoot.web2.services;

import java.util.ArrayList;
import java.util.List;


import SpringBoot.web2.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private static final List<Room> rooms = new ArrayList();

    static{
        for(int i=0;i<10;i++){
            rooms.add(new Room( "Room " + i, "R"+i, "Q", i));
        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }
}
