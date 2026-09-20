package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TimelineV2 extends AbstractC0269h implements sre0 {
    private static final TimelineV2 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 groups_ = AbstractC0269h.emptyProtobufList();

    public static final class TimelineGroup extends AbstractC0269h implements sre0 {
        private static final TimelineGroup DEFAULT_INSTANCE;
        public static final int DETAILS_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String details_ = "";
        private ae50 items_ = AbstractC0269h.emptyProtobufList();

        public static final class TimelineItem extends AbstractC0269h implements sre0 {
            private static final TimelineItem DEFAULT_INSTANCE;
            public static final int DETAILS_FIELD_NUMBER = 2;
            public static final int NESTED_ITEMS_FIELD_NUMBER = 3;
            private static volatile r2n0 PARSER = null;
            public static final int TITLE_FIELD_NUMBER = 1;
            private String title_ = "";
            private String details_ = "";
            private ae50 nestedItems_ = AbstractC0269h.emptyProtobufList();

            public static final class NestedTimelineItem extends AbstractC0269h implements sre0 {
                private static final NestedTimelineItem DEFAULT_INSTANCE;
                public static final int DETAILS_FIELD_NUMBER = 2;
                private static volatile r2n0 PARSER = null;
                public static final int TITLE_FIELD_NUMBER = 1;
                private String title_ = "";
                private String details_ = "";

                static {
                    NestedTimelineItem nestedTimelineItem = new NestedTimelineItem();
                    DEFAULT_INSTANCE = nestedTimelineItem;
                    AbstractC0269h.registerDefaultInstance(NestedTimelineItem.class, nestedTimelineItem);
                }

                private NestedTimelineItem() {
                }

                /* JADX INFO: renamed from: n */
                public static void m6505n(NestedTimelineItem nestedTimelineItem) {
                    nestedTimelineItem.getClass();
                    nestedTimelineItem.details_ = "$9.99/month";
                }

                /* JADX INFO: renamed from: o */
                public static void m6506o(NestedTimelineItem nestedTimelineItem, String str) {
                    nestedTimelineItem.getClass();
                    nestedTimelineItem.title_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: q */
                public static C0522r1 m6507q() {
                    return (C0522r1) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"title_", "details_"});
                    }
                    if (iOrdinal == 3) {
                        return new NestedTimelineItem();
                    }
                    if (iOrdinal == 4) {
                        return new C0522r1(DEFAULT_INSTANCE);
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
                    synchronized (NestedTimelineItem.class) {
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

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                    return newBuilderForType();
                }

                /* JADX INFO: renamed from: p */
                public final String m6508p() {
                    return this.details_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                TimelineItem timelineItem = new TimelineItem();
                DEFAULT_INSTANCE = timelineItem;
                AbstractC0269h.registerDefaultInstance(TimelineItem.class, timelineItem);
            }

            private TimelineItem() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6499n(TimelineItem timelineItem, List list) {
                ae50 ae50Var = timelineItem.nestedItems_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    timelineItem.nestedItems_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(list, timelineItem.nestedItems_);
            }

            /* JADX INFO: renamed from: o */
            public static void m6500o(TimelineItem timelineItem) {
                timelineItem.getClass();
                timelineItem.details_ = "$9.99/month";
            }

            /* JADX INFO: renamed from: p */
            public static void m6501p(TimelineItem timelineItem, String str) {
                timelineItem.getClass();
                timelineItem.title_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: s */
            public static C0519q1 m6502s() {
                return (C0519q1) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"title_", "details_", "nestedItems_", NestedTimelineItem.class});
                }
                if (iOrdinal == 3) {
                    return new TimelineItem();
                }
                if (iOrdinal == 4) {
                    return new C0519q1(DEFAULT_INSTANCE);
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
                synchronized (TimelineItem.class) {
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

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: q */
            public final String m6503q() {
                return this.details_;
            }

            /* JADX INFO: renamed from: r */
            public final ae50 m6504r() {
                return this.nestedItems_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            TimelineGroup timelineGroup = new TimelineGroup();
            DEFAULT_INSTANCE = timelineGroup;
            AbstractC0269h.registerDefaultInstance(TimelineGroup.class, timelineGroup);
        }

        private TimelineGroup() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6494n(TimelineGroup timelineGroup, List list) {
            ae50 ae50Var = timelineGroup.items_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                timelineGroup.items_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(list, timelineGroup.items_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6495o(TimelineGroup timelineGroup, String str) {
            timelineGroup.getClass();
            timelineGroup.details_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m6496p(TimelineGroup timelineGroup, String str) {
            timelineGroup.getClass();
            timelineGroup.title_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static C0516p1 m6497r() {
            return (C0516p1) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"title_", "details_", "items_", TimelineItem.class});
            }
            if (iOrdinal == 3) {
                return new TimelineGroup();
            }
            if (iOrdinal == 4) {
                return new C0516p1(DEFAULT_INSTANCE);
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
            synchronized (TimelineGroup.class) {
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

        public final List getItemsList() {
            return this.items_;
        }

        public final String getTitle() {
            return this.title_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: q */
        public final String m6498q() {
            return this.details_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TimelineV2 timelineV2 = new TimelineV2();
        DEFAULT_INSTANCE = timelineV2;
        AbstractC0269h.registerDefaultInstance(TimelineV2.class, timelineV2);
    }

    private TimelineV2() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6489n(TimelineV2 timelineV2, List list) {
        ae50 ae50Var = timelineV2.groups_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            timelineV2.groups_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, timelineV2.groups_);
    }

    /* JADX INFO: renamed from: o */
    public static TimelineV2 m6490o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static C0513o1 m6491r() {
        return (C0513o1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"groups_", TimelineGroup.class});
        }
        if (iOrdinal == 3) {
            return new TimelineV2();
        }
        if (iOrdinal == 4) {
            return new C0513o1(DEFAULT_INSTANCE);
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
        synchronized (TimelineV2.class) {
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
    public final int m6492p() {
        return this.groups_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m6493q() {
        return this.groups_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
