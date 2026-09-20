package com.spotify.rcs.admin.grpc.p140v0.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Publish$BackendContext extends AbstractC0269h implements sre0 {
    private static final Publish$BackendContext DEFAULT_INSTANCE;
    public static final int DYNAMIC_CONTEXT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SERVICE_NAME_FIELD_NUMBER = 2;
    public static final int STATIC_CONTEXT_FIELD_NUMBER = 3;
    public static final int SURFACE_METADATA_FIELD_NUMBER = 10;
    public static final int SYSTEM_FIELD_NUMBER = 1;
    private int bitField0_;
    private Publish$DynamicContext dynamicContext_;
    private StaticContext staticContext_;
    private SurfaceMetadata surfaceMetadata_;
    private String system_ = "";
    private String serviceName_ = "";

    /* JADX INFO: loaded from: classes10.dex */
    public static final class StaticContext extends AbstractC0269h implements sre0 {
        private static final StaticContext DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SERVICE_NAME_FIELD_NUMBER = 2;
        public static final int SYSTEM_FIELD_NUMBER = 1;
        private String system_ = "";
        private String serviceName_ = "";

        static {
            StaticContext staticContext = new StaticContext();
            DEFAULT_INSTANCE = staticContext;
            AbstractC0269h.registerDefaultInstance(StaticContext.class, staticContext);
        }

        private StaticContext() {
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"system_", "serviceName_"});
            }
            if (iOrdinal == 3) {
                return new StaticContext();
            }
            if (iOrdinal == 4) {
                return new C1259b(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            r2n0 r2n0Var = PARSER;
            if (r2n0Var != null) {
                return r2n0Var;
            }
            synchronized (StaticContext.class) {
                try {
                    r110Var = PARSER;
                    if (r110Var == null) {
                        r110Var = new r110(DEFAULT_INSTANCE);
                        PARSER = r110Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return r110Var;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class SurfaceMetadata extends AbstractC0269h implements sre0 {
        public static final int BACKEND_SDK_VERSION_FIELD_NUMBER = 1;
        private static final SurfaceMetadata DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private String backendSdkVersion_ = "";

        static {
            SurfaceMetadata surfaceMetadata = new SurfaceMetadata();
            DEFAULT_INSTANCE = surfaceMetadata;
            AbstractC0269h.registerDefaultInstance(SurfaceMetadata.class, surfaceMetadata);
        }

        private SurfaceMetadata() {
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"backendSdkVersion_"});
            }
            if (iOrdinal == 3) {
                return new SurfaceMetadata();
            }
            if (iOrdinal == 4) {
                return new C1260c(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            r2n0 r2n0Var = PARSER;
            if (r2n0Var != null) {
                return r2n0Var;
            }
            synchronized (SurfaceMetadata.class) {
                try {
                    r110Var = PARSER;
                    if (r110Var == null) {
                        r110Var = new r110(DEFAULT_INSTANCE);
                        PARSER = r110Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return r110Var;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Publish$BackendContext publish$BackendContext = new Publish$BackendContext();
        DEFAULT_INSTANCE = publish$BackendContext;
        AbstractC0269h.registerDefaultInstance(Publish$BackendContext.class, publish$BackendContext);
    }

    private Publish$BackendContext() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\nဉ\u0002", new Object[]{"bitField0_", "system_", "serviceName_", "staticContext_", "dynamicContext_", "surfaceMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Publish$BackendContext();
        }
        if (iOrdinal == 4) {
            return new C1258a();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (Publish$BackendContext.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
