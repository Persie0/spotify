package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.trm0;
import p204p.xrm0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Paragraph extends AbstractC0269h implements sre0 {
    public static final int BOX_FIELD_NUMBER = 4;
    private static final Paragraph DEFAULT_INSTANCE;
    public static final int HERO_FIELD_NUMBER = 5;
    public static final int MULTI_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SINGLE_FIELD_NUMBER = 6;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TEXT_VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private Box box_;
    private Style style_;
    private TextStyle text_;
    private Object type_;
    private int typeCase_ = 0;
    private ae50 textValues_ = AbstractC0269h.emptyProtobufList();

    public static final class AutoSize extends AbstractC0269h implements sre0 {
        public static final int AUTO_SIZE_STEP_FIELD_NUMBER = 3;
        private static final AutoSize DEFAULT_INSTANCE;
        public static final int MAX_FONT_SIZE_FIELD_NUMBER = 2;
        public static final int MIN_FONT_SIZE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int autoSizeStep_;
        private float maxFontSize_;
        private float minFontSize_;

        static {
            AutoSize autoSize = new AutoSize();
            DEFAULT_INSTANCE = autoSize;
            AbstractC0269h.registerDefaultInstance(AutoSize.class, autoSize);
        }

        private AutoSize() {
        }

        /* JADX INFO: renamed from: o */
        public static AutoSize m23159o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0004", new Object[]{"minFontSize_", "maxFontSize_", "autoSizeStep_"});
            }
            if (iOrdinal == 3) {
                return new AutoSize();
            }
            if (iOrdinal == 4) {
                return new C1379a(DEFAULT_INSTANCE);
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
            synchronized (AutoSize.class) {
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
        public final int m23160n() {
            return this.autoSizeStep_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final float m23161p() {
            return this.maxFontSize_;
        }

        /* JADX INFO: renamed from: q */
        public final float m23162q() {
            return this.minFontSize_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Box extends AbstractC0269h implements sre0 {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
        private static final Box DEFAULT_INSTANCE;
        public static final int OUTLINE_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int START_END_PADDING_FIELD_NUMBER = 3;
        public static final int TOP_BOTTOM_PADDING_FIELD_NUMBER = 2;
        private String backgroundColor_ = "";
        private int bitField0_;
        private Outline outline_;
        private int startEndPadding_;
        private int topBottomPadding_;

        static {
            Box box = new Box();
            DEFAULT_INSTANCE = box;
            AbstractC0269h.registerDefaultInstance(Box.class, box);
        }

        private Box() {
        }

        /* JADX INFO: renamed from: o */
        public static Box m23163o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "topBottomPadding_", "startEndPadding_", "outline_"});
            }
            if (iOrdinal == 3) {
                return new Box();
            }
            if (iOrdinal == 4) {
                return new C1380b(DEFAULT_INSTANCE);
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
            synchronized (Box.class) {
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
        public final String m23164n() {
            return this.backgroundColor_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final Outline m23165p() {
            Outline outline = this.outline_;
            return outline == null ? Outline.m23145o() : outline;
        }

        /* JADX INFO: renamed from: q */
        public final int m23166q() {
            return this.startEndPadding_;
        }

        /* JADX INFO: renamed from: r */
        public final int m23167r() {
            return this.topBottomPadding_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FontVariation extends AbstractC0269h implements sre0 {
        private static final FontVariation DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int WEIGHT_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private int bitField0_;
        private int weight_;
        private int width_;

        static {
            FontVariation fontVariation = new FontVariation();
            DEFAULT_INSTANCE = fontVariation;
            AbstractC0269h.registerDefaultInstance(FontVariation.class, fontVariation);
        }

        private FontVariation() {
        }

        /* JADX INFO: renamed from: n */
        public static FontVariation m23168n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004င\u0000\u0005င\u0001", new Object[]{"bitField0_", "weight_", "width_"});
            }
            if (iOrdinal == 3) {
                return new FontVariation();
            }
            if (iOrdinal == 4) {
                return new C1382d(DEFAULT_INSTANCE);
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
            synchronized (FontVariation.class) {
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
        public final int m23169o() {
            return this.weight_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class GlowBox extends AbstractC0269h implements sre0 {
        public static final int CORNER_RADIUS_FIELD_NUMBER = 3;
        private static final GlowBox DEFAULT_INSTANCE;
        public static final int FILL_COLOR_FIELD_NUMBER = 1;
        public static final int INNER_FADE_FIELD_NUMBER = 4;
        public static final int NOISE_TEXTURE_URL_FIELD_NUMBER = 2;
        public static final int OUTER_FADE_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER;
        private int cornerRadius_;
        private int innerFade_;
        private int outerFade_;
        private String fillColor_ = "";
        private String noiseTextureUrl_ = "";

        static {
            GlowBox glowBox = new GlowBox();
            DEFAULT_INSTANCE = glowBox;
            AbstractC0269h.registerDefaultInstance(GlowBox.class, glowBox);
        }

        private GlowBox() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"fillColor_", "noiseTextureUrl_", "cornerRadius_", "innerFade_", "outerFade_"});
            }
            if (iOrdinal == 3) {
                return new GlowBox();
            }
            if (iOrdinal == 4) {
                return new C1383e(DEFAULT_INSTANCE);
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
            synchronized (GlowBox.class) {
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

    public static final class Hero extends AbstractC0269h implements sre0 {
        public static final int AUTO_SIZE_FIELD_NUMBER = 2;
        public static final int BOX_FIELD_NUMBER = 6;
        private static final Hero DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 7;
        public static final int MAX_LINES_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_KERNING_FIELD_NUMBER = 4;
        public static final int TEXT_OUTLINE_FIELD_NUMBER = 3;
        private AutoSize autoSize_;
        private int backgroundBoxCase_ = 0;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private float textKerning_;
        private Outline textOutline_;
        private TextStyle text_;

        static {
            Hero hero = new Hero();
            DEFAULT_INSTANCE = hero;
            AbstractC0269h.registerDefaultInstance(Hero.class, hero);
        }

        private Hero() {
        }

        /* JADX INFO: renamed from: p */
        public static Hero m23170p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0005\u0004\u0006<\u0000\u0007<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "autoSize_", "textOutline_", "textKerning_", "maxLines_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Hero();
            }
            if (iOrdinal == 4) {
                return new C1384f(DEFAULT_INSTANCE);
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
            synchronized (Hero.class) {
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
        public final AutoSize m23171n() {
            AutoSize autoSize = this.autoSize_;
            return autoSize == null ? AutoSize.m23159o() : autoSize;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final Box m23172o() {
            return this.backgroundBoxCase_ == 6 ? (Box) this.backgroundBox_ : Box.m23163o();
        }

        /* JADX INFO: renamed from: q */
        public final int m23173q() {
            return this.maxLines_;
        }

        /* JADX INFO: renamed from: r */
        public final TextStyle m23174r() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.m23198q() : textStyle;
        }

        /* JADX INFO: renamed from: s */
        public final float m23175s() {
            return this.textKerning_;
        }

        /* JADX INFO: renamed from: t */
        public final Outline m23176t() {
            Outline outline = this.textOutline_;
            return outline == null ? Outline.m23145o() : outline;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Multi extends AbstractC0269h implements sre0 {
        public static final int ALIGNMENT_FIELD_NUMBER = 4;
        public static final int BOX_FIELD_NUMBER = 5;
        private static final Multi DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 6;
        public static final int MAX_LINES_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_VALUES_FIELD_NUMBER = 2;
        private int alignment_;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private TextStyle text_;
        private int backgroundBoxCase_ = 0;
        private ae50 textValues_ = AbstractC0269h.emptyProtobufList();

        static {
            Multi multi = new Multi();
            DEFAULT_INSTANCE = multi;
            AbstractC0269h.registerDefaultInstance(Multi.class, multi);
        }

        private Multi() {
        }

        /* JADX INFO: renamed from: n */
        public static void m23177n(Multi multi, ArrayList arrayList) {
            ae50 ae50Var = multi.textValues_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                multi.textValues_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, multi.textValues_);
        }

        /* JADX INFO: renamed from: o */
        public static void m23178o(Multi multi, TextStyle textStyle) {
            multi.getClass();
            textStyle.getClass();
            multi.text_ = textStyle;
            multi.bitField0_ |= 1;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static Multi m23179r() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: v */
        public static C1385g m23180v() {
            return (C1385g) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004\u0004ဌ\u0001\u0005<\u0000\u0006<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "textValues_", TextStyle.class, "maxLines_", "alignment_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Multi();
            }
            if (iOrdinal == 4) {
                return new C1385g(DEFAULT_INSTANCE);
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
            synchronized (Multi.class) {
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

        /* JADX INFO: renamed from: p */
        public final trm0 m23181p() {
            trm0 trm0VarM81358a = trm0.m81358a(this.alignment_);
            return trm0VarM81358a == null ? trm0.UNRECOGNIZED : trm0VarM81358a;
        }

        /* JADX INFO: renamed from: q */
        public final Box m23182q() {
            return this.backgroundBoxCase_ == 5 ? (Box) this.backgroundBox_ : Box.m23163o();
        }

        /* JADX INFO: renamed from: s */
        public final int m23183s() {
            return this.maxLines_;
        }

        /* JADX INFO: renamed from: t */
        public final TextStyle m23184t() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.m23198q() : textStyle;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final ae50 m23185u() {
            return this.textValues_;
        }
    }

    public static final class Single extends AbstractC0269h implements sre0 {
        public static final int ALIGNMENT_FIELD_NUMBER = 5;
        public static final int BOX_FIELD_NUMBER = 6;
        private static final Single DEFAULT_INSTANCE;
        public static final int GLOW_BOX_FIELD_NUMBER = 7;
        public static final int MAX_LINES_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_KERNING_FIELD_NUMBER = 3;
        public static final int TEXT_OUTLINE_FIELD_NUMBER = 2;
        private int alignment_;
        private int backgroundBoxCase_ = 0;
        private Object backgroundBox_;
        private int bitField0_;
        private int maxLines_;
        private float textKerning_;
        private Outline textOutline_;
        private TextStyle text_;

        static {
            Single single = new Single();
            DEFAULT_INSTANCE = single;
            AbstractC0269h.registerDefaultInstance(Single.class, single);
        }

        private Single() {
        }

        /* JADX INFO: renamed from: n */
        public static void m23186n(Single single, TextStyle textStyle) {
            single.getClass();
            textStyle.getClass();
            single.text_ = textStyle;
            single.bitField0_ |= 1;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static Single m23187q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: v */
        public static C1386h m23188v() {
            return (C1386h) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0004\u0004\u0005ဌ\u0003\u0006<\u0000\u0007<\u0000", new Object[]{"backgroundBox_", "backgroundBoxCase_", "bitField0_", "text_", "textOutline_", "textKerning_", "maxLines_", "alignment_", Box.class, GlowBox.class});
            }
            if (iOrdinal == 3) {
                return new Single();
            }
            if (iOrdinal == 4) {
                return new C1386h(DEFAULT_INSTANCE);
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
            synchronized (Single.class) {
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
        public final trm0 m23189o() {
            trm0 trm0VarM81358a = trm0.m81358a(this.alignment_);
            return trm0VarM81358a == null ? trm0.UNRECOGNIZED : trm0VarM81358a;
        }

        /* JADX INFO: renamed from: p */
        public final Box m23190p() {
            return this.backgroundBoxCase_ == 6 ? (Box) this.backgroundBox_ : Box.m23163o();
        }

        /* JADX INFO: renamed from: r */
        public final int m23191r() {
            return this.maxLines_;
        }

        /* JADX INFO: renamed from: s */
        public final TextStyle m23192s() {
            TextStyle textStyle = this.text_;
            return textStyle == null ? TextStyle.m23198q() : textStyle;
        }

        /* JADX INFO: renamed from: t */
        public final float m23193t() {
            return this.textKerning_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final Outline m23194u() {
            Outline outline = this.textOutline_;
            return outline == null ? Outline.m23145o() : outline;
        }
    }

    @Deprecated
    public static final class Style extends AbstractC0269h implements sre0 {
        private static final Style DEFAULT_INSTANCE;
        public static final int MAX_LINES_FIELD_NUMBER = 3;
        public static final int MULTI_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int SINGLE_FIELD_NUMBER = 1;
        private int maxLines_;
        private int typeCase_ = 0;
        private Object type_;

        public static final class Multi extends AbstractC0269h implements sre0 {
            private static final Multi DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int TEXT_VALUES_FIELD_NUMBER = 2;
            private ae50 textValues_ = AbstractC0269h.emptyProtobufList();

            static {
                Multi multi = new Multi();
                DEFAULT_INSTANCE = multi;
                AbstractC0269h.registerDefaultInstance(Multi.class, multi);
            }

            private Multi() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"textValues_", TextStyle.class});
                }
                if (iOrdinal == 3) {
                    return new Multi();
                }
                if (iOrdinal == 4) {
                    return new C1388j(DEFAULT_INSTANCE);
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
                synchronized (Multi.class) {
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

        public static final class Single extends AbstractC0269h implements sre0 {
            public static final int AUTO_SIZE_FIELD_NUMBER = 1;
            private static final Single DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int TEXT_KERNING_FIELD_NUMBER = 3;
            public static final int TEXT_OUTLINE_FIELD_NUMBER = 2;
            private AutoSize autoSize_;
            private int bitField0_;
            private float textKerning_;
            private Outline textOutline_;

            static {
                Single single = new Single();
                DEFAULT_INSTANCE = single;
                AbstractC0269h.registerDefaultInstance(Single.class, single);
            }

            private Single() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "autoSize_", "textOutline_", "textKerning_"});
                }
                if (iOrdinal == 3) {
                    return new Single();
                }
                if (iOrdinal == 4) {
                    return new C1389k(DEFAULT_INSTANCE);
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
                synchronized (Single.class) {
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

        static {
            Style style = new Style();
            DEFAULT_INSTANCE = style;
            AbstractC0269h.registerDefaultInstance(Style.class, style);
        }

        private Style() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u0004", new Object[]{"type_", "typeCase_", Single.class, Multi.class, "maxLines_"});
            }
            if (iOrdinal == 3) {
                return new Style();
            }
            if (iOrdinal == 4) {
                return new C1387i(DEFAULT_INSTANCE);
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
            synchronized (Style.class) {
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

    public static final class TextStyle extends AbstractC0269h implements sre0 {
        private static final TextStyle DEFAULT_INSTANCE;
        public static final int FONT_SIZE_FIELD_NUMBER = 6;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int FONT_VARIATION_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int SHARE_CARD_FONT_STYLE_FIELD_NUMBER = 10;
        public static final int STORY_CARD_FONT_STYLE_FIELD_NUMBER = 9;
        public static final int TEXT_BACKGROUND_COLOR_FIELD_NUMBER = 4;
        public static final int TEXT_COLOR_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int fontSize_;
        private Object fontStyleType_;
        private int fontStyle_;
        private FontVariation fontVariation_;
        private int fontStyleTypeCase_ = 0;
        private String text_ = "";
        private String textColor_ = "";
        private String textBackgroundColor_ = "";

        static {
            TextStyle textStyle = new TextStyle();
            DEFAULT_INSTANCE = textStyle;
            AbstractC0269h.registerDefaultInstance(TextStyle.class, textStyle);
        }

        private TextStyle() {
        }

        /* JADX INFO: renamed from: n */
        public static void m23195n(TextStyle textStyle, xrm0 xrm0Var) {
            textStyle.getClass();
            textStyle.fontStyle_ = xrm0Var.getNumber();
        }

        /* JADX INFO: renamed from: o */
        public static void m23196o(TextStyle textStyle, String str) {
            textStyle.getClass();
            str.getClass();
            textStyle.text_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m23197p(TextStyle textStyle, String str) {
            textStyle.getClass();
            str.getClass();
            textStyle.textColor_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static TextStyle m23198q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: x */
        public static C1390l m23199x() {
            return (C1390l) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005ဉ\u0000\u0006\u0004\t?\u0000\n?\u0000", new Object[]{"fontStyleType_", "fontStyleTypeCase_", "bitField0_", "text_", "textColor_", "fontStyle_", "textBackgroundColor_", "fontVariation_", "fontSize_"});
            }
            if (iOrdinal == 3) {
                return new TextStyle();
            }
            if (iOrdinal == 4) {
                return new C1390l(DEFAULT_INSTANCE);
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

        /* JADX INFO: renamed from: r */
        public final int m23200r() {
            return this.fontSize_;
        }

        /* JADX INFO: renamed from: s */
        public final xrm0 m23201s() {
            xrm0 xrm0Var;
            switch (this.fontStyle_) {
                case 0:
                    xrm0Var = xrm0.headline_large;
                    break;
                case 1:
                    xrm0Var = xrm0.headline_medium;
                    break;
                case 2:
                case 8:
                case 9:
                case 12:
                case 15:
                case 16:
                default:
                    xrm0Var = null;
                    break;
                case 3:
                    xrm0Var = xrm0.title_large;
                    break;
                case 4:
                    xrm0Var = xrm0.title_medium;
                    break;
                case 5:
                    xrm0Var = xrm0.title_small;
                    break;
                case 6:
                    xrm0Var = xrm0.body_medium;
                    break;
                case 7:
                    xrm0Var = xrm0.body_medium_bold;
                    break;
                case 10:
                    xrm0Var = xrm0.body_small;
                    break;
                case 11:
                    xrm0Var = xrm0.body_small_bold;
                    break;
                case 13:
                    xrm0Var = xrm0.marginal;
                    break;
                case 14:
                    xrm0Var = xrm0.marginal_bold;
                    break;
                case 17:
                    xrm0Var = xrm0.title_xsmall;
                    break;
                case 18:
                    xrm0Var = xrm0.body_monospace;
                    break;
                case 19:
                    xrm0Var = xrm0.body_small_monospace;
                    break;
            }
            return xrm0Var == null ? xrm0.UNRECOGNIZED : xrm0Var;
        }

        /* JADX INFO: renamed from: t */
        public final FontVariation m23202t() {
            FontVariation fontVariation = this.fontVariation_;
            return fontVariation == null ? FontVariation.m23168n() : fontVariation;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m23203u() {
            return this.text_;
        }

        /* JADX INFO: renamed from: v */
        public final String m23204v() {
            return this.textBackgroundColor_;
        }

        /* JADX INFO: renamed from: w */
        public final String m23205w() {
            return this.textColor_;
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
    public static void m23148n(Paragraph paragraph, Multi multi) {
        paragraph.getClass();
        multi.getClass();
        paragraph.type_ = multi;
        paragraph.typeCase_ = 7;
    }

    /* JADX INFO: renamed from: o */
    public static void m23149o(Paragraph paragraph, Single single) {
        paragraph.getClass();
        single.getClass();
        paragraph.type_ = single;
        paragraph.typeCase_ = 6;
    }

    /* JADX INFO: renamed from: p */
    public static Paragraph m23150p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static C1381c m23151w() {
        return (C1381c) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: x */
    public static Paragraph m23152x(byte[] bArr) {
        return (Paragraph) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"type_", "typeCase_", "bitField0_", "text_", "textValues_", TextStyle.class, "style_", "box_", Hero.class, Single.class, Multi.class});
        }
        if (iOrdinal == 3) {
            return new Paragraph();
        }
        if (iOrdinal == 4) {
            return new C1381c(DEFAULT_INSTANCE);
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

    /* JADX INFO: renamed from: q */
    public final Hero m23153q() {
        return this.typeCase_ == 5 ? (Hero) this.type_ : Hero.m23170p();
    }

    /* JADX INFO: renamed from: r */
    public final Multi m23154r() {
        return this.typeCase_ == 7 ? (Multi) this.type_ : Multi.m23179r();
    }

    /* JADX INFO: renamed from: s */
    public final Single m23155s() {
        return this.typeCase_ == 6 ? (Single) this.type_ : Single.m23187q();
    }

    /* JADX INFO: renamed from: t */
    public final TextStyle m23156t() {
        TextStyle textStyle = this.text_;
        return textStyle == null ? TextStyle.m23198q() : textStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m23157u() {
        return this.textValues_;
    }

    /* JADX INFO: renamed from: v */
    public final int m23158v() {
        int i = this.typeCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }
}
