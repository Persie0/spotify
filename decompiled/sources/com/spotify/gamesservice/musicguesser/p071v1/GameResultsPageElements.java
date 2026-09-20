package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GameResultsPageElements extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_ANIMATION_URL_FIELD_NUMBER = 11;
    public static final int BACKGROUND_AUDIO_FIELD_NUMBER = 14;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_LABEL_FIELD_NUMBER = 19;
    public static final int CORRECT_ANSWER_COUNT_ACCESSIBILITY_LABEL_FIELD_NUMBER = 17;
    public static final int CORRECT_STRING_FIELD_NUMBER = 9;
    private static final GameResultsPageElements DEFAULT_INSTANCE;
    public static final int DESTINATION_URL_FIELD_NUMBER = 13;
    public static final int FOOTER_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LOGO_URL_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_CTA_REDIRECT_FIELD_NUMBER = 7;
    public static final int PLAYLIST_CTA_TEXT_FIELD_NUMBER = 6;
    public static final int PLAY_TIME_ACCESSIBILITY_LABEL_FIELD_NUMBER = 18;
    public static final int SCORE_DESCRIPTOR_FIELD_NUMBER = 12;
    public static final int SHARE_CARD_URL_FIELD_NUMBER = 4;
    public static final int SHARE_CTA_TEXT_FIELD_NUMBER = 3;
    public static final int SHARE_MESSAGE_FIELD_NUMBER = 5;
    public static final int SHARE_PREVIEW_DESCRIPTION_FIELD_NUMBER = 21;
    public static final int SHARE_PREVIEW_TITLE_FIELD_NUMBER = 20;
    public static final int STATS_HIGHLIGHT_STRING_FIELD_NUMBER = 15;
    public static final int TIME_STRING_FIELD_NUMBER = 10;
    public static final int USER_SCORE_ACCESSIBILITY_LABEL_FIELD_NUMBER = 16;
    private String header_ = "";
    private String footer_ = "";
    private String shareCtaText_ = "";
    private String shareCardUrl_ = "";
    private String shareMessage_ = "";
    private String playlistCtaText_ = "";
    private String playlistCtaRedirect_ = "";
    private String logoUrl_ = "";
    private String correctString_ = "";
    private String timeString_ = "";
    private String backgroundAnimationUrl_ = "";
    private String scoreDescriptor_ = "";
    private String destinationUrl_ = "";
    private String backgroundAudio_ = "";
    private String statsHighlightString_ = "";
    private String userScoreAccessibilityLabel_ = "";
    private String correctAnswerCountAccessibilityLabel_ = "";
    private String playTimeAccessibilityLabel_ = "";
    private String closeButtonAccessibilityLabel_ = "";
    private String sharePreviewTitle_ = "";
    private String sharePreviewDescription_ = "";

    static {
        GameResultsPageElements gameResultsPageElements = new GameResultsPageElements();
        DEFAULT_INSTANCE = gameResultsPageElements;
        AbstractC0269h.registerDefaultInstance(GameResultsPageElements.class, gameResultsPageElements);
    }

    private GameResultsPageElements() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static GameResultsPageElements m11030q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m11031A() {
        return this.shareMessage_;
    }

    /* JADX INFO: renamed from: B */
    public final String m11032B() {
        return this.sharePreviewDescription_;
    }

    /* JADX INFO: renamed from: C */
    public final String m11033C() {
        return this.sharePreviewTitle_;
    }

    /* JADX INFO: renamed from: D */
    public final String m11034D() {
        return this.statsHighlightString_;
    }

    /* JADX INFO: renamed from: E */
    public final String m11035E() {
        return this.timeString_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ", new Object[]{"header_", "footer_", "shareCtaText_", "shareCardUrl_", "shareMessage_", "playlistCtaText_", "playlistCtaRedirect_", "logoUrl_", "correctString_", "timeString_", "backgroundAnimationUrl_", "scoreDescriptor_", "destinationUrl_", "backgroundAudio_", "statsHighlightString_", "userScoreAccessibilityLabel_", "correctAnswerCountAccessibilityLabel_", "playTimeAccessibilityLabel_", "closeButtonAccessibilityLabel_", "sharePreviewTitle_", "sharePreviewDescription_"});
        }
        if (iOrdinal == 3) {
            return new GameResultsPageElements();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 7);
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
        synchronized (GameResultsPageElements.class) {
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
    public final String m11036n() {
        return this.backgroundAnimationUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11037o() {
        return this.backgroundAudio_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11038p() {
        return this.correctString_;
    }

    /* JADX INFO: renamed from: r */
    public final String m11039r() {
        return this.destinationUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m11040s() {
        return this.footer_;
    }

    /* JADX INFO: renamed from: t */
    public final String m11041t() {
        return this.header_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m11042u() {
        return this.logoUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final String m11043v() {
        return this.playlistCtaRedirect_;
    }

    /* JADX INFO: renamed from: w */
    public final String m11044w() {
        return this.playlistCtaText_;
    }

    /* JADX INFO: renamed from: x */
    public final String m11045x() {
        return this.scoreDescriptor_;
    }

    /* JADX INFO: renamed from: y */
    public final String m11046y() {
        return this.shareCardUrl_;
    }

    /* JADX INFO: renamed from: z */
    public final String m11047z() {
        return this.shareCtaText_;
    }
}
