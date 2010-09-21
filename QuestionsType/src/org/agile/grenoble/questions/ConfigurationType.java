/*
 * XML Type:  configurationType
 * Namespace: http://grenoble.agile.org/questions
 * Java type: org.agile.grenoble.questions.ConfigurationType
 *
 * Automatically generated - do not modify.
 */
package org.agile.grenoble.questions;


/**
 * An XML configurationType(@http://grenoble.agile.org/questions).
 *
 * This is a complex type.
 */
public interface ConfigurationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfigurationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32A2924D89A49183F5DC8C9EA3267D67").resolveHandle("configurationtypee0fbtype");
    
    /**
     * Gets the "type" element
     */
    org.agile.grenoble.questions.ConfigurationType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.agile.grenoble.questions.ConfigurationType.Type xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.agile.grenoble.questions.ConfigurationType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.agile.grenoble.questions.ConfigurationType.Type type);
    
    /**
     * Gets the "number" element
     */
    byte getNumber();
    
    /**
     * Gets (as xml) the "number" element
     */
    org.apache.xmlbeans.XmlByte xgetNumber();
    
    /**
     * True if has "number" element
     */
    boolean isSetNumber();
    
    /**
     * Sets the "number" element
     */
    void setNumber(byte number);
    
    /**
     * Sets (as xml) the "number" element
     */
    void xsetNumber(org.apache.xmlbeans.XmlByte number);
    
    /**
     * Unsets the "number" element
     */
    void unsetNumber();
    
    /**
     * An XML type(@http://grenoble.agile.org/questions).
     *
     * This is an atomic type that is a restriction of org.agile.grenoble.questions.ConfigurationType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32A2924D89A49183F5DC8C9EA3267D67").resolveHandle("typef2d1elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SINGLE = Enum.forString("single");
        static final Enum MULTIPLE = Enum.forString("multiple");
        
        static final int INT_SINGLE = Enum.INT_SINGLE;
        static final int INT_MULTIPLE = Enum.INT_MULTIPLE;
        
        /**
         * Enumeration value class for org.agile.grenoble.questions.ConfigurationType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SINGLE
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_SINGLE = 1;
            static final int INT_MULTIPLE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("single", INT_SINGLE),
                    new Enum("multiple", INT_MULTIPLE),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.agile.grenoble.questions.ConfigurationType.Type newValue(java.lang.Object obj) {
              return (org.agile.grenoble.questions.ConfigurationType.Type) type.newValue( obj ); }
            
            public static org.agile.grenoble.questions.ConfigurationType.Type newInstance() {
              return (org.agile.grenoble.questions.ConfigurationType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.agile.grenoble.questions.ConfigurationType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.agile.grenoble.questions.ConfigurationType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.agile.grenoble.questions.ConfigurationType newInstance() {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.agile.grenoble.questions.ConfigurationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.agile.grenoble.questions.ConfigurationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.agile.grenoble.questions.ConfigurationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.agile.grenoble.questions.ConfigurationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.agile.grenoble.questions.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
