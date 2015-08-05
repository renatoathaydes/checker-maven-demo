package com.athaydes.checkerframework;

/**
 * Created by renato on 05/08/15.
 */
public class NullnessExample
{

    private final String _strField;
    private final Object _object;

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
        NullnessExample example = new NullnessExample("hi", 4);

    }

}
