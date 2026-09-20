package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetQuizMetadataResponse extends AbstractC0269h implements sre0 {
    public static final int ARTIST_DISPLAY_INFO_FIELD_NUMBER = 2;
    public static final int BACKGROUND_MUSIC_URL_FIELD_NUMBER = 5;
    private static final GetQuizMetadataResponse DEFAULT_INSTANCE;
    public static final int FAILED_LOADING_ANIMATION_FIELD_NUMBER = 8;
    public static final int FAILED_LOADING_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int HUMAN_VERIFIED_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_NAME_FIELD_NUMBER = 6;
    public static final int ROUNDS_FIELD_NUMBER = 1;
    private ArtistDisplayInfo artistDisplayInfo_;
    private int bitField0_;
    private LottieAnimation failedLoadingAnimation_;
    private boolean humanVerified_;
    private ae50 rounds_ = AbstractC0269h.emptyProtobufList();
    private String failedLoadingImageUrl_ = "";
    private String backgroundMusicUrl_ = "";
    private String quizName_ = "";

    public static final class RoundMetadata extends AbstractC0269h implements sre0 {
        private static final RoundMetadata DEFAULT_INSTANCE;
        public static final int DISPLAY_TEXT_FIELD_NUMBER = 2;
        public static final int FACT_FIELD_NUMBER = 3;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        public static final int LOADING_ANIMATION_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int PLAY_BUTTON_TEXT_FIELD_NUMBER = 4;
        private int bitField0_;
        private LottieAnimation loadingAnimation_;
        private String imageUrl_ = "";
        private String displayText_ = "";
        private ae50 fact_ = AbstractC0269h.emptyProtobufList();
        private String playButtonText_ = "";

        static {
            RoundMetadata roundMetadata = new RoundMetadata();
            DEFAULT_INSTANCE = roundMetadata;
            AbstractC0269h.registerDefaultInstance(RoundMetadata.class, roundMetadata);
        }

        private RoundMetadata() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "displayText_", "fact_", "playButtonText_", "loadingAnimation_"});
            }
            if (iOrdinal == 3) {
                return new RoundMetadata();
            }
            if (iOrdinal == 4) {
                return new C1071j(DEFAULT_INSTANCE);
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
            synchronized (RoundMetadata.class) {
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

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        /* JADX INFO: renamed from: n */
        public final String m15826n() {
            return this.displayText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ae50 m15827o() {
            return this.fact_;
        }

        /* JADX INFO: renamed from: p */
        public final LottieAnimation m15828p() {
            LottieAnimation lottieAnimation = this.loadingAnimation_;
            return lottieAnimation == null ? LottieAnimation.m15862n() : lottieAnimation;
        }

        /* JADX INFO: renamed from: q */
        public final String m15829q() {
            return this.playButtonText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetQuizMetadataResponse getQuizMetadataResponse = new GetQuizMetadataResponse();
        DEFAULT_INSTANCE = getQuizMetadataResponse;
        AbstractC0269h.registerDefaultInstance(GetQuizMetadataResponse.class, getQuizMetadataResponse);
    }

    private GetQuizMetadataResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\bဉ\u0001", new Object[]{"bitField0_", "rounds_", RoundMetadata.class, "artistDisplayInfo_", "failedLoadingImageUrl_", "backgroundMusicUrl_", "quizName_", "humanVerified_", "failedLoadingAnimation_"});
        }
        if (iOrdinal == 3) {
            return new GetQuizMetadataResponse();
        }
        if (iOrdinal == 4) {
            return new C1070i(DEFAULT_INSTANCE);
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
        synchronized (GetQuizMetadataResponse.class) {
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
    public final String m15821n() {
        return this.backgroundMusicUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final LottieAnimation m15822o() {
        LottieAnimation lottieAnimation = this.failedLoadingAnimation_;
        return lottieAnimation == null ? LottieAnimation.m15862n() : lottieAnimation;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15823p() {
        return this.humanVerified_;
    }

    /* JADX INFO: renamed from: q */
    public final String m15824q() {
        return this.quizName_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m15825r() {
        return this.rounds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
