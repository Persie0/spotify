package com.spotify.watchfeed.component.layout.p186v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.p187v1.proto.MediaItem;
import com.spotify.watchfeed.component.model.p187v1.proto.StylingOverrides;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedSurveyLayout extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final WatchFeedSurveyLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 9;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    public static final int MEDIA_ITEM_FIELD_NUMBER = 5;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int REFERENCED_URI_FIELD_NUMBER = 2;
    public static final int SKIP_OPTION_FIELD_NUMBER = 8;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private MediaItem mediaItem_;
    private SkipOption skipOption_;
    private StylingOverrides stylingOverrides_;
    private String uri_ = "";
    private String referencedUri_ = "";
    private String itemId_ = "";
    private String title_ = "";
    private ae50 options_ = AbstractC0269h.emptyProtobufList();

    public static final class Option extends AbstractC0269h implements sre0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
        private static final Option DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private String text_ = "";
        private String accessibilityText_ = "";
        private String value_ = "";

        static {
            Option option = new Option();
            DEFAULT_INSTANCE = option;
            AbstractC0269h.registerDefaultInstance(Option.class, option);
        }

        private Option() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "accessibilityText_", "value_"});
            }
            if (iOrdinal == 3) {
                return new Option();
            }
            if (iOrdinal == 4) {
                return new C1357d(DEFAULT_INSTANCE);
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
            synchronized (Option.class) {
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

        public final String getValue() {
            return this.value_;
        }

        /* JADX INFO: renamed from: n */
        public final String m22851n() {
            return this.accessibilityText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22852o() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SkipOption extends AbstractC0269h implements sre0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
        private static final SkipOption DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String accessibilityText_ = "";

        static {
            SkipOption skipOption = new SkipOption();
            DEFAULT_INSTANCE = skipOption;
            AbstractC0269h.registerDefaultInstance(SkipOption.class, skipOption);
        }

        private SkipOption() {
        }

        /* JADX INFO: renamed from: o */
        public static SkipOption m22853o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "accessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new SkipOption();
            }
            if (iOrdinal == 4) {
                return new C1358e(DEFAULT_INSTANCE);
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
            synchronized (SkipOption.class) {
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
        public final String m22854n() {
            return this.accessibilityText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m22855p() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedSurveyLayout watchFeedSurveyLayout = new WatchFeedSurveyLayout();
        DEFAULT_INSTANCE = watchFeedSurveyLayout;
        AbstractC0269h.registerDefaultInstance(WatchFeedSurveyLayout.class, watchFeedSurveyLayout);
    }

    private WatchFeedSurveyLayout() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static WatchFeedSurveyLayout m22841w(gva gvaVar) {
        return (WatchFeedSurveyLayout) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\u0007\u001b\bဉ\u0002\tဉ\u0003\nဉ\u0004", new Object[]{"bitField0_", "uri_", "referencedUri_", "content_", "itemId_", "mediaItem_", "title_", "options_", Option.class, "skipOption_", "headerOverrides_", "stylingOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedSurveyLayout();
        }
        if (iOrdinal == 4) {
            return new C1356c(DEFAULT_INSTANCE);
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
        synchronized (WatchFeedSurveyLayout.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final Any m22842n() {
        Any any = this.content_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HeaderOverrides m22843o() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: p */
    public final String m22844p() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: q */
    public final MediaItem m22845q() {
        MediaItem mediaItem = this.mediaItem_;
        return mediaItem == null ? MediaItem.m22902n() : mediaItem;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m22846r() {
        return this.options_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22847s() {
        return this.referencedUri_;
    }

    /* JADX INFO: renamed from: t */
    public final SkipOption m22848t() {
        SkipOption skipOption = this.skipOption_;
        return skipOption == null ? SkipOption.m22853o() : skipOption;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22849u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22850v() {
        return (this.bitField0_ & 4) != 0;
    }
}
