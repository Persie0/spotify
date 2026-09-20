package com.spotify.paragraph.p120v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yrm0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Paragraph extends AbstractC0269h implements sre0 {
    private static final Paragraph DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TEXT_VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 textValues_ = AbstractC0269h.emptyProtobufList();
    private TextStyle text_;

    public static final class TextStyle extends AbstractC0269h implements sre0 {
        private static final TextStyle DEFAULT_INSTANCE;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_COLOR_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int fontStyle_;
        private String text_ = "";
        private String textColor_ = "";

        static {
            TextStyle textStyle = new TextStyle();
            DEFAULT_INSTANCE = textStyle;
            AbstractC0269h.registerDefaultInstance(TextStyle.class, textStyle);
        }

        private TextStyle() {
        }

        /* JADX INFO: renamed from: n */
        public static TextStyle m16613n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"text_", "textColor_", "fontStyle_"});
            }
            if (iOrdinal == 3) {
                return new TextStyle();
            }
            if (iOrdinal == 4) {
                return new C1100b(DEFAULT_INSTANCE);
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
            synchronized (TextStyle.class) {
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
        public final yrm0 m16614o() {
            yrm0 yrm0Var;
            switch (this.fontStyle_) {
                case 0:
                    yrm0Var = yrm0.bass;
                    break;
                case 1:
                    yrm0Var = yrm0.forte;
                    break;
                case 2:
                    yrm0Var = yrm0.brio;
                    break;
                case 3:
                    yrm0Var = yrm0.alto;
                    break;
                case 4:
                    yrm0Var = yrm0.canon;
                    break;
                case 5:
                    yrm0Var = yrm0.cello;
                    break;
                case 6:
                    yrm0Var = yrm0.ballad;
                    break;
                case 7:
                    yrm0Var = yrm0.ballad_bold;
                    break;
                case 8:
                    yrm0Var = yrm0.viola;
                    break;
                case 9:
                    yrm0Var = yrm0.viola_bold;
                    break;
                case 10:
                    yrm0Var = yrm0.mesto;
                    break;
                case 11:
                    yrm0Var = yrm0.mesto_bold;
                    break;
                case 12:
                    yrm0Var = yrm0.metronome;
                    break;
                case 13:
                    yrm0Var = yrm0.finale;
                    break;
                case 14:
                    yrm0Var = yrm0.finale_bold;
                    break;
                case 15:
                    yrm0Var = yrm0.minuet;
                    break;
                case 16:
                    yrm0Var = yrm0.minuet_bold;
                    break;
                case 17:
                    yrm0Var = yrm0.headlineLarge;
                    break;
                case 18:
                    yrm0Var = yrm0.headlineMedium;
                    break;
                case 19:
                    yrm0Var = yrm0.titleLarge;
                    break;
                case 20:
                    yrm0Var = yrm0.titleMedium;
                    break;
                case 21:
                    yrm0Var = yrm0.titleSmall;
                    break;
                case 22:
                    yrm0Var = yrm0.bodyMedium;
                    break;
                case 23:
                    yrm0Var = yrm0.bodyMediumBold;
                    break;
                case 24:
                    yrm0Var = yrm0.bodySmall;
                    break;
                case 25:
                    yrm0Var = yrm0.bodySmallBold;
                    break;
                case 26:
                    yrm0Var = yrm0.marginal;
                    break;
                case 27:
                    yrm0Var = yrm0.marginalBold;
                    break;
                case 28:
                    yrm0Var = yrm0.titleXsmall;
                    break;
                default:
                    yrm0Var = null;
                    break;
            }
            return yrm0Var == null ? yrm0.UNRECOGNIZED : yrm0Var;
        }

        /* JADX INFO: renamed from: p */
        public final String m16615p() {
            return this.text_;
        }

        /* JADX INFO: renamed from: q */
        public final String m16616q() {
            return this.textColor_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Paragraph paragraph = new Paragraph();
        DEFAULT_INSTANCE = paragraph;
        AbstractC0269h.registerDefaultInstance(Paragraph.class, paragraph);
    }

    private Paragraph() {
    }

    /* JADX INFO: renamed from: n */
    public static Paragraph m16609n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "text_", "textValues_", TextStyle.class});
        }
        if (iOrdinal == 3) {
            return new Paragraph();
        }
        if (iOrdinal == 4) {
            return new C1099a(DEFAULT_INSTANCE);
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
        synchronized (Paragraph.class) {
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
    public final TextStyle m16610o() {
        TextStyle textStyle = this.text_;
        return textStyle == null ? TextStyle.m16613n() : textStyle;
    }

    /* JADX INFO: renamed from: p */
    public final int m16611p() {
        return this.textValues_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16612q() {
        return this.textValues_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
