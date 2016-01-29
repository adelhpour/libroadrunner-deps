/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace libsbml {

 using System;
 using System.Runtime.InteropServices;

/** 
 * @sbmlpackage{core}
 *
@htmlinclude pkg-marker-core.html File and text-string SBML writer.
 *
 * @htmlinclude not-sbml-warning.html
 *
 * The SBMLWriter class is the converse of SBMLReader, and provides the
 * main interface for serializing SBML models into XML and writing the
 * result to an output stream or to files and text strings.  The methods 
 * for writing SBML all take an SBMLDocument object and a destination.  
 * They return a boolean or integer value to indicate success or failure.
 *
 * @section sbmlwriter-compression Support for writing compressed files
 *
 * LibSBML provides support for writing (as well as reading) compressed
 * SBML files.  The process is transparent to the calling
 * application---the application does not need to do anything
 * deliberate to invoke the functionality.  If a given SBML filename ends
 * with an extension for the @em gzip, @em zip or @em bzip2 compression
 * formats (respectively, <code>&quot;.gz&quot;</code>,
 * <code>&quot;.zip&quot;</code>, or <code>&quot;.bz2&quot;</code>),
 * then the methods
 * SBMLWriter::writeSBML(@if java SBMLDocument, String@endif)
 * and SBMLReader::readSBML(@if java String@endif)
 * will automatically compress and decompress the file while writing and
 * reading it.  If the filename has no such extension, it
 * will be written and read uncompressed as normal.
 *
 * The compression feature requires that the @em zlib (for @em gzip and @em
 * zip formats) and/or @em bzip2 (for @em bzip2 format) be available on the
 * system running libSBML, and that libSBML was configured with their
 * support compiled-in.  Please see the libSBML @if clike <a href='libsbml-installation.html'>installation instructions</a>@endif@if python <a href='libsbml-installation.html'>installation instructions</a>@endif@if java  <a href='../../../libsbml-installation.html'>installation instructions</a>@endif for 
 * more information about this.  The methods
 * SBMLWriter::hasZlib() and
 * SBMLWriter::hasBzip2()
 * can be used by an application to query at run-time whether support
 * for the compression libraries is available in the present copy of
 * libSBML.
 *
 * Support for compression is not mandated by the SBML standard, but
 * applications may find it helpful, particularly when large SBML models
 * are being communicated across data links of limited bandwidth.
 */

public class SBMLWriter : IDisposable {
	private HandleRef swigCPtr;
	protected bool swigCMemOwn;
	
	internal SBMLWriter(IntPtr cPtr, bool cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr    = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(SBMLWriter obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (SBMLWriter obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~SBMLWriter() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_SBMLWriter(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public static bool operator==(SBMLWriter lhs, SBMLWriter rhs)
  {
    if((Object)lhs == (Object)rhs)
    {
      return true;
    }

    if( ((Object)lhs == null) || ((Object)rhs == null) )
    {
      return false;
    }

    return (getCPtr(lhs).Handle.ToString() == getCPtr(rhs).Handle.ToString());
  }

  public static bool operator!=(SBMLWriter lhs, SBMLWriter rhs)
  {
    return !(lhs == rhs);
  }

  public override bool Equals(Object sb)
  {
    if ( ! (sb is SBMLWriter) )
    {
      return false;
    }

    return this == (SBMLWriter)sb;
  }

  public override int GetHashCode()
  {
    return swigCPtr.Handle.ToInt32();
  }

  
/**
   * Creates a new SBMLWriter.
   *
   * The libSBML SBMLWriter objects offer methods for writing SBML in
   * XML form to files and text strings.
   */ public
 SBMLWriter() : this(libsbmlPINVOKE.new_SBMLWriter(), true) {
  }

  
/**
   * Sets the name of this program, i.e., the program that is about to
   * write out the SBMLDocument.
   *
   * If the program name and version are set (see
   * SBMLWriter::setProgramVersion(@if java String@endif)), the
   * following XML comment, intended for human consumption, will be written
   * at the beginning of the XML document:
   * @verbatim
 <!-- Created by <program name> version <program version>
 on yyyy-MM-dd HH:mm with libSBML version <libsbml version>. -->
 @endverbatim
   *
   * If the program name and version are not set at some point before
   * calling the writeSBML() methods, no such comment is written out.
   *
   * @param name the name of this program (where 'this program' refers to
   * program in which libSBML is embedded, not libSBML itself!)
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * 
   * @see setProgramVersion(string version)
   */ public
 int setProgramName(string name) {
    int ret = libsbmlPINVOKE.SBMLWriter_setProgramName(swigCPtr, name);
    return ret;
  }

  
/**
   * Sets the version of this program, i.e., the program that is about to
   * write out the SBMLDocument.
   *
   * If the program version and name are set (see
   * SBMLWriter::setProgramName(@if java String@endif)), the
   * following XML comment, intended for human consumption, will be written
   * at the beginning of the document:
   * @verbatim
 <!-- Created by <program name> version <program version>
 on yyyy-MM-dd HH:mm with libSBML version <libsbml version>. -->
 @endverbatim
   *
   * If the program version and name are not set at some point before
   * calling the writeSBML() methods, no such comment is written out.
   *
   * @param version the version of this program (where 'this program'
   * refers to program in which libSBML is embedded, not libSBML itself!)
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   *
   * @see setProgramName(string name)
   */ public
 int setProgramVersion(string version) {
    int ret = libsbmlPINVOKE.SBMLWriter_setProgramVersion(swigCPtr, version);
    return ret;
  }

  
/**
   * Writes the given SBML document to filename.
   *
   * @htmlinclude assuming-compressed-file.html
   *
   * @param d the SBML document to be written
   *
   * @param filename the name or full pathname of the file where the SBML
   * is to be written. 
   *
   * @return @c true on success and @c false if the filename could not be
   * opened for writing.
   *
   * @note @htmlinclude note-writing-zipped-files.html
   * 
   * @see setProgramVersion(string version)
   * @see setProgramName(string name)
   */ public
 bool writeSBML(SBMLDocument d, string filename) {
    bool ret = libsbmlPINVOKE.SBMLWriter_writeSBML__SWIG_0(swigCPtr, SBMLDocument.getCPtr(d), filename);
    return ret;
  }

  
/**
   * Writes the given SBML document to the output stream.
   *
   * @param d the SBML document to be written
   *
   * @param stream the stream object where the SBML is to be written.
   *
   * @return @c true on success and @c false if one of the underlying
   * parser components fail (rare).
   * 
   * @see setProgramVersion(string version)
   * @see setProgramName(string name)
   */ public
 bool writeSBML(SBMLDocument d, OStream stream) {
    bool ret = libsbmlPINVOKE.SBMLWriter_writeSBML__SWIG_1(swigCPtr, SBMLDocument.getCPtr(d), SWIGTYPE_p_std__ostream.getCPtr(stream.get_ostream()));
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  
/** */ /* libsbml-internal */ public
 string writeToString(SBMLDocument d) {
    string ret = libsbmlPINVOKE.SBMLWriter_writeToString(swigCPtr, SBMLDocument.getCPtr(d));
    return ret;
  }

  
/**
   * Writes the given SBML document to filename.
   *
   * @htmlinclude assuming-compressed-file.html
   *
   * @param d the SBML document to be written
   *
   * @param filename the name or full pathname of the file where the SBML
   * is to be written. 
   *
   * @return @c true on success and @c false if the filename could not be
   * opened for writing.
   *
   * @note @htmlinclude note-writing-zipped-files.html
   * 
   * @see setProgramVersion(string version)
   * @see setProgramName(string name)
   */ public
 bool writeSBMLToFile(SBMLDocument d, string filename) {
    bool ret = libsbmlPINVOKE.SBMLWriter_writeSBMLToFile(swigCPtr, SBMLDocument.getCPtr(d), filename);
    return ret;
  }

  
/**
   * Writes the given SBML document to an in-memory string and returns a
   * pointer to it.
   *
   * The string is owned by the caller and should be freed (with @c free())
   * when no longer needed.
   *
   * @param d the SBML document to be written
   *
   * @return the string on success and @c 0 if one of the underlying parser
   * components fail.
   * 
   * @see setProgramVersion(string version)
   * @see setProgramName(string name)
   */ public
 string writeSBMLToString(SBMLDocument d) {
    string ret = libsbmlPINVOKE.SBMLWriter_writeSBMLToString(swigCPtr, SBMLDocument.getCPtr(d));
    return ret;
  }

  
/**
   * Predicate returning @c true if this copy of libSBML has been linked
   * with the <em>zlib</em> library.
   *
   * LibSBML supports reading and writing files compressed with either
   * bzip2 or zip/gzip compression.  The facility depends on libSBML having
   * been compiled with the necessary support libraries.  This method
   * allows a calling program to inquire whether that is the case for the
   * copy of libSBML it is using.
   *
   * @return @c true if libSBML is linked with zlib, @c false otherwise.
   *
   *
 * @if python @note Because this is a static method on a class, the Python
 * language interface for libSBML will contain two variants.  One will be the
 * expected, normal static method on the class (i.e., a regular
 * <em>methodName</em>), and the other will be a standalone top-level
 * function with the name <em>ClassName_methodName()</em>. This is merely an
 * artifact of how the language interfaces are created in libSBML.  The
 * methods are functionally identical. @endif
 *
 *
   *
   * @see @if clike hasBzip2() @else SBMLWriter::hasBzip2() @endif
   */ public
 static bool hasZlib() {
    bool ret = libsbmlPINVOKE.SBMLWriter_hasZlib();
    return ret;
  }

  
/**
   * Predicate returning @c true if this copy of libSBML has been linked
   * with the <em>bzip2</em> library.
   *
   * LibSBML supports reading and writing files compressed with either
   * bzip2 or zip/gzip compression.  The facility depends on libSBML having
   * been compiled with the necessary support libraries.  This method
   * allows a calling program to inquire whether that is the case for the
   * copy of libSBML it is using.
   *
   * @return @c true if libSBML is linked with bzip2, @c false otherwise.
   *
   *
 * @if python @note Because this is a static method on a class, the Python
 * language interface for libSBML will contain two variants.  One will be the
 * expected, normal static method on the class (i.e., a regular
 * <em>methodName</em>), and the other will be a standalone top-level
 * function with the name <em>ClassName_methodName()</em>. This is merely an
 * artifact of how the language interfaces are created in libSBML.  The
 * methods are functionally identical. @endif
 *
 *
   *
   * @see @if clike hasZlib() @else SBMLWriter::hasZlib() @endif
   */ public
 static bool hasBzip2() {
    bool ret = libsbmlPINVOKE.SBMLWriter_hasBzip2();
    return ret;
  }

}

}
