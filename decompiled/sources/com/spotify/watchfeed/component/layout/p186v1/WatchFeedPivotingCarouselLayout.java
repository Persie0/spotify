package com.spotify.watchfeed.component.layout.p186v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import com.spotify.watchfeed.component.model.p187v1.proto.StylingOverrides;
import com.spotify.watchfeed.component.model.p187v1.proto.VideoFile;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedPivotingCarouselLayout extends AbstractC0269h implements sre0 {
    public static final int BOTTOM_COMPONENT_FIELD_NUMBER = 8;
    public static final int CARDS_FIELD_NUMBER = 4;
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final WatchFeedPivotingCarouselLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 9;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 6;
    public static final int HIDE_HEADER_FIELD_NUMBER = 7;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any bottomComponent_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private StylingOverrides stylingOverrides_;
    private String uri_ = "";
    private String itemId_ = "";
    private String title_ = "";
    private ae50 cards_ = AbstractC0269h.emptyProtobufList();
    private String headerTitleOverride_ = "";

    public static final class PivotingCard extends AbstractC0269h implements sre0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
        public static final int DECISION_ID_FIELD_NUMBER = 7;
        private static final PivotingCard DEFAULT_INSTANCE;
        public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
        public static final int IS_LARGE_FIELD_NUMBER = 8;
        public static final int LOGO_IMAGE_FIELD_NUMBER = 10;
        public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
        private static volatile r2n0 PARSER = null;
        public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        public static final int VIDEO_FILE_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean isLarge_;
        private Image logoImage_;
        private Image thumbnailImage_;
        private VideoFile videoFile_;
        private String uri_ = "";
        private String firstItemUri_ = "";
        private String title_ = "";
        private String navigationUri_ = "";
        private String decisionId_ = "";
        private String accessibilityText_ = "";

        static {
            PivotingCard pivotingCard = new PivotingCard();
            DEFAULT_INSTANCE = pivotingCard;
            AbstractC0269h.registerDefaultInstance(PivotingCard.class, pivotingCard);
        }

        private PivotingCard() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nဉ\u0002", new Object[]{"bitField0_", "uri_", "firstItemUri_", "title_", "videoFile_", "thumbnailImage_", "navigationUri_", "decisionId_", "isLarge_", "accessibilityText_", "logoImage_"});
            }
            if (iOrdinal == 3) {
                return new PivotingCard();
            }
            if (iOrdinal == 4) {
                return new C1355b(DEFAULT_INSTANCE);
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
            synchronized (PivotingCard.class) {
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
        public final String m22832n() {
            return this.accessibilityText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m22833o() {
            return this.decisionId_;
        }

        /* JADX INFO: renamed from: p */
        public final String m22834p() {
            return this.firstItemUri_;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m22835q() {
            return this.isLarge_;
        }

        /* JADX INFO: renamed from: r */
        public final Image m22836r() {
            Image image = this.logoImage_;
            return image == null ? Image.m22897n() : image;
        }

        /* JADX INFO: renamed from: s */
        public final String m22837s() {
            return this.navigationUri_;
        }

        /* JADX INFO: renamed from: t */
        public final Image m22838t() {
            Image image = this.thumbnailImage_;
            return image == null ? Image.m22897n() : image;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final VideoFile m22839u() {
            VideoFile videoFile = this.videoFile_;
            return videoFile == null ? VideoFile.m22923n() : videoFile;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m22840v() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    static {
        WatchFeedPivotingCarouselLayout watchFeedPivotingCarouselLayout = new WatchFeedPivotingCarouselLayout();
        DEFAULT_INSTANCE = watchFeedPivotingCarouselLayout;
        AbstractC0269h.registerDefaultInstance(WatchFeedPivotingCarouselLayout.class, watchFeedPivotingCarouselLayout);
    }

    private WatchFeedPivotingCarouselLayout() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static WatchFeedPivotingCarouselLayout m22822w(gva gvaVar) {
        return (WatchFeedPivotingCarouselLayout) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006Ȉ\u0007\u0007\bဉ\u0001\tဉ\u0002\nဉ\u0003", new Object[]{"bitField0_", "uri_", "itemId_", "title_", "cards_", PivotingCard.class, "content_", "headerTitleOverride_", "hideHeader_", "bottomComponent_", "headerOverrides_", "stylingOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedPivotingCarouselLayout();
        }
        if (iOrdinal == 4) {
            return new C1354a(DEFAULT_INSTANCE);
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
        synchronized (WatchFeedPivotingCarouselLayout.class) {
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
    public final Any m22823n() {
        Any any = this.bottomComponent_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22824o() {
        return this.cards_;
    }

    /* JADX INFO: renamed from: p */
    public final Any m22825p() {
        Any any = this.content_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: q */
    public final HeaderOverrides m22826q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: r */
    public final String m22827r() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: s */
    public final StylingOverrides m22828s() {
        StylingOverrides stylingOverrides = this.stylingOverrides_;
        return stylingOverrides == null ? StylingOverrides.m22917n() : stylingOverrides;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m22829t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22830u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22831v() {
        return (this.bitField0_ & 8) != 0;
    }
}
