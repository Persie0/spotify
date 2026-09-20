package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ListeningPartyCardStory extends AbstractC0269h implements sre0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 5;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 15;
    public static final int CARD_MAIN_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int CARD_SECONDARY_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int COLLECTIBLE_TITLE_FIELD_NUMBER = 6;
    public static final int DATE_FIELD_NUMBER = 8;
    private static final ListeningPartyCardStory DEFAULT_INSTANCE;
    public static final int DETAILS_SUBTITLE_FIELD_NUMBER = 9;
    public static final int DETAILS_TITLE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 11;
    public static final int SHARE_DATA_FIELD_NUMBER = 13;
    public static final int SHARE_LABEL_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VIP_IMAGE_URL_FIELD_NUMBER = 14;
    private Text artistName_;
    private BaseStory base_;
    private int bitField0_;
    private Text collectibleTitle_;
    private Text date_;
    private Text detailsSubtitle_;
    private Text detailsTitle_;
    private ShareData shareData_;
    private Text shareLabel_;
    private Text title_;
    private String cardMainImageUrl_ = "";
    private String backgroundImageUrl_ = "";
    private String cardSecondaryImageUrl_ = "";
    private String premiumLabel_ = "";
    private String vipImageUrl_ = "";
    private String cardBackgroundImageUrl_ = "";

    static {
        ListeningPartyCardStory listeningPartyCardStory = new ListeningPartyCardStory();
        DEFAULT_INSTANCE = listeningPartyCardStory;
        AbstractC0269h.registerDefaultInstance(ListeningPartyCardStory.class, listeningPartyCardStory);
    }

    private ListeningPartyCardStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: v */
    public static ListeningPartyCardStory m10888v() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Text m10889A() {
        Text text = this.shareLabel_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: B */
    public final Text m10890B() {
        Text text = this.title_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: C */
    public final String m10891C() {
        return this.vipImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nȈ\u000bȈ\fဉ\u0007\rဉ\b\u000eȈ\u000fȈ", new Object[]{"bitField0_", "base_", "cardMainImageUrl_", "backgroundImageUrl_", "title_", "artistName_", "collectibleTitle_", "detailsTitle_", "date_", "detailsSubtitle_", "cardSecondaryImageUrl_", "premiumLabel_", "shareLabel_", "shareData_", "vipImageUrl_", "cardBackgroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyCardStory();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 26);
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
        synchronized (ListeningPartyCardStory.class) {
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
    public final Text m10892n() {
        Text text = this.artistName_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10893o() {
        return this.backgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final BaseStory m10894p() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: q */
    public final String m10895q() {
        return this.cardBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10896r() {
        return this.cardMainImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10897s() {
        return this.cardSecondaryImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final Text m10898t() {
        Text text = this.collectibleTitle_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m10899u() {
        Text text = this.date_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: w */
    public final Text m10900w() {
        Text text = this.detailsSubtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: x */
    public final Text m10901x() {
        Text text = this.detailsTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: y */
    public final String m10902y() {
        return this.premiumLabel_;
    }

    /* JADX INFO: renamed from: z */
    public final ShareData m10903z() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.m10929n() : shareData;
    }
}
