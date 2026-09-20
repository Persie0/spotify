package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Rating extends AbstractC0269h implements sre0 {
    public static final int AVERAGE_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final Rating DEFAULT_INSTANCE;
    public static final int GRANULAR_RATINGS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private double average_;
    private int bitField0_;
    private long count_;
    private GranularRatings granularRatings_;

    static {
        Rating rating = new Rating();
        DEFAULT_INSTANCE = rating;
        AbstractC0269h.registerDefaultInstance(Rating.class, rating);
    }

    private Rating() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Rating m7924q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0002\u0003ဉ\u0000", new Object[]{"bitField0_", "average_", "count_", "granularRatings_"});
        }
        if (iOrdinal == 3) {
            return new Rating();
        }
        if (iOrdinal == 4) {
            return new u6u0(2);
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
        synchronized (Rating.class) {
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
    public final double m7925o() {
        return this.average_;
    }

    /* JADX INFO: renamed from: p */
    public final long m7926p() {
        return this.count_;
    }

    /* JADX INFO: renamed from: r */
    public final GranularRatings m7927r() {
        GranularRatings granularRatings = this.granularRatings_;
        return granularRatings == null ? GranularRatings.m7859o() : granularRatings;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7928s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
