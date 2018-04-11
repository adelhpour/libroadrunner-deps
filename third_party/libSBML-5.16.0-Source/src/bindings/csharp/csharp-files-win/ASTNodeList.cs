//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace libsbml {

public class ASTNodeList : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal ASTNodeList(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(ASTNodeList obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~ASTNodeList() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_ASTNodeList(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public ASTNodeList() : this(libsbmlPINVOKE.new_ASTNodeList(), true) {
  }

  public void add(ASTNode item) {
    libsbmlPINVOKE.ASTNodeList_add(swigCPtr, ASTNode.getCPtr(item));
  }

  public ASTNode get(uint n) {
    global::System.IntPtr cPtr = libsbmlPINVOKE.ASTNodeList_get(swigCPtr, n);
    ASTNode ret = (cPtr == global::System.IntPtr.Zero) ? null : new ASTNode(cPtr, false);
    return ret;
  }

  public void prepend(ASTNode item) {
    libsbmlPINVOKE.ASTNodeList_prepend(swigCPtr, ASTNode.getCPtr(item));
  }

  public ASTNode remove(uint n) {
    global::System.IntPtr cPtr = libsbmlPINVOKE.ASTNodeList_remove(swigCPtr, n);
    ASTNode ret = (cPtr == global::System.IntPtr.Zero) ? null : new ASTNode(cPtr, false);
    return ret;
  }

  public uint getSize() {
    uint ret = libsbmlPINVOKE.ASTNodeList_getSize(swigCPtr);
    return ret;
  }

}

}
