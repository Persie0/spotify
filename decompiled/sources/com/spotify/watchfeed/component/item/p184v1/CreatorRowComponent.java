package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.Visual;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorRowComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int CREATOR_URIS_FIELD_NUMBER = 1;
    private static final CreatorRowComponent DEFAULT_INSTANCE;
    public static final int FOLLOW_ACTION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TAP_ACTION_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int VISUALS_FIELD_NUMBER = 2;
    private int bitField0_;
    private FollowAction followAction_;
    private TapAction tapAction_;
    private ae50 creatorUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 visuals_ = AbstractC0269h.emptyProtobufList();
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";

    public static final class FollowAction extends AbstractC0269h implements sre0 {
        private static final FollowAction DEFAULT_INSTANCE;
        public static final int FOLLOWING_ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
        public static final int FOLLOWING_TEXT_FIELD_NUMBER = 3;
        public static final int FOLLOW_ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
        public static final int FOLLOW_TEXT_FIELD_NUMBER = 2;
        public static final int FOLLOW_URI_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String followUri_ = "";
        private String followText_ = "";
        private String followingText_ = "";
        private String followAccessibilityText_ = "";
        private String followingAccessibilityText_ = "";

        static {
            FollowAction followAction = new FollowAction();
            DEFAULT_INSTANCE = followAction;
            AbstractC0269h.registerDefaultInstance(FollowAction.class, followAction);
        }

        private FollowAction() {
        }

        /* JADX INFO: renamed from: n */
        public static FollowAction m22625n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"followUri_", "followText_", "followingText_", "followAccessibilityText_", "followingAccessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new FollowAction();
            }
            if (iOrdinal == 4) {
                return new C1343d(DEFAULT_INSTANCE);
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
            synchronized (FollowAction.class) {
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
        public final String m22626o() {
            return this.followAccessibilityText_;
        }

        /* JADX INFO: renamed from: p */
        public final String m22627p() {
            return this.followText_;
        }

        /* JADX INFO: renamed from: q */
        public final String m22628q() {
            return this.followUri_;
        }

        /* JADX INFO: renamed from: r */
        public final String m22629r() {
            return this.followingAccessibilityText_;
        }

        /* JADX INFO: renamed from: s */
        public final String m22630s() {
            return this.followingText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TapAction extends AbstractC0269h implements sre0 {
        private static final TapAction DEFAULT_INSTANCE;
        public static final int NAVIGATION_URI_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int SHEET_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private Object action_;

        static {
            TapAction tapAction = new TapAction();
            DEFAULT_INSTANCE = tapAction;
            AbstractC0269h.registerDefaultInstance(TapAction.class, tapAction);
        }

        private TapAction() {
        }

        /* JADX INFO: renamed from: n */
        public static TapAction m22631n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"action_", "actionCase_", Any.class});
            }
            if (iOrdinal == 3) {
                return new TapAction();
            }
            if (iOrdinal == 4) {
                return new C1344e(DEFAULT_INSTANCE);
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
            synchronized (TapAction.class) {
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
        public final String m22632o() {
            return this.actionCase_ == 1 ? (String) this.action_ : "";
        }

        /* JADX INFO: renamed from: p */
        public final Any m22633p() {
            return this.actionCase_ == 2 ? (Any) this.action_ : Any.m1909p();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CreatorRowComponent creatorRowComponent = new CreatorRowComponent();
        DEFAULT_INSTANCE = creatorRowComponent;
        AbstractC0269h.registerDefaultInstance(CreatorRowComponent.class, creatorRowComponent);
    }

    private CreatorRowComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static CreatorRowComponent m22618t(gva gvaVar) {
        return (CreatorRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ț\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007Ȉ", new Object[]{"bitField0_", "creatorUris_", "visuals_", Visual.class, "title_", "subtitle_", "followAction_", "tapAction_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CreatorRowComponent();
        }
        if (iOrdinal == 4) {
            return new C1342c(DEFAULT_INSTANCE);
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
        synchronized (CreatorRowComponent.class) {
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
    public final String m22619n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22620o() {
        return this.creatorUris_;
    }

    /* JADX INFO: renamed from: p */
    public final FollowAction m22621p() {
        FollowAction followAction = this.followAction_;
        return followAction == null ? FollowAction.m22625n() : followAction;
    }

    /* JADX INFO: renamed from: q */
    public final TapAction m22622q() {
        TapAction tapAction = this.tapAction_;
        return tapAction == null ? TapAction.m22631n() : tapAction;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m22623r() {
        return this.visuals_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22624s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
