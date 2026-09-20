package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Row extends AbstractC0269h implements sre0 {
    public static final int ARTIST_BOTTOM_UP_SHEET_TRIGGER_ROW_FIELD_NUMBER = 13;
    public static final int ARTIST_ROW_FIELD_NUMBER = 6;
    public static final int CAMPAIGN_ROUTING_ROW_FIELD_NUMBER = 19;
    public static final int CONCERT_ROW_FIELD_NUMBER = 12;
    private static final Row DEFAULT_INSTANCE;
    public static final int DISCLAIMER_ROW_FIELD_NUMBER = 4;
    public static final int LEGAL_ROW_FIELD_NUMBER = 20;
    public static final int LIVE_PERFORMANCE_ROW_FIELD_NUMBER = 18;
    public static final int OFFERS_BLOCK_ROW_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PAST_EVENT_ROW_FIELD_NUMBER = 15;
    public static final int PLAYABLE_ITEM_BOTTOM_UP_SHEET_TRIGGER_ROW_FIELD_NUMBER = 14;
    public static final int PLAYABLE_ITEM_ROW_FIELD_NUMBER = 5;
    public static final int TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER = 21;
    public static final int TITLE_ROW_FIELD_NUMBER = 2;
    public static final int VENUE_ADDRESS_ROW_FIELD_NUMBER = 10;
    public static final int VENUE_INFO_ROW_FIELD_NUMBER = 9;
    public static final int VENUE_LINK_ROW_FIELD_NUMBER = 8;
    public static final int VENUE_MAP_ROW_FIELD_NUMBER = 11;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Row row = new Row();
        DEFAULT_INSTANCE = row;
        AbstractC0269h.registerDefaultInstance(Row.class, row);
    }

    private Row() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final VenueAddressRow m7107A() {
        return this.contentCase_ == 10 ? (VenueAddressRow) this.content_ : VenueAddressRow.m7191o();
    }

    /* JADX INFO: renamed from: B */
    public final VenueInfoRow m7108B() {
        return this.contentCase_ == 9 ? (VenueInfoRow) this.content_ : VenueInfoRow.m7193p();
    }

    /* JADX INFO: renamed from: C */
    public final VenueLinkRow m7109C() {
        return this.contentCase_ == 8 ? (VenueLinkRow) this.content_ : VenueLinkRow.m7200o();
    }

    /* JADX INFO: renamed from: D */
    public final VenueMapRow m7110D() {
        return this.contentCase_ == 11 ? (VenueMapRow) this.content_ : VenueMapRow.m7205p();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0000\u0002\u0015\u0011\u0000\u0000\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"content_", "contentCase_", TitleRow.class, DisclaimerRow.class, PlayableItemRow.class, ArtistRow.class, VenueLinkRow.class, VenueInfoRow.class, VenueAddressRow.class, VenueMapRow.class, ConcertRow.class, ArtistBottomUpSheetTriggerRow.class, PlayableItemBottomUpSheetTriggerRow.class, PastEventRow.class, OffersBlockRow.class, LivePerformanceRow.class, CampaignRoutingRow.class, LegalRow.class, TicketingTimelinePlaceholderRow.class});
        }
        if (iOrdinal == 3) {
            return new Row();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 7);
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
        synchronized (Row.class) {
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
    public final ArtistBottomUpSheetTriggerRow m7111n() {
        return this.contentCase_ == 13 ? (ArtistBottomUpSheetTriggerRow) this.content_ : ArtistBottomUpSheetTriggerRow.m7015p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ArtistRow m7112o() {
        return this.contentCase_ == 6 ? (ArtistRow) this.content_ : ArtistRow.m7019o();
    }

    /* JADX INFO: renamed from: p */
    public final CampaignRoutingRow m7113p() {
        return this.contentCase_ == 19 ? (CampaignRoutingRow) this.content_ : CampaignRoutingRow.m7024p();
    }

    /* JADX INFO: renamed from: q */
    public final ConcertRow m7114q() {
        return this.contentCase_ == 12 ? (ConcertRow) this.content_ : ConcertRow.m7028p();
    }

    /* JADX INFO: renamed from: r */
    public final int m7115r() {
        switch (this.contentCase_) {
            case 0:
                return 18;
            case 1:
            case 3:
            case 7:
            case 17:
            default:
                return 0;
            case 2:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 8:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 8;
            case 12:
                return 9;
            case 13:
                return 10;
            case 14:
                return 11;
            case 15:
                return 12;
            case 16:
                return 13;
            case 18:
                return 14;
            case 19:
                return 15;
            case 20:
                return 16;
            case 21:
                return 17;
        }
    }

    /* JADX INFO: renamed from: s */
    public final DisclaimerRow m7116s() {
        return this.contentCase_ == 4 ? (DisclaimerRow) this.content_ : DisclaimerRow.m7032n();
    }

    /* JADX INFO: renamed from: t */
    public final LegalRow m7117t() {
        return this.contentCase_ == 20 ? (LegalRow) this.content_ : LegalRow.m7061n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final LivePerformanceRow m7118u() {
        return this.contentCase_ == 18 ? (LivePerformanceRow) this.content_ : LivePerformanceRow.m7063n();
    }

    /* JADX INFO: renamed from: v */
    public final OffersBlockRow m7119v() {
        return this.contentCase_ == 16 ? (OffersBlockRow) this.content_ : OffersBlockRow.m7075n();
    }

    /* JADX INFO: renamed from: w */
    public final PastEventRow m7120w() {
        return this.contentCase_ == 15 ? (PastEventRow) this.content_ : PastEventRow.m7083o();
    }

    /* JADX INFO: renamed from: x */
    public final PlayableItemBottomUpSheetTriggerRow m7121x() {
        return this.contentCase_ == 14 ? (PlayableItemBottomUpSheetTriggerRow) this.content_ : PlayableItemBottomUpSheetTriggerRow.m7097o();
    }

    /* JADX INFO: renamed from: y */
    public final PlayableItemRow m7122y() {
        return this.contentCase_ == 5 ? (PlayableItemRow) this.content_ : PlayableItemRow.m7101n();
    }

    /* JADX INFO: renamed from: z */
    public final TitleRow m7123z() {
        return this.contentCase_ == 2 ? (TitleRow) this.content_ : TitleRow.m7186p();
    }
}
