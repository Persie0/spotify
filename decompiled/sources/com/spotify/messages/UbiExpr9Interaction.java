package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.hu91;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class UbiExpr9Interaction extends AbstractC0269h implements sre0 {
    public static final int ACTION_NAME_FIELD_NUMBER = 7;
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 9;
    public static final int ACTION_VERSION_FIELD_NUMBER = 8;
    public static final int ACTOR_FIELD_NUMBER = 3;
    public static final int APP_FIELD_NUMBER = 18;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 19;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 20;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 23;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 21;
    private static final UbiExpr9Interaction DEFAULT_INSTANCE;
    public static final int GENERATOR_VERSION_FIELD_NUMBER = 22;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    public static final int INTERACTION_PARAMETERS_FIELD_NUMBER = 6;
    public static final int INTERACTION_TYPE_NAME_FIELD_NUMBER = 4;
    public static final int INTERACTION_TYPE_VERSION_FIELD_NUMBER = 5;
    public static final int PAGE_ID_FIELD_NUMBER = 12;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 14;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 15;
    public static final int PAGE_URI_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 10;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 16;
    public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 17;
    public static final int SOURCE_PATHS_FIELD_NUMBER = 11;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 2;
    private int actionVersion_;
    private int appVisitIndex_;
    private int bitField0_;
    private int interactionTypeVersion_;
    private int pagePresentationId_;
    private long ubiEventCreationTimestamp_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String interactionId_ = "";
    private String actor_ = "";
    private String interactionTypeName_ = "";
    private ae50 interactionParameters_ = AbstractC0269h.emptyProtobufList();
    private String actionName_ = "";
    private ae50 actionParameters_ = AbstractC0269h.emptyProtobufList();
    private ae50 path_ = AbstractC0269h.emptyProtobufList();
    private ae50 sourcePaths_ = AbstractC0269h.emptyProtobufList();
    private String pageId_ = "";
    private String pageUri_ = "";
    private String pageInstanceId_ = "";
    private String playbackId_ = "";
    private String playContextUri_ = "";
    private String app_ = "";
    private String appInstanceId_ = "";
    private String clientTimezone_ = "";
    private String generatorVersion_ = "";

    public static final class ActionParameters extends AbstractC0269h implements sre0 {
        private static final ActionParameters DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String name_ = "";
        private String value_ = "";

        static {
            ActionParameters actionParameters = new ActionParameters();
            DEFAULT_INSTANCE = actionParameters;
            AbstractC0269h.registerDefaultInstance(ActionParameters.class, actionParameters);
        }

        private ActionParameters() {
        }

        /* JADX INFO: renamed from: n */
        public static void m14542n(ActionParameters actionParameters, String str) {
            actionParameters.getClass();
            actionParameters.bitField0_ |= 1;
            actionParameters.name_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m14543o(ActionParameters actionParameters, String str) {
            actionParameters.getClass();
            actionParameters.bitField0_ |= 2;
            actionParameters.value_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C0883a m14544p() {
            return (C0883a) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "value_"});
            }
            if (iOrdinal == 3) {
                return new ActionParameters();
            }
            if (iOrdinal == 4) {
                return new C0883a(DEFAULT_INSTANCE);
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
            synchronized (ActionParameters.class) {
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

    public static final class InteractionParameters extends AbstractC0269h implements sre0 {
        private static final InteractionParameters DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String name_ = "";
        private String value_ = "";

        static {
            InteractionParameters interactionParameters = new InteractionParameters();
            DEFAULT_INSTANCE = interactionParameters;
            AbstractC0269h.registerDefaultInstance(InteractionParameters.class, interactionParameters);
        }

        private InteractionParameters() {
        }

        /* JADX INFO: renamed from: n */
        public static void m14545n(InteractionParameters interactionParameters, String str) {
            interactionParameters.getClass();
            interactionParameters.bitField0_ |= 1;
            interactionParameters.name_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m14546o(InteractionParameters interactionParameters, String str) {
            interactionParameters.getClass();
            interactionParameters.bitField0_ |= 2;
            interactionParameters.value_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C0885c m14547p() {
            return (C0885c) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "value_"});
            }
            if (iOrdinal == 3) {
                return new InteractionParameters();
            }
            if (iOrdinal == 4) {
                return new C0885c(DEFAULT_INSTANCE);
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
            synchronized (InteractionParameters.class) {
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

    public static final class Path extends AbstractC0269h implements sre0 {
        private static final Path DEFAULT_INSTANCE;
        public static final int ELEMENTS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private String version_ = "";
        private ae50 elements_ = AbstractC0269h.emptyProtobufList();

        public static final class Elements extends AbstractC0269h implements sre0 {
            private static final Elements DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int POS_FIELD_NUMBER = 2;
            public static final int REASON_FIELD_NUMBER = 5;
            public static final int URI_FIELD_NUMBER = 4;
            private int bitField0_;
            private String name_ = "";
            private String pos_ = "";
            private String id_ = "";
            private String uri_ = "";
            private String reason_ = "";

            static {
                Elements elements = new Elements();
                DEFAULT_INSTANCE = elements;
                AbstractC0269h.registerDefaultInstance(Elements.class, elements);
            }

            private Elements() {
            }

            /* JADX INFO: renamed from: n */
            public static void m14551n(Elements elements, String str) {
                elements.getClass();
                str.getClass();
                elements.bitField0_ |= 4;
                elements.id_ = str;
            }

            /* JADX INFO: renamed from: o */
            public static void m14552o(Elements elements, String str) {
                elements.getClass();
                str.getClass();
                elements.bitField0_ |= 1;
                elements.name_ = str;
            }

            /* JADX INFO: renamed from: p */
            public static void m14553p(Elements elements, String str) {
                elements.getClass();
                str.getClass();
                elements.bitField0_ |= 2;
                elements.pos_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m14554q(Elements elements, String str) {
                elements.getClass();
                str.getClass();
                elements.bitField0_ |= 16;
                elements.reason_ = str;
            }

            /* JADX INFO: renamed from: r */
            public static void m14555r(Elements elements, String str) {
                elements.getClass();
                str.getClass();
                elements.bitField0_ |= 8;
                elements.uri_ = str;
            }

            /* JADX INFO: renamed from: s */
            public static C0887e m14556s() {
                return (C0887e) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "name_", "pos_", "id_", "uri_", "reason_"});
                }
                if (iOrdinal == 3) {
                    return new Elements();
                }
                if (iOrdinal == 4) {
                    return new C0887e(DEFAULT_INSTANCE);
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
                synchronized (Elements.class) {
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
            Path path = new Path();
            DEFAULT_INSTANCE = path;
            AbstractC0269h.registerDefaultInstance(Path.class, path);
        }

        private Path() {
        }

        /* JADX INFO: renamed from: n */
        public static void m14548n(Path path, Elements elements) {
            path.getClass();
            elements.getClass();
            ae50 ae50Var = path.elements_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                path.elements_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            path.elements_.add(elements);
        }

        /* JADX INFO: renamed from: o */
        public static void m14549o(Path path, String str) {
            path.getClass();
            str.getClass();
            path.bitField0_ |= 1;
            path.version_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C0886d m14550p() {
            return (C0886d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "version_", "elements_", Elements.class});
            }
            if (iOrdinal == 3) {
                return new Path();
            }
            if (iOrdinal == 4) {
                return new C0886d(DEFAULT_INSTANCE);
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
            synchronized (Path.class) {
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

    public static final class SourcePaths extends AbstractC0269h implements sre0 {
        private static final SourcePaths DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        private ae50 path_ = AbstractC0269h.emptyProtobufList();

        public static final class Path extends AbstractC0269h implements sre0 {
            private static final Path DEFAULT_INSTANCE;
            public static final int ELEMENTS_FIELD_NUMBER = 2;
            private static volatile r2n0 PARSER = null;
            public static final int VERSION_FIELD_NUMBER = 1;
            private int bitField0_;
            private String version_ = "";
            private ae50 elements_ = AbstractC0269h.emptyProtobufList();

            public static final class Elements extends AbstractC0269h implements sre0 {
                private static final Elements DEFAULT_INSTANCE;
                public static final int ID_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER = null;
                public static final int POS_FIELD_NUMBER = 2;
                public static final int REASON_FIELD_NUMBER = 5;
                public static final int URI_FIELD_NUMBER = 4;
                private int bitField0_;
                private String name_ = "";
                private String pos_ = "";
                private String id_ = "";
                private String uri_ = "";
                private String reason_ = "";

                static {
                    Elements elements = new Elements();
                    DEFAULT_INSTANCE = elements;
                    AbstractC0269h.registerDefaultInstance(Elements.class, elements);
                }

                private Elements() {
                }

                /* JADX INFO: renamed from: n */
                public static void m14564n(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 4;
                    elements.id_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m14565o(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 1;
                    elements.name_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static void m14566p(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 2;
                    elements.pos_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: q */
                public static void m14567q(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 16;
                    elements.reason_ = str;
                }

                /* JADX INFO: renamed from: r */
                public static void m14568r(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 8;
                    elements.uri_ = str;
                }

                /* JADX INFO: renamed from: s */
                public static C0890h m14569s() {
                    return (C0890h) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "name_", "pos_", "id_", "uri_", "reason_"});
                    }
                    if (iOrdinal == 3) {
                        return new Elements();
                    }
                    if (iOrdinal == 4) {
                        return new C0890h(DEFAULT_INSTANCE);
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
                    synchronized (Elements.class) {
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
                Path path = new Path();
                DEFAULT_INSTANCE = path;
                AbstractC0269h.registerDefaultInstance(Path.class, path);
            }

            private Path() {
            }

            /* JADX INFO: renamed from: n */
            public static void m14560n(Path path, Elements elements) {
                path.getClass();
                elements.getClass();
                ae50 ae50Var = path.elements_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    path.elements_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                path.elements_.add(elements);
            }

            /* JADX INFO: renamed from: o */
            public static void m14561o(Path path, String str) {
                path.getClass();
                str.getClass();
                path.bitField0_ |= 1;
                path.version_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0889g m14562q() {
                return (C0889g) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "version_", "elements_", Elements.class});
                }
                if (iOrdinal == 3) {
                    return new Path();
                }
                if (iOrdinal == 4) {
                    return new C0889g(DEFAULT_INSTANCE);
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
                synchronized (Path.class) {
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
            public final int m14563p() {
                return this.elements_.size();
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            SourcePaths sourcePaths = new SourcePaths();
            DEFAULT_INSTANCE = sourcePaths;
            AbstractC0269h.registerDefaultInstance(SourcePaths.class, sourcePaths);
        }

        private SourcePaths() {
        }

        /* JADX INFO: renamed from: n */
        public static void m14557n(SourcePaths sourcePaths, Path path) {
            sourcePaths.getClass();
            path.getClass();
            ae50 ae50Var = sourcePaths.path_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                sourcePaths.path_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            sourcePaths.path_.add(path);
        }

        /* JADX INFO: renamed from: p */
        public static C0888f m14558p() {
            return (C0888f) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"path_", Path.class});
            }
            if (iOrdinal == 3) {
                return new SourcePaths();
            }
            if (iOrdinal == 4) {
                return new C0888f(DEFAULT_INSTANCE);
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
            synchronized (SourcePaths.class) {
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
        public final int m14559o() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        UbiExpr9Interaction ubiExpr9Interaction = new UbiExpr9Interaction();
        DEFAULT_INSTANCE = ubiExpr9Interaction;
        AbstractC0269h.registerDefaultInstance(UbiExpr9Interaction.class, ubiExpr9Interaction);
    }

    private UbiExpr9Interaction() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14518A(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 1;
        ubiExpr9Interaction.interactionId_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m14519B(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 8;
        ubiExpr9Interaction.interactionTypeName_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m14520C(UbiExpr9Interaction ubiExpr9Interaction, int i) {
        ubiExpr9Interaction.bitField0_ |= 16;
        ubiExpr9Interaction.interactionTypeVersion_ = i;
    }

    /* JADX INFO: renamed from: D */
    public static void m14521D(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 128;
        ubiExpr9Interaction.pageId_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14522E(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 512;
        ubiExpr9Interaction.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14523F(UbiExpr9Interaction ubiExpr9Interaction, int i) {
        ubiExpr9Interaction.bitField0_ |= 1024;
        ubiExpr9Interaction.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: G */
    public static void m14524G(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 256;
        ubiExpr9Interaction.pageUri_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14525H(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 4096;
        ubiExpr9Interaction.playContextUri_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14526I(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 2048;
        ubiExpr9Interaction.playbackId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m14527J(UbiExpr9Interaction ubiExpr9Interaction, long j) {
        ubiExpr9Interaction.bitField0_ |= 2;
        ubiExpr9Interaction.ubiEventCreationTimestamp_ = j;
    }

    /* JADX INFO: renamed from: K */
    public static C0884b m14528K() {
        return (C0884b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14529n(UbiExpr9Interaction ubiExpr9Interaction, ActionParameters actionParameters) {
        ubiExpr9Interaction.getClass();
        actionParameters.getClass();
        ae50 ae50Var = ubiExpr9Interaction.actionParameters_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr9Interaction.actionParameters_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr9Interaction.actionParameters_.add(actionParameters);
    }

    /* JADX INFO: renamed from: o */
    public static void m14530o(UbiExpr9Interaction ubiExpr9Interaction, InteractionParameters interactionParameters) {
        ubiExpr9Interaction.getClass();
        interactionParameters.getClass();
        ae50 ae50Var = ubiExpr9Interaction.interactionParameters_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr9Interaction.interactionParameters_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr9Interaction.interactionParameters_.add(interactionParameters);
    }

    /* JADX INFO: renamed from: p */
    public static void m14531p(UbiExpr9Interaction ubiExpr9Interaction, Path path) {
        ubiExpr9Interaction.getClass();
        path.getClass();
        ae50 ae50Var = ubiExpr9Interaction.path_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr9Interaction.path_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr9Interaction.path_.add(path);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14532q(UbiExpr9Interaction ubiExpr9Interaction, SourcePaths sourcePaths) {
        ubiExpr9Interaction.getClass();
        sourcePaths.getClass();
        ae50 ae50Var = ubiExpr9Interaction.sourcePaths_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr9Interaction.sourcePaths_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr9Interaction.sourcePaths_.add(sourcePaths);
    }

    /* JADX INFO: renamed from: r */
    public static ihc0 m14533r(UbiExpr9Interaction ubiExpr9Interaction) {
        ihc0 ihc0Var = ubiExpr9Interaction.clientDebugMetadata_;
        if (!ihc0Var.f102236a) {
            ubiExpr9Interaction.clientDebugMetadata_ = ihc0Var.m50613h();
        }
        return ubiExpr9Interaction.clientDebugMetadata_;
    }

    /* JADX INFO: renamed from: s */
    public static void m14534s(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 32;
        ubiExpr9Interaction.actionName_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14535t(UbiExpr9Interaction ubiExpr9Interaction, int i) {
        ubiExpr9Interaction.bitField0_ |= 64;
        ubiExpr9Interaction.actionVersion_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m14536u(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 4;
        ubiExpr9Interaction.actor_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m14537v(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 8192;
        ubiExpr9Interaction.app_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14538w(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 16384;
        ubiExpr9Interaction.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14539x(UbiExpr9Interaction ubiExpr9Interaction, int i) {
        ubiExpr9Interaction.bitField0_ |= 32768;
        ubiExpr9Interaction.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m14540y(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        ubiExpr9Interaction.bitField0_ |= 65536;
        ubiExpr9Interaction.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14541z(UbiExpr9Interaction ubiExpr9Interaction, String str) {
        ubiExpr9Interaction.getClass();
        str.getClass();
        ubiExpr9Interaction.bitField0_ |= 131072;
        ubiExpr9Interaction.generatorVersion_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0001\u0004\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006\u001b\u0007ဈ\u0005\bင\u0006\t\u001b\n\u001b\u000b\u001b\fဈ\u0007\rဈ\b\u000eဈ\t\u000fင\n\u0010ဈ\u000b\u0011ဈ\f\u0012ဈ\r\u0013ဈ\u000e\u0014င\u000f\u0015ဈ\u0010\u0016ဈ\u0011\u00172", new Object[]{"bitField0_", "interactionId_", "ubiEventCreationTimestamp_", "actor_", "interactionTypeName_", "interactionTypeVersion_", "interactionParameters_", InteractionParameters.class, "actionName_", "actionVersion_", "actionParameters_", ActionParameters.class, "path_", Path.class, "sourcePaths_", SourcePaths.class, "pageId_", "pageUri_", "pageInstanceId_", "pagePresentationId_", "playbackId_", "playContextUri_", "app_", "appInstanceId_", "appVisitIndex_", "clientTimezone_", "generatorVersion_", "clientDebugMetadata_", hu91.f95354a});
        }
        if (iOrdinal == 3) {
            return new UbiExpr9Interaction();
        }
        if (iOrdinal == 4) {
            return new C0884b(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr9Interaction.class) {
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
