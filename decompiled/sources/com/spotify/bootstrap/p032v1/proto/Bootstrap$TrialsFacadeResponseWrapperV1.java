package com.spotify.bootstrap.p032v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Bootstrap$TrialsFacadeResponseWrapperV1 extends AbstractC0269h implements sre0 {
    private static final Bootstrap$TrialsFacadeResponseWrapperV1 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class TrialsFacadeResponseWrapperError extends AbstractC0269h implements sre0 {
        private static final TrialsFacadeResponseWrapperError DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int LOG_ID_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int errorCode_;
        private String message_ = "";
        private String logId_ = "";

        static {
            TrialsFacadeResponseWrapperError trialsFacadeResponseWrapperError = new TrialsFacadeResponseWrapperError();
            DEFAULT_INSTANCE = trialsFacadeResponseWrapperError;
            AbstractC0269h.registerDefaultInstance(TrialsFacadeResponseWrapperError.class, trialsFacadeResponseWrapperError);
        }

        private TrialsFacadeResponseWrapperError() {
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
                return new TrialsFacadeResponseWrapperError();
            }
            if (iOrdinal == 4) {
                return new C0312b(DEFAULT_INSTANCE);
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
            synchronized (TrialsFacadeResponseWrapperError.class) {
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class TrialsFacadeResponseWrapperSuccess extends AbstractC0269h implements sre0 {
        private static final TrialsFacadeResponseWrapperSuccess DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            TrialsFacadeResponseWrapperSuccess trialsFacadeResponseWrapperSuccess = new TrialsFacadeResponseWrapperSuccess();
            DEFAULT_INSTANCE = trialsFacadeResponseWrapperSuccess;
            AbstractC0269h.registerDefaultInstance(TrialsFacadeResponseWrapperSuccess.class, trialsFacadeResponseWrapperSuccess);
        }

        private TrialsFacadeResponseWrapperSuccess() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new TrialsFacadeResponseWrapperSuccess();
            }
            if (iOrdinal == 4) {
                return new C0313c(DEFAULT_INSTANCE);
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
            synchronized (TrialsFacadeResponseWrapperSuccess.class) {
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
        Bootstrap$TrialsFacadeResponseWrapperV1 bootstrap$TrialsFacadeResponseWrapperV1 = new Bootstrap$TrialsFacadeResponseWrapperV1();
        DEFAULT_INSTANCE = bootstrap$TrialsFacadeResponseWrapperV1;
        AbstractC0269h.registerDefaultInstance(Bootstrap$TrialsFacadeResponseWrapperV1.class, bootstrap$TrialsFacadeResponseWrapperV1);
    }

    private Bootstrap$TrialsFacadeResponseWrapperV1() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", TrialsFacadeResponseWrapperSuccess.class, TrialsFacadeResponseWrapperError.class});
        }
        if (iOrdinal == 3) {
            return new Bootstrap$TrialsFacadeResponseWrapperV1();
        }
        if (iOrdinal == 4) {
            return new C0311a();
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
        synchronized (Bootstrap$TrialsFacadeResponseWrapperV1.class) {
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
