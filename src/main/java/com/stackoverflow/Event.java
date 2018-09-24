package com.stackoverflow;

import java.time.ZonedDateTime;

public class Event {

    private long id;
    private String name;
    private ZonedDateTime time;

    public Event() {
    }

    public Event(long id, String name, ZonedDateTime time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

}
