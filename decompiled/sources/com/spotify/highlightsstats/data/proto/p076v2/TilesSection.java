package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TilesSection extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_TILE_FIELD_NUMBER = 1;
    private static final TilesSection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SOCIAL_ARTISTS_TILE_FIELD_NUMBER = 4;
    public static final int SOCIAL_MINUTES_TILE_FIELD_NUMBER = 3;
    public static final int SOCIAL_TRACKS_TILE_FIELD_NUMBER = 5;
    public static final int TRACKS_TILE_FIELD_NUMBER = 2;
    private ArtistsTile artistsTile_;
    private int bitField0_;
    private SocialArtistsTile socialArtistsTile_;
    private SocialMinutesTile socialMinutesTile_;
    private SocialTracksTile socialTracksTile_;
    private TracksTile tracksTile_;

    static {
        TilesSection tilesSection = new TilesSection();
        DEFAULT_INSTANCE = tilesSection;
        AbstractC0269h.registerDefaultInstance(TilesSection.class, tilesSection);
    }

    private TilesSection() {
    }

    /* JADX INFO: renamed from: o */
    public static TilesSection m11693o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "artistsTile_", "tracksTile_", "socialMinutesTile_", "socialArtistsTile_", "socialTracksTile_"});
        }
        if (iOrdinal == 3) {
            return new TilesSection();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 24);
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
        synchronized (TilesSection.class) {
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
    public final ArtistsTile m11694n() {
        ArtistsTile artistsTile = this.artistsTile_;
        return artistsTile == null ? ArtistsTile.m11498o() : artistsTile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final SocialArtistsTile m11695p() {
        SocialArtistsTile socialArtistsTile = this.socialArtistsTile_;
        return socialArtistsTile == null ? SocialArtistsTile.m11610o() : socialArtistsTile;
    }

    /* JADX INFO: renamed from: q */
    public final SocialMinutesTile m11696q() {
        SocialMinutesTile socialMinutesTile = this.socialMinutesTile_;
        return socialMinutesTile == null ? SocialMinutesTile.m11628o() : socialMinutesTile;
    }

    /* JADX INFO: renamed from: r */
    public final SocialTracksTile m11697r() {
        SocialTracksTile socialTracksTile = this.socialTracksTile_;
        return socialTracksTile == null ? SocialTracksTile.m11640o() : socialTracksTile;
    }

    /* JADX INFO: renamed from: s */
    public final TracksTile m11698s() {
        TracksTile tracksTile = this.tracksTile_;
        return tracksTile == null ? TracksTile.m11731o() : tracksTile;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11699t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11700u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11701v() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11702w() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11703x() {
        return (this.bitField0_ & 2) != 0;
    }
}
