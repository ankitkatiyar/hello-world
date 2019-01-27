package learning.io_nio;

import java.io.Serializable;

public class User implements Serializable
{

    private static final long serialVersionUID = 3521936561009092842L;
    private Integer id;
    private String name;

    public User(Integer id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "User [id=" + id + ", name=" + name + "]";
    }

}
