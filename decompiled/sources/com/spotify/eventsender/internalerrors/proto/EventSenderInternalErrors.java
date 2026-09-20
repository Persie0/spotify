package com.spotify.eventsender.internalerrors.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EventSenderInternalErrors extends AbstractC0269h implements sre0 {
    private static final EventSenderInternalErrors DEFAULT_INSTANCE;
    public static final int ERROR_TO_COUNTS_MAP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 errorToCountsMap_ = ihc0.f102235b;

    public static final class Counts extends AbstractC0269h implements sre0 {
        private static final Counts DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int REPORTEDCOUNT_FIELD_NUMBER = 2;
        public static final int TOTALCOUNT_FIELD_NUMBER = 1;
        private long reportedCount_;
        private long totalCount_;

        static {
            Counts counts = new Counts();
            DEFAULT_INSTANCE = counts;
            AbstractC0269h.registerDefaultInstance(Counts.class, counts);
        }

        private Counts() {
        }

        /* JADX INFO: renamed from: n */
        public static void m9810n(Counts counts, long j) {
            counts.reportedCount_ = j;
        }

        /* JADX INFO: renamed from: o */
        public static void m9811o(Counts counts, long j) {
            counts.totalCount_ = j;
        }

        /* JADX INFO: renamed from: p */
        public static Counts m9812p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: s */
        public static C0725b m9813s() {
            return (C0725b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"totalCount_", "reportedCount_"});
            }
            if (iOrdinal == 3) {
                return new Counts();
            }
            if (iOrdinal == 4) {
                return new C0725b(DEFAULT_INSTANCE);
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
            synchronized (Counts.class) {
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

        /* JADX INFO: renamed from: q */
        public final long m9814q() {
            return this.reportedCount_;
        }

        /* JADX INFO: renamed from: r */
        public final long m9815r() {
            return this.totalCount_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EventSenderInternalErrors eventSenderInternalErrors = new EventSenderInternalErrors();
        DEFAULT_INSTANCE = eventSenderInternalErrors;
        AbstractC0269h.registerDefaultInstance(EventSenderInternalErrors.class, eventSenderInternalErrors);
    }

    private EventSenderInternalErrors() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m9806n(EventSenderInternalErrors eventSenderInternalErrors) {
        ihc0 ihc0Var = eventSenderInternalErrors.errorToCountsMap_;
        if (!ihc0Var.f102236a) {
            eventSenderInternalErrors.errorToCountsMap_ = ihc0Var.m50613h();
        }
        return eventSenderInternalErrors.errorToCountsMap_;
    }

    /* JADX INFO: renamed from: p */
    public static C0724a m9807p() {
        return (C0724a) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EventSenderInternalErrors m9808q(byte[] bArr) {
        return (EventSenderInternalErrors) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"errorToCountsMap_", AbstractC0726c.f3914a});
        }
        if (iOrdinal == 3) {
            return new EventSenderInternalErrors();
        }
        if (iOrdinal == 4) {
            return new C0724a(DEFAULT_INSTANCE);
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
        synchronized (EventSenderInternalErrors.class) {
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
    public final Map m9809o() {
        return Collections.unmodifiableMap(this.errorToCountsMap_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
