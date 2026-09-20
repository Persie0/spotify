package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GamePageElements extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int CLOSE_GAME_CTA_ACCESSIBILITY_LABEL_FIELD_NUMBER = 9;
    public static final int CONTINUE_CTA_TEXT_FIELD_NUMBER = 1;
    public static final int CORRECT_ANSWER_TEXT_FIELD_NUMBER = 5;
    public static final int COUNTDOWN_AUDIO_URL_FIELD_NUMBER = 7;
    public static final int CURRENT_SCORE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 8;
    private static final GamePageElements DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int ROUND_COUNT_ACCESSIBILITY_LABEL_FIELD_NUMBER = 10;
    public static final int SCORE_BACKGROUND_ANIMATION_URLS_FIELD_NUMBER = 3;
    public static final int SCORE_DESCRIPTORS_FIELD_NUMBER = 4;
    public static final int START_ANIMATION_URL_FIELD_NUMBER = 6;
    private String continueCtaText_ = "";
    private String backgroundImageUrl_ = "";
    private ae50 scoreBackgroundAnimationUrls_ = AbstractC0269h.emptyProtobufList();
    private ae50 scoreDescriptors_ = AbstractC0269h.emptyProtobufList();
    private String correctAnswerText_ = "";
    private String startAnimationUrl_ = "";
    private String countdownAudioUrl_ = "";
    private String currentScoreAccessibilityLabel_ = "";
    private String closeGameCtaAccessibilityLabel_ = "";
    private ae50 roundCountAccessibilityLabel_ = AbstractC0269h.emptyProtobufList();

    static {
        GamePageElements gamePageElements = new GamePageElements();
        DEFAULT_INSTANCE = gamePageElements;
        AbstractC0269h.registerDefaultInstance(GamePageElements.class, gamePageElements);
    }

    private GamePageElements() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static GamePageElements m11011r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȚ", new Object[]{"continueCtaText_", "backgroundImageUrl_", "scoreBackgroundAnimationUrls_", ScoreThresholdMap.class, "scoreDescriptors_", ScoreThresholdMap.class, "correctAnswerText_", "startAnimationUrl_", "countdownAudioUrl_", "currentScoreAccessibilityLabel_", "closeGameCtaAccessibilityLabel_", "roundCountAccessibilityLabel_"});
        }
        if (iOrdinal == 3) {
            return new GamePageElements();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 4);
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
        synchronized (GamePageElements.class) {
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
    public final String m11012n() {
        return this.backgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11013o() {
        return this.continueCtaText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11014p() {
        return this.correctAnswerText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11015q() {
        return this.countdownAudioUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m11016s() {
        return this.scoreBackgroundAnimationUrls_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m11017t() {
        return this.scoreDescriptors_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m11018u() {
        return this.startAnimationUrl_;
    }
}
