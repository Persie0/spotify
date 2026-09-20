package com.spotify.adonappopen.logger.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zq0;

/* JADX INFO: loaded from: classes4.dex */
public final class AdOnAppOpenClientEvent extends AbstractC0269h implements sre0 {
    public static final int AD_IDS_FIELD_NUMBER = 4;
    public static final int BG_TASK_ID_FIELD_NUMBER = 3;
    public static final int CACHE_EXPIRATION_TIMESTAMP_FIELD_NUMBER = 5;
    private static final AdOnAppOpenClientEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 6;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long cacheExpirationTimestamp_;
    private String eventType_ = "";
    private String requestId_ = "";
    private String bgTaskId_ = "";
    private ae50 adIds_ = AbstractC0269h.emptyProtobufList();
    private String payload_ = "";

    static {
        AdOnAppOpenClientEvent adOnAppOpenClientEvent = new AdOnAppOpenClientEvent();
        DEFAULT_INSTANCE = adOnAppOpenClientEvent;
        AbstractC0269h.registerDefaultInstance(AdOnAppOpenClientEvent.class, adOnAppOpenClientEvent);
    }

    private AdOnAppOpenClientEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2544n(AdOnAppOpenClientEvent adOnAppOpenClientEvent, List list) {
        ae50 ae50Var = adOnAppOpenClientEvent.adIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            adOnAppOpenClientEvent.adIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, adOnAppOpenClientEvent.adIds_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2545o(AdOnAppOpenClientEvent adOnAppOpenClientEvent, String str) {
        adOnAppOpenClientEvent.getClass();
        str.getClass();
        adOnAppOpenClientEvent.bitField0_ |= 1;
        adOnAppOpenClientEvent.eventType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2546p(AdOnAppOpenClientEvent adOnAppOpenClientEvent, String str) {
        adOnAppOpenClientEvent.getClass();
        adOnAppOpenClientEvent.bitField0_ |= 16;
        adOnAppOpenClientEvent.payload_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2547q(AdOnAppOpenClientEvent adOnAppOpenClientEvent, String str) {
        adOnAppOpenClientEvent.getClass();
        adOnAppOpenClientEvent.bitField0_ |= 2;
        adOnAppOpenClientEvent.requestId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static zq0 m2548r() {
        return (zq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဂ\u0003\u0006ဈ\u0004", new Object[]{"bitField0_", "eventType_", "requestId_", "bgTaskId_", "adIds_", "cacheExpirationTimestamp_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new AdOnAppOpenClientEvent();
        }
        if (iOrdinal == 4) {
            return new zq0(DEFAULT_INSTANCE);
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
        synchronized (AdOnAppOpenClientEvent.class) {
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
