package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class QuizColors extends AbstractC0269h implements sre0 {
    public static final int ACCENT_1_FIELD_NUMBER = 6;
    public static final int ACCENT_2_FIELD_NUMBER = 7;
    public static final int ACCENT_3_FIELD_NUMBER = 8;
    public static final int BACKGROUND_DARK_FIELD_NUMBER = 1;
    public static final int BACKGROUND_MID_FIELD_NUMBER = 2;
    private static final QuizColors DEFAULT_INSTANCE;
    public static final int NEGATIVE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_FIELD_NUMBER = 3;
    public static final int SECONDARY_FIELD_NUMBER = 5;
    private String backgroundDark_ = "";
    private String backgroundMid_ = "";
    private String primary_ = "";
    private String negative_ = "";
    private String secondary_ = "";
    private String accent1_ = "";
    private String accent2_ = "";
    private String accent3_ = "";

    static {
        QuizColors quizColors = new QuizColors();
        DEFAULT_INSTANCE = quizColors;
        AbstractC0269h.registerDefaultInstance(QuizColors.class, quizColors);
    }

    private QuizColors() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static QuizColors m15895s() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"backgroundDark_", "backgroundMid_", "primary_", "negative_", "secondary_", "accent1_", "accent2_", "accent3_"});
        }
        if (iOrdinal == 3) {
            return new QuizColors();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 21);
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
        synchronized (QuizColors.class) {
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
    public final String m15896n() {
        return this.accent1_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m15897o() {
        return this.accent2_;
    }

    /* JADX INFO: renamed from: p */
    public final String m15898p() {
        return this.accent3_;
    }

    /* JADX INFO: renamed from: q */
    public final String m15899q() {
        return this.backgroundDark_;
    }

    /* JADX INFO: renamed from: r */
    public final String m15900r() {
        return this.backgroundMid_;
    }

    /* JADX INFO: renamed from: t */
    public final String m15901t() {
        return this.negative_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m15902u() {
        return this.primary_;
    }

    /* JADX INFO: renamed from: v */
    public final String m15903v() {
        return this.secondary_;
    }
}
