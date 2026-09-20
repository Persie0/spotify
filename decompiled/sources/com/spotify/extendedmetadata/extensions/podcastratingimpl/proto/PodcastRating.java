package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PodcastRating extends AbstractC0269h implements sre0 {
    public static final int AVERAGE_RATING_FIELD_NUMBER = 1;
    public static final int CAN_RATE_FIELD_NUMBER = 3;
    private static final PodcastRating DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 2;
    private AverageRating averageRating_;
    private int bitField0_;
    private boolean canRate_;
    private Rating rating_;

    static {
        PodcastRating podcastRating = new PodcastRating();
        DEFAULT_INSTANCE = podcastRating;
        AbstractC0269h.registerDefaultInstance(PodcastRating.class, podcastRating);
    }

    private PodcastRating() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PodcastRating m10284q(byte[] bArr) {
        return (PodcastRating) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "averageRating_", "rating_", "canRate_"});
        }
        if (iOrdinal == 3) {
            return new PodcastRating();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 0);
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
        synchronized (PodcastRating.class) {
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
    public final AverageRating m10285n() {
        AverageRating averageRating = this.averageRating_;
        return averageRating == null ? AverageRating.m10280o() : averageRating;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10286o() {
        return this.canRate_;
    }

    /* JADX INFO: renamed from: p */
    public final Rating m10287p() {
        Rating rating = this.rating_;
        return rating == null ? Rating.m10288n() : rating;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
