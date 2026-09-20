package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$DevicesWithContextResponse extends AbstractC0269h implements sre0 {
    private static final EsOffline$DevicesWithContextResponse DEFAULT_INSTANCE;
    public static final int DEVICEWITHCONTEXT_FIELD_NUMBER = 1;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 deviceWithContext_ = AbstractC0269h.emptyProtobufList();
    private long error_;

    public static final class DeviceWithContext extends AbstractC0269h implements sre0 {
        public static final int CONTEXT_FIELD_NUMBER = 3;
        private static final DeviceWithContext DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 1;
        public static final int IS_SUPPORTED_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private EsOffline$Context context_;
        private EsOffline$Device device_;
        private boolean isSupported_;

        static {
            DeviceWithContext deviceWithContext = new DeviceWithContext();
            DEFAULT_INSTANCE = deviceWithContext;
            AbstractC0269h.registerDefaultInstance(DeviceWithContext.class, deviceWithContext);
        }

        private DeviceWithContext() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001", new Object[]{"bitField0_", "device_", "isSupported_", "context_"});
            }
            if (iOrdinal == 3) {
                return new DeviceWithContext();
            }
            if (iOrdinal == 4) {
                return new C1090b(DEFAULT_INSTANCE);
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
            synchronized (DeviceWithContext.class) {
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

        /* JADX INFO: renamed from: n */
        public final EsOffline$Context m16119n() {
            EsOffline$Context esOffline$Context = this.context_;
            return esOffline$Context == null ? EsOffline$Context.m16092o() : esOffline$Context;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final EsOffline$Device m16120o() {
            EsOffline$Device esOffline$Device = this.device_;
            return esOffline$Device == null ? EsOffline$Device.m16103p() : esOffline$Device;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m16121p() {
            return this.isSupported_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOffline$DevicesWithContextResponse esOffline$DevicesWithContextResponse = new EsOffline$DevicesWithContextResponse();
        DEFAULT_INSTANCE = esOffline$DevicesWithContextResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$DevicesWithContextResponse.class, esOffline$DevicesWithContextResponse);
    }

    private EsOffline$DevicesWithContextResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static EsOffline$DevicesWithContextResponse m16116p(byte[] bArr) {
        return (EsOffline$DevicesWithContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"deviceWithContext_", DeviceWithContext.class, "error_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$DevicesWithContextResponse();
        }
        if (iOrdinal == 4) {
            return new C1089a(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$DevicesWithContextResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m16117n() {
        return this.deviceWithContext_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m16118o() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
