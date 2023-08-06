package de.brightslearning.circle.controller;

import de.brightslearning.circle.model.Circle;
import de.brightslearning.circle.service.CircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CircleController {

    private final ApplicationContext context;

    private final CircleService service;

    @Autowired
    public CircleController(ApplicationContext context, CircleService service) {
        this.context = context;
        this.service = service;
    }

    @GetMapping(value = "/")
    public String index(@ModelAttribute("result") Circle result, Model model) {
        Circle circle = context.getBean(Circle.class, 0d, 0d, 0d, 0d);
        model.addAttribute("circle", circle);

        if (result != null) {
            model.addAttribute("result", result);
        }

        return "/index";
    }

    @PostMapping(value = "/calculate")
    public String calculate(@ModelAttribute Circle circle, RedirectAttributes redirectAttributes) {
        Circle result = context.getBean(Circle.class);

        result.setRadius(circle.getRadius());
        result.setDiameter(service.calculateDiameter(circle));
        result.setSurface(service.calculateSurface(circle));
        result.setCircumference(service.calculateCircumference(circle));

        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/";
    }

    @GetMapping(value = "/reset")
    public String reset() {
        Circle circle = context.getBean(Circle.class);
        circle.reset();

        return "redirect:/";
    }
}
