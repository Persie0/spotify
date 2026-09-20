package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ljc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ChallengeCompletion extends AbstractC0269h implements sre0 {
    private static final ChallengeCompletion DEFAULT_INSTANCE;
    public static final int OTHER_USERNAME_FIELD_NUMBER = 2;
    public static final int OTHER_USER_RESULT_FIELD_NUMBER = 1;
    public static final int OUTCOME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VISUAL_ASSETS_FIELD_NUMBER = 4;
    private int bitField0_;
    private Result otherUserResult_;
    private String otherUsername_ = "";
    private int outcome_;
    private VisualAssets visualAssets_;

    public static final class VisualAssets extends AbstractC0269h implements sre0 {
        private static final VisualAssets DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int WINNER_MARKER_FIELD_NUMBER = 1;
        private String winnerMarker_ = "";

        static {
            VisualAssets visualAssets = new VisualAssets();
            DEFAULT_INSTANCE = visualAssets;
            AbstractC0269h.registerDefaultInstance(VisualAssets.class, visualAssets);
        }

        private VisualAssets() {
        }

        /* JADX INFO: renamed from: n */
        public static VisualAssets m15801n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"winnerMarker_"});
            }
            if (iOrdinal == 3) {
                return new VisualAssets();
            }
            if (iOrdinal == 4) {
                return new C1069h(DEFAULT_INSTANCE);
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
            synchronized (VisualAssets.class) {
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
        public final String m15802o() {
            return this.winnerMarker_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ChallengeCompletion challengeCompletion = new ChallengeCompletion();
        DEFAULT_INSTANCE = challengeCompletion;
        AbstractC0269h.registerDefaultInstance(ChallengeCompletion.class, challengeCompletion);
    }

    private ChallengeCompletion() {
    }

    /* JADX INFO: renamed from: n */
    public static ChallengeCompletion m15796n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004ဉ\u0001", new Object[]{"bitField0_", "otherUserResult_", "otherUsername_", "outcome_", "visualAssets_"});
        }
        if (iOrdinal == 3) {
            return new ChallengeCompletion();
        }
        if (iOrdinal == 4) {
            return new C1068g(DEFAULT_INSTANCE);
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
        synchronized (ChallengeCompletion.class) {
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
    public final Result m15797o() {
        Result result = this.otherUserResult_;
        return result == null ? Result.m15916o() : result;
    }

    /* JADX INFO: renamed from: p */
    public final String m15798p() {
        return this.otherUsername_;
    }

    /* JADX INFO: renamed from: q */
    public final ljc m15799q() {
        ljc ljcVar;
        int i = this.outcome_;
        if (i == 0) {
            ljcVar = ljc.OUTCOME_UNSPECIFIED;
        } else if (i == 1) {
            ljcVar = ljc.DRAW;
        } else if (i == 2) {
            ljcVar = ljc.WIN;
        } else if (i != 3) {
            ljcVar = i != 4 ? null : ljc.PERFECT_TIE;
        } else {
            ljcVar = ljc.LOSS;
        }
        return ljcVar == null ? ljc.UNRECOGNIZED : ljcVar;
    }

    /* JADX INFO: renamed from: r */
    public final VisualAssets m15800r() {
        VisualAssets visualAssets = this.visualAssets_;
        return visualAssets == null ? VisualAssets.m15801n() : visualAssets;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
