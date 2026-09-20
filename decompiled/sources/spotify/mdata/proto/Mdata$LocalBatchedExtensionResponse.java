package spotify.mdata.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import java.util.List;
import p204p.ae50;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Mdata$LocalBatchedExtensionResponse extends AbstractC0269h implements sre0 {
    private static final Mdata$LocalBatchedExtensionResponse DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();

    public static final class EntityExtension extends AbstractC0269h implements sre0 {
        private static final EntityExtension DEFAULT_INSTANCE;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
        public static final int HEADER_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String entityUri_ = "";
        private Any extensionData_;
        private ExtensionHeader header_;

        static {
            EntityExtension entityExtension = new EntityExtension();
            DEFAULT_INSTANCE = entityExtension;
            AbstractC0269h.registerDefaultInstance(EntityExtension.class, entityExtension);
        }

        private EntityExtension() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "entityUri_", "header_", "extensionData_"});
            }
            if (iOrdinal == 3) {
                return new EntityExtension();
            }
            if (iOrdinal == 4) {
                return new C2687b(DEFAULT_INSTANCE);
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
            synchronized (EntityExtension.class) {
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
        public final String m97629n() {
            return this.entityUri_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final Any m97630o() {
            Any any = this.extensionData_;
            return any == null ? Any.m1909p() : any;
        }

        /* JADX INFO: renamed from: p */
        public final ExtensionHeader m97631p() {
            ExtensionHeader extensionHeader = this.header_;
            return extensionHeader == null ? ExtensionHeader.m97633n() : extensionHeader;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Extension extends AbstractC0269h implements sre0 {
        private static final Extension DEFAULT_INSTANCE;
        public static final int ENTITY_EXTENSION_FIELD_NUMBER = 2;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private ae50 entityExtension_ = AbstractC0269h.emptyProtobufList();
        private int extensionKind_;

        static {
            Extension extension = new Extension();
            DEFAULT_INSTANCE = extension;
            AbstractC0269h.registerDefaultInstance(Extension.class, extension);
        }

        private Extension() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"extensionKind_", "entityExtension_", EntityExtension.class});
            }
            if (iOrdinal == 3) {
                return new Extension();
            }
            if (iOrdinal == 4) {
                return new C2688c(DEFAULT_INSTANCE);
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
            synchronized (Extension.class) {
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

        public final ntx getExtensionKind() {
            ntx ntxVarM65644b = ntx.m65644b(this.extensionKind_);
            return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
        }

        /* JADX INFO: renamed from: n */
        public final ae50 m97632n() {
            return this.entityExtension_;
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

    public static final class ExtensionHeader extends AbstractC0269h implements sre0 {
        public static final int CACHE_EXPIRY_TIMESTAMP_FIELD_NUMBER = 5;
        public static final int CACHE_VALID_FIELD_NUMBER = 1;
        private static final ExtensionHeader DEFAULT_INSTANCE;
        public static final int ETAG_FIELD_NUMBER = 7;
        public static final int IS_EMPTY_FIELD_NUMBER = 4;
        public static final int OFFLINE_EXPIRY_TIMESTAMP_FIELD_NUMBER = 6;
        public static final int OFFLINE_VALID_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int STATUS_CODE_FIELD_NUMBER = 3;
        private long cacheExpiryTimestamp_;
        private boolean cacheValid_;
        private String etag_ = "";
        private boolean isEmpty_;
        private long offlineExpiryTimestamp_;
        private boolean offlineValid_;
        private int statusCode_;

        static {
            ExtensionHeader extensionHeader = new ExtensionHeader();
            DEFAULT_INSTANCE = extensionHeader;
            AbstractC0269h.registerDefaultInstance(ExtensionHeader.class, extensionHeader);
        }

        private ExtensionHeader() {
        }

        /* JADX INFO: renamed from: n */
        public static ExtensionHeader m97633n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ", new Object[]{"cacheValid_", "offlineValid_", "statusCode_", "isEmpty_", "cacheExpiryTimestamp_", "offlineExpiryTimestamp_", "etag_"});
            }
            if (iOrdinal == 3) {
                return new ExtensionHeader();
            }
            if (iOrdinal == 4) {
                return new C2689d(DEFAULT_INSTANCE);
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
            synchronized (ExtensionHeader.class) {
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

        public final int getStatusCode() {
            return this.statusCode_;
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
        Mdata$LocalBatchedExtensionResponse mdata$LocalBatchedExtensionResponse = new Mdata$LocalBatchedExtensionResponse();
        DEFAULT_INSTANCE = mdata$LocalBatchedExtensionResponse;
        AbstractC0269h.registerDefaultInstance(Mdata$LocalBatchedExtensionResponse.class, mdata$LocalBatchedExtensionResponse);
    }

    private Mdata$LocalBatchedExtensionResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static Mdata$LocalBatchedExtensionResponse m97628n(byte[] bArr) {
        return (Mdata$LocalBatchedExtensionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"extension_", Extension.class});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalBatchedExtensionResponse();
        }
        if (iOrdinal == 4) {
            return new C2686a(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalBatchedExtensionResponse.class) {
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

    public final List getExtensionList() {
        return this.extension_;
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
