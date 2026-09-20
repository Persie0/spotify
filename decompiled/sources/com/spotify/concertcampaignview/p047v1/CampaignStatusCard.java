package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignStatusCard extends AbstractC0269h implements sre0 {
    private static final CampaignStatusCard DEFAULT_INSTANCE;
    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp nextRefreshTime_;
    private CampaignCardDecoratedText pretitle_;

    static {
        CampaignStatusCard campaignStatusCard = new CampaignStatusCard();
        DEFAULT_INSTANCE = campaignStatusCard;
        AbstractC0269h.registerDefaultInstance(CampaignStatusCard.class, campaignStatusCard);
    }

    private CampaignStatusCard() {
    }

    /* JADX INFO: renamed from: n */
    public static CampaignStatusCard m6964n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "pretitle_", "nextRefreshTime_"});
        }
        if (iOrdinal == 3) {
            return new CampaignStatusCard();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 20);
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
        synchronized (CampaignStatusCard.class) {
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
    public final Timestamp m6965o() {
        Timestamp timestamp = this.nextRefreshTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: p */
    public final CampaignCardDecoratedText m6966p() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.pretitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.m6930n() : campaignCardDecoratedText;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6967q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
