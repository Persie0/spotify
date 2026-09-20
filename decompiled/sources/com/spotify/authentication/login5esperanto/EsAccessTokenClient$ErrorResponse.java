package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.mhw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAccessTokenClient$ErrorResponse extends AbstractC0269h implements sre0 {
    private static final EsAccessTokenClient$ErrorResponse DEFAULT_INSTANCE;
    public static final int GENERIC_ERROR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SPECIFIC_ERROR_FIELD_NUMBER = 2;
    private int errorCase_ = 0;
    private Object error_;

    public static final class GenericError extends AbstractC0269h implements sre0 {
        private static final GenericError DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int errorCode_;
        private String errorMessage_ = "";

        static {
            GenericError genericError = new GenericError();
            DEFAULT_INSTANCE = genericError;
            AbstractC0269h.registerDefaultInstance(GenericError.class, genericError);
        }

        private GenericError() {
        }

        /* JADX INFO: renamed from: n */
        public static GenericError m3490n() {
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
                return new GenericError();
            }
            if (iOrdinal == 4) {
                return new C0297b(DEFAULT_INSTANCE);
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
            synchronized (GenericError.class) {
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
        public final int m3491o() {
            return this.errorCode_;
        }

        /* JADX INFO: renamed from: p */
        public final String m3492p() {
            return this.errorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsAccessTokenClient$ErrorResponse esAccessTokenClient$ErrorResponse = new EsAccessTokenClient$ErrorResponse();
        DEFAULT_INSTANCE = esAccessTokenClient$ErrorResponse;
        AbstractC0269h.registerDefaultInstance(EsAccessTokenClient$ErrorResponse.class, esAccessTokenClient$ErrorResponse);
    }

    private EsAccessTokenClient$ErrorResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static EsAccessTokenClient$ErrorResponse m3482n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static EsAccessTokenClient$ErrorResponse m3483u(byte[] bArr) {
        return (EsAccessTokenClient$ErrorResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000", new Object[]{"error_", "errorCase_", GenericError.class});
        }
        if (iOrdinal == 3) {
            return new EsAccessTokenClient$ErrorResponse();
        }
        if (iOrdinal == 4) {
            return new C0296a(DEFAULT_INSTANCE);
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
        synchronized (EsAccessTokenClient$ErrorResponse.class) {
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
    public final int m3484o() {
        int i = this.errorCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final GenericError m3485p() {
        return this.errorCase_ == 1 ? (GenericError) this.error_ : GenericError.m3490n();
    }

    /* JADX INFO: renamed from: q */
    public final mhw m3486q() {
        int i = this.errorCase_;
        mhw mhwVar = mhw.INVALID_CREDENTIALS;
        if (i == 2) {
            switch (((Integer) this.error_).intValue()) {
                case 0:
                    break;
                case 1:
                    mhwVar = mhw.HTTP_ERROR;
                    break;
                case 2:
                    mhwVar = mhw.OFFLINE;
                    break;
                case 3:
                    mhwVar = mhw.BAD_REQUEST;
                    break;
                case 4:
                    mhwVar = mhw.UNSUPPORTED_LOGIN_PROTOCOL;
                    break;
                case 5:
                    mhwVar = mhw.TOO_MANY_ATTEMPTS;
                    break;
                case 6:
                    mhwVar = mhw.NOT_ALLOWED;
                    break;
                default:
                    mhwVar = null;
                    break;
            }
            if (mhwVar == null) {
                return mhw.UNRECOGNIZED;
            }
        }
        return mhwVar;
    }

    /* JADX INFO: renamed from: r */
    public final int m3487r() {
        if (this.errorCase_ == 2) {
            return ((Integer) this.error_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3488s() {
        return this.errorCase_ == 1;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3489t() {
        return this.errorCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
