package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sib;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignRouting extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    public static final int CONCERT_URI_FIELD_NUMBER = 2;
    private static final CampaignRouting DEFAULT_INSTANCE;
    public static final int OFFER_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String campaignUri_ = "";
    private String concertUri_ = "";
    private String offerId_ = "";

    static {
        CampaignRouting campaignRouting = new CampaignRouting();
        DEFAULT_INSTANCE = campaignRouting;
        AbstractC0269h.registerDefaultInstance(CampaignRouting.class, campaignRouting);
    }

    private CampaignRouting() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6952n(CampaignRouting campaignRouting, String str) {
        campaignRouting.getClass();
        str.getClass();
        campaignRouting.campaignUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6953o(CampaignRouting campaignRouting, String str) {
        campaignRouting.getClass();
        str.getClass();
        campaignRouting.concertUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6954p(CampaignRouting campaignRouting, String str) {
        campaignRouting.getClass();
        str.getClass();
        campaignRouting.offerId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CampaignRouting m6955r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static sib m6956s() {
        return (sib) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"campaignUri_", "concertUri_", "offerId_"});
        }
        if (iOrdinal == 3) {
            return new CampaignRouting();
        }
        if (iOrdinal == 4) {
            return new sib(DEFAULT_INSTANCE);
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
        synchronized (CampaignRouting.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m6957q() {
        return this.concertUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
