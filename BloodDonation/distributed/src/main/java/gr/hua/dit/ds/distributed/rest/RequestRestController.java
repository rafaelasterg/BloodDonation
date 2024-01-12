package gr.hua.dit.ds.tsidimaempena.rest;

import gr.hua.dit.ds.tsidimaempena.dao.RequestDAO;
import gr.hua.dit.ds.tsidimaempena.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class RequestRestController {

    @Autowired
    private RequestDAO requestDAO;

    @GetMapping("")
    public List<Request> getRequest(){ return requestDAO.getRequests(); }

    @PostMapping("")
    public Request saveRequest(@RequestBody Request request){ return requestDAO.saveRequest(request); }

}
