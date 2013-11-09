/**
 * Copyright (c) 2004-2011 Wang Jinbao(Julian Wong), http://www.ralasafe.com
 * Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php
 */
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: LinkerType.java,v 1.1 2010/07/09 08:17:54 back Exp $
 */

package org.ralasafe.db.sql.xml.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class LinkerType.
 * 
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:54 $
 */
public class LinkerType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The AND type
     */
    public static final int AND_TYPE = 0;

    /**
     * The instance of the AND type
     */
    public static final LinkerType AND = new LinkerType(AND_TYPE, "AND");

    /**
     * The OR type
     */
    public static final int OR_TYPE = 1;

    /**
     * The instance of the OR type
     */
    public static final LinkerType OR = new LinkerType(OR_TYPE, "OR");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private LinkerType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of LinkerType
     * 
     * @return an Enumeration over all possible instances of
     * LinkerType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this LinkerType
     * 
     * @return the type of this LinkerType
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable init(
    ) {
        Hashtable members = new Hashtable();
        members.put("AND", AND);
        members.put("OR", OR);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private java.lang.Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * LinkerType
     * 
     * @return the String representation of this LinkerType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new LinkerType based on the given
     * String value.
     * 
     * @param string
     * @return the LinkerType value of parameter 'string'
     */
    public static org.ralasafe.db.sql.xml.types.LinkerType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid LinkerType";
            throw new IllegalArgumentException(err);
        }
        return (LinkerType) obj;
    }

}
