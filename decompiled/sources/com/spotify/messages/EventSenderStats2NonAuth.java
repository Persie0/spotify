package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.TreeSet;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cva;
import p204p.gva;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.xd50;
import p204p.y1b0;
import p204p.y7x;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EventSenderStats2NonAuth extends AbstractC0269h implements sre0 {
    private static final EventSenderStats2NonAuth DEFAULT_INSTANCE;
    public static final int DROP_LIST_COUNTS_TOTAL_FIELD_NUMBER = 12;
    public static final int DROP_LIST_COUNTS_UNREPORTED_FIELD_NUMBER = 13;
    public static final int DROP_LIST_EVENT_NAME_INDEX_FIELD_NUMBER = 11;
    public static final int DROP_LIST_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER = 10;
    public static final int EVENT_NAMES_FIELD_NUMBER = 2;
    public static final int LOSS_STATS_EVENT_NAME_INDEX_FIELD_NUMBER = 4;
    public static final int LOSS_STATS_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER = 3;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_MINS_FIELD_NUMBER = 6;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_NEXTS_FIELD_NUMBER = 7;
    public static final int LOSS_STATS_STORAGE_SIZES_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RATELIMITER_STATS_DROP_COUNT_FIELD_NUMBER = 9;
    public static final int RATELIMITER_STATS_EVENT_NAME_INDEX_FIELD_NUMBER = 8;
    public static final int SEQUENCE_IDS_FIELD_NUMBER = 1;
    public static final int STATES_LIST_DELETED_COUNTS_TOTAL_FIELD_NUMBER = 22;
    public static final int STATES_LIST_DELIVERED_COUNTS_TOTAL_FIELD_NUMBER = 21;
    public static final int STATES_LIST_DROPPED_COUNTS_TOTAL_FIELD_NUMBER = 18;
    public static final int STATES_LIST_ENTERED_COUNTS_TOTAL_FIELD_NUMBER = 16;
    public static final int STATES_LIST_EVENT_NAME_INDEX_FIELD_NUMBER = 15;
    public static final int STATES_LIST_PERSISTED_COUNTS_TOTAL_FIELD_NUMBER = 19;
    public static final int STATES_LIST_REJECTED_BACKEND_COUNTS_TOTAL_FIELD_NUMBER = 20;
    public static final int STATES_LIST_REJECTED_CLIENT_COUNTS_TOTAL_FIELD_NUMBER = 17;
    private ae50 sequenceIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 eventNames_ = AbstractC0269h.emptyProtobufList();
    private ud50 lossStatsNumEntriesPerSequenceId_ = AbstractC0269h.emptyIntList();
    private ud50 lossStatsEventNameIndex_ = AbstractC0269h.emptyIntList();
    private xd50 lossStatsStorageSizes_ = AbstractC0269h.emptyLongList();
    private xd50 lossStatsSequenceNumberMins_ = AbstractC0269h.emptyLongList();
    private xd50 lossStatsSequenceNumberNexts_ = AbstractC0269h.emptyLongList();
    private ud50 ratelimiterStatsEventNameIndex_ = AbstractC0269h.emptyIntList();
    private xd50 ratelimiterStatsDropCount_ = AbstractC0269h.emptyLongList();
    private ud50 dropListNumEntriesPerSequenceId_ = AbstractC0269h.emptyIntList();
    private ud50 dropListEventNameIndex_ = AbstractC0269h.emptyIntList();
    private xd50 dropListCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 dropListCountsUnreported_ = AbstractC0269h.emptyLongList();
    private ud50 statesListEventNameIndex_ = AbstractC0269h.emptyIntList();
    private xd50 statesListEnteredCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListRejectedClientCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListDroppedCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListPersistedCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListRejectedBackendCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListDeliveredCountsTotal_ = AbstractC0269h.emptyLongList();
    private xd50 statesListDeletedCountsTotal_ = AbstractC0269h.emptyLongList();

    static {
        EventSenderStats2NonAuth eventSenderStats2NonAuth = new EventSenderStats2NonAuth();
        DEFAULT_INSTANCE = eventSenderStats2NonAuth;
        AbstractC0269h.registerDefaultInstance(EventSenderStats2NonAuth.class, eventSenderStats2NonAuth);
    }

    private EventSenderStats2NonAuth() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static void m13857A(EventSenderStats2NonAuth eventSenderStats2NonAuth, int i) {
        ud50 ud50Var = eventSenderStats2NonAuth.statesListEventNameIndex_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderStats2NonAuth.statesListEventNameIndex_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderStats2NonAuth.statesListEventNameIndex_).m63581b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static void m13858B(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListPersistedCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListPersistedCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListPersistedCountsTotal_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static void m13859C(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListRejectedBackendCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListRejectedBackendCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListRejectedBackendCountsTotal_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static void m13860D(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListRejectedClientCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListRejectedClientCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListRejectedClientCountsTotal_).m92642b(j);
    }

    /* JADX INFO: renamed from: a0 */
    public static y7x m13861a0() {
        return (y7x) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: b0 */
    public static EventSenderStats2NonAuth m13862b0(gva gvaVar) {
        return (EventSenderStats2NonAuth) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m13863n(EventSenderStats2NonAuth eventSenderStats2NonAuth, TreeSet treeSet) {
        ae50 ae50Var = eventSenderStats2NonAuth.eventNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            eventSenderStats2NonAuth.eventNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(treeSet, eventSenderStats2NonAuth.eventNames_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m13864o(EventSenderStats2NonAuth eventSenderStats2NonAuth, int i) {
        ud50 ud50Var = eventSenderStats2NonAuth.lossStatsEventNameIndex_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderStats2NonAuth.lossStatsEventNameIndex_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderStats2NonAuth.lossStatsEventNameIndex_).m63581b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static void m13865p(EventSenderStats2NonAuth eventSenderStats2NonAuth, int i) {
        ud50 ud50Var = eventSenderStats2NonAuth.lossStatsNumEntriesPerSequenceId_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderStats2NonAuth.lossStatsNumEntriesPerSequenceId_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderStats2NonAuth.lossStatsNumEntriesPerSequenceId_).m63581b(i);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static void m13866q(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.lossStatsSequenceNumberMins_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.lossStatsSequenceNumberMins_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.lossStatsSequenceNumberMins_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static void m13867r(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.lossStatsSequenceNumberNexts_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.lossStatsSequenceNumberNexts_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.lossStatsSequenceNumberNexts_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m13868s(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.lossStatsStorageSizes_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.lossStatsStorageSizes_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.lossStatsStorageSizes_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static void m13869t(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.ratelimiterStatsDropCount_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.ratelimiterStatsDropCount_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.ratelimiterStatsDropCount_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static void m13870u(EventSenderStats2NonAuth eventSenderStats2NonAuth, int i) {
        ud50 ud50Var = eventSenderStats2NonAuth.ratelimiterStatsEventNameIndex_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderStats2NonAuth.ratelimiterStatsEventNameIndex_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderStats2NonAuth.ratelimiterStatsEventNameIndex_).m63581b(i);
    }

    /* JADX INFO: renamed from: v */
    public static void m13871v(EventSenderStats2NonAuth eventSenderStats2NonAuth, cva cvaVar) {
        eventSenderStats2NonAuth.getClass();
        ae50 ae50Var = eventSenderStats2NonAuth.sequenceIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            eventSenderStats2NonAuth.sequenceIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        eventSenderStats2NonAuth.sequenceIds_.add(cvaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static void m13872w(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListDeletedCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListDeletedCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListDeletedCountsTotal_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static void m13873x(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListDeliveredCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListDeliveredCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListDeliveredCountsTotal_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static void m13874y(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListDroppedCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListDroppedCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListDroppedCountsTotal_).m92642b(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m13875z(EventSenderStats2NonAuth eventSenderStats2NonAuth, long j) {
        xd50 xd50Var = eventSenderStats2NonAuth.statesListEnteredCountsTotal_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            eventSenderStats2NonAuth.statesListEnteredCountsTotal_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        ((y1b0) eventSenderStats2NonAuth.statesListEnteredCountsTotal_).m92642b(j);
    }

    /* JADX INFO: renamed from: E */
    public final int m13876E() {
        return ((y1b0) this.dropListCountsTotal_).size();
    }

    /* JADX INFO: renamed from: F */
    public final ae50 m13877F() {
        return this.eventNames_;
    }

    /* JADX INFO: renamed from: G */
    public final ud50 m13878G() {
        return this.lossStatsEventNameIndex_;
    }

    /* JADX INFO: renamed from: H */
    public final int m13879H() {
        return ((n350) this.lossStatsNumEntriesPerSequenceId_).size();
    }

    /* JADX INFO: renamed from: I */
    public final ud50 m13880I() {
        return this.lossStatsNumEntriesPerSequenceId_;
    }

    /* JADX INFO: renamed from: J */
    public final xd50 m13881J() {
        return this.lossStatsSequenceNumberMins_;
    }

    /* JADX INFO: renamed from: K */
    public final xd50 m13882K() {
        return this.lossStatsSequenceNumberNexts_;
    }

    /* JADX INFO: renamed from: L */
    public final xd50 m13883L() {
        return this.lossStatsStorageSizes_;
    }

    /* JADX INFO: renamed from: M */
    public final int m13884M() {
        return ((y1b0) this.ratelimiterStatsDropCount_).size();
    }

    /* JADX INFO: renamed from: N */
    public final xd50 m13885N() {
        return this.ratelimiterStatsDropCount_;
    }

    /* JADX INFO: renamed from: O */
    public final ud50 m13886O() {
        return this.ratelimiterStatsEventNameIndex_;
    }

    /* JADX INFO: renamed from: P */
    public final int m13887P() {
        return this.sequenceIds_.size();
    }

    /* JADX INFO: renamed from: Q */
    public final ae50 m13888Q() {
        return this.sequenceIds_;
    }

    /* JADX INFO: renamed from: R */
    public final xd50 m13889R() {
        return this.statesListDeletedCountsTotal_;
    }

    /* JADX INFO: renamed from: S */
    public final xd50 m13890S() {
        return this.statesListDeliveredCountsTotal_;
    }

    /* JADX INFO: renamed from: T */
    public final xd50 m13891T() {
        return this.statesListDroppedCountsTotal_;
    }

    /* JADX INFO: renamed from: U */
    public final xd50 m13892U() {
        return this.statesListEnteredCountsTotal_;
    }

    /* JADX INFO: renamed from: V */
    public final int m13893V() {
        return ((n350) this.statesListEventNameIndex_).size();
    }

    /* JADX INFO: renamed from: W */
    public final ud50 m13894W() {
        return this.statesListEventNameIndex_;
    }

    /* JADX INFO: renamed from: X */
    public final xd50 m13895X() {
        return this.statesListPersistedCountsTotal_;
    }

    /* JADX INFO: renamed from: Y */
    public final xd50 m13896Y() {
        return this.statesListRejectedBackendCountsTotal_;
    }

    /* JADX INFO: renamed from: Z */
    public final xd50 m13897Z() {
        return this.statesListRejectedClientCountsTotal_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0000\u0001\u0016\u0015\u0000\u0015\u0000\u0001\u001c\u0002\u001a\u0003\u0016\u0004\u0016\u0005\u0014\u0006\u0014\u0007\u0014\b\u0016\t\u0014\n\u0016\u000b\u0016\f\u0014\r\u0014\u000f\u0016\u0010\u0014\u0011\u0014\u0012\u0014\u0013\u0014\u0014\u0014\u0015\u0014\u0016\u0014", new Object[]{"sequenceIds_", "eventNames_", "lossStatsNumEntriesPerSequenceId_", "lossStatsEventNameIndex_", "lossStatsStorageSizes_", "lossStatsSequenceNumberMins_", "lossStatsSequenceNumberNexts_", "ratelimiterStatsEventNameIndex_", "ratelimiterStatsDropCount_", "dropListNumEntriesPerSequenceId_", "dropListEventNameIndex_", "dropListCountsTotal_", "dropListCountsUnreported_", "statesListEventNameIndex_", "statesListEnteredCountsTotal_", "statesListRejectedClientCountsTotal_", "statesListDroppedCountsTotal_", "statesListPersistedCountsTotal_", "statesListRejectedBackendCountsTotal_", "statesListDeliveredCountsTotal_", "statesListDeletedCountsTotal_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderStats2NonAuth();
        }
        if (iOrdinal == 4) {
            return new y7x(DEFAULT_INSTANCE);
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
        synchronized (EventSenderStats2NonAuth.class) {
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
