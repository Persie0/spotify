package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GameMetadata extends AbstractC0269h implements sre0 {
    public static final int ARTIST_METADATA_FIELD_NUMBER = 2;
    private static final GameMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_METADATA_FIELD_NUMBER = 1;
    private ihc0 artistMetadata_;
    private ihc0 trackMetadata_;

    public static final class ArtistMetadata extends AbstractC0269h implements sre0 {
        private static final ArtistMetadata DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String imageUrl_ = "";
        private String displayName_ = "";

        static {
            ArtistMetadata artistMetadata = new ArtistMetadata();
            DEFAULT_INSTANCE = artistMetadata;
            AbstractC0269h.registerDefaultInstance(ArtistMetadata.class, artistMetadata);
        }

        private ArtistMetadata() {
        }

        /* JADX INFO: renamed from: n */
        public static ArtistMetadata m11008n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"imageUrl_", "displayName_"});
            }
            if (iOrdinal == 3) {
                return new ArtistMetadata();
            }
            if (iOrdinal == 4) {
                return new C0765d(DEFAULT_INSTANCE);
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
            synchronized (ArtistMetadata.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getImageUrl() {
            return this.imageUrl_;
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

    public static final class TrackMetadata extends AbstractC0269h implements sre0 {
        private static final TrackMetadata DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PREVIEW_TRACK_URL_FIELD_NUMBER = 1;
        private String previewTrackUrl_ = "";

        static {
            TrackMetadata trackMetadata = new TrackMetadata();
            DEFAULT_INSTANCE = trackMetadata;
            AbstractC0269h.registerDefaultInstance(TrackMetadata.class, trackMetadata);
        }

        private TrackMetadata() {
        }

        /* JADX INFO: renamed from: n */
        public static TrackMetadata m11009n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"previewTrackUrl_"});
            }
            if (iOrdinal == 3) {
                return new TrackMetadata();
            }
            if (iOrdinal == 4) {
                return new C0768g(DEFAULT_INSTANCE);
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
            synchronized (TrackMetadata.class) {
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
        public final String m11010o() {
            return this.previewTrackUrl_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GameMetadata gameMetadata = new GameMetadata();
        DEFAULT_INSTANCE = gameMetadata;
        AbstractC0269h.registerDefaultInstance(GameMetadata.class, gameMetadata);
    }

    private GameMetadata() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.trackMetadata_ = ihc0Var;
        this.artistMetadata_ = ihc0Var;
    }

    /* JADX INFO: renamed from: o */
    public static GameMetadata m11005o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"trackMetadata_", AbstractC0769h.f4094a, "artistMetadata_", AbstractC0766e.f4093a});
        }
        if (iOrdinal == 3) {
            return new GameMetadata();
        }
        if (iOrdinal == 4) {
            return new C0767f(DEFAULT_INSTANCE);
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
        synchronized (GameMetadata.class) {
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
    public final Map m11006n() {
        return Collections.unmodifiableMap(this.artistMetadata_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Map m11007p() {
        return Collections.unmodifiableMap(this.trackMetadata_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
