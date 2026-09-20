package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeassociationsResponse$Entity extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_CHAPTER_FIELD_NUMBER = 13;
    public static final int AUDIOBOOK_FIELD_NUMBER = 12;
    private static final EpisodeassociationsResponse$Entity DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 10;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 8;
    public static final int PODCAST_SHORT_FIELD_NUMBER = 11;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int TRACK_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 5;
    private Object entity_;
    private int entityCase_ = 0;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";

    static {
        EpisodeassociationsResponse$Entity episodeassociationsResponse$Entity = new EpisodeassociationsResponse$Entity();
        DEFAULT_INSTANCE = episodeassociationsResponse$Entity;
        AbstractC0269h.registerDefaultInstance(EpisodeassociationsResponse$Entity.class, episodeassociationsResponse$Entity);
    }

    private EpisodeassociationsResponse$Entity() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"entity_", "entityCase_", "uri_", "name_", "imageUri_", EpisodeassociationsResponse$Artist.class, EpisodeassociationsResponse$User.class, EpisodeassociationsResponse$Album.class, EpisodeassociationsResponse$Track.class, EpisodeassociationsResponse$Playlist.class, EpisodeassociationsResponse$Show.class, EpisodeassociationsResponse$Episode.class, EpisodeassociationsResponse$PodcastShort.class, EpisodeassociationsResponse$Audiobook.class, EpisodeassociationsResponse$AudiobookChapter.class});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Entity();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 1);
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
        synchronized (EpisodeassociationsResponse$Entity.class) {
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
    public final EpisodeassociationsResponse$Album m9708n() {
        return this.entityCase_ == 6 ? (EpisodeassociationsResponse$Album) this.entity_ : EpisodeassociationsResponse$Album.m9697o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EpisodeassociationsResponse$Audiobook m9709o() {
        return this.entityCase_ == 12 ? (EpisodeassociationsResponse$Audiobook) this.entity_ : EpisodeassociationsResponse$Audiobook.m9700o();
    }

    /* JADX INFO: renamed from: p */
    public final EpisodeassociationsResponse$AudiobookChapter m9710p() {
        return this.entityCase_ == 13 ? (EpisodeassociationsResponse$AudiobookChapter) this.entity_ : EpisodeassociationsResponse$AudiobookChapter.m9702q();
    }

    /* JADX INFO: renamed from: q */
    public final int m9711q() {
        int i = this.entityCase_;
        if (i == 0) {
            return 11;
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
            case 12:
                return 9;
            case 13:
                return 10;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: r */
    public final EpisodeassociationsResponse$Episode m9712r() {
        return this.entityCase_ == 10 ? (EpisodeassociationsResponse$Episode) this.entity_ : EpisodeassociationsResponse$Episode.m9717n();
    }

    /* JADX INFO: renamed from: s */
    public final String m9713s() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: t */
    public final EpisodeassociationsResponse$Playlist m9714t() {
        return this.entityCase_ == 8 ? (EpisodeassociationsResponse$Playlist) this.entity_ : EpisodeassociationsResponse$Playlist.m9724o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final EpisodeassociationsResponse$Show m9715u() {
        return this.entityCase_ == 9 ? (EpisodeassociationsResponse$Show) this.entity_ : EpisodeassociationsResponse$Show.m9728n();
    }

    /* JADX INFO: renamed from: v */
    public final EpisodeassociationsResponse$Track m9716v() {
        return this.entityCase_ == 7 ? (EpisodeassociationsResponse$Track) this.entity_ : EpisodeassociationsResponse$Track.m9730n();
    }
}
