package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Playlist;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ArtistsDetailsPage extends AbstractC0269h implements sre0 {
    private static final ArtistsDetailsPage DEFAULT_INSTANCE;
    public static final int GRAPH_SECTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RECOMMENDATIONS_TITLE_FIELD_NUMBER = 2;
    public static final int RECOMMENDED_MIXES_FIELD_NUMBER = 3;
    public static final int TOP_ARTISTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private GraphSection graphSection_;
    private ae50 topArtists_ = AbstractC0269h.emptyProtobufList();
    private String recommendationsTitle_ = "";
    private ae50 recommendedMixes_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistsDetailsPage artistsDetailsPage = new ArtistsDetailsPage();
        DEFAULT_INSTANCE = artistsDetailsPage;
        AbstractC0269h.registerDefaultInstance(ArtistsDetailsPage.class, artistsDetailsPage);
    }

    private ArtistsDetailsPage() {
    }

    /* JADX INFO: renamed from: n */
    public static ArtistsDetailsPage m11317n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "topArtists_", TopArtist.class, "recommendationsTitle_", "recommendedMixes_", Playlist.class, "graphSection_"});
        }
        if (iOrdinal == 3) {
            return new ArtistsDetailsPage();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 13);
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
        synchronized (ArtistsDetailsPage.class) {
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
    public final GraphSection m11318o() {
        GraphSection graphSection = this.graphSection_;
        return graphSection == null ? GraphSection.m11332o() : graphSection;
    }

    /* JADX INFO: renamed from: p */
    public final String m11319p() {
        return this.recommendationsTitle_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m11320q() {
        return this.recommendedMixes_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11321r() {
        return this.topArtists_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11322s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
