package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSetSleepTimerRequest$SetSleepTimerRequest extends AbstractC0269h implements sre0 {
    public static final int CLEAR_FIELD_NUMBER = 3;
    private static final EsSetSleepTimerRequest$SetSleepTimerRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int END_OF_TRACK_FIELD_NUMBER = 5;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private int timerTypeCase_ = 0;
    private Object timerType_;

    public static final class Clear extends AbstractC0269h implements sre0 {
        private static final Clear DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Clear clear = new Clear();
            DEFAULT_INSTANCE = clear;
            AbstractC0269h.registerDefaultInstance(Clear.class, clear);
        }

        private Clear() {
        }

        /* JADX INFO: renamed from: n */
        public static C1165b m17985n() {
            return (C1165b) DEFAULT_INSTANCE.createBuilder();
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
                return new Clear();
            }
            if (iOrdinal == 4) {
                return new C1165b(DEFAULT_INSTANCE);
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
            synchronized (Clear.class) {
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

    public static final class Duration extends AbstractC0269h implements sre0 {
        private static final Duration DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private com.google.protobuf.Duration duration_;

        static {
            Duration duration = new Duration();
            DEFAULT_INSTANCE = duration;
            AbstractC0269h.registerDefaultInstance(Duration.class, duration);
        }

        private Duration() {
        }

        /* JADX INFO: renamed from: n */
        public static void m17986n(Duration duration, com.google.protobuf.Duration duration2) {
            duration.getClass();
            duration2.getClass();
            duration.duration_ = duration2;
            duration.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static C1166c m17987o() {
            return (C1166c) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "duration_"});
            }
            if (iOrdinal == 3) {
                return new Duration();
            }
            if (iOrdinal == 4) {
                return new C1166c(DEFAULT_INSTANCE);
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
            synchronized (Duration.class) {
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

    public static final class EndOfTrack extends AbstractC0269h implements sre0 {
        private static final EndOfTrack DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            EndOfTrack endOfTrack = new EndOfTrack();
            DEFAULT_INSTANCE = endOfTrack;
            AbstractC0269h.registerDefaultInstance(EndOfTrack.class, endOfTrack);
        }

        private EndOfTrack() {
        }

        /* JADX INFO: renamed from: n */
        public static C1167d m17988n() {
            return (C1167d) DEFAULT_INSTANCE.createBuilder();
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
                return new EndOfTrack();
            }
            if (iOrdinal == 4) {
                return new C1167d(DEFAULT_INSTANCE);
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
            synchronized (EndOfTrack.class) {
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
        EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest = new EsSetSleepTimerRequest$SetSleepTimerRequest();
        DEFAULT_INSTANCE = esSetSleepTimerRequest$SetSleepTimerRequest;
        AbstractC0269h.registerDefaultInstance(EsSetSleepTimerRequest$SetSleepTimerRequest.class, esSetSleepTimerRequest$SetSleepTimerRequest);
    }

    private EsSetSleepTimerRequest$SetSleepTimerRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17979n(EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest, Clear clear) {
        esSetSleepTimerRequest$SetSleepTimerRequest.getClass();
        clear.getClass();
        esSetSleepTimerRequest$SetSleepTimerRequest.timerType_ = clear;
        esSetSleepTimerRequest$SetSleepTimerRequest.timerTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: o */
    public static void m17980o(EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest, Duration duration) {
        esSetSleepTimerRequest$SetSleepTimerRequest.getClass();
        duration.getClass();
        esSetSleepTimerRequest$SetSleepTimerRequest.timerType_ = duration;
        esSetSleepTimerRequest$SetSleepTimerRequest.timerTypeCase_ = 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m17981p(EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest, EndOfTrack endOfTrack) {
        esSetSleepTimerRequest$SetSleepTimerRequest.getClass();
        endOfTrack.getClass();
        esSetSleepTimerRequest$SetSleepTimerRequest.timerType_ = endOfTrack;
        esSetSleepTimerRequest$SetSleepTimerRequest.timerTypeCase_ = 5;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17982q(EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetSleepTimerRequest$SetSleepTimerRequest.getClass();
        esSetSleepTimerRequest$SetSleepTimerRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSetSleepTimerRequest$SetSleepTimerRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m17983r(EsSetSleepTimerRequest$SetSleepTimerRequest esSetSleepTimerRequest$SetSleepTimerRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetSleepTimerRequest$SetSleepTimerRequest.getClass();
        esSetSleepTimerRequest$SetSleepTimerRequest.options_ = esCommandOptions$CommandOptions;
        esSetSleepTimerRequest$SetSleepTimerRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static C1164a m17984s() {
        return (C1164a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"timerType_", "timerTypeCase_", "bitField0_", "options_", "loggingParams_", Clear.class, Duration.class, EndOfTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsSetSleepTimerRequest$SetSleepTimerRequest();
        }
        if (iOrdinal == 4) {
            return new C1164a(DEFAULT_INSTANCE);
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
        synchronized (EsSetSleepTimerRequest$SetSleepTimerRequest.class) {
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
