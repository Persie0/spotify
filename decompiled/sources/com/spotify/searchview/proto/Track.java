package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.ae50;
import p204p.eb81;
import p204p.fb81;
import p204p.gb81;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Track extends AbstractC0269h implements sre0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 15;
    public static final int ALTERNATE_IMAGE_URI_FIELD_NUMBER = 11;
    public static final int ALTERNATE_URI_FIELD_NUMBER = 13;
    public static final int CLASSIFICATION_FIELD_NUMBER = 17;
    public static final int CONTENT_ACCESS_FIELD_NUMBER = 19;
    private static final Track DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 18;
    public static final int EXPLICIT_FIELD_NUMBER = 1;
    public static final int IS_CHAPTERED_FIELD_NUMBER = 20;
    public static final int LYRICS_FIELD_NUMBER = 16;
    public static final int LYRICS_MATCH_FIELD_NUMBER = 7;
    public static final int MOGEF19_FIELD_NUMBER = 6;
    public static final int ON_DEMAND_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 10;
    public static final int RELEASE_SIGNIFIER_TEXT_FIELD_NUMBER = 12;
    public static final int TRACK_ALBUM_FIELD_NUMBER = 3;
    public static final int TRACK_ARTISTS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 14;
    public static final int WINDOWED_FIELD_NUMBER = 2;
    private boolean ageAssured_;
    private int bitField0_;
    private int classification_;
    private int contentAccess_;
    private Duration duration_;
    private boolean explicit_;
    private boolean isChaptered_;
    private boolean lyricsMatch_;
    private Snippet lyrics_;
    private boolean mogef19_;
    private OnDemand onDemand_;
    private boolean premiumOnly_;
    private RelatedEntity trackAlbum_;
    private int type_;
    private boolean windowed_;
    private ae50 trackArtists_ = AbstractC0269h.emptyProtobufList();
    private String alternateImageUri_ = "";
    private String releaseSignifierText_ = "";
    private String alternateUri_ = "";

    static {
        Track track = new Track();
        DEFAULT_INSTANCE = track;
        AbstractC0269h.registerDefaultInstance(Track.class, track);
    }

    private Track() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Track m20916s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final RelatedEntity m20917A() {
        RelatedEntity relatedEntity = this.trackAlbum_;
        return relatedEntity == null ? RelatedEntity.m20898n() : relatedEntity;
    }

    /* JADX INFO: renamed from: B */
    public final ae50 m20918B() {
        return this.trackArtists_;
    }

    /* JADX INFO: renamed from: C */
    public final gb81 m20919C() {
        gb81 gb81Var;
        int i = this.type_;
        if (i == 0) {
            gb81Var = gb81.UNKNOWN;
        } else if (i == 1) {
            gb81Var = gb81.AUDIO_ONLY;
        } else if (i == 2) {
            gb81Var = gb81.AUDIO_WITH_VIDEO;
        } else if (i != 3) {
            gb81Var = i != 4 ? null : gb81.VIDEO_UNMAPPED;
        } else {
            gb81Var = gb81.VIDEO_MAPPED;
        }
        return gb81Var == null ? gb81.UNRECOGNIZED : gb81Var;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m20920D() {
        return this.windowed_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004\u001b\u0006\u0007\u0007\u0007\bဉ\u0001\n\u0007\u000bȈ\fȈ\rȈ\u000e\f\u000f\u0007\u0010ဉ\u0002\u0011\f\u0012ဉ\u0003\u0013\f\u0014\u0007", new Object[]{"bitField0_", "explicit_", "windowed_", "trackAlbum_", "trackArtists_", RelatedEntity.class, "mogef19_", "lyricsMatch_", "onDemand_", "premiumOnly_", "alternateImageUri_", "releaseSignifierText_", "alternateUri_", "type_", "ageAssured_", "lyrics_", "classification_", "duration_", "contentAccess_", "isChaptered_"});
        }
        if (iOrdinal == 3) {
            return new Track();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 6);
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
        synchronized (Track.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m20921n() {
        return this.ageAssured_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20922o() {
        return this.alternateImageUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m20923p() {
        return this.alternateUri_;
    }

    /* JADX INFO: renamed from: q */
    public final fb81 m20924q() {
        fb81 fb81Var;
        int i = this.classification_;
        if (i == 0) {
            fb81Var = fb81.TRACK_CLASSIFICATION_UNKNOWN;
        } else if (i != 1) {
            fb81Var = i != 2 ? null : fb81.TRACK_CLASSIFICATION_MTV;
        } else {
            fb81Var = fb81.TRACK_CLASSIFICATION_PERFORMANCE;
        }
        return fb81Var == null ? fb81.UNRECOGNIZED : fb81Var;
    }

    /* JADX INFO: renamed from: r */
    public final eb81 m20925r() {
        eb81 eb81Var;
        int i = this.contentAccess_;
        if (i == 0) {
            eb81Var = eb81.CONTENT_ACCESS_NONE;
        } else if (i != 1) {
            eb81Var = i != 2 ? null : eb81.CONTENT_ACCESS_GATED;
        } else {
            eb81Var = eb81.CONTENT_ACCESS_WINDOWING;
        }
        return eb81Var == null ? eb81.UNRECOGNIZED : eb81Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m20926t() {
        return this.explicit_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20927u() {
        return this.isChaptered_;
    }

    /* JADX INFO: renamed from: v */
    public final Snippet m20928v() {
        Snippet snippet = this.lyrics_;
        return snippet == null ? Snippet.m20913n() : snippet;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m20929w() {
        return this.lyricsMatch_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20930x() {
        return this.mogef19_;
    }

    /* JADX INFO: renamed from: y */
    public final OnDemand m20931y() {
        OnDemand onDemand = this.onDemand_;
        return onDemand == null ? OnDemand.m20874n() : onDemand;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20932z() {
        return this.premiumOnly_;
    }
}
