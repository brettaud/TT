// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.algoTrader.vo;

/**
 * 
 */
public class ExitValueVO
    extends com.algoTrader.BaseObject
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8601863134684632928L;

    public ExitValueVO()
    {
        this.value = 0;
    }

    public ExitValueVO(double value)
    {
        this.value = value;
    }

    /**
     * Copies constructor from other ExitValueVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public ExitValueVO(ExitValueVO otherBean)
    {
        this(otherBean.getValue());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(ExitValueVO otherBean)
    {
        if (otherBean != null)
        {
            this.setValue(otherBean.getValue());
        }
    }

    private double value;

    /**
     * 
     */
    public double getValue()
    {
        return this.value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

}