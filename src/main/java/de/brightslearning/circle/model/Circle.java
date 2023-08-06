package de.brightslearning.circle.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {

    private Double radius;

    private Double surface;

    private Double diameter;

    private Double circumference;

    public Circle() {
    }

    public Circle(Double radius, Double surface, Double diameter, Double circumference) {
        this.radius = radius;
        this.surface = surface;
        this.diameter = diameter;
        this.circumference = circumference;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getCircumference() {
        return circumference;
    }

    public void setCircumference(Double circumference) {
        this.circumference = circumference;
    }

    public void reset() {
        this.radius = null;
        this.diameter = null;
        this.circumference = null;
        this.surface = null;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", surface=" + surface + ", diameter=" + diameter + ", circumference=" + circumference + '}';
    }
}
