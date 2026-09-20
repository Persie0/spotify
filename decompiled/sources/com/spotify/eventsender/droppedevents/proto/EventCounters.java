package com.spotify.eventsender.droppedevents.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCounters extends AbstractC0269h implements sre0 {
    private static final EventCounters DEFAULT_INSTANCE;
    public static final int EVENT_NAME_TO_COUNTERS_MAP_FIELD_NUMBER = 2;
    public static final int FILE_FORMAT_VERSION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 eventNameToCountersMap_ = ihc0.f102235b;
    private int fileFormatVersion_;

    public static final class Counters extends AbstractC0269h implements sre0 {
        public static final int COUNTERS_FIELD_NUMBER = 1;
        private static final Counters DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int countersMemoizedSerializedSize = -1;
        private xd50 counters_ = AbstractC0269h.emptyLongList();

        static {
            Counters counters = new Counters();
            DEFAULT_INSTANCE = counters;
            AbstractC0269h.registerDefaultInstance(Counters.class, counters);
        }

        private Counters() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public static void m9773n(Counters counters, ArrayList arrayList) {
            xd50 xd50Var = counters.counters_;
            if (!((AbstractC1733c9) xd50Var).f35342a) {
                counters.counters_ = AbstractC0269h.mutableCopy(xd50Var);
            }
            AbstractC2118m8.addAll(arrayList, counters.counters_);
        }

        /* JADX INFO: renamed from: p */
        public static Counters m9774p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0718b m9775q() {
            return (C0718b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"counters_"});
            }
            if (iOrdinal == 3) {
                return new Counters();
            }
            if (iOrdinal == 4) {
                return new C0718b(DEFAULT_INSTANCE);
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
            synchronized (Counters.class) {
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
        public final xd50 m9776o() {
            return this.counters_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EventCounters eventCounters = new EventCounters();
        DEFAULT_INSTANCE = eventCounters;
        AbstractC0269h.registerDefaultInstance(EventCounters.class, eventCounters);
    }

    private EventCounters() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m9767n(EventCounters eventCounters) {
        ihc0 ihc0Var = eventCounters.eventNameToCountersMap_;
        if (!ihc0Var.f102236a) {
            eventCounters.eventNameToCountersMap_ = ihc0Var.m50613h();
        }
        return eventCounters.eventNameToCountersMap_;
    }

    /* JADX INFO: renamed from: o */
    public static void m9768o(EventCounters eventCounters) {
        eventCounters.fileFormatVersion_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static C0717a m9769r() {
        return (C0717a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: s */
    public static EventCounters m9770s(byte[] bArr) {
        return (EventCounters) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u00022", new Object[]{"fileFormatVersion_", "eventNameToCountersMap_", AbstractC0719c.f3908a});
        }
        if (iOrdinal == 3) {
            return new EventCounters();
        }
        if (iOrdinal == 4) {
            return new C0717a(DEFAULT_INSTANCE);
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
        synchronized (EventCounters.class) {
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
    public final Map m9771p() {
        return Collections.unmodifiableMap(this.eventNameToCountersMap_);
    }

    /* JADX INFO: renamed from: q */
    public final int m9772q() {
        return this.fileFormatVersion_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
