package com.spotify.watchfeed.component.item.p185v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class BoxedEntityRowComponentV2 extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int BUTTON_FIELD_NUMBER = 8;
    private static final BoxedEntityRowComponentV2 DEFAULT_INSTANCE;
    public static final int ENTITY_ICON_FIELD_NUMBER = 9;
    public static final int EXPLICIT_FIELD_NUMBER = 4;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int IS_19_PLUS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 11;
    public static final int SHOULD_RESUME_ON_FULL_PLAYBACK_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TAP_ACTION_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any button_;
    private boolean explicit_;
    private Image image_;
    private boolean is19Plus_;
    private boolean shouldResumeOnFullPlayback_;
    private TapAction tapAction_;
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";
    private String entityIcon_ = "";
    private String reason_ = "";

    public static final class TapAction extends AbstractC0269h implements sre0 {
        private static final TapAction DEFAULT_INSTANCE;
        public static final int NAVIGATION_COMMAND_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int PLAY_COMMAND_FIELD_NUMBER = 2;
        private int commandCase_ = 0;
        private Object command_;

        public static final class NavigationCommand extends AbstractC0269h implements sre0 {
            private static final NavigationCommand DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int URI_FIELD_NUMBER = 1;
            private String uri_ = "";

            static {
                NavigationCommand navigationCommand = new NavigationCommand();
                DEFAULT_INSTANCE = navigationCommand;
                AbstractC0269h.registerDefaultInstance(NavigationCommand.class, navigationCommand);
            }

            private NavigationCommand() {
            }

            /* JADX INFO: renamed from: n */
            public static NavigationCommand m22788n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
                }
                if (iOrdinal == 3) {
                    return new NavigationCommand();
                }
                if (iOrdinal == 4) {
                    return new C1352f(DEFAULT_INSTANCE);
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
                synchronized (NavigationCommand.class) {
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

            public final String getUri() {
                return this.uri_;
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

        public static final class PlayCommand extends AbstractC0269h implements sre0 {
            private static final PlayCommand DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 2;
            public static final int SHOULD_PREFER_VIDEO_FORMAT_FIELD_NUMBER = 3;
            public static final int URI_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean shouldPreferVideoFormat_;
            private String uri_ = "";
            private String playContextUri_ = "";

            static {
                PlayCommand playCommand = new PlayCommand();
                DEFAULT_INSTANCE = playCommand;
                AbstractC0269h.registerDefaultInstance(PlayCommand.class, playCommand);
            }

            private PlayCommand() {
            }

            /* JADX INFO: renamed from: n */
            public static PlayCommand m22789n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0007", new Object[]{"bitField0_", "uri_", "playContextUri_", "shouldPreferVideoFormat_"});
                }
                if (iOrdinal == 3) {
                    return new PlayCommand();
                }
                if (iOrdinal == 4) {
                    return new C1353g(DEFAULT_INSTANCE);
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
                synchronized (PlayCommand.class) {
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

            public final String getUri() {
                return this.uri_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final String m22790o() {
                return this.playContextUri_;
            }

            /* JADX INFO: renamed from: p */
            public final boolean m22791p() {
                return this.shouldPreferVideoFormat_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            TapAction tapAction = new TapAction();
            DEFAULT_INSTANCE = tapAction;
            AbstractC0269h.registerDefaultInstance(TapAction.class, tapAction);
        }

        private TapAction() {
        }

        /* JADX INFO: renamed from: o */
        public static TapAction m22784o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"command_", "commandCase_", NavigationCommand.class, PlayCommand.class});
            }
            if (iOrdinal == 3) {
                return new TapAction();
            }
            if (iOrdinal == 4) {
                return new C1351e(DEFAULT_INSTANCE);
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

        /* JADX INFO: renamed from: n */
        public final int m22785n() {
            int i = this.commandCase_;
            if (i == 0) {
                return 3;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final NavigationCommand m22786p() {
            return this.commandCase_ == 1 ? (NavigationCommand) this.command_ : NavigationCommand.m22788n();
        }

        /* JADX INFO: renamed from: q */
        public final PlayCommand m22787q() {
            return this.commandCase_ == 2 ? (PlayCommand) this.command_ : PlayCommand.m22789n();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        BoxedEntityRowComponentV2 boxedEntityRowComponentV2 = new BoxedEntityRowComponentV2();
        DEFAULT_INSTANCE = boxedEntityRowComponentV2;
        AbstractC0269h.registerDefaultInstance(BoxedEntityRowComponentV2.class, boxedEntityRowComponentV2);
    }

    private BoxedEntityRowComponentV2() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static BoxedEntityRowComponentV2 m22773x(gva gvaVar) {
        return (BoxedEntityRowComponentV2) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007\u0005\u0007\u0006ဉ\u0001\u0007Ȉ\bဉ\u0002\tȈ\n\u0007\u000bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "image_", "explicit_", "is19Plus_", "tapAction_", "accessibilityText_", "button_", "entityIcon_", "shouldResumeOnFullPlayback_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new BoxedEntityRowComponentV2();
        }
        if (iOrdinal == 4) {
            return new C1350d(DEFAULT_INSTANCE);
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
        synchronized (BoxedEntityRowComponentV2.class) {
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
    public final String m22774n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Any m22775o() {
        Any any = this.button_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: p */
    public final String m22776p() {
        return this.entityIcon_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22777q() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: r */
    public final Image m22778r() {
        Image image = this.image_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22779s() {
        return this.is19Plus_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22780t() {
        return this.reason_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22781u() {
        return this.shouldResumeOnFullPlayback_;
    }

    /* JADX INFO: renamed from: v */
    public final TapAction m22782v() {
        TapAction tapAction = this.tapAction_;
        return tapAction == null ? TapAction.m22784o() : tapAction;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22783w() {
        return (this.bitField0_ & 4) != 0;
    }
}
