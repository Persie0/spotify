package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetResultsResponse extends AbstractC0269h implements sre0 {
    public static final int ANIMATIONS_FIELD_NUMBER = 8;
    public static final int ARTIST_DISPLAY_INFO_FIELD_NUMBER = 4;
    public static final int BACKGROUND_MUSIC_URL_FIELD_NUMBER = 7;
    public static final int CHALLENGE_FIELD_NUMBER = 3;
    private static final GetResultsResponse DEFAULT_INSTANCE;
    public static final int FOREGROUND_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int HUMAN_VERIFIED_FIELD_NUMBER = 9;
    public static final int IS_PLAY_ANOTHER_QUIZ_ENABLED_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_NAME_FIELD_NUMBER = 10;
    public static final int QUIZ_URI_FIELD_NUMBER = 5;
    public static final int SOLO_FIELD_NUMBER = 2;
    public static final int USER_RESULT_FIELD_NUMBER = 1;
    private ResultAnimations animations_;
    private ArtistDisplayInfo artistDisplayInfo_;
    private int bitField0_;
    private Object completionType_;
    private boolean humanVerified_;
    private boolean isPlayAnotherQuizEnabled_;
    private Result userResult_;
    private int completionTypeCase_ = 0;
    private String quizUri_ = "";
    private String foregroundImageUrl_ = "";
    private String backgroundMusicUrl_ = "";
    private String quizName_ = "";

    static {
        GetResultsResponse getResultsResponse = new GetResultsResponse();
        DEFAULT_INSTANCE = getResultsResponse;
        AbstractC0269h.registerDefaultInstance(GetResultsResponse.class, getResultsResponse);
    }

    private GetResultsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005Ȉ\u0006ለ\u0002\u0007Ȉ\bဉ\u0003\t\u0007\nȈ\u000b\u0007", new Object[]{"completionType_", "completionTypeCase_", "bitField0_", "userResult_", SoloCompletion.class, ChallengeCompletion.class, "artistDisplayInfo_", "quizUri_", "foregroundImageUrl_", "backgroundMusicUrl_", "animations_", "humanVerified_", "quizName_", "isPlayAnotherQuizEnabled_"});
        }
        if (iOrdinal == 3) {
            return new GetResultsResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 20);
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
        synchronized (GetResultsResponse.class) {
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
    public final ResultAnimations m15832n() {
        ResultAnimations resultAnimations = this.animations_;
        return resultAnimations == null ? ResultAnimations.m15920o() : resultAnimations;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m15833o() {
        return this.backgroundMusicUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final ChallengeCompletion m15834p() {
        return this.completionTypeCase_ == 3 ? (ChallengeCompletion) this.completionType_ : ChallengeCompletion.m15796n();
    }

    /* JADX INFO: renamed from: q */
    public final int m15835q() {
        int i = this.completionTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15836r() {
        return this.humanVerified_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15837s() {
        return this.isPlayAnotherQuizEnabled_;
    }

    /* JADX INFO: renamed from: t */
    public final String m15838t() {
        return this.quizName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m15839u() {
        return this.quizUri_;
    }

    /* JADX INFO: renamed from: v */
    public final Result m15840v() {
        Result result = this.userResult_;
        return result == null ? Result.m15916o() : result;
    }
}
