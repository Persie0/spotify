package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.q5u0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StatsCard extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_TITLE_FIELD_NUMBER = 1;
    private static final StatsCard DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RANK_DIRECTION_FIELD_NUMBER = 5;
    public static final int RANK_FIELD_NUMBER = 4;
    private int rankDirection_;
    private int rank_;
    private String categoryTitle_ = "";
    private String navigationUri_ = "";
    private String entityUri_ = "";

    static {
        StatsCard statsCard = new StatsCard();
        DEFAULT_INSTANCE = statsCard;
        AbstractC0269h.registerDefaultInstance(StatsCard.class, statsCard);
    }

    private StatsCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f", new Object[]{"categoryTitle_", "navigationUri_", "entityUri_", "rank_", "rankDirection_"});
        }
        if (iOrdinal == 3) {
            return new StatsCard();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 6);
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
        synchronized (StatsCard.class) {
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
    public final String m16319n() {
        return this.categoryTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16320o() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16321p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final int m16322q() {
        return this.rank_;
    }

    /* JADX INFO: renamed from: r */
    public final q5u0 m16323r() {
        q5u0 q5u0Var;
        int i = this.rankDirection_;
        if (i == 0) {
            q5u0Var = q5u0.RANK_DIRECTION_SAME;
        } else if (i != 1) {
            q5u0Var = i != 2 ? null : q5u0.RANK_DIRECTION_DOWN;
        } else {
            q5u0Var = q5u0.RANK_DIRECTION_UP;
        }
        return q5u0Var == null ? q5u0.UNRECOGNIZED : q5u0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
