package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class StatsDetailsResponse extends AbstractC0269h implements sre0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 10;
    public static final int ARTIST_DETAILS_FIELD_NUMBER = 7;
    private static final StatsDetailsResponse DEFAULT_INSTANCE;
    public static final int HEADER_ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 11;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LISTENING_STATS_DETAILS_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIOUS_PERIOD_COMPARISON_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRACK_DETAILS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Object detailsPageOneof_;
    private Paragraph header_;
    private int previousPeriodComparison_;
    private Paragraph title_;
    private int detailsPageOneofCase_ = 0;
    private String subtitle_ = "";
    private String accentColor_ = "";
    private String headerAccessibilityDescription_ = "";

    static {
        StatsDetailsResponse statsDetailsResponse = new StatsDetailsResponse();
        DEFAULT_INSTANCE = statsDetailsResponse;
        AbstractC0269h.registerDefaultInstance(StatsDetailsResponse.class, statsDetailsResponse);
    }

    private StatsDetailsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004\u0004\u0006<\u0000\u0007<\u0000\b<\u0000\nȈ\u000bȈ", new Object[]{"detailsPageOneof_", "detailsPageOneofCase_", "bitField0_", "header_", "title_", "subtitle_", "previousPeriodComparison_", TrackDetailsPage.class, ArtistsDetailsPage.class, ListeningStatsDetailsPage.class, "accentColor_", "headerAccessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new StatsDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 8);
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
        synchronized (StatsDetailsResponse.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final String m11436n() {
        return this.accentColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ArtistsDetailsPage m11437o() {
        return this.detailsPageOneofCase_ == 7 ? (ArtistsDetailsPage) this.detailsPageOneof_ : ArtistsDetailsPage.m11317n();
    }

    /* JADX INFO: renamed from: p */
    public final int m11438p() {
        int i = this.detailsPageOneofCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 6) {
            return 1;
        }
        if (i != 7) {
            return i != 8 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public final Paragraph m11439q() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final String m11440r() {
        return this.headerAccessibilityDescription_;
    }

    /* JADX INFO: renamed from: s */
    public final ListeningStatsDetailsPage m11441s() {
        return this.detailsPageOneofCase_ == 8 ? (ListeningStatsDetailsPage) this.detailsPageOneof_ : ListeningStatsDetailsPage.m11367n();
    }

    /* JADX INFO: renamed from: t */
    public final int m11442t() {
        return this.previousPeriodComparison_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Paragraph m11443u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: v */
    public final TrackDetailsPage m11444v() {
        return this.detailsPageOneofCase_ == 6 ? (TrackDetailsPage) this.detailsPageOneof_ : TrackDetailsPage.m11473n();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11445w() {
        return (this.bitField0_ & 2) != 0;
    }
}
