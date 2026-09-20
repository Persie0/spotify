package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.axt0;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Quiz extends AbstractC0269h implements sre0 {
    public static final int CALL_TO_ACTION_TEXT_FIELD_NUMBER = 8;
    public static final int CONTENT_VARIANT_FIELD_NUMBER = 10;
    private static final Quiz DEFAULT_INSTANCE;
    public static final int ENTITY_WITH_OVERLAY_FIELD_NUMBER = 6;
    public static final int INFO_TEXT_FIELD_NUMBER = 9;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    public static final int SINGLE_ENTITY_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TWO_ENTITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private int contentVariant_;
    private QuizInfoText infoText_;
    private Object quizCardVariant_;
    private int quizCardVariantCase_ = 0;
    private String quizUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String logoImageUrl_ = "";
    private String callToActionText_ = "";

    static {
        Quiz quiz = new Quiz();
        DEFAULT_INSTANCE = quiz;
        AbstractC0269h.registerDefaultInstance(Quiz.class, quiz);
    }

    private Quiz() {
    }

    /* JADX INFO: renamed from: p */
    public static Quiz m20555p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\bȈ\tဉ\u0000\n\f", new Object[]{"quizCardVariant_", "quizCardVariantCase_", "bitField0_", "quizUri_", "title_", "subtitle_", QuizSingleEntity.class, QuizTwoEntity.class, QuizEntityWithOverlay.class, "logoImageUrl_", "callToActionText_", "infoText_", "contentVariant_"});
        }
        if (iOrdinal == 3) {
            return new Quiz();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 20);
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
        synchronized (Quiz.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m20556n() {
        return this.callToActionText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final axt0 m20557o() {
        axt0 axt0Var;
        int i = this.contentVariant_;
        if (i == 0) {
            axt0Var = axt0.QUIZ_CONTENT_VARIANT_UNSPECIFIED;
        } else if (i == 1) {
            axt0Var = axt0.QUIZ_CONTENT_VARIANT_PLAY_QUIZ;
        } else if (i != 2) {
            axt0Var = i != 3 ? null : axt0.QUIZ_CONTENT_VARIANT_CHALLENGE_FRIEND;
        } else {
            axt0Var = axt0.QUIZ_CONTENT_VARIANT_SCORE_SHARE;
        }
        return axt0Var == null ? axt0.UNRECOGNIZED : axt0Var;
    }

    /* JADX INFO: renamed from: q */
    public final QuizEntityWithOverlay m20558q() {
        return this.quizCardVariantCase_ == 6 ? (QuizEntityWithOverlay) this.quizCardVariant_ : QuizEntityWithOverlay.m20568o();
    }

    /* JADX INFO: renamed from: r */
    public final QuizInfoText m20559r() {
        QuizInfoText quizInfoText = this.infoText_;
        return quizInfoText == null ? QuizInfoText.m20571n() : quizInfoText;
    }

    /* JADX INFO: renamed from: s */
    public final String m20560s() {
        return this.logoImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m20561t() {
        return this.quizUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final QuizSingleEntity m20562u() {
        return this.quizCardVariantCase_ == 4 ? (QuizSingleEntity) this.quizCardVariant_ : QuizSingleEntity.m20574n();
    }

    /* JADX INFO: renamed from: v */
    public final QuizTwoEntity m20563v() {
        return this.quizCardVariantCase_ == 5 ? (QuizTwoEntity) this.quizCardVariant_ : QuizTwoEntity.m20576o();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m20564w() {
        return this.quizCardVariantCase_ == 6;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20565x() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m20566y() {
        return this.quizCardVariantCase_ == 4;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20567z() {
        return this.quizCardVariantCase_ == 5;
    }
}
