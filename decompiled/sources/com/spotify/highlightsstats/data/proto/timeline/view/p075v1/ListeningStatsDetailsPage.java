package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Playlist;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListeningStatsDetailsPage extends AbstractC0269h implements sre0 {
    private static final ListeningStatsDetailsPage DEFAULT_INSTANCE;
    public static final int GRAPH_SECTION_FIELD_NUMBER = 1;
    public static final int MARKET_COMPARISON_SECTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RECOMMENDATIONS_TITLE_FIELD_NUMBER = 4;
    public static final int RECOMMENDED_PLAYLIST_FIELD_NUMBER = 5;
    public static final int TIME_OF_THE_DAY_SECTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private ListeningTimeGraph graphSection_;
    private MarketComparisonSection marketComparisonSection_;
    private String recommendationsTitle_ = "";
    private Playlist recommendedPlaylist_;
    private TimeOfTheDaySection timeOfTheDaySection_;

    static {
        ListeningStatsDetailsPage listeningStatsDetailsPage = new ListeningStatsDetailsPage();
        DEFAULT_INSTANCE = listeningStatsDetailsPage;
        AbstractC0269h.registerDefaultInstance(ListeningStatsDetailsPage.class, listeningStatsDetailsPage);
    }

    private ListeningStatsDetailsPage() {
    }

    /* JADX INFO: renamed from: n */
    public static ListeningStatsDetailsPage m11367n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003", new Object[]{"bitField0_", "graphSection_", "timeOfTheDaySection_", "marketComparisonSection_", "recommendationsTitle_", "recommendedPlaylist_"});
        }
        if (iOrdinal == 3) {
            return new ListeningStatsDetailsPage();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 0);
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
        synchronized (ListeningStatsDetailsPage.class) {
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
    public final ListeningTimeGraph m11368o() {
        ListeningTimeGraph listeningTimeGraph = this.graphSection_;
        return listeningTimeGraph == null ? ListeningTimeGraph.m11373p() : listeningTimeGraph;
    }

    /* JADX INFO: renamed from: p */
    public final MarketComparisonSection m11369p() {
        MarketComparisonSection marketComparisonSection = this.marketComparisonSection_;
        return marketComparisonSection == null ? MarketComparisonSection.m11385o() : marketComparisonSection;
    }

    /* JADX INFO: renamed from: q */
    public final String m11370q() {
        return this.recommendationsTitle_;
    }

    /* JADX INFO: renamed from: r */
    public final Playlist m11371r() {
        Playlist playlist = this.recommendedPlaylist_;
        return playlist == null ? Playlist.m11291o() : playlist;
    }

    /* JADX INFO: renamed from: s */
    public final TimeOfTheDaySection m11372s() {
        TimeOfTheDaySection timeOfTheDaySection = this.timeOfTheDaySection_;
        return timeOfTheDaySection == null ? TimeOfTheDaySection.m11451o() : timeOfTheDaySection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
