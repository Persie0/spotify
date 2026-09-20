package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.hw91;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class UbiProd1Interaction extends AbstractC0269h implements sre0 {
    public static final int ACTION_NAME_FIELD_NUMBER = 4;
    public static final int ACTION_PARAMETER_NAMES_FIELD_NUMBER = 6;
    public static final int ACTION_PARAMETER_VALUES_FIELD_NUMBER = 7;
    public static final int ACTION_VERSION_FIELD_NUMBER = 5;
    public static final int ANNOTATOR_CONFIGURATION_VERSION_FIELD_NUMBER = 21;
    public static final int ANNOTATOR_VERSION_FIELD_NUMBER = 20;
    public static final int APP_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 37;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 38;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 35;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 34;
    private static final UbiProd1Interaction DEFAULT_INSTANCE;
    public static final int ELEMENT_PATH_IDS_FIELD_NUMBER = 10;
    public static final int ELEMENT_PATH_NAMES_FIELD_NUMBER = 8;
    public static final int ELEMENT_PATH_POS_FIELD_NUMBER = 9;
    public static final int ELEMENT_PATH_REASONS_FIELD_NUMBER = 12;
    public static final int ELEMENT_PATH_URIS_FIELD_NUMBER = 11;
    public static final int ERRORS_FIELD_NUMBER = 13;
    public static final int FEATURE_FIELD_NUMBER = 40;
    public static final int GENERATOR_VERSION_FIELD_NUMBER = 1;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 19;
    public static final int INTERACTION_ID_FIELD_NUMBER = 14;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 3;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 41;
    public static final int PAGE_ID_FIELD_NUMBER = 33;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 15;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 36;
    public static final int PAGE_URI_FIELD_NUMBER = 29;
    public static final int PARENT_MODES_FIELD_NUMBER = 28;
    public static final int PARENT_PATH_IDS_FIELD_NUMBER = 24;
    public static final int PARENT_PATH_NAMES_FIELD_NUMBER = 22;
    public static final int PARENT_PATH_POS_FIELD_NUMBER = 23;
    public static final int PARENT_PATH_REASONS_FIELD_NUMBER = 26;
    public static final int PARENT_PATH_URIS_FIELD_NUMBER = 25;
    public static final int PARENT_SPECIFICATION_VERSIONS_FIELD_NUMBER = 27;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 18;
    public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 30;
    public static final int REPORTED_CLIENT_TIMESTAMP_FIELD_NUMBER = 31;
    public static final int SOURCE_PATHS_FIELD_NUMBER = 39;
    public static final int SPECIFICATION_MODE_FIELD_NUMBER = 17;
    public static final int SPECIFICATION_VERSION_FIELD_NUMBER = 16;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 32;
    private int actionVersion_;
    private int appVisitIndex_;
    private int bitField0_;
    private int pagePresentationId_;
    private long reportedClientTimestamp_;
    private long ubiEventCreationTimestamp_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String generatorVersion_ = "";
    private String app_ = "";
    private String interactionType_ = "";
    private String actionName_ = "";
    private ae50 actionParameterNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 actionParameterValues_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathPos_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathReasons_ = AbstractC0269h.emptyProtobufList();
    private ae50 errors_ = AbstractC0269h.emptyProtobufList();
    private String interactionId_ = "";
    private String pageInstanceId_ = "";
    private String specificationVersion_ = "";
    private String specificationMode_ = "";
    private String playbackId_ = "";
    private String impressionId_ = "";
    private String annotatorVersion_ = "";
    private String annotatorConfigurationVersion_ = "";
    private ae50 parentPathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentPathPos_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentPathIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentPathUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentPathReasons_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentSpecificationVersions_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentModes_ = AbstractC0269h.emptyProtobufList();
    private String pageUri_ = "";
    private String playContextUri_ = "";
    private String pageId_ = "";
    private String clientTimezone_ = "";
    private String appInstanceId_ = "";
    private ae50 sourcePaths_ = AbstractC0269h.emptyProtobufList();
    private String feature_ = "";
    private String pageIdentifier_ = "";

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
                public static void m14718n(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 4;
                    elements.id_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m14719o(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 1;
                    elements.name_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static void m14720p(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 2;
                    elements.pos_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: q */
                public static void m14721q(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 16;
                    elements.reason_ = str;
                }

                /* JADX INFO: renamed from: r */
                public static void m14722r(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 8;
                    elements.uri_ = str;
                }

                /* JADX INFO: renamed from: s */
                public static C0902t m14723s() {
                    return (C0902t) DEFAULT_INSTANCE.createBuilder();
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
                        return new C0902t(DEFAULT_INSTANCE);
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
            public static void m14714n(Path path, Elements elements) {
                path.getClass();
                elements.getClass();
                ae50 ae50Var = path.elements_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    path.elements_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                path.elements_.add(elements);
            }

            /* JADX INFO: renamed from: o */
            public static void m14715o(Path path, String str) {
                path.getClass();
                str.getClass();
                path.bitField0_ |= 1;
                path.version_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0901s m14716q() {
                return (C0901s) DEFAULT_INSTANCE.createBuilder();
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
                    return new C0901s(DEFAULT_INSTANCE);
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
            public final int m14717p() {
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
        public static void m14711n(SourcePaths sourcePaths, Path path) {
            sourcePaths.getClass();
            path.getClass();
            ae50 ae50Var = sourcePaths.path_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                sourcePaths.path_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            sourcePaths.path_.add(path);
        }

        /* JADX INFO: renamed from: p */
        public static C0900r m14712p() {
            return (C0900r) DEFAULT_INSTANCE.createBuilder();
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
                return new C0900r(DEFAULT_INSTANCE);
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
        public final int m14713o() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        UbiProd1Interaction ubiProd1Interaction = new UbiProd1Interaction();
        DEFAULT_INSTANCE = ubiProd1Interaction;
        AbstractC0269h.registerDefaultInstance(UbiProd1Interaction.class, ubiProd1Interaction);
    }

    private UbiProd1Interaction() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14674A(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentSpecificationVersions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentSpecificationVersions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentSpecificationVersions_.add(str);
    }

    /* JADX INFO: renamed from: B */
    public static void m14675B(UbiProd1Interaction ubiProd1Interaction, SourcePaths sourcePaths) {
        ubiProd1Interaction.getClass();
        sourcePaths.getClass();
        ae50 ae50Var = ubiProd1Interaction.sourcePaths_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.sourcePaths_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.sourcePaths_.add(sourcePaths);
    }

    /* JADX INFO: renamed from: C */
    public static ihc0 m14676C(UbiProd1Interaction ubiProd1Interaction) {
        ihc0 ihc0Var = ubiProd1Interaction.clientDebugMetadata_;
        if (!ihc0Var.f102236a) {
            ubiProd1Interaction.clientDebugMetadata_ = ihc0Var.m50613h();
        }
        return ubiProd1Interaction.clientDebugMetadata_;
    }

    /* JADX INFO: renamed from: D */
    public static void m14677D(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 8;
        ubiProd1Interaction.actionName_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14678E(UbiProd1Interaction ubiProd1Interaction, int i) {
        ubiProd1Interaction.bitField0_ |= 16;
        ubiProd1Interaction.actionVersion_ = i;
    }

    /* JADX INFO: renamed from: F */
    public static void m14679F(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 4096;
        ubiProd1Interaction.annotatorConfigurationVersion_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m14680G(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 2048;
        ubiProd1Interaction.annotatorVersion_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14681H(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 2;
        ubiProd1Interaction.app_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14682I(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 1048576;
        ubiProd1Interaction.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m14683J(UbiProd1Interaction ubiProd1Interaction, int i) {
        ubiProd1Interaction.bitField0_ |= 2097152;
        ubiProd1Interaction.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: K */
    public static void m14684K(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 262144;
        ubiProd1Interaction.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m14685L(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 1;
        ubiProd1Interaction.generatorVersion_ = str;
    }

    /* JADX INFO: renamed from: M */
    public static void m14686M(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 32;
        ubiProd1Interaction.interactionId_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static void m14687N(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 4;
        ubiProd1Interaction.interactionType_ = str;
    }

    /* JADX INFO: renamed from: O */
    public static void m14688O(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 131072;
        ubiProd1Interaction.pageId_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m14689P(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 64;
        ubiProd1Interaction.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: Q */
    public static void m14690Q(UbiProd1Interaction ubiProd1Interaction, int i) {
        ubiProd1Interaction.bitField0_ |= 524288;
        ubiProd1Interaction.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: R */
    public static void m14691R(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 8192;
        ubiProd1Interaction.pageUri_ = str;
    }

    /* JADX INFO: renamed from: S */
    public static void m14692S(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 16384;
        ubiProd1Interaction.playContextUri_ = str;
    }

    /* JADX INFO: renamed from: T */
    public static void m14693T(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 512;
        ubiProd1Interaction.playbackId_ = str;
    }

    /* JADX INFO: renamed from: U */
    public static void m14694U(UbiProd1Interaction ubiProd1Interaction) {
        ubiProd1Interaction.getClass();
        ubiProd1Interaction.bitField0_ |= 256;
        ubiProd1Interaction.specificationMode_ = "default";
    }

    /* JADX INFO: renamed from: V */
    public static void m14695V(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ubiProd1Interaction.bitField0_ |= 128;
        ubiProd1Interaction.specificationVersion_ = str;
    }

    /* JADX INFO: renamed from: W */
    public static void m14696W(UbiProd1Interaction ubiProd1Interaction, long j) {
        ubiProd1Interaction.bitField0_ |= 65536;
        ubiProd1Interaction.ubiEventCreationTimestamp_ = j;
    }

    /* JADX INFO: renamed from: X */
    public static C0899q m14697X() {
        return (C0899q) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14698n(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.actionParameterNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.actionParameterNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.actionParameterNames_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m14699o(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.actionParameterValues_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.actionParameterValues_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.actionParameterValues_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m14700p(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.elementPathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.elementPathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.elementPathIds_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14701q(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Interaction.elementPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.elementPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.elementPathNames_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m14702r(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.elementPathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.elementPathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.elementPathPos_.add(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m14703s(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.elementPathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.elementPathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.elementPathReasons_.add(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m14704t(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.elementPathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.elementPathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.elementPathUris_.add(str);
    }

    /* JADX INFO: renamed from: u */
    public static void m14705u(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentModes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentModes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentModes_.add(str);
    }

    /* JADX INFO: renamed from: v */
    public static void m14706v(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentPathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentPathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentPathIds_.add(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m14707w(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentPathNames_.add(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m14708x(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentPathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentPathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentPathPos_.add(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m14709y(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentPathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentPathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentPathReasons_.add(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m14710z(UbiProd1Interaction ubiProd1Interaction, String str) {
        ubiProd1Interaction.getClass();
        ae50 ae50Var = ubiProd1Interaction.parentPathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Interaction.parentPathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Interaction.parentPathUris_.add(str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001)\u0000\u0001\u0001))\u0001\u0010\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006\u001a\u0007\u001a\b\u001a\t\u001a\n\u001a\u000b\u001a\f\u001a\r\u001a\u000eဈ\u0005\u000fဈ\u0006\u0010ဈ\u0007\u0011ဈ\b\u0012ဈ\t\u0013ဈ\n\u0014ဈ\u000b\u0015ဈ\f\u0016\u001a\u0017\u001a\u0018\u001a\u0019\u001a\u001a\u001a\u001b\u001a\u001c\u001a\u001dဈ\r\u001eဈ\u000e\u001fဂ\u000f ဂ\u0010!ဈ\u0011\"ဈ\u0012#2$င\u0013%ဈ\u0014&င\u0015'\u001b(ဈ\u0016)ဈ\u0017", new Object[]{"bitField0_", "generatorVersion_", "app_", "interactionType_", "actionName_", "actionVersion_", "actionParameterNames_", "actionParameterValues_", "elementPathNames_", "elementPathPos_", "elementPathIds_", "elementPathUris_", "elementPathReasons_", "errors_", "interactionId_", "pageInstanceId_", "specificationVersion_", "specificationMode_", "playbackId_", "impressionId_", "annotatorVersion_", "annotatorConfigurationVersion_", "parentPathNames_", "parentPathPos_", "parentPathIds_", "parentPathUris_", "parentPathReasons_", "parentSpecificationVersions_", "parentModes_", "pageUri_", "playContextUri_", "reportedClientTimestamp_", "ubiEventCreationTimestamp_", "pageId_", "clientTimezone_", "clientDebugMetadata_", hw91.f95893a, "pagePresentationId_", "appInstanceId_", "appVisitIndex_", "sourcePaths_", SourcePaths.class, "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1Interaction();
        }
        if (iOrdinal == 4) {
            return new C0899q(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1Interaction.class) {
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
