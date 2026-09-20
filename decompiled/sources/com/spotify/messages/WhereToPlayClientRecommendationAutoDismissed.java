package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.krd1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class WhereToPlayClientRecommendationAutoDismissed extends AbstractC0269h implements sre0 {
    private static final WhereToPlayClientRecommendationAutoDismissed DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int RECOMMENDATION_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String reason_ = "";
    private String recommendationId_ = "";

    static {
        WhereToPlayClientRecommendationAutoDismissed whereToPlayClientRecommendationAutoDismissed = new WhereToPlayClientRecommendationAutoDismissed();
        DEFAULT_INSTANCE = whereToPlayClientRecommendationAutoDismissed;
        AbstractC0269h.registerDefaultInstance(WhereToPlayClientRecommendationAutoDismissed.class, whereToPlayClientRecommendationAutoDismissed);
    }

    private WhereToPlayClientRecommendationAutoDismissed() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14839n(WhereToPlayClientRecommendationAutoDismissed whereToPlayClientRecommendationAutoDismissed, String str) {
        whereToPlayClientRecommendationAutoDismissed.getClass();
        str.getClass();
        whereToPlayClientRecommendationAutoDismissed.bitField0_ |= 1;
        whereToPlayClientRecommendationAutoDismissed.reason_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14840o(WhereToPlayClientRecommendationAutoDismissed whereToPlayClientRecommendationAutoDismissed, String str) {
        whereToPlayClientRecommendationAutoDismissed.getClass();
        str.getClass();
        whereToPlayClientRecommendationAutoDismissed.bitField0_ |= 2;
        whereToPlayClientRecommendationAutoDismissed.recommendationId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static krd1 m14841p() {
        return (krd1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "reason_", "recommendationId_"});
        }
        if (iOrdinal == 3) {
            return new WhereToPlayClientRecommendationAutoDismissed();
        }
        if (iOrdinal == 4) {
            return new krd1(DEFAULT_INSTANCE);
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
        synchronized (WhereToPlayClientRecommendationAutoDismissed.class) {
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
