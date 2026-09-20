package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hs31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetShowRequest extends AbstractC0269h implements sre0 {
    private static final GetShowRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 6;
    public static final int FORCE_INCLUDE_CONTEXT_FIELD_NUMBER = 8;
    public static final int HEADER_POLICY_FIELD_NUMBER = 9;
    public static final int INCLUDE_EXTENSIONS_ON_ERROR_FIELD_NUMBER = 15;
    public static final int INCLUDE_IN_RANGE_FIELD_NUMBER = 7;
    public static final int LIST_POLICY_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PREFER_CACHE_FIELD_NUMBER = 16;
    public static final int QUERY_FILTER_FIELD_NUMBER = 14;
    public static final int RANGE_FIELD_NUMBER = 13;
    public static final int RANGE_LENGTH_FIELD_NUMBER = 4;
    public static final int RANGE_START_FIELD_NUMBER = 3;
    public static final int SECTIONS_POLICY_FIELD_NUMBER = 11;
    public static final int SHOW_ID_FIELD_NUMBER = 1;
    public static final int SORT_FIELD_NUMBER = 5;
    public static final int SORT_ORDER_FIELD_NUMBER = 12;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    private int bitField0_;
    private int forceIncludeContext_;
    private HeaderPolicy headerPolicy_;
    private boolean includeExtensionsOnError_;
    private ListPolicy listPolicy_;
    private boolean preferCache_;
    private QueryFilter queryFilter_;
    private int rangeLength_;
    private int rangeStart_;
    private Range range_;
    private SectionsPolicy sectionsPolicy_;
    private int sortOrder_;
    private int updateThrottling_;
    private String showId_ = "";
    private String sort_ = "";
    private String filter_ = "";
    private String includeInRange_ = "";

    public static final class Range extends AbstractC0269h implements sre0 {
        private static final Range DEFAULT_INSTANCE;
        public static final int FOCUS_FIELD_NUMBER = 2;
        public static final int LIMIT_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int limit_;
        private int selectionCase_ = 0;
        private Object selection_;

        public static final class Focus extends AbstractC0269h implements sre0 {
            public static final int DATA_FIELD_NUMBER = 2;
            private static final Focus DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private String data_ = "";
            private int type_;

            static {
                Focus focus = new Focus();
                DEFAULT_INSTANCE = focus;
                AbstractC0269h.registerDefaultInstance(Focus.class, focus);
            }

            private Focus() {
            }

            /* JADX INFO: renamed from: n */
            public static void m21204n(Focus focus, String str) {
                focus.getClass();
                str.getClass();
                focus.data_ = str;
            }

            /* JADX INFO: renamed from: o */
            public static void m21205o(Focus focus, EnumC1301d enumC1301d) {
                focus.getClass();
                focus.type_ = enumC1301d.getNumber();
            }

            /* JADX INFO: renamed from: p */
            public static C1300c m21206p() {
                return (C1300c) DEFAULT_INSTANCE.createBuilder();
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "data_"});
                }
                if (iOrdinal == 3) {
                    return new Focus();
                }
                if (iOrdinal == 4) {
                    return new C1300c(DEFAULT_INSTANCE);
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
                synchronized (Focus.class) {
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
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            AbstractC0269h.registerDefaultInstance(Range.class, range);
        }

        private Range() {
        }

        /* JADX INFO: renamed from: n */
        public static void m21200n(Range range, Focus focus) {
            range.getClass();
            range.selection_ = focus;
            range.selectionCase_ = 2;
        }

        /* JADX INFO: renamed from: o */
        public static void m21201o(Range range, int i) {
            range.limit_ = i;
        }

        /* JADX INFO: renamed from: p */
        public static void m21202p(Range range, int i) {
            range.selectionCase_ = 1;
            range.selection_ = Integer.valueOf(i);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1299b m21203q() {
            return (C1299b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001>\u0000\u0002<\u0000\u0003\u000b", new Object[]{"selection_", "selectionCase_", Focus.class, "limit_"});
            }
            if (iOrdinal == 3) {
                return new Range();
            }
            if (iOrdinal == 4) {
                return new C1299b(DEFAULT_INSTANCE);
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
            synchronized (Range.class) {
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
        GetShowRequest getShowRequest = new GetShowRequest();
        DEFAULT_INSTANCE = getShowRequest;
        AbstractC0269h.registerDefaultInstance(GetShowRequest.class, getShowRequest);
    }

    private GetShowRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21189n(GetShowRequest getShowRequest, HeaderPolicy headerPolicy) {
        getShowRequest.getClass();
        headerPolicy.getClass();
        getShowRequest.headerPolicy_ = headerPolicy;
        getShowRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m21190o(GetShowRequest getShowRequest) {
        getShowRequest.includeExtensionsOnError_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m21191p(GetShowRequest getShowRequest, ListPolicy listPolicy) {
        getShowRequest.getClass();
        getShowRequest.listPolicy_ = listPolicy;
        getShowRequest.bitField0_ |= 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21192q(GetShowRequest getShowRequest, boolean z) {
        getShowRequest.preferCache_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21193r(GetShowRequest getShowRequest, QueryFilter queryFilter) {
        getShowRequest.getClass();
        getShowRequest.queryFilter_ = queryFilter;
        getShowRequest.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: s */
    public static void m21194s(GetShowRequest getShowRequest, Range range) {
        getShowRequest.getClass();
        range.getClass();
        getShowRequest.range_ = range;
        getShowRequest.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: t */
    public static void m21195t(GetShowRequest getShowRequest, SectionsPolicy sectionsPolicy) {
        getShowRequest.getClass();
        getShowRequest.sectionsPolicy_ = sectionsPolicy;
        getShowRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: u */
    public static void m21196u(GetShowRequest getShowRequest, String str) {
        getShowRequest.getClass();
        str.getClass();
        getShowRequest.showId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m21197v(GetShowRequest getShowRequest, hs31 hs31Var) {
        getShowRequest.getClass();
        getShowRequest.sortOrder_ = hs31Var.getNumber();
    }

    /* JADX INFO: renamed from: w */
    public static void m21198w(GetShowRequest getShowRequest, int i) {
        getShowRequest.updateThrottling_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static C1298a m21199x() {
        return (C1298a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u0004\u0004င\u0000\u0005Ȉ\u0006Ȉ\u0007Ȉ\bင\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004\f\f\rဉ\u0005\u000eဉ\u0006\u000f\u0007\u0010\u0007", new Object[]{"bitField0_", "showId_", "updateThrottling_", "rangeStart_", "rangeLength_", "sort_", "filter_", "includeInRange_", "forceIncludeContext_", "headerPolicy_", "listPolicy_", "sectionsPolicy_", "sortOrder_", "range_", "queryFilter_", "includeExtensionsOnError_", "preferCache_"});
        }
        if (iOrdinal == 3) {
            return new GetShowRequest();
        }
        if (iOrdinal == 4) {
            return new C1298a(DEFAULT_INSTANCE);
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
        synchronized (GetShowRequest.class) {
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
