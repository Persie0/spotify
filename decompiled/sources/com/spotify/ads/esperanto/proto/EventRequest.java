package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r6x;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class EventRequest extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int ASSET_ID_FIELD_NUMBER = 9;
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 7;
    private static final EventRequest DEFAULT_INSTANCE;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int EVENT_SOURCE_FIELD_NUMBER = 5;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_DURATION_FIELD_NUMBER = 8;
    public static final int PLAYBACK_POSITION_FIELD_NUMBER = 3;
    public static final int SLOT_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private long playbackDuration_;
    private long playbackPosition_;
    private String adId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String eventSource_ = "";
    private String slotId_ = "";
    private String clientPayload_ = "";
    private String assetId_ = "";

    static {
        EventRequest eventRequest = new EventRequest();
        DEFAULT_INSTANCE = eventRequest;
        AbstractC0269h.registerDefaultInstance(EventRequest.class, eventRequest);
    }

    private EventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2644n(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2645o(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.bitField0_ |= 64;
        eventRequest.assetId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2646p(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.bitField0_ |= 16;
        eventRequest.clientPayload_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2647q(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.bitField0_ |= 2;
        eventRequest.eventReason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2648r(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.bitField0_ |= 4;
        eventRequest.eventSource_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2649s(EventRequest eventRequest, String str) {
        eventRequest.getClass();
        str.getClass();
        eventRequest.eventType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2650t(EventRequest eventRequest, long j) {
        eventRequest.bitField0_ |= 1;
        eventRequest.playbackPosition_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static r6x m2651u() {
        return (r6x) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဃ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006ለ\u0003\u0007ለ\u0004\bဃ\u0005\tለ\u0006", new Object[]{"bitField0_", "adId_", "eventType_", "playbackPosition_", "eventReason_", "eventSource_", "slotId_", "clientPayload_", "playbackDuration_", "assetId_"});
        }
        if (iOrdinal == 3) {
            return new EventRequest();
        }
        if (iOrdinal == 4) {
            return new r6x(DEFAULT_INSTANCE);
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
        synchronized (EventRequest.class) {
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
