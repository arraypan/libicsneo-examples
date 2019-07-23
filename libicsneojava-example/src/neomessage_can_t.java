/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class neomessage_can_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected neomessage_can_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(neomessage_can_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        icsneojavaJNI.delete_neomessage_can_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStatus(neomessage_statusbitfield_t value) {
    icsneojavaJNI.neomessage_can_t_status_set(swigCPtr, this, neomessage_statusbitfield_t.getCPtr(value), value);
  }

  public neomessage_statusbitfield_t getStatus() {
    long cPtr = icsneojavaJNI.neomessage_can_t_status_get(swigCPtr, this);
    return (cPtr == 0) ? null : new neomessage_statusbitfield_t(cPtr, false);
  }

  public void setTimestamp(java.math.BigInteger value) {
    icsneojavaJNI.neomessage_can_t_timestamp_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getTimestamp() {
    return icsneojavaJNI.neomessage_can_t_timestamp_get(swigCPtr, this);
  }

  public void setTimestampReserved(java.math.BigInteger value) {
    icsneojavaJNI.neomessage_can_t_timestampReserved_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getTimestampReserved() {
    return icsneojavaJNI.neomessage_can_t_timestampReserved_get(swigCPtr, this);
  }

  public void setData(byte[] value) {
    icsneojavaJNI.neomessage_can_t_data_set(swigCPtr, this, value);
  }

  public byte[] getData() {
    return icsneojavaJNI.neomessage_can_t_data_get(swigCPtr, this);
}

  public void setLength(long value) {
    icsneojavaJNI.neomessage_can_t_length_set(swigCPtr, this, value);
  }

  public long getLength() {
    return icsneojavaJNI.neomessage_can_t_length_get(swigCPtr, this);
  }

  public void setArbid(long value) {
    icsneojavaJNI.neomessage_can_t_arbid_set(swigCPtr, this, value);
  }

  public long getArbid() {
    return icsneojavaJNI.neomessage_can_t_arbid_get(swigCPtr, this);
  }

  public void setNetid(int value) {
    icsneojavaJNI.neomessage_can_t_netid_set(swigCPtr, this, value);
  }

  public int getNetid() {
    return icsneojavaJNI.neomessage_can_t_netid_get(swigCPtr, this);
  }

  public void setType(short value) {
    icsneojavaJNI.neomessage_can_t_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return icsneojavaJNI.neomessage_can_t_type_get(swigCPtr, this);
  }

  public void setDlcOnWire(short value) {
    icsneojavaJNI.neomessage_can_t_dlcOnWire_set(swigCPtr, this, value);
  }

  public short getDlcOnWire() {
    return icsneojavaJNI.neomessage_can_t_dlcOnWire_get(swigCPtr, this);
  }

  public void setReserved(short[] value) {
    icsneojavaJNI.neomessage_can_t_reserved_set(swigCPtr, this, value);
  }

  public short[] getReserved() {
    return icsneojavaJNI.neomessage_can_t_reserved_get(swigCPtr, this);
  }

  public neomessage_can_t() {
    this(icsneojavaJNI.new_neomessage_can_t(), true);
  }

}
