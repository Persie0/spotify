package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignRoutingRow extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    public static final int CONCERT_URI_FIELD_NUMBER = 2;
    private static final CampaignRoutingRow DEFAULT_INSTANCE;
    public static final int OFFER_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String campaignUri_ = "";
    private String concertUri_ = "";
    private String offerId_ = "";

    static {
        CampaignRoutingRow campaignRoutingRow = new CampaignRoutingRow();
        DEFAULT_INSTANCE = campaignRoutingRow;
        AbstractC0269h.registerDefaultInstance(CampaignRoutingRow.class, campaignRoutingRow);
    }

    private CampaignRoutingRow() {
    }

    /* JADX INFO: renamed from: p */
    public static CampaignRoutingRow m7024p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"campaignUri_", "concertUri_", "offerId_"});
        }
        if (iOrdinal == 3) {
            return new CampaignRoutingRow();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 18);
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
        synchronized (CampaignRoutingRow.class) {
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
    public final String m7025n() {
        return this.campaignUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7026o() {
        return this.concertUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7027q() {
        return this.offerId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
