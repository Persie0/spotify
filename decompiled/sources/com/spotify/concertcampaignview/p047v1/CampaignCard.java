package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignCard extends AbstractC0269h implements sre0 {
    public static final int CTAS_FIELD_NUMBER = 4;
    public static final int DECORATED_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DECORATED_PRETITLE_FIELD_NUMBER = 1;
    public static final int DECORATED_TITLE_FIELD_NUMBER = 2;
    private static final CampaignCard DEFAULT_INSTANCE;
    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_ON_SALE_COLORS_FIELD_NUMBER = 7;
    public static final int STATE_FIELD_NUMBER = 8;
    public static final int TAG_FIELD_NUMBER = 6;
    private int bitField0_;
    private CampaignCardDecoratedText decoratedDescription_;
    private CampaignCardDecoratedText decoratedPretitle_;
    private CampaignCardDecoratedText decoratedTitle_;
    private Timestamp nextRefreshTime_;
    private boolean showOnSaleColors_;
    private CampaignCardTagText tag_;
    private ae50 ctas_ = AbstractC0269h.emptyProtobufList();
    private String state_ = "";

    static {
        CampaignCard campaignCard = new CampaignCard();
        DEFAULT_INSTANCE = campaignCard;
        AbstractC0269h.registerDefaultInstance(CampaignCard.class, campaignCard);
    }

    private CampaignCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u0007\bȈ", new Object[]{"bitField0_", "decoratedPretitle_", "decoratedTitle_", "decoratedDescription_", "ctas_", CtaType.class, "nextRefreshTime_", "tag_", "showOnSaleColors_", "state_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCard();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 11);
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
        synchronized (CampaignCard.class) {
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

    public final boolean hasTag() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m6921n() {
        return this.ctas_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CampaignCardDecoratedText m6922o() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedDescription_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.m6930n() : campaignCardDecoratedText;
    }

    /* JADX INFO: renamed from: p */
    public final CampaignCardDecoratedText m6923p() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedPretitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.m6930n() : campaignCardDecoratedText;
    }

    /* JADX INFO: renamed from: q */
    public final CampaignCardDecoratedText m6924q() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedTitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.m6930n() : campaignCardDecoratedText;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m6925r() {
        Timestamp timestamp = this.nextRefreshTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6926s() {
        return this.showOnSaleColors_;
    }

    /* JADX INFO: renamed from: t */
    public final String m6927t() {
        return this.state_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final CampaignCardTagText m6928u() {
        CampaignCardTagText campaignCardTagText = this.tag_;
        return campaignCardTagText == null ? CampaignCardTagText.m6949p() : campaignCardTagText;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6929v() {
        return (this.bitField0_ & 8) != 0;
    }
}
