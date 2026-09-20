package com.spotify.eventsender.gabo;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.j6t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PublishEventsRequest extends AbstractC0269h implements sre0 {
    private static final PublishEventsRequest DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPRESS_PERSIST_FIELD_NUMBER = 2;
    private ae50 event_ = AbstractC0269h.emptyProtobufList();
    private boolean suppressPersist_;

    static {
        PublishEventsRequest publishEventsRequest = new PublishEventsRequest();
        DEFAULT_INSTANCE = publishEventsRequest;
        AbstractC0269h.registerDefaultInstance(PublishEventsRequest.class, publishEventsRequest);
    }

    private PublishEventsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9792n(PublishEventsRequest publishEventsRequest, ArrayList arrayList) {
        ae50 ae50Var = publishEventsRequest.event_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            publishEventsRequest.event_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, publishEventsRequest.event_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9793o(PublishEventsRequest publishEventsRequest, EventEnvelope eventEnvelope) {
        publishEventsRequest.getClass();
        eventEnvelope.getClass();
        ae50 ae50Var = publishEventsRequest.event_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            publishEventsRequest.event_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        publishEventsRequest.event_.add(eventEnvelope);
    }

    /* JADX INFO: renamed from: p */
    public static j6t0 m9794p() {
        return (j6t0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"event_", EventEnvelope.class, "suppressPersist_"});
        }
        if (iOrdinal == 3) {
            return new PublishEventsRequest();
        }
        if (iOrdinal == 4) {
            return new j6t0(DEFAULT_INSTANCE);
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
        synchronized (PublishEventsRequest.class) {
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
