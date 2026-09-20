package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes10.dex */
public final class Entity extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_FIELD_NUMBER = 13;
    public static final int AUDIO_EPISODE_FIELD_NUMBER = 10;
    public static final int AUDIO_SHOW_FIELD_NUMBER = 9;
    public static final int AUTHOR_FIELD_NUMBER = 17;
    public static final int AUTOCOMPLETE_FIELD_NUMBER = 2046;
    public static final int BEST_MATCH_FIELD_NUMBER = 20;
    public static final int CONCERT_FIELD_NUMBER = 19;
    private static final Entity DEFAULT_INSTANCE;
    public static final int GATING_DECISION_FIELD_NUMBER = 25;
    public static final int GENRE_FIELD_NUMBER = 8;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int KALLAX_FIELD_NUMBER = 22;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEW_RELEASE_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 7;
    public static final int PODCAST_CHAPTER_FIELD_NUMBER = 23;
    public static final int PROFILE_FIELD_NUMBER = 11;
    public static final int RECENT_SEARCH_FIELD_NUMBER = 18;
    public static final int SECTION_FIELD_NUMBER = 14;
    public static final int SERP_METADATA_FIELD_NUMBER = 2047;
    public static final int SIGNIFIER_TEXT_FIELD_NUMBER = 24;
    public static final int TRACK_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VENUE_FIELD_NUMBER = 21;
    private int bitField0_;
    private Object entity_;
    private GatingDecision gatingDecision_;
    private Object highlightType_;
    private int entityCase_ = 0;
    private int highlightTypeCase_ = 0;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String serpMetadata_ = "";
    private String signifierText_ = "";

    static {
        Entity entity = new Entity();
        DEFAULT_INSTANCE = entity;
        AbstractC0269h.registerDefaultInstance(Entity.class, entity);
    }

    private Entity() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static Entity m20810u() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Kallax m20811A() {
        return this.entityCase_ == 22 ? (Kallax) this.entity_ : Kallax.m20857n();
    }

    /* JADX INFO: renamed from: B */
    public final Playlist m20812B() {
        return this.entityCase_ == 7 ? (Playlist) this.entity_ : Playlist.m20876n();
    }

    /* JADX INFO: renamed from: C */
    public final PodcastChapter m20813C() {
        return this.entityCase_ == 23 ? (PodcastChapter) this.entity_ : PodcastChapter.m20884o();
    }

    /* JADX INFO: renamed from: D */
    public final Profile m20814D() {
        return this.entityCase_ == 11 ? (Profile) this.entity_ : Profile.m20893n();
    }

    /* JADX INFO: renamed from: E */
    public final Section m20815E() {
        return this.entityCase_ == 14 ? (Section) this.entity_ : Section.m20901p();
    }

    /* JADX INFO: renamed from: F */
    public final String m20816F() {
        return this.serpMetadata_;
    }

    /* JADX INFO: renamed from: G */
    public final String m20817G() {
        return this.signifierText_;
    }

    /* JADX INFO: renamed from: H */
    public final Track m20818H() {
        return this.entityCase_ == 5 ? (Track) this.entity_ : Track.m20916s();
    }

    /* JADX INFO: renamed from: I */
    public final Venue m20819I() {
        return this.entityCase_ == 21 ? (Venue) this.entity_ : Venue.m20935n();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0002\u0001\u0001߿\u0019\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u0010<\u0001\u0011<\u0000\u0012<\u0001\u0013<\u0000\u0014<\u0001\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018Ȉ\u0019ဉ\u0000߾<\u0000߿Ȉ", new Object[]{"entity_", "entityCase_", "highlightType_", "highlightTypeCase_", "bitField0_", "uri_", "name_", "imageUri_", Artist.class, Track.class, Album.class, Playlist.class, Genre.class, AudioShow.class, AudioEpisode.class, Profile.class, Audiobook.class, Section.class, HighlightTypeNewRelease.class, Author.class, HighlightTypeRecentSearch.class, Concert.class, HighlightTypeBestMatch.class, Venue.class, Kallax.class, PodcastChapter.class, "signifierText_", "gatingDecision_", AutocompleteQuery.class, "serpMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Entity();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 16);
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
        synchronized (Entity.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Album m20820n() {
        return this.entityCase_ == 6 ? (Album) this.entity_ : Album.m20732o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Artist m20821o() {
        return this.entityCase_ == 4 ? (Artist) this.entity_ : Artist.m20740p();
    }

    /* JADX INFO: renamed from: p */
    public final AudioEpisode m20822p() {
        return this.entityCase_ == 10 ? (AudioEpisode) this.entity_ : AudioEpisode.m20748o();
    }

    /* JADX INFO: renamed from: q */
    public final AudioShow m20823q() {
        return this.entityCase_ == 9 ? (AudioShow) this.entity_ : AudioShow.m20760o();
    }

    /* JADX INFO: renamed from: r */
    public final Audiobook m20824r() {
        return this.entityCase_ == 13 ? (Audiobook) this.entity_ : Audiobook.m20764p();
    }

    /* JADX INFO: renamed from: s */
    public final AutocompleteQuery m20825s() {
        return this.entityCase_ == 2046 ? (AutocompleteQuery) this.entity_ : AutocompleteQuery.m20775n();
    }

    /* JADX INFO: renamed from: t */
    public final Concert m20826t() {
        return this.entityCase_ == 19 ? (Concert) this.entity_ : Concert.m20789o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: v */
    public final int m20827v() {
        int i = this.entityCase_;
        if (i == 0) {
            return 17;
        }
        if (i == 17) {
            return 11;
        }
        if (i == 19) {
            return 12;
        }
        if (i == 2046) {
            return 16;
        }
        if (i == 13) {
            return 9;
        }
        if (i == 14) {
            return 10;
        }
        switch (i) {
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 8;
            default:
                switch (i) {
                    case 21:
                        return 13;
                    case 22:
                        return 14;
                    case 23:
                        return 15;
                    default:
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: w */
    public final GatingDecision m20828w() {
        GatingDecision gatingDecision = this.gatingDecision_;
        return gatingDecision == null ? GatingDecision.m20844n() : gatingDecision;
    }

    /* JADX INFO: renamed from: x */
    public final Genre m20829x() {
        return this.entityCase_ == 8 ? (Genre) this.entity_ : Genre.m20852n();
    }

    /* JADX INFO: renamed from: y */
    public final int m20830y() {
        int i = this.highlightTypeCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 16) {
            return 1;
        }
        if (i != 18) {
            return i != 20 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: z */
    public final String m20831z() {
        return this.imageUri_;
    }
}
