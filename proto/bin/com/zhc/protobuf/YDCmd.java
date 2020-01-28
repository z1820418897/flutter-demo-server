// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: b.proto

package com.zhc.protobuf;

public final class YDCmd {
  private YDCmd() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code protobuf.YiDongCmd}
   */
  public enum YiDongCmd
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *协议开始标记 没什么用
     * </pre>
     *
     * <code>BASE = 1000;</code>
     */
    BASE(1000),
    /**
     * <pre>
     *心跳
     * </pre>
     *
     * <code>BEAT = 1001;</code>
     */
    BEAT(1001),
    /**
     * <pre>
     *获取所有的点
     * </pre>
     *
     * <code>REQ_SITES = 1002;</code>
     */
    REQ_SITES(1002),
    /**
     * <pre>
     *返回所有的点
     * </pre>
     *
     * <code>RSP_SITES = 1003;</code>
     */
    RSP_SITES(1003),
    /**
     * <pre>
     *当前点
     * </pre>
     *
     * <code>RSP_SITE = 1004;</code>
     */
    RSP_SITE(1004),
    ;

    /**
     * <pre>
     *协议开始标记 没什么用
     * </pre>
     *
     * <code>BASE = 1000;</code>
     */
    public static final int BASE_VALUE = 1000;
    /**
     * <pre>
     *心跳
     * </pre>
     *
     * <code>BEAT = 1001;</code>
     */
    public static final int BEAT_VALUE = 1001;
    /**
     * <pre>
     *获取所有的点
     * </pre>
     *
     * <code>REQ_SITES = 1002;</code>
     */
    public static final int REQ_SITES_VALUE = 1002;
    /**
     * <pre>
     *返回所有的点
     * </pre>
     *
     * <code>RSP_SITES = 1003;</code>
     */
    public static final int RSP_SITES_VALUE = 1003;
    /**
     * <pre>
     *当前点
     * </pre>
     *
     * <code>RSP_SITE = 1004;</code>
     */
    public static final int RSP_SITE_VALUE = 1004;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static YiDongCmd valueOf(int value) {
      return forNumber(value);
    }

    public static YiDongCmd forNumber(int value) {
      switch (value) {
        case 1000: return BASE;
        case 1001: return BEAT;
        case 1002: return REQ_SITES;
        case 1003: return RSP_SITES;
        case 1004: return RSP_SITE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<YiDongCmd>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        YiDongCmd> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<YiDongCmd>() {
            public YiDongCmd findValueByNumber(int number) {
              return YiDongCmd.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.zhc.protobuf.YDCmd.getDescriptor().getEnumTypes().get(0);
    }

    private static final YiDongCmd[] VALUES = values();

    public static YiDongCmd valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private YiDongCmd(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobuf.YiDongCmd)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\007b.proto\022\010protobuf*P\n\tYiDongCmd\022\t\n\004BASE" +
      "\020\350\007\022\t\n\004BEAT\020\351\007\022\016\n\tREQ_SITES\020\352\007\022\016\n\tRSP_SI" +
      "TES\020\353\007\022\r\n\010RSP_SITE\020\354\007B\031\n\020com.zhc.protobu" +
      "fB\005YDCmd"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}