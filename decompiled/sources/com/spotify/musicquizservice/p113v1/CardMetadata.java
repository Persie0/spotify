package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CardMetadata extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_ARTWORK_URL_FIELD_NUMBER = 8;
    public static final int BACKGROUND_COLOUR_1_FIELD_NUMBER = 4;
    public static final int BACKGROUND_COLOUR_2_FIELD_NUMBER = 5;
    public static final int BACKGROUND_COLOUR_3_FIELD_NUMBER = 6;
    public static final int BASE_TEXT_COLOUR_FIELD_NUMBER = 11;
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final CardMetadata DEFAULT_INSTANCE;
    public static final int FOREGROUND_ARTWORK_URL_FIELD_NUMBER = 7;
    public static final int FOREGROUND_TEXT_COLOUR_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_LOGO_URL_FIELD_NUMBER = 9;
    public static final int QUIZ_NAME_FIELD_NUMBER = 3;
    public static final int SOLO_FIELD_NUMBER = 1;
    public static final int SPOTIFY_LOGO_URL_FIELD_NUMBER = 12;
    private Object specificMetadata_;
    private int specificMetadataCase_ = 0;
    private String quizName_ = "";
    private String backgroundColour1_ = "";
    private String backgroundColour2_ = "";
    private String backgroundColour3_ = "";
    private String foregroundArtworkUrl_ = "";
    private String backgroundArtworkUrl_ = "";
    private String quizLogoUrl_ = "";
    private String foregroundTextColour_ = "";
    private String baseTextColour_ = "";
    private String spotifyLogoUrl_ = "";

    static {
        CardMetadata cardMetadata = new CardMetadata();
        DEFAULT_INSTANCE = cardMetadata;
        AbstractC0269h.registerDefaultInstance(CardMetadata.class, cardMetadata);
    }

    private CardMetadata() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ", new Object[]{"specificMetadata_", "specificMetadataCase_", SoloCompletionMetadata.class, ChallengeCompletionMetadata.class, "quizName_", "backgroundColour1_", "backgroundColour2_", "backgroundColour3_", "foregroundArtworkUrl_", "backgroundArtworkUrl_", "quizLogoUrl_", "foregroundTextColour_", "baseTextColour_", "spotifyLogoUrl_"});
        }
        if (iOrdinal == 3) {
            return new CardMetadata();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 15);
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
        synchronized (CardMetadata.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
