package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeassociationsResponse$Track extends AbstractC0269h implements sre0 {
    public static final int ALBUM_NAME_FIELD_NUMBER = 6;
    public static final int ALBUM_URI_FIELD_NUMBER = 5;
    public static final int ARTIST_FIELD_NUMBER = 1;
    private static final EpisodeassociationsResponse$Track DEFAULT_INSTANCE;
    public static final int IS_19_PLUS_FIELD_NUMBER = 3;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 2;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private boolean is19Plus_;
    private boolean isExplicit_;
    private boolean isPlayable_;
    private ae50 artist_ = AbstractC0269h.emptyProtobufList();
    private String albumUri_ = "";
    private String albumName_ = "";

    public static final class ArtistEntry extends AbstractC0269h implements sre0 {
        private static final ArtistEntry DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";
        private String name_ = "";

        static {
            ArtistEntry artistEntry = new ArtistEntry();
            DEFAULT_INSTANCE = artistEntry;
            AbstractC0269h.registerDefaultInstance(ArtistEntry.class, artistEntry);
        }

        private ArtistEntry() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "name_"});
            }
            if (iOrdinal == 3) {
                return new ArtistEntry();
            }
            if (iOrdinal == 4) {
                return new C0709a(DEFAULT_INSTANCE);
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
            synchronized (ArtistEntry.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EpisodeassociationsResponse$Track episodeassociationsResponse$Track = new EpisodeassociationsResponse$Track();
        DEFAULT_INSTANCE = episodeassociationsResponse$Track;
        AbstractC0269h.registerDefaultInstance(EpisodeassociationsResponse$Track.class, episodeassociationsResponse$Track);
    }

    private EpisodeassociationsResponse$Track() {
    }

    /* JADX INFO: renamed from: n */
    public static EpisodeassociationsResponse$Track m9730n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u0007\u0004\u0007\u0005Ȉ\u0006Ȉ", new Object[]{"artist_", ArtistEntry.class, "isExplicit_", "is19Plus_", "isPlayable_", "albumUri_", "albumName_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Track();
        }
        if (iOrdinal == 4) {
            return new C0710b(DEFAULT_INSTANCE);
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
        synchronized (EpisodeassociationsResponse$Track.class) {
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

    public final List getArtistList() {
        return this.artist_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9731o() {
        return this.is19Plus_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
