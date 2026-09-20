package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.lrd1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class WhereToPlayClientRecommendationNotDisplayed extends AbstractC0269h implements sre0 {
    private static final WhereToPlayClientRecommendationNotDisplayed DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREDICTION_ID_FIELD_NUMBER = 3;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int REQUEST_SENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean requestSent_;
    private String reason_ = "";
    private String predictionId_ = "";

    static {
        WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayed = new WhereToPlayClientRecommendationNotDisplayed();
        DEFAULT_INSTANCE = whereToPlayClientRecommendationNotDisplayed;
        AbstractC0269h.registerDefaultInstance(WhereToPlayClientRecommendationNotDisplayed.class, whereToPlayClientRecommendationNotDisplayed);
    }

    private WhereToPlayClientRecommendationNotDisplayed() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14842n(WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayed, String str) {
        whereToPlayClientRecommendationNotDisplayed.getClass();
        str.getClass();
        whereToPlayClientRecommendationNotDisplayed.bitField0_ |= 4;
        whereToPlayClientRecommendationNotDisplayed.predictionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14843o(WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayed, String str) {
        whereToPlayClientRecommendationNotDisplayed.getClass();
        str.getClass();
        whereToPlayClientRecommendationNotDisplayed.bitField0_ |= 1;
        whereToPlayClientRecommendationNotDisplayed.reason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14844p(WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayed, boolean z) {
        whereToPlayClientRecommendationNotDisplayed.bitField0_ |= 2;
        whereToPlayClientRecommendationNotDisplayed.requestSent_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static lrd1 m14845q() {
        return (lrd1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "reason_", "requestSent_", "predictionId_"});
        }
        if (iOrdinal == 3) {
            return new WhereToPlayClientRecommendationNotDisplayed();
        }
        if (iOrdinal == 4) {
            return new lrd1(DEFAULT_INSTANCE);
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
        synchronized (WhereToPlayClientRecommendationNotDisplayed.class) {
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
