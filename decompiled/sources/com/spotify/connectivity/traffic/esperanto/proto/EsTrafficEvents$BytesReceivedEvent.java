package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fpw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$BytesReceivedEvent extends AbstractC0269h implements sre0 {
    public static final int AMOUNT_OF_BYTES_FIELD_NUMBER = 1;
    private static final EsTrafficEvents$BytesReceivedEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private long amountOfBytes_;

    static {
        EsTrafficEvents$BytesReceivedEvent esTrafficEvents$BytesReceivedEvent = new EsTrafficEvents$BytesReceivedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$BytesReceivedEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$BytesReceivedEvent.class, esTrafficEvents$BytesReceivedEvent);
    }

    private EsTrafficEvents$BytesReceivedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7613n(EsTrafficEvents$BytesReceivedEvent esTrafficEvents$BytesReceivedEvent, long j) {
        esTrafficEvents$BytesReceivedEvent.amountOfBytes_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static EsTrafficEvents$BytesReceivedEvent m7614p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static fpw m7615q() {
        return (fpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"amountOfBytes_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$BytesReceivedEvent();
        }
        if (iOrdinal == 4) {
            return new fpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$BytesReceivedEvent.class) {
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
    public final long m7616o() {
        return this.amountOfBytes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
