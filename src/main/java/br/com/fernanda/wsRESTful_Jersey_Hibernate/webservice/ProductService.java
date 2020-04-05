package br.com.fernanda.wsRESTful_Jersey_Hibernate.webservice;

import br.com.fernanda.wsRESTful_Jersey_Hibernate.bean.IProductBean;
import br.com.fernanda.wsRESTful_Jersey_Hibernate.bean.ProductBean;
import br.com.fernanda.wsRESTful_Jersey_Hibernate.model.Product;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/product")
@Consumes("application/json; charset=UTF-8")
@Produces("application/json; charset=UTF-8")
public class ProductService {

    private IProductBean productBean = new ProductBean();

    @POST
    @Path("/save")
    public Response save(Product product) throws Exception {
        return Response.status(Response.Status.CREATED)
                .entity(product)
                .build();
    }

    @PUT
    @Path("/update")
    public void update(Product product) throws Exception {
        productBean.update(product);
    }

    @DELETE
    @Path("/delete")
    public void delete(Product product) throws Exception {
        productBean.remove(product);
    }

    @GET
    @Path("/getProducts")
    public List<Product> getProducts() throws Exception {
        return productBean.findAll();
    }

    @GET
    @Path("/getProductById/{id}")
    public Product getProduct(@PathParam("id") int id) throws Exception {
        return productBean.findById(id);
    }

    @GET
    @Path("/getProductByName/{name}")
    public Product getProduct(@PathParam("name") String name) throws Exception {
        return productBean.findByName(name);
    }





}