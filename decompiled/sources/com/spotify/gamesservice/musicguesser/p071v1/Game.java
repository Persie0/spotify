package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zhy0;

/* JADX INFO: loaded from: classes7.dex */
public final class Game extends AbstractC0269h implements sre0 {
    public static final int CONFIG_FIELD_NUMBER = 3;
    private static final Game DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Config config_;
    private String id_ = "";
    private ae50 question_ = AbstractC0269h.emptyProtobufList();

    public static final class Config extends AbstractC0269h implements sre0 {
        private static final Config DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SCORECRITERIA_FIELD_NUMBER = 1;
        private ae50 scoreCriteria_ = AbstractC0269h.emptyProtobufList();

        public static final class ScoreCriteria extends AbstractC0269h implements sre0 {
            private static final ScoreCriteria DEFAULT_INSTANCE;
            public static final int MAX_RESPONSE_TIME_MS_FIELD_NUMBER = 3;
            private static volatile r2n0 PARSER = null;
            public static final int SCORE_FIELD_NUMBER = 2;
            public static final int SCORE_THRESHOLD_FIELD_NUMBER = 1;
            private int maxResponseTimeMs_;
            private int scoreThreshold_;
            private int score_;

            static {
                ScoreCriteria scoreCriteria = new ScoreCriteria();
                DEFAULT_INSTANCE = scoreCriteria;
                AbstractC0269h.registerDefaultInstance(ScoreCriteria.class, scoreCriteria);
            }

            private ScoreCriteria() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"scoreThreshold_", "score_", "maxResponseTimeMs_"});
                }
                if (iOrdinal == 3) {
                    return new ScoreCriteria();
                }
                if (iOrdinal == 4) {
                    return new C0764c(DEFAULT_INSTANCE);
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
                synchronized (ScoreCriteria.class) {
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
            public final int m11002n() {
                return this.maxResponseTimeMs_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final int m11003o() {
                return this.score_;
            }

            /* JADX INFO: renamed from: p */
            public final zhy0 m11004p() {
                zhy0 zhy0VarM96182a = zhy0.m96182a(this.scoreThreshold_);
                return zhy0VarM96182a == null ? zhy0.UNRECOGNIZED : zhy0VarM96182a;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Config config = new Config();
            DEFAULT_INSTANCE = config;
            AbstractC0269h.registerDefaultInstance(Config.class, config);
        }

        private Config() {
        }

        /* JADX INFO: renamed from: n */
        public static Config m11000n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"scoreCriteria_", ScoreCriteria.class});
            }
            if (iOrdinal == 3) {
                return new Config();
            }
            if (iOrdinal == 4) {
                return new C0763b(DEFAULT_INSTANCE);
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
            synchronized (Config.class) {
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
        public final ae50 m11001o() {
            return this.scoreCriteria_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Game game = new Game();
        DEFAULT_INSTANCE = game;
        AbstractC0269h.registerDefaultInstance(Game.class, game);
    }

    private Game() {
    }

    /* JADX INFO: renamed from: o */
    public static Game m10997o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "question_", Question.class, "config_"});
        }
        if (iOrdinal == 3) {
            return new Game();
        }
        if (iOrdinal == 4) {
            return new C0762a(DEFAULT_INSTANCE);
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
        synchronized (Game.class) {
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
    public final Config m10998n() {
        Config config = this.config_;
        return config == null ? Config.m11000n() : config;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m10999p() {
        return this.question_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
