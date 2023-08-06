package de.brightslearning.circle.service;

import de.brightslearning.circle.model.Circle;
import org.springframework.stereotype.Service;

@Service
public class CircleService {

    public CircleService() {
    }

    public Double calculateSurface(Circle circle) {
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }

    public Double calculateDiameter(Circle circle) {
        return circle.getRadius() * 2;
    }

    public Double calculateCircumference(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
