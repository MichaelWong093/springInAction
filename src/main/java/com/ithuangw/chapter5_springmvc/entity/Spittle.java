package com.ithuangw.chapter5_springmvc.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/13 13:36
 */
@Getter
@Setter
public class Spittle {

    private Long id;
    private String message;
    private Date time;
    private Double latitude;
    private Double longtitude;

    public Spittle(String message, Date time) {
        this.message = message;
        this.time = time;
    }

    public Spittle(String message, Date time, Double latitude, Double longtitude) {
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spittle spittle = (Spittle) o;
        return Objects.equals(id, spittle.id) &&
                Objects.equals(time, spittle.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time);
    }
}
