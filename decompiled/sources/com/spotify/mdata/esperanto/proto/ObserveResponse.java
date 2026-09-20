package com.spotify.mdata.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.ae50;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserveResponse extends AbstractC0269h implements sre0 {
    private static final ObserveResponse DEFAULT_INSTANCE;
    public static final int EXTENSION_RESULT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PENDING_RESPONSE_FIELD_NUMBER = 2;
    private ae50 extensionResult_ = AbstractC0269h.emptyProtobufList();
    private boolean pendingResponse_;

    public static final class Details extends AbstractC0269h implements sre0 {
        public static final int CACHE_STATUS_FIELD_NUMBER = 1;
        private static final Details DEFAULT_INSTANCE;
        public static final int FRESH_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int cacheStatus_;
        private boolean fresh_;

        static {
            Details details = new Details();
            DEFAULT_INSTANCE = details;
            AbstractC0269h.registerDefaultInstance(Details.class, details);
        }

        private Details() {
        }

        /* JADX INFO: renamed from: p */
        public static Details m13444p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"cacheStatus_", "fresh_"});
            }
            if (iOrdinal == 3) {
                return new Details();
            }
            if (iOrdinal == 4) {
                return new C0880d();
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
            synchronized (Details.class) {
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
        public final EnumC0881e m13445o() {
            EnumC0881e enumC0881e;
            int i = this.cacheStatus_;
            if (i == 0) {
                enumC0881e = EnumC0881e.UNKNOWN;
            } else if (i == 1) {
                enumC0881e = EnumC0881e.OK;
            } else if (i == 2) {
                enumC0881e = EnumC0881e.NOT_RESOLVED;
            } else if (i != 3) {
                enumC0881e = i != 4 ? null : EnumC0881e.UNAVAILABLE_FOR_LEGAL_REASONS;
            } else {
                enumC0881e = EnumC0881e.NOT_FOUND;
            }
            return enumC0881e == null ? EnumC0881e.UNRECOGNIZED : enumC0881e;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m13446q() {
            return this.fresh_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ExtensionResult extends AbstractC0269h implements sre0 {
        private static final ExtensionResult DEFAULT_INSTANCE;
        public static final int DETAILS_FIELD_NUMBER = 5;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 4;
        private int bitField0_;
        private Details details_;
        private String entityUri_ = "";
        private Any extensionData_;
        private int extensionKind_;
        private int status_;

        static {
            ExtensionResult extensionResult = new ExtensionResult();
            DEFAULT_INSTANCE = extensionResult;
            AbstractC0269h.registerDefaultInstance(ExtensionResult.class, extensionResult);
        }

        private ExtensionResult() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "entityUri_", "extensionKind_", "extensionData_", "status_", "details_"});
            }
            if (iOrdinal == 3) {
                return new ExtensionResult();
            }
            if (iOrdinal == 4) {
                return new C0882f();
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
            synchronized (ExtensionResult.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final Details m13448o() {
            Details details = this.details_;
            return details == null ? Details.m13444p() : details;
        }

        /* JADX INFO: renamed from: p */
        public final String m13449p() {
            return this.entityUri_;
        }

        /* JADX INFO: renamed from: q */
        public final Any m13450q() {
            Any any = this.extensionData_;
            return any == null ? Any.m1909p() : any;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ObserveResponse observeResponse = new ObserveResponse();
        DEFAULT_INSTANCE = observeResponse;
        AbstractC0269h.registerDefaultInstance(ObserveResponse.class, observeResponse);
    }

    private ObserveResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ObserveResponse m13440q(byte[] bArr) {
        return (ObserveResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"extensionResult_", ExtensionResult.class, "pendingResponse_"});
        }
        if (iOrdinal == 3) {
            return new ObserveResponse();
        }
        if (iOrdinal == 4) {
            return new C0879c();
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
        synchronized (ObserveResponse.class) {
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
    public final ae50 m13441o() {
        return this.extensionResult_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m13442p() {
        return this.pendingResponse_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
