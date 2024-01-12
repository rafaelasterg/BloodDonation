package gr.hua.dit.ds.tsidimaempena.dao;

import gr.hua.dit.ds.tsidimaempena.entity.Request;

import java.util.List;

public interface RequestDAO {

    public List<Request> getRequests();

    public Request saveRequest(Request request);

    public Request getRequest(int id);

}
