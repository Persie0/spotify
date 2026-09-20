package com.spotify.connectivity.auth.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mow;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsSession$APPermanentErrorResult extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsSession$APPermanentErrorResult DEFAULT_INSTANCE;
    public static final int GENERIC_ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
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
        public static GenericError m7491n() {
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
                return new C0553b(DEFAULT_INSTANCE);
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
        public final int m7492o() {
            return this.errorCode_;
        }

        /* JADX INFO: renamed from: p */
        public final String m7493p() {
            return this.errorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsSession$APPermanentErrorResult esSession$APPermanentErrorResult = new EsSession$APPermanentErrorResult();
        DEFAULT_INSTANCE = esSession$APPermanentErrorResult;
        AbstractC0269h.registerDefaultInstance(EsSession$APPermanentErrorResult.class, esSession$APPermanentErrorResult);
    }

    private EsSession$APPermanentErrorResult() {
    }

    /* JADX INFO: renamed from: p */
    public static EsSession$APPermanentErrorResult m7488p(byte[] bArr) {
        return (EsSession$APPermanentErrorResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"error_", "errorCase_", GenericError.class});
        }
        if (iOrdinal == 3) {
            return new EsSession$APPermanentErrorResult();
        }
        if (iOrdinal == 4) {
            return new C0552a(DEFAULT_INSTANCE);
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
        synchronized (EsSession$APPermanentErrorResult.class) {
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
    public final mow m7489n() {
        int i = this.errorCase_;
        mow mowVar = mow.BAD_CREDENTIALS;
        if (i == 1) {
            int iIntValue = ((Integer) this.error_).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    mowVar = iIntValue != 2 ? null : mow.PASSWORD_CHANGED;
                } else {
                    mowVar = mow.REGION_MISMATCH;
                }
            }
            if (mowVar == null) {
                return mow.UNRECOGNIZED;
            }
        }
        return mowVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GenericError m7490o() {
        return this.errorCase_ == 2 ? (GenericError) this.error_ : GenericError.m7491n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
