package com.athaydes.checkerframework;

import javax.annotation.Nullable;

/**
 * Created by renato on 05/08/15.
 */
public class NullnessExample
{

    private final String _strField;
    private final Object _object;

    @Nullable
    String _nullableString;

    public NullnessExample(String strField, Object object)
    {
        _strField = strField;
        _object = object;
    }

    public String getStrField()
    {
        return _strField;
    }

    public Object getObject()
    {
        return _object;
    }

    public static void main(String[] args)
    {
        // will not compile if the NullnessChecker is enabled!
        NullnessExample example = new NullnessExample("hi", null);

        NullnessExample example2 = new NullnessExample("hi", 4);

        // should also fail to compile
        example2._nullableString.equals("4");

    }

}
