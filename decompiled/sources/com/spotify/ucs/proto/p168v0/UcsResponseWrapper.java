package com.spotify.ucs.proto.p168v0;

import com.google.protobuf.AbstractC0269h;
import com.spotify.rcs.resolver.grpc.p141v0.ResolveResponse;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ix91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UcsResponseWrapper extends AbstractC0269h implements sre0 {
    private static final UcsResponseWrapper DEFAULT_INSTANCE;
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
        public static AccountAttributesResponse m21875p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"accountAttributes_", AbstractC1308d.f6914a});
            }
            if (iOrdinal == 3) {
                return new AccountAttributesResponse();
            }
            if (iOrdinal == 4) {
                return new C1309e();
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
        public final Map m21876o() {
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
        public static Error m21878o() {
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
                return new C1311g();
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
        public final int m21879p() {
            return this.errorCode_;
        }

        /* JADX INFO: renamed from: q */
        public final String m21880q() {
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

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static UcsResponse m21882r() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001\u0005\u0002", new Object[]{"resolveResult_", "resolveResultCase_", "accountAttributesResult_", "accountAttributesResultCase_", ResolveResponse.class, Error.class, AccountAttributesResponse.class, Error.class, "fetchTimeMillis_"});
            }
            if (iOrdinal == 3) {
                return new UcsResponse();
            }
            if (iOrdinal == 4) {
                return new C1313i();
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
        public final Error m21883o() {
            return this.accountAttributesResultCase_ == 4 ? (Error) this.accountAttributesResult_ : Error.m21878o();
        }

        /* JADX INFO: renamed from: p */
        public final EnumC1312h m21884p() {
            int i = this.accountAttributesResultCase_;
            if (i == 0) {
                return EnumC1312h.ACCOUNTATTRIBUTESRESULT_NOT_SET;
            }
            if (i == 3) {
                return EnumC1312h.ACCOUNT_ATTRIBUTES_SUCCESS;
            }
            if (i != 4) {
                return null;
            }
            return EnumC1312h.ACCOUNT_ATTRIBUTES_ERROR;
        }

        /* JADX INFO: renamed from: q */
        public final AccountAttributesResponse m21885q() {
            return this.accountAttributesResultCase_ == 3 ? (AccountAttributesResponse) this.accountAttributesResult_ : AccountAttributesResponse.m21875p();
        }

        /* JADX INFO: renamed from: s */
        public final long m21886s() {
            return this.fetchTimeMillis_;
        }

        /* JADX INFO: renamed from: t */
        public final Error m21887t() {
            return this.resolveResultCase_ == 2 ? (Error) this.resolveResult_ : Error.m21878o();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final EnumC1314j m21888u() {
            int i = this.resolveResultCase_;
            if (i == 0) {
                return EnumC1314j.RESOLVERESULT_NOT_SET;
            }
            if (i == 1) {
                return EnumC1314j.RESOLVE_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return EnumC1314j.RESOLVE_ERROR;
        }

        /* JADX INFO: renamed from: v */
        public final ResolveResponse m21889v() {
            return this.resolveResultCase_ == 1 ? (ResolveResponse) this.resolveResult_ : ResolveResponse.m20149o();
        }

        /* JADX INFO: renamed from: w */
        public final boolean m21890w() {
            return this.resolveResultCase_ == 1;
        }
    }

    static {
        UcsResponseWrapper ucsResponseWrapper = new UcsResponseWrapper();
        DEFAULT_INSTANCE = ucsResponseWrapper;
        AbstractC0269h.registerDefaultInstance(UcsResponseWrapper.class, ucsResponseWrapper);
    }

    private UcsResponseWrapper() {
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
            return new UcsResponseWrapper();
        }
        if (iOrdinal == 4) {
            return new C1310f();
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
        synchronized (UcsResponseWrapper.class) {
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
    public final Error m21871o() {
        return this.resultCase_ == 2 ? (Error) this.result_ : Error.m21878o();
    }

    /* JADX INFO: renamed from: p */
    public final ix91 m21872p() {
        int i = this.resultCase_;
        if (i == 0) {
            return ix91.RESULT_NOT_SET;
        }
        if (i == 1) {
            return ix91.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ix91.ERROR;
    }

    /* JADX INFO: renamed from: q */
    public final UcsResponse m21873q() {
        return this.resultCase_ == 1 ? (UcsResponse) this.result_ : UcsResponse.m21882r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
