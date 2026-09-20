package com.spotify.bootstrap.p032v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.ucs.p169v0.proto.Ucs$UcsResponseWrapper;
import p204p.ore0;
import p204p.pi9;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Bootstrap$UcsResponseWrapperV0 extends AbstractC0269h implements sre0 {
    private static final Bootstrap$UcsResponseWrapperV0 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    public static final class UcsResponseWrapperError extends AbstractC0269h implements sre0 {
        private static final UcsResponseWrapperError DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int LOG_ID_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int errorCode_;
        private String message_ = "";
        private String logId_ = "";

        static {
            UcsResponseWrapperError ucsResponseWrapperError = new UcsResponseWrapperError();
            DEFAULT_INSTANCE = ucsResponseWrapperError;
            AbstractC0269h.registerDefaultInstance(UcsResponseWrapperError.class, ucsResponseWrapperError);
        }

        private UcsResponseWrapperError() {
        }

        /* JADX INFO: renamed from: o */
        public static UcsResponseWrapperError m4045o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"errorCode_", "message_", "logId_"});
            }
            if (iOrdinal == 3) {
                return new UcsResponseWrapperError();
            }
            if (iOrdinal == 4) {
                return new C0315e();
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
            synchronized (UcsResponseWrapperError.class) {
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

        public final String getMessage() {
            return this.message_;
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

    public static final class UcsResponseWrapperSuccess extends AbstractC0269h implements sre0 {
        public static final int CUSTOMIZATION_FIELD_NUMBER = 1;
        private static final UcsResponseWrapperSuccess DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private Ucs$UcsResponseWrapper customization_;

        static {
            UcsResponseWrapperSuccess ucsResponseWrapperSuccess = new UcsResponseWrapperSuccess();
            DEFAULT_INSTANCE = ucsResponseWrapperSuccess;
            AbstractC0269h.registerDefaultInstance(UcsResponseWrapperSuccess.class, ucsResponseWrapperSuccess);
        }

        private UcsResponseWrapperSuccess() {
        }

        /* JADX INFO: renamed from: p */
        public static UcsResponseWrapperSuccess m4047p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "customization_"});
            }
            if (iOrdinal == 3) {
                return new UcsResponseWrapperSuccess();
            }
            if (iOrdinal == 4) {
                return new C0316f();
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
            synchronized (UcsResponseWrapperSuccess.class) {
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
        public final Ucs$UcsResponseWrapper m4048o() {
            Ucs$UcsResponseWrapper ucs$UcsResponseWrapper = this.customization_;
            return ucs$UcsResponseWrapper == null ? Ucs$UcsResponseWrapper.m21907o() : ucs$UcsResponseWrapper;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m4049q() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Bootstrap$UcsResponseWrapperV0 bootstrap$UcsResponseWrapperV0 = new Bootstrap$UcsResponseWrapperV0();
        DEFAULT_INSTANCE = bootstrap$UcsResponseWrapperV0;
        AbstractC0269h.registerDefaultInstance(Bootstrap$UcsResponseWrapperV0.class, bootstrap$UcsResponseWrapperV0);
    }

    private Bootstrap$UcsResponseWrapperV0() {
    }

    /* JADX INFO: renamed from: o */
    public static Bootstrap$UcsResponseWrapperV0 m4040o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", UcsResponseWrapperSuccess.class, UcsResponseWrapperError.class});
        }
        if (iOrdinal == 3) {
            return new Bootstrap$UcsResponseWrapperV0();
        }
        if (iOrdinal == 4) {
            return new C0314d();
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
        synchronized (Bootstrap$UcsResponseWrapperV0.class) {
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
    public final UcsResponseWrapperError m4041p() {
        return this.resultCase_ == 2 ? (UcsResponseWrapperError) this.result_ : UcsResponseWrapperError.m4045o();
    }

    /* JADX INFO: renamed from: q */
    public final int m4042q() {
        return pi9.m70077b(this.resultCase_);
    }

    /* JADX INFO: renamed from: r */
    public final UcsResponseWrapperSuccess m4043r() {
        return this.resultCase_ == 1 ? (UcsResponseWrapperSuccess) this.result_ : UcsResponseWrapperSuccess.m4047p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
