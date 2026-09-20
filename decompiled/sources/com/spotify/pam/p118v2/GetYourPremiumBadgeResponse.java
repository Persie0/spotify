package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.mco0;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetYourPremiumBadgeResponse extends AbstractC0269h implements sre0 {
    private static final GetYourPremiumBadgeResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_COLOR_FIELD_NUMBER = 3;
    public static final int PLAN_NAME_SHORT_FIELD_NUMBER = 1;
    public static final int PLAN_TIER_FIELD_NUMBER = 2;
    private int planTier_;
    private String planNameShort_ = "";
    private String planColor_ = "";

    static {
        GetYourPremiumBadgeResponse getYourPremiumBadgeResponse = new GetYourPremiumBadgeResponse();
        DEFAULT_INSTANCE = getYourPremiumBadgeResponse;
        AbstractC0269h.registerDefaultInstance(GetYourPremiumBadgeResponse.class, getYourPremiumBadgeResponse);
    }

    private GetYourPremiumBadgeResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"planNameShort_", "planTier_", "planColor_"});
        }
        if (iOrdinal == 3) {
            return new GetYourPremiumBadgeResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 22);
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
        synchronized (GetYourPremiumBadgeResponse.class) {
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
    public final String m16520n() {
        return this.planColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16521o() {
        return this.planNameShort_;
    }

    /* JADX INFO: renamed from: p */
    public final mco0 m16522p() {
        mco0 mco0VarM61468a = mco0.m61468a(this.planTier_);
        return mco0VarM61468a == null ? mco0.UNRECOGNIZED : mco0VarM61468a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
