package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.iyt0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class QuizInfoText extends AbstractC0269h implements sre0 {
    private static final QuizInfoText DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int icon_;
    private String text_ = "";

    static {
        QuizInfoText quizInfoText = new QuizInfoText();
        DEFAULT_INSTANCE = quizInfoText;
        AbstractC0269h.registerDefaultInstance(QuizInfoText.class, quizInfoText);
    }

    private QuizInfoText() {
    }

    /* JADX INFO: renamed from: n */
    public static QuizInfoText m20571n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"text_", "icon_"});
        }
        if (iOrdinal == 3) {
            return new QuizInfoText();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 23);
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
        synchronized (QuizInfoText.class) {
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
    public final iyt0 m20572o() {
        iyt0 iyt0Var;
        int i = this.icon_;
        if (i != 0) {
            iyt0Var = i != 1 ? null : iyt0.QUIZ_ICON_TYPE_INFO;
        } else {
            iyt0Var = iyt0.QUIZ_ICON_TYPE_UNSPECIFIED;
        }
        return iyt0Var == null ? iyt0.UNRECOGNIZED : iyt0Var;
    }

    /* JADX INFO: renamed from: p */
    public final String m20573p() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
