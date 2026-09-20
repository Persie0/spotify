package com.spotify.offline.offlineplugin_proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOfflinePlugin$Metadata extends AbstractC0269h implements sre0 {
    private static final EsOfflinePlugin$Metadata DEFAULT_INSTANCE;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Any extensionData_;
    private Header header_;

    public static final class Header extends AbstractC0269h implements sre0 {
        private static final Header DEFAULT_INSTANCE;
        public static final int IS_EMPTY_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int STATUS_CODE_FIELD_NUMBER = 1;
        private boolean isEmpty_;
        private int statusCode_;

        static {
            Header header = new Header();
            DEFAULT_INSTANCE = header;
            AbstractC0269h.registerDefaultInstance(Header.class, header);
        }

        private Header() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"statusCode_", "isEmpty_"});
            }
            if (iOrdinal == 3) {
                return new Header();
            }
            if (iOrdinal == 4) {
                return new C1084j(DEFAULT_INSTANCE);
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
            synchronized (Header.class) {
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
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = new EsOfflinePlugin$Metadata();
        DEFAULT_INSTANCE = esOfflinePlugin$Metadata;
        AbstractC0269h.registerDefaultInstance(EsOfflinePlugin$Metadata.class, esOfflinePlugin$Metadata);
    }

    private EsOfflinePlugin$Metadata() {
    }

    /* JADX INFO: renamed from: n */
    public static EsOfflinePlugin$Metadata m16057n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "header_", "extensionData_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$Metadata();
        }
        if (iOrdinal == 4) {
            return new C1083i(DEFAULT_INSTANCE);
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
        synchronized (EsOfflinePlugin$Metadata.class) {
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

    /* JADX INFO: renamed from: o */
    public final Any m16058o() {
        Any any = this.extensionData_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
