package com.example.socialconnect.viewmodel;

import javax.inject.Inject;

public class ItemViewModel {

    public String name;
    public String lastSeen;
    public String id;
    public String email;
    public int profilepic;

    @Inject
    public ItemViewModel() {
    }

    public int getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(int profilepic) {
        this.profilepic = profilepic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
