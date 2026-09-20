package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GranularRatings extends AbstractC0269h implements sre0 {
    private static final GranularRatings DEFAULT_INSTANCE;
    public static final int FIVE_STARS_FIELD_NUMBER = 5;
    public static final int FOUR_STARS_FIELD_NUMBER = 4;
    public static final int ONE_STAR_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int THREE_STARS_FIELD_NUMBER = 3;
    public static final int TWO_STARS_FIELD_NUMBER = 2;
    private long fiveStars_;
    private long fourStars_;
    private long oneStar_;
    private long threeStars_;
    private long twoStars_;

    static {
        GranularRatings granularRatings = new GranularRatings();
        DEFAULT_INSTANCE = granularRatings;
        AbstractC0269h.registerDefaultInstance(GranularRatings.class, granularRatings);
    }

    private GranularRatings() {
    }

    /* JADX INFO: renamed from: o */
    public static GranularRatings m7859o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"oneStar_", "twoStars_", "threeStars_", "fourStars_", "fiveStars_"});
        }
        if (iOrdinal == 3) {
            return new GranularRatings();
        }
        if (iOrdinal == 4) {
            return new iw10(2);
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
        synchronized (GranularRatings.class) {
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
    public final long m7860p() {
        return this.fiveStars_;
    }

    /* JADX INFO: renamed from: q */
    public final long m7861q() {
        return this.fourStars_;
    }

    /* JADX INFO: renamed from: r */
    public final long m7862r() {
        return this.oneStar_;
    }

    /* JADX INFO: renamed from: s */
    public final long m7863s() {
        return this.threeStars_;
    }

    /* JADX INFO: renamed from: t */
    public final long m7864t() {
        return this.twoStars_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
