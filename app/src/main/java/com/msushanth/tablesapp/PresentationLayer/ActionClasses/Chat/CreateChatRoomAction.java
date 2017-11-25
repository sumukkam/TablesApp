package com.msushanth.tablesapp.PresentationLayer.ActionClasses.Chat;

import com.msushanth.tablesapp.BusinessLogicLayer.DispatchClasses.CreateChatRoomDispatch;
import com.msushanth.tablesapp.Room;
import com.msushanth.tablesapp.User;

/**
 * Created by Sushanth on 11/9/17.
 */

public class CreateChatRoomAction {
    private User user1;
    private User user2;
    private Room room;

    public CreateChatRoomAction(User user1, User user2){
        this.user1 = user1;
        this.user2 = user2;
        this.room = new Room(user1, user2);
    }

    public void createRoom(){
        CreateChatRoomDispatch nextLayer = new CreateChatRoomDispatch(user1, user2);
        nextLayer.createRoom();
    }


}
