package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mpw;
import p204p.ore0;
import p204p.p1v;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$TrafficEvent extends AbstractC0269h implements sre0 {
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 6;
    public static final int BYTES_SENT_FIELD_NUMBER = 5;
    private static final EsTrafficEvents$TrafficEvent DEFAULT_INSTANCE;
    public static final int FAILED_FIELD_NUMBER = 9;
    public static final int FINISHED_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_READY_FIELD_NUMBER = 4;
    public static final int RESPONSE_RECEIVED_FIELD_NUMBER = 7;
    public static final int STARTED_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private Object event_;
    private long timestamp_;
    private int eventCase_ = 0;
    private String id_ = "";

    static {
        EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent = new EsTrafficEvents$TrafficEvent();
        DEFAULT_INSTANCE = esTrafficEvents$TrafficEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$TrafficEvent.class, esTrafficEvents$TrafficEvent);
    }

    private EsTrafficEvents$TrafficEvent() {
    }

    /* JADX INFO: renamed from: E */
    public static mpw m7654E() {
        return (mpw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: F */
    public static EsTrafficEvents$TrafficEvent m7655F(byte[] bArr) {
        return (EsTrafficEvents$TrafficEvent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m7656n(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$BytesReceivedEvent esTrafficEvents$BytesReceivedEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$BytesReceivedEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$BytesReceivedEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 6;
    }

    /* JADX INFO: renamed from: o */
    public static void m7657o(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$BytesSentEvent esTrafficEvents$BytesSentEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$BytesSentEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$BytesSentEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 5;
    }

    /* JADX INFO: renamed from: p */
    public static void m7658p(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$FailedEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$FailedEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 9;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7659q(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$FinishedEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$FinishedEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 8;
    }

    /* JADX INFO: renamed from: r */
    public static void m7660r(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, String str) {
        esTrafficEvents$TrafficEvent.getClass();
        str.getClass();
        esTrafficEvents$TrafficEvent.id_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m7661s(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$RequestReadyEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$RequestReadyEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 4;
    }

    /* JADX INFO: renamed from: t */
    public static void m7662t(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$ResponseReceivedEvent esTrafficEvents$ResponseReceivedEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$ResponseReceivedEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$ResponseReceivedEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 7;
    }

    /* JADX INFO: renamed from: u */
    public static void m7663u(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, EsTrafficEvents$StartedEvent esTrafficEvents$StartedEvent) {
        esTrafficEvents$TrafficEvent.getClass();
        esTrafficEvents$StartedEvent.getClass();
        esTrafficEvents$TrafficEvent.event_ = esTrafficEvents$StartedEvent;
        esTrafficEvents$TrafficEvent.eventCase_ = 3;
    }

    /* JADX INFO: renamed from: v */
    public static void m7664v(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, long j) {
        esTrafficEvents$TrafficEvent.timestamp_ = j;
    }

    /* JADX INFO: renamed from: A */
    public final EsTrafficEvents$FinishedEvent m7665A() {
        return this.eventCase_ == 8 ? (EsTrafficEvents$FinishedEvent) this.event_ : EsTrafficEvents$FinishedEvent.m7635q();
    }

    /* JADX INFO: renamed from: B */
    public final EsTrafficEvents$RequestReadyEvent m7666B() {
        return this.eventCase_ == 4 ? (EsTrafficEvents$RequestReadyEvent) this.event_ : EsTrafficEvents$RequestReadyEvent.m7643q();
    }

    /* JADX INFO: renamed from: C */
    public final EsTrafficEvents$ResponseReceivedEvent m7667C() {
        return this.eventCase_ == 7 ? (EsTrafficEvents$ResponseReceivedEvent) this.event_ : EsTrafficEvents$ResponseReceivedEvent.m7648o();
    }

    /* JADX INFO: renamed from: D */
    public final EsTrafficEvents$StartedEvent m7668D() {
        return this.eventCase_ == 3 ? (EsTrafficEvents$StartedEvent) this.event_ : EsTrafficEvents$StartedEvent.m7652o();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"event_", "eventCase_", "id_", "timestamp_", EsTrafficEvents$StartedEvent.class, EsTrafficEvents$RequestReadyEvent.class, EsTrafficEvents$BytesSentEvent.class, EsTrafficEvents$BytesReceivedEvent.class, EsTrafficEvents$ResponseReceivedEvent.class, EsTrafficEvents$FinishedEvent.class, EsTrafficEvents$FailedEvent.class});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$TrafficEvent();
        }
        if (iOrdinal == 4) {
            return new mpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$TrafficEvent.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final long getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: w */
    public final EsTrafficEvents$BytesReceivedEvent m7669w() {
        return this.eventCase_ == 6 ? (EsTrafficEvents$BytesReceivedEvent) this.event_ : EsTrafficEvents$BytesReceivedEvent.m7614p();
    }

    /* JADX INFO: renamed from: x */
    public final EsTrafficEvents$BytesSentEvent m7670x() {
        return this.eventCase_ == 5 ? (EsTrafficEvents$BytesSentEvent) this.event_ : EsTrafficEvents$BytesSentEvent.m7618p();
    }

    /* JADX INFO: renamed from: y */
    public final int m7671y() {
        return p1v.m68847d(this.eventCase_);
    }

    /* JADX INFO: renamed from: z */
    public final EsTrafficEvents$FailedEvent m7672z() {
        return this.eventCase_ == 9 ? (EsTrafficEvents$FailedEvent) this.event_ : EsTrafficEvents$FailedEvent.m7625r();
    }
}
