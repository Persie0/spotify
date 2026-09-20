package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x6x;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EventSenderCanaryNonAuth extends AbstractC0269h implements sre0 {
    public static final int BATCH_SIZE_FIELD_NUMBER = 3;
    public static final int BATCH_START_TIME_MS_FIELD_NUMBER = 6;
    public static final int BATCH_UUID_FIELD_NUMBER = 1;
    public static final int CONFIGURATION_FIELD_NUMBER = 8;
    private static final EventSenderCanaryNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int EVENT_TIME_MS_FIELD_NUMBER = 7;
    public static final int EXPECTED_MUTATION_COUNT_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_VARIANT_FIELD_NUMBER = 9;
    public static final int MUTATION_COUNT_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int SENDING_SYSTEM_FIELD_NUMBER = 4;
    public static final int SENT_AS_PENDING_EVENT_FIELD_NUMBER = 5;
    private long batchSize_;
    private long batchStartTimeMs_;
    private int bitField0_;
    private long eventId_;
    private long eventTimeMs_;
    private long expectedMutationCount_;
    private long mutationCount_;
    private boolean sentAsPendingEvent_;
    private String batchUuid_ = "";
    private String sendingSystem_ = "";
    private String configuration_ = "";
    private String experimentVariant_ = "";

    static {
        EventSenderCanaryNonAuth eventSenderCanaryNonAuth = new EventSenderCanaryNonAuth();
        DEFAULT_INSTANCE = eventSenderCanaryNonAuth;
        AbstractC0269h.registerDefaultInstance(EventSenderCanaryNonAuth.class, eventSenderCanaryNonAuth);
    }

    private EventSenderCanaryNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13846n(EventSenderCanaryNonAuth eventSenderCanaryNonAuth) {
        eventSenderCanaryNonAuth.getClass();
        eventSenderCanaryNonAuth.bitField0_ |= 256;
        eventSenderCanaryNonAuth.experimentVariant_ = "heartbeat";
    }

    /* JADX INFO: renamed from: o */
    public static x6x m13847o() {
        return (x6x) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဂ\n", new Object[]{"bitField0_", "batchUuid_", "eventId_", "batchSize_", "sendingSystem_", "sentAsPendingEvent_", "batchStartTimeMs_", "eventTimeMs_", "configuration_", "experimentVariant_", "mutationCount_", "expectedMutationCount_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderCanaryNonAuth();
        }
        if (iOrdinal == 4) {
            return new x6x(DEFAULT_INSTANCE);
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
        synchronized (EventSenderCanaryNonAuth.class) {
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
