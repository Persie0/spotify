package com.spotify.eventsender.gabo;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EventEnvelope extends AbstractC0269h implements sre0 {
    private static final EventEnvelope DEFAULT_INSTANCE;
    public static final int EVENT_FRAGMENT_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SEQUENCE_ID_FIELD_NUMBER = 4;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 5;
    private long sequenceNumber_;
    private String eventName_ = "";
    private ae50 eventFragment_ = AbstractC0269h.emptyProtobufList();
    private gva sequenceId_ = gva.f84678b;

    public static final class EventFragment extends AbstractC0269h implements sre0 {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final EventFragment DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String name_ = "";
        private gva data_ = gva.f84678b;

        static {
            EventFragment eventFragment = new EventFragment();
            DEFAULT_INSTANCE = eventFragment;
            AbstractC0269h.registerDefaultInstance(EventFragment.class, eventFragment);
        }

        private EventFragment() {
        }

        /* JADX INFO: renamed from: n */
        public static void m9789n(EventFragment eventFragment, gva gvaVar) {
            eventFragment.getClass();
            gvaVar.getClass();
            eventFragment.data_ = gvaVar;
        }

        /* JADX INFO: renamed from: o */
        public static void m9790o(EventFragment eventFragment, String str) {
            eventFragment.getClass();
            str.getClass();
            eventFragment.name_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C0721b m9791p() {
            return (C0721b) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"name_", "data_"});
            }
            if (iOrdinal == 3) {
                return new EventFragment();
            }
            if (iOrdinal == 4) {
                return new C0721b(DEFAULT_INSTANCE);
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
            synchronized (EventFragment.class) {
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
        EventEnvelope eventEnvelope = new EventEnvelope();
        DEFAULT_INSTANCE = eventEnvelope;
        AbstractC0269h.registerDefaultInstance(EventEnvelope.class, eventEnvelope);
    }

    private EventEnvelope() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9784n(EventEnvelope eventEnvelope, ArrayList arrayList) {
        ae50 ae50Var = eventEnvelope.eventFragment_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            eventEnvelope.eventFragment_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, eventEnvelope.eventFragment_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9785o(EventEnvelope eventEnvelope, String str) {
        eventEnvelope.getClass();
        str.getClass();
        eventEnvelope.eventName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9786p(EventEnvelope eventEnvelope, gva gvaVar) {
        eventEnvelope.getClass();
        gvaVar.getClass();
        eventEnvelope.sequenceId_ = gvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9787q(EventEnvelope eventEnvelope, long j) {
        eventEnvelope.sequenceNumber_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static C0720a m9788r() {
        return (C0720a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u0004\n\u0005\u0002", new Object[]{"eventName_", "eventFragment_", EventFragment.class, "sequenceId_", "sequenceNumber_"});
        }
        if (iOrdinal == 3) {
            return new EventEnvelope();
        }
        if (iOrdinal == 4) {
            return new C0720a(DEFAULT_INSTANCE);
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
        synchronized (EventEnvelope.class) {
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
