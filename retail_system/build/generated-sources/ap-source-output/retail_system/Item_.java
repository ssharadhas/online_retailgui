package retail_system;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-20T20:48:09")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Integer> itemid;
    public static volatile SingularAttribute<Item, byte[]> image;
    public static volatile SingularAttribute<Item, String> itemname;
    public static volatile SingularAttribute<Item, Integer> itemprice;
    public static volatile SingularAttribute<Item, String> category;
    public static volatile SingularAttribute<Item, Integer> itemunits;

}