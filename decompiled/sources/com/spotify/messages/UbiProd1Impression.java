package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.dw91;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UbiProd1Impression extends AbstractC0269h implements sre0 {
    public static final int ANNOTATOR_CONFIGURATION_VERSION_FIELD_NUMBER = 15;
    public static final int ANNOTATOR_VERSION_FIELD_NUMBER = 14;
    public static final int APP_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 32;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 33;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 31;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 29;
    private static final UbiProd1Impression DEFAULT_INSTANCE;
    public static final int DWELL_TIME_MS_FIELD_NUMBER = 25;
    public static final int DWELL_TIME_START_TIMESTAMP_FIELD_NUMBER = 26;
    public static final int ELEMENT_PATH_IDS_FIELD_NUMBER = 5;
    public static final int ELEMENT_PATH_NAMES_FIELD_NUMBER = 3;
    public static final int ELEMENT_PATH_POS_FIELD_NUMBER = 4;
    public static final int ELEMENT_PATH_REASONS_FIELD_NUMBER = 7;
    public static final int ELEMENT_PATH_URIS_FIELD_NUMBER = 6;
    public static final int ERRORS_FIELD_NUMBER = 8;
    public static final int FEATURE_FIELD_NUMBER = 35;
    public static final int GENERATOR_VERSION_FIELD_NUMBER = 1;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 9;
    public static final int IS_VISIBLE_FOR_MIN_DURATION_FIELD_NUMBER = 30;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 36;
    public static final int PAGE_ID_FIELD_NUMBER = 28;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 10;
    public static final int PAGE_URI_FIELD_NUMBER = 23;
    public static final int PARENT_MODES_FIELD_NUMBER = 22;
    public static final int PARENT_PATH_IDS_FIELD_NUMBER = 18;
    public static final int PARENT_PATH_NAMES_FIELD_NUMBER = 16;
    public static final int PARENT_PATH_POS_FIELD_NUMBER = 17;
    public static final int PARENT_PATH_REASONS_FIELD_NUMBER = 20;
    public static final int PARENT_PATH_URIS_FIELD_NUMBER = 19;
    public static final int PARENT_SPECIFICATION_VERSIONS_FIELD_NUMBER = 21;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 13;
    public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 24;
    public static final int SOURCE_PATHS_FIELD_NUMBER = 34;
    public static final int SPECIFICATION_MODE_FIELD_NUMBER = 12;
    public static final int SPECIFICATION_VERSION_FIELD_NUMBER = 11;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 27;
    private int appVisitIndex_;
    private int bitField0_;
    private long dwellTimeMs_;
    private long dwellTimeStartTimestamp_;
    private boolean isVisibleForMinDuration_;
    private long ubiEventCreationTimestamp_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String generatorVersion_ = "";
    private String app_ = "";
    private ae50 elementPathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathPos_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 elementPathReasons_ = AbstractC0269h.emptyProtobufList();
    private ae50 errors_ = AbstractC0269h.emptyProtobufList();
    private String impressionId_ = "";
    private String pageInstanceId_ = "";
    private String specificationVersion_ = "";
    private String specificationMode_ = "";
    private String playbackId_ = "";
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

    /* JADX INFO: loaded from: classes8.dex */
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
                public static void m14612n(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 4;
                    elements.id_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m14613o(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 1;
                    elements.name_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static void m14614p(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 2;
                    elements.pos_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: q */
                public static void m14615q(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 16;
                    elements.reason_ = str;
                }

                /* JADX INFO: renamed from: r */
                public static void m14616r(Elements elements, String str) {
                    elements.getClass();
                    str.getClass();
                    elements.bitField0_ |= 8;
                    elements.uri_ = str;
                }

                /* JADX INFO: renamed from: s */
                public static C0894l m14617s() {
                    return (C0894l) DEFAULT_INSTANCE.createBuilder();
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
                        return new C0894l(DEFAULT_INSTANCE);
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
            public static void m14608n(Path path, Elements elements) {
                path.getClass();
                elements.getClass();
                ae50 ae50Var = path.elements_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    path.elements_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                path.elements_.add(elements);
            }

            /* JADX INFO: renamed from: o */
            public static void m14609o(Path path, String str) {
                path.getClass();
                str.getClass();
                path.bitField0_ |= 1;
                path.version_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0893k m14610q() {
                return (C0893k) DEFAULT_INSTANCE.createBuilder();
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
                    return new C0893k(DEFAULT_INSTANCE);
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
            public final int m14611p() {
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
        public static void m14605n(SourcePaths sourcePaths, Path path) {
            sourcePaths.getClass();
            path.getClass();
            ae50 ae50Var = sourcePaths.path_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                sourcePaths.path_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            sourcePaths.path_.add(path);
        }

        /* JADX INFO: renamed from: p */
        public static C0892j m14606p() {
            return (C0892j) DEFAULT_INSTANCE.createBuilder();
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
                return new C0892j(DEFAULT_INSTANCE);
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
        public final int m14607o() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        UbiProd1Impression ubiProd1Impression = new UbiProd1Impression();
        DEFAULT_INSTANCE = ubiProd1Impression;
        AbstractC0269h.registerDefaultInstance(UbiProd1Impression.class, ubiProd1Impression);
    }

    private UbiProd1Impression() {
    }

    /* JADX INFO: renamed from: A */
    public static ihc0 m14570A(UbiProd1Impression ubiProd1Impression) {
        ihc0 ihc0Var = ubiProd1Impression.clientDebugMetadata_;
        if (!ihc0Var.f102236a) {
            ubiProd1Impression.clientDebugMetadata_ = ihc0Var.m50613h();
        }
        return ubiProd1Impression.clientDebugMetadata_;
    }

    /* JADX INFO: renamed from: B */
    public static void m14571B(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 256;
        ubiProd1Impression.annotatorConfigurationVersion_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m14572C(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 128;
        ubiProd1Impression.annotatorVersion_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m14573D(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 2;
        ubiProd1Impression.app_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14574E(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 131072;
        ubiProd1Impression.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14575F(UbiProd1Impression ubiProd1Impression, int i) {
        ubiProd1Impression.bitField0_ |= 262144;
        ubiProd1Impression.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: G */
    public static void m14576G(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ubiProd1Impression.bitField0_ |= 32768;
        ubiProd1Impression.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14577H(UbiProd1Impression ubiProd1Impression, long j) {
        ubiProd1Impression.bitField0_ |= 2048;
        ubiProd1Impression.dwellTimeMs_ = j;
    }

    /* JADX INFO: renamed from: I */
    public static void m14578I(UbiProd1Impression ubiProd1Impression, long j) {
        ubiProd1Impression.bitField0_ |= 4096;
        ubiProd1Impression.dwellTimeStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: J */
    public static void m14579J(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 1;
        ubiProd1Impression.generatorVersion_ = str;
    }

    /* JADX INFO: renamed from: K */
    public static void m14580K(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 4;
        ubiProd1Impression.impressionId_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m14581L(UbiProd1Impression ubiProd1Impression) {
        ubiProd1Impression.bitField0_ |= 65536;
        ubiProd1Impression.isVisibleForMinDuration_ = true;
    }

    /* JADX INFO: renamed from: M */
    public static void m14582M(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 16384;
        ubiProd1Impression.pageId_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static void m14583N(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 8;
        ubiProd1Impression.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: O */
    public static void m14584O(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ubiProd1Impression.bitField0_ |= 512;
        ubiProd1Impression.pageUri_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m14585P(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ubiProd1Impression.bitField0_ |= 1024;
        ubiProd1Impression.playContextUri_ = str;
    }

    /* JADX INFO: renamed from: Q */
    public static void m14586Q(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ubiProd1Impression.bitField0_ |= 64;
        ubiProd1Impression.playbackId_ = str;
    }

    /* JADX INFO: renamed from: R */
    public static void m14587R(UbiProd1Impression ubiProd1Impression) {
        ubiProd1Impression.getClass();
        ubiProd1Impression.bitField0_ |= 32;
        ubiProd1Impression.specificationMode_ = "default";
    }

    /* JADX INFO: renamed from: S */
    public static void m14588S(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ubiProd1Impression.bitField0_ |= 16;
        ubiProd1Impression.specificationVersion_ = str;
    }

    /* JADX INFO: renamed from: T */
    public static void m14589T(UbiProd1Impression ubiProd1Impression, long j) {
        ubiProd1Impression.bitField0_ |= 8192;
        ubiProd1Impression.ubiEventCreationTimestamp_ = j;
    }

    /* JADX INFO: renamed from: V */
    public static C0891i m14590V() {
        return (C0891i) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14591n(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.elementPathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.elementPathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.elementPathIds_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m14592o(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Impression.elementPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.elementPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.elementPathNames_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m14593p(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.elementPathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.elementPathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.elementPathPos_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14594q(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.elementPathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.elementPathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.elementPathReasons_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m14595r(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.elementPathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.elementPathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.elementPathUris_.add(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m14596s(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.parentModes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentModes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentModes_.add(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m14597t(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.parentPathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentPathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentPathIds_.add(str);
    }

    /* JADX INFO: renamed from: u */
    public static void m14598u(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Impression.parentPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentPathNames_.add(str);
    }

    /* JADX INFO: renamed from: v */
    public static void m14599v(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.parentPathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentPathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentPathPos_.add(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m14600w(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.parentPathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentPathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentPathReasons_.add(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m14601x(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        ae50 ae50Var = ubiProd1Impression.parentPathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentPathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentPathUris_.add(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m14602y(UbiProd1Impression ubiProd1Impression, String str) {
        ubiProd1Impression.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1Impression.parentSpecificationVersions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.parentSpecificationVersions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.parentSpecificationVersions_.add(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m14603z(UbiProd1Impression ubiProd1Impression, SourcePaths sourcePaths) {
        ubiProd1Impression.getClass();
        sourcePaths.getClass();
        ae50 ae50Var = ubiProd1Impression.sourcePaths_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1Impression.sourcePaths_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1Impression.sourcePaths_.add(sourcePaths);
    }

    /* JADX INFO: renamed from: U */
    public final long m14604U() {
        return this.dwellTimeStartTimestamp_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001$\u0000\u0001\u0001$$\u0001\u000e\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\tဈ\u0002\nဈ\u0003\u000bဈ\u0004\fဈ\u0005\rဈ\u0006\u000eဈ\u0007\u000fဈ\b\u0010\u001a\u0011\u001a\u0012\u001a\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017ဈ\t\u0018ဈ\n\u0019ဂ\u000b\u001aဂ\f\u001bဂ\r\u001cဈ\u000e\u001dဈ\u000f\u001eဇ\u0010\u001f2 ဈ\u0011!င\u0012\"\u001b#ဈ\u0013$ဈ\u0014", new Object[]{"bitField0_", "generatorVersion_", "app_", "elementPathNames_", "elementPathPos_", "elementPathIds_", "elementPathUris_", "elementPathReasons_", "errors_", "impressionId_", "pageInstanceId_", "specificationVersion_", "specificationMode_", "playbackId_", "annotatorVersion_", "annotatorConfigurationVersion_", "parentPathNames_", "parentPathPos_", "parentPathIds_", "parentPathUris_", "parentPathReasons_", "parentSpecificationVersions_", "parentModes_", "pageUri_", "playContextUri_", "dwellTimeMs_", "dwellTimeStartTimestamp_", "ubiEventCreationTimestamp_", "pageId_", "clientTimezone_", "isVisibleForMinDuration_", "clientDebugMetadata_", dw91.f53648a, "appInstanceId_", "appVisitIndex_", "sourcePaths_", SourcePaths.class, "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1Impression();
        }
        if (iOrdinal == 4) {
            return new C0891i(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1Impression.class) {
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
