package roomescape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminPageController {

    @GetMapping
    public String showAdminIndexPage() {
        return "admin/index";
    }

    @GetMapping("/reservation")
    public String showReservationPage() {
        return "admin/reservation-new";
    }

    @GetMapping("/time")
    public String showReservationTimePage() {
        return "admin/time";
    }

    @GetMapping("/theme")
    public String showThemePage() {
        return "admin/theme";
    }
}
