package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AverageRating extends AbstractC0269h implements sre0 {
    public static final int AVERAGE_FIELD_NUMBER = 1;
    private static final AverageRating DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_AVERAGE_FIELD_NUMBER = 3;
    public static final int TOTAL_RATINGS_FIELD_NUMBER = 2;
    private double average_;
    private boolean showAverage_;
    private long totalRatings_;

    static {
        AverageRating averageRating = new AverageRating();
        DEFAULT_INSTANCE = averageRating;
        AbstractC0269h.registerDefaultInstance(AverageRating.class, averageRating);
    }

    private AverageRating() {
    }

    /* JADX INFO: renamed from: o */
    public static AverageRating m10280o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0002\u0003\u0007", new Object[]{"average_", "totalRatings_", "showAverage_"});
        }
        if (iOrdinal == 3) {
            return new AverageRating();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 1);
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
        synchronized (AverageRating.class) {
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
    public final double m10281n() {
        return this.average_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10282p() {
        return this.showAverage_;
    }

    /* JADX INFO: renamed from: q */
    public final long m10283q() {
        return this.totalRatings_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
