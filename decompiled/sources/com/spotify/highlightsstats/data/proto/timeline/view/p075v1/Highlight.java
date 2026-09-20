package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Track;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ae50;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Highlight extends AbstractC0269h implements sre0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 6;
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 10;
    public static final int DATE_ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 15;
    public static final int DATE_FIELD_NUMBER = 3;
    private static final Highlight DEFAULT_INSTANCE;
    public static final int EMPTY_ARTWORK_FIELD_NUMBER = 17;
    public static final int GRID_ARTWORK_FIELD_NUMBER = 7;
    public static final int HIGHLIGHT_ID_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANDSCAPE_ARTWORK_FIELD_NUMBER = 11;
    public static final int NAVIGATION_FIELD_NUMBER = 12;
    public static final int OVERLAPPING_ARTWORK_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 14;
    public static final int SINGLE_ARTWORK_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 16;
    private HighlightAnalyticsParameters analyticsParameters_;
    private Object artworkOneof_;
    private int bitField0_;
    private Navigation navigation_;
    private Signifier signifier_;
    private Paragraph subtitle_;
    private int artworkOneofCase_ = 0;
    private String id_ = "";
    private String highlightId_ = "";
    private String date_ = "";
    private String title_ = "";
    private String accentColor_ = "";
    private String dateAccessibilityDescription_ = "";
    private ae50 track_ = AbstractC0269h.emptyProtobufList();

    static {
        Highlight highlight = new Highlight();
        DEFAULT_INSTANCE = highlight;
        AbstractC0269h.registerDefaultInstance(Highlight.class, highlight);
    }

    private Highlight() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0001\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ\u0007<\u0000\b<\u0000\t<\u0000\nဉ\u0001\u000b<\u0000\fဉ\u0002\rȈ\u000eဉ\u0003\u000fȈ\u0010\u001b\u0011<\u0000", new Object[]{"artworkOneof_", "artworkOneofCase_", "bitField0_", "id_", "date_", "title_", "subtitle_", "accentColor_", HighlightGridArtwork.class, HighlightArtworkItem.class, OverlappingHighlightArtwork.class, "analyticsParameters_", LandscapeArtworkItem.class, "navigation_", "highlightId_", "signifier_", "dateAccessibilityDescription_", "track_", Track.class, EmptyHighlightArtwork.class});
        }
        if (iOrdinal == 3) {
            return new Highlight();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 15);
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
        synchronized (Highlight.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final HighlightAnalyticsParameters m11340n() {
        HighlightAnalyticsParameters highlightAnalyticsParameters = this.analyticsParameters_;
        return highlightAnalyticsParameters == null ? HighlightAnalyticsParameters.m11353n() : highlightAnalyticsParameters;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m11341o() {
        int i = this.artworkOneofCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 11) {
            return 4;
        }
        if (i == 17) {
            return 5;
        }
        if (i == 7) {
            return 1;
        }
        if (i != 8) {
            return i != 9 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public final String m11342p() {
        return this.date_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11343q() {
        return this.dateAccessibilityDescription_;
    }

    /* JADX INFO: renamed from: r */
    public final HighlightGridArtwork m11344r() {
        return this.artworkOneofCase_ == 7 ? (HighlightGridArtwork) this.artworkOneof_ : HighlightGridArtwork.m11359n();
    }

    /* JADX INFO: renamed from: s */
    public final String m11345s() {
        return this.highlightId_;
    }

    /* JADX INFO: renamed from: t */
    public final LandscapeArtworkItem m11346t() {
        return this.artworkOneofCase_ == 11 ? (LandscapeArtworkItem) this.artworkOneof_ : LandscapeArtworkItem.m11365o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Navigation m11347u() {
        Navigation navigation = this.navigation_;
        return navigation == null ? Navigation.m11391o() : navigation;
    }

    /* JADX INFO: renamed from: v */
    public final OverlappingHighlightArtwork m11348v() {
        return this.artworkOneofCase_ == 9 ? (OverlappingHighlightArtwork) this.artworkOneof_ : OverlappingHighlightArtwork.m11393o();
    }

    /* JADX INFO: renamed from: w */
    public final Signifier m11349w() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m11401o() : signifier;
    }

    /* JADX INFO: renamed from: x */
    public final HighlightArtworkItem m11350x() {
        return this.artworkOneofCase_ == 8 ? (HighlightArtworkItem) this.artworkOneof_ : HighlightArtworkItem.m11356o();
    }

    /* JADX INFO: renamed from: y */
    public final Paragraph m11351y() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: z */
    public final ae50 m11352z() {
        return this.track_;
    }
}
