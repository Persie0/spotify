package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Visual;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorFollowRowComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int CREATOR_URI_FIELD_NUMBER = 1;
    private static final CreatorFollowRowComponent DEFAULT_INSTANCE;
    public static final int FOLLOW_ACTION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int VISUAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private FollowAction followAction_;
    private Visual visual_;
    private String creatorUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";

    public static final class FollowAction extends AbstractC0269h implements sre0 {
        private static final FollowAction DEFAULT_INSTANCE;
        public static final int FOLLOWING_ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
        public static final int FOLLOWING_TEXT_FIELD_NUMBER = 2;
        public static final int FOLLOW_ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
        public static final int FOLLOW_TEXT_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
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
        public static FollowAction m22613n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"followText_", "followingText_", "followAccessibilityText_", "followingAccessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new FollowAction();
            }
            if (iOrdinal == 4) {
                return new C1341b(DEFAULT_INSTANCE);
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
        public final String m22614o() {
            return this.followAccessibilityText_;
        }

        /* JADX INFO: renamed from: p */
        public final String m22615p() {
            return this.followText_;
        }

        /* JADX INFO: renamed from: q */
        public final String m22616q() {
            return this.followingAccessibilityText_;
        }

        /* JADX INFO: renamed from: r */
        public final String m22617r() {
            return this.followingText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CreatorFollowRowComponent creatorFollowRowComponent = new CreatorFollowRowComponent();
        DEFAULT_INSTANCE = creatorFollowRowComponent;
        AbstractC0269h.registerDefaultInstance(CreatorFollowRowComponent.class, creatorFollowRowComponent);
    }

    private CreatorFollowRowComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CreatorFollowRowComponent m22608r(gva gvaVar) {
        return (CreatorFollowRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ", new Object[]{"bitField0_", "creatorUri_", "visual_", "title_", "subtitle_", "followAction_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CreatorFollowRowComponent();
        }
        if (iOrdinal == 4) {
            return new C1340a(DEFAULT_INSTANCE);
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
        synchronized (CreatorFollowRowComponent.class) {
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
    public final String m22609n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22610o() {
        return this.creatorUri_;
    }

    /* JADX INFO: renamed from: p */
    public final FollowAction m22611p() {
        FollowAction followAction = this.followAction_;
        return followAction == null ? FollowAction.m22613n() : followAction;
    }

    /* JADX INFO: renamed from: q */
    public final Visual m22612q() {
        Visual visual = this.visual_;
        return visual == null ? Visual.m22929o() : visual;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
