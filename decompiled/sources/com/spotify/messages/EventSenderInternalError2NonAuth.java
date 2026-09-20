package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.gva;
import p204p.l7x;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EventSenderInternalError2NonAuth extends AbstractC0269h implements sre0 {
    private static final EventSenderInternalError2NonAuth DEFAULT_INSTANCE;
    public static final int ERROR_TOTAL_COUNTS_FIELD_NUMBER = 2;
    public static final int ERROR_TYPES_FIELD_NUMBER = 1;
    public static final int ERROR_UNREPORTED_COUNTS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ae50 errorTypes_ = AbstractC0269h.emptyProtobufList();
    private ud50 errorTotalCounts_ = AbstractC0269h.emptyIntList();
    private ud50 errorUnreportedCounts_ = AbstractC0269h.emptyIntList();

    static {
        EventSenderInternalError2NonAuth eventSenderInternalError2NonAuth = new EventSenderInternalError2NonAuth();
        DEFAULT_INSTANCE = eventSenderInternalError2NonAuth;
        AbstractC0269h.registerDefaultInstance(EventSenderInternalError2NonAuth.class, eventSenderInternalError2NonAuth);
    }

    private EventSenderInternalError2NonAuth() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m13848n(EventSenderInternalError2NonAuth eventSenderInternalError2NonAuth, int i) {
        ud50 ud50Var = eventSenderInternalError2NonAuth.errorTotalCounts_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderInternalError2NonAuth.errorTotalCounts_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderInternalError2NonAuth.errorTotalCounts_).m63581b(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m13849o(EventSenderInternalError2NonAuth eventSenderInternalError2NonAuth, String str) {
        eventSenderInternalError2NonAuth.getClass();
        ae50 ae50Var = eventSenderInternalError2NonAuth.errorTypes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            eventSenderInternalError2NonAuth.errorTypes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        eventSenderInternalError2NonAuth.errorTypes_.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static void m13850p(EventSenderInternalError2NonAuth eventSenderInternalError2NonAuth, int i) {
        ud50 ud50Var = eventSenderInternalError2NonAuth.errorUnreportedCounts_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            eventSenderInternalError2NonAuth.errorUnreportedCounts_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) eventSenderInternalError2NonAuth.errorUnreportedCounts_).m63581b(i);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static l7x m13851u() {
        return (l7x) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: v */
    public static EventSenderInternalError2NonAuth m13852v(gva gvaVar) {
        return (EventSenderInternalError2NonAuth) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u0016", new Object[]{"errorTypes_", "errorTotalCounts_", "errorUnreportedCounts_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderInternalError2NonAuth();
        }
        if (iOrdinal == 4) {
            return new l7x(DEFAULT_INSTANCE);
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
        synchronized (EventSenderInternalError2NonAuth.class) {
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
    public final int m13853q() {
        return ((n350) this.errorTotalCounts_).size();
    }

    /* JADX INFO: renamed from: r */
    public final ud50 m13854r() {
        return this.errorTotalCounts_;
    }

    /* JADX INFO: renamed from: s */
    public final int m13855s() {
        return this.errorTypes_.size();
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m13856t() {
        return this.errorTypes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
