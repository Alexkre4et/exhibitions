package ua.andrii.project_7.commands;

import org.apache.log4j.Logger;
import ua.andrii.project_7.entity.User;
import ua.andrii.project_7.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientInfoCommand extends Command {

    private static final Logger LOGGER = Logger.getLogger(AdminService.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        LOGGER.debug("ClientInfoCommand()");
        User user = (User) request.getSession().getAttribute("user");

        return "/client_page.jsp";
    }
}
