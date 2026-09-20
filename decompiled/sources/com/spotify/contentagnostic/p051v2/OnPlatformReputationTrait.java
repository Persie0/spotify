package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class OnPlatformReputationTrait extends AbstractC0269h implements sre0 {
    public static final int CHART_POSITION_FIELD_NUMBER = 7;
    private static final OnPlatformReputationTrait DEFAULT_INSTANCE;
    public static final int MONTHLY_LISTENERS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 8;
    public static final int TOTAL_ESTABLISHED_USER_RELATIONSHIPS_FIELD_NUMBER = 1;
    public static final int TOTAL_PLAYS_FIELD_NUMBER = 3;
    public static final int VERIFICATION_FIELD_NUMBER = 9;
    private int bitField0_;
    private ChartPosition chartPosition_;
    private long monthlyListeners_;
    private Rating rating_;
    private long totalEstablishedUserRelationships_;
    private long totalPlays_;
    private Verification verification_;

    static {
        OnPlatformReputationTrait onPlatformReputationTrait = new OnPlatformReputationTrait();
        DEFAULT_INSTANCE = onPlatformReputationTrait;
        AbstractC0269h.registerDefaultInstance(OnPlatformReputationTrait.class, onPlatformReputationTrait);
    }

    private OnPlatformReputationTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static OnPlatformReputationTrait m7887z(byte[] bArr) {
        return (OnPlatformReputationTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "totalEstablishedUserRelationships_", "totalPlays_", "monthlyListeners_", "chartPosition_", "rating_", "verification_"});
        }
        if (iOrdinal == 3) {
            return new OnPlatformReputationTrait();
        }
        if (iOrdinal == 4) {
            return new y7l0(1);
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
        synchronized (OnPlatformReputationTrait.class) {
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
    public final ChartPosition m7888o() {
        ChartPosition chartPosition = this.chartPosition_;
        return chartPosition == null ? ChartPosition.m7788p() : chartPosition;
    }

    /* JADX INFO: renamed from: p */
    public final long m7889p() {
        return this.monthlyListeners_;
    }

    /* JADX INFO: renamed from: q */
    public final Rating m7890q() {
        Rating rating = this.rating_;
        return rating == null ? Rating.m7924q() : rating;
    }

    /* JADX INFO: renamed from: r */
    public final long m7891r() {
        return this.totalEstablishedUserRelationships_;
    }

    /* JADX INFO: renamed from: s */
    public final long m7892s() {
        return this.totalPlays_;
    }

    /* JADX INFO: renamed from: t */
    public final Verification m7893t() {
        Verification verification = this.verification_;
        return verification == null ? Verification.m7949p() : verification;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7894u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7895v() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7896w() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7897x() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7898y() {
        return (this.bitField0_ & 32) != 0;
    }
}
