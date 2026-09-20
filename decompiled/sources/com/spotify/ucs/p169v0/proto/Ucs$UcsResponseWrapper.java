package com.spotify.ucs.p169v0.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.rcs.resolver.grpc.p141v0.proto.Resolve$ResolveResponse;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Ucs$UcsResponseWrapper extends AbstractC0269h implements sre0 {
    private static final Ucs$UcsResponseWrapper DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    public static final class AccountAttributesResponse extends AbstractC0269h implements sre0 {
        public static final int ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 1;
        private static final AccountAttributesResponse DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private ihc0 accountAttributes_ = ihc0.f102235b;

        static {
            AccountAttributesResponse accountAttributesResponse = new AccountAttributesResponse();
            DEFAULT_INSTANCE = accountAttributesResponse;
            AbstractC0269h.registerDefaultInstance(AccountAttributesResponse.class, accountAttributesResponse);
        }

        private AccountAttributesResponse() {
        }

        /* JADX INFO: renamed from: p */
        public static AccountAttributesResponse m21913p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"accountAttributes_", AbstractC1318d.f6921a});
            }
            if (iOrdinal == 3) {
                return new AccountAttributesResponse();
            }
            if (iOrdinal == 4) {
                return new C1319e();
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
            synchronized (AccountAttributesResponse.class) {
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
        public final Map m21914o() {
            return Collections.unmodifiableMap(this.accountAttributes_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Error extends AbstractC0269h implements sre0 {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int errorCode_;
        private String errorMessage_ = "";

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            AbstractC0269h.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        /* JADX INFO: renamed from: o */
        public static Error m21916o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"errorCode_", "errorMessage_"});
            }
            if (iOrdinal == 3) {
                return new Error();
            }
            if (iOrdinal == 4) {
                return new C1321g();
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
            synchronized (Error.class) {
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

        /* JADX INFO: renamed from: p */
        public final String m21917p() {
            return this.errorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UcsResponse extends AbstractC0269h implements sre0 {
        public static final int ACCOUNT_ATTRIBUTES_ERROR_FIELD_NUMBER = 4;
        public static final int ACCOUNT_ATTRIBUTES_SUCCESS_FIELD_NUMBER = 3;
        private static final UcsResponse DEFAULT_INSTANCE;
        public static final int FETCH_TIME_MILLIS_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int RESOLVE_ERROR_FIELD_NUMBER = 2;
        public static final int RESOLVE_SUCCESS_FIELD_NUMBER = 1;
        private Object accountAttributesResult_;
        private long fetchTimeMillis_;
        private Object resolveResult_;
        private int resolveResultCase_ = 0;
        private int accountAttributesResultCase_ = 0;

        static {
            UcsResponse ucsResponse = new UcsResponse();
            DEFAULT_INSTANCE = ucsResponse;
            AbstractC0269h.registerDefaultInstance(UcsResponse.class, ucsResponse);
        }

        private UcsResponse() {
        }

        /* JADX INFO: renamed from: p */
        public static UcsResponse m21919p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001\u0005\u0002", new Object[]{"resolveResult_", "resolveResultCase_", "accountAttributesResult_", "accountAttributesResultCase_", Resolve$ResolveResponse.class, Error.class, AccountAttributesResponse.class, Error.class, "fetchTimeMillis_"});
            }
            if (iOrdinal == 3) {
                return new UcsResponse();
            }
            if (iOrdinal == 4) {
                return new C1322h();
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
            synchronized (UcsResponse.class) {
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
        public final AccountAttributesResponse m21920o() {
            return this.accountAttributesResultCase_ == 3 ? (AccountAttributesResponse) this.accountAttributesResult_ : AccountAttributesResponse.m21913p();
        }

        /* JADX INFO: renamed from: q */
        public final Resolve$ResolveResponse m21921q() {
            return this.resolveResultCase_ == 1 ? (Resolve$ResolveResponse) this.resolveResult_ : Resolve$ResolveResponse.m20175p();
        }

        /* JADX INFO: renamed from: r */
        public final boolean m21922r() {
            return this.accountAttributesResultCase_ == 3;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m21923s() {
            return this.resolveResultCase_ == 1;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Ucs$UcsResponseWrapper ucs$UcsResponseWrapper = new Ucs$UcsResponseWrapper();
        DEFAULT_INSTANCE = ucs$UcsResponseWrapper;
        AbstractC0269h.registerDefaultInstance(Ucs$UcsResponseWrapper.class, ucs$UcsResponseWrapper);
    }

    private Ucs$UcsResponseWrapper() {
    }

    /* JADX INFO: renamed from: o */
    public static Ucs$UcsResponseWrapper m21907o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", UcsResponse.class, Error.class});
        }
        if (iOrdinal == 3) {
            return new Ucs$UcsResponseWrapper();
        }
        if (iOrdinal == 4) {
            return new C1320f();
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
        synchronized (Ucs$UcsResponseWrapper.class) {
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

    /* JADX INFO: renamed from: p */
    public final Error m21908p() {
        return this.resultCase_ == 2 ? (Error) this.result_ : Error.m21916o();
    }

    /* JADX INFO: renamed from: q */
    public final UcsResponse m21909q() {
        return this.resultCase_ == 1 ? (UcsResponse) this.result_ : UcsResponse.m21919p();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21910r() {
        return this.resultCase_ == 2;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21911s() {
        return this.resultCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
