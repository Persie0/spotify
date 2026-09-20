package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsSleepTimer$SleepTimer extends AbstractC0269h implements sre0 {
    private static final EsSleepTimer$SleepTimer DEFAULT_INSTANCE;
    public static final int END_OF_TRACK_FIELD_NUMBER = 3;
    public static final int NONE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int timerTypeCase_ = 0;
    private Object timerType_;

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
                return new C1169f();
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

    public static final class None extends AbstractC0269h implements sre0 {
        private static final None DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            None none = new None();
            DEFAULT_INSTANCE = none;
            AbstractC0269h.registerDefaultInstance(None.class, none);
        }

        private None() {
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
                return new None();
            }
            if (iOrdinal == 4) {
                return new C1170g();
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
            synchronized (None.class) {
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

    public static final class Timestamp extends AbstractC0269h implements sre0 {
        private static final Timestamp DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private long timestamp_;

        static {
            Timestamp timestamp = new Timestamp();
            DEFAULT_INSTANCE = timestamp;
            AbstractC0269h.registerDefaultInstance(Timestamp.class, timestamp);
        }

        private Timestamp() {
        }

        /* JADX INFO: renamed from: o */
        public static Timestamp m18019o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"timestamp_"});
            }
            if (iOrdinal == 3) {
                return new Timestamp();
            }
            if (iOrdinal == 4) {
                return new C1171h();
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
            synchronized (Timestamp.class) {
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

        public final long getTimestamp() {
            return this.timestamp_;
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
        EsSleepTimer$SleepTimer esSleepTimer$SleepTimer = new EsSleepTimer$SleepTimer();
        DEFAULT_INSTANCE = esSleepTimer$SleepTimer;
        AbstractC0269h.registerDefaultInstance(EsSleepTimer$SleepTimer.class, esSleepTimer$SleepTimer);
    }

    private EsSleepTimer$SleepTimer() {
    }

    /* JADX INFO: renamed from: o */
    public static EsSleepTimer$SleepTimer m18012o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"timerType_", "timerTypeCase_", None.class, Timestamp.class, EndOfTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsSleepTimer$SleepTimer();
        }
        if (iOrdinal == 4) {
            return new C1168e();
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
        synchronized (EsSleepTimer$SleepTimer.class) {
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

    public final boolean hasTimestamp() {
        return this.timerTypeCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Timestamp m18013p() {
        return this.timerTypeCase_ == 2 ? (Timestamp) this.timerType_ : Timestamp.m18019o();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18014q() {
        return this.timerTypeCase_ == 3;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18015r() {
        return this.timerTypeCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
