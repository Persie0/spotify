package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fjb;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignUserStateIneligible extends AbstractC0269h implements sre0 {
    private static final CampaignUserStateIneligible DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    static {
        CampaignUserStateIneligible campaignUserStateIneligible = new CampaignUserStateIneligible();
        DEFAULT_INSTANCE = campaignUserStateIneligible;
        AbstractC0269h.registerDefaultInstance(CampaignUserStateIneligible.class, campaignUserStateIneligible);
    }

    private CampaignUserStateIneligible() {
    }

    /* JADX INFO: renamed from: n */
    public static CampaignUserStateIneligible m10019n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new CampaignUserStateIneligible();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 23);
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
        synchronized (CampaignUserStateIneligible.class) {
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
    public final fjb m10020o() {
        fjb fjbVar;
        switch (this.reason_) {
            case 0:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_REASON_UNSPECIFIED;
                break;
            case 1:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_FRAUD_SUSPECTED;
                break;
            case 2:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_ACCOUNT_AGE;
                break;
            case 3:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_AGE_RESTRICTION;
                break;
            case 4:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_SOLD_OUT;
                break;
            case 5:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_CANCELLED;
                break;
            case 6:
                fjbVar = fjb.CAMPAIGN_USER_STATE_INELIGIBLE_SALE_ENDED;
                break;
            default:
                fjbVar = null;
                break;
        }
        return fjbVar == null ? fjb.UNRECOGNIZED : fjbVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
