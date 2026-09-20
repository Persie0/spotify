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
public final class Timeline extends AbstractC0269h implements sre0 {
    private static final Timeline DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    public static final class TimelineItem extends AbstractC0269h implements sre0 {
        private static final TimelineItem DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int IS_ACTIVE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String description_ = "";
        private boolean isActive_;

        static {
            TimelineItem timelineItem = new TimelineItem();
            DEFAULT_INSTANCE = timelineItem;
            AbstractC0269h.registerDefaultInstance(TimelineItem.class, timelineItem);
        }

        private TimelineItem() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6485n(TimelineItem timelineItem, String str) {
            timelineItem.getClass();
            timelineItem.description_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m6486o(TimelineItem timelineItem, boolean z) {
            timelineItem.isActive_ = z;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0510n1 m6487q() {
            return (C0510n1) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003Ȉ", new Object[]{"isActive_", "description_"});
            }
            if (iOrdinal == 3) {
                return new TimelineItem();
            }
            if (iOrdinal == 4) {
                return new C0510n1(DEFAULT_INSTANCE);
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

        public final String getDescription() {
            return this.description_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final boolean m6488p() {
            return this.isActive_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Timeline timeline = new Timeline();
        DEFAULT_INSTANCE = timeline;
        AbstractC0269h.registerDefaultInstance(Timeline.class, timeline);
    }

    private Timeline() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6482n(Timeline timeline, List list) {
        ae50 ae50Var = timeline.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            timeline.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, timeline.items_);
    }

    /* JADX INFO: renamed from: o */
    public static Timeline m6483o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static C0507m1 m6484p() {
        return (C0507m1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", TimelineItem.class});
        }
        if (iOrdinal == 3) {
            return new Timeline();
        }
        if (iOrdinal == 4) {
            return new C0507m1(DEFAULT_INSTANCE);
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
        synchronized (Timeline.class) {
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

    public final int getItemsCount() {
        return this.items_.size();
    }

    public final List getItemsList() {
        return this.items_;
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
