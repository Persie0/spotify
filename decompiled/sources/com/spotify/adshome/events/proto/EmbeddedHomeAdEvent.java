package com.spotify.adshome.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.j6u;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class EmbeddedHomeAdEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 5;
    private static final EmbeddedHomeAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adId_ = "";
    private String adPlaybackId_ = "";

    static {
        EmbeddedHomeAdEvent embeddedHomeAdEvent = new EmbeddedHomeAdEvent();
        DEFAULT_INSTANCE = embeddedHomeAdEvent;
        AbstractC0269h.registerDefaultInstance(EmbeddedHomeAdEvent.class, embeddedHomeAdEvent);
    }

    private EmbeddedHomeAdEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2830n(EmbeddedHomeAdEvent embeddedHomeAdEvent, String str) {
        embeddedHomeAdEvent.getClass();
        str.getClass();
        embeddedHomeAdEvent.bitField0_ |= 8;
        embeddedHomeAdEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2831o(EmbeddedHomeAdEvent embeddedHomeAdEvent, String str) {
        embeddedHomeAdEvent.getClass();
        str.getClass();
        embeddedHomeAdEvent.bitField0_ |= 16;
        embeddedHomeAdEvent.adPlaybackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2832p(EmbeddedHomeAdEvent embeddedHomeAdEvent, String str) {
        embeddedHomeAdEvent.getClass();
        embeddedHomeAdEvent.bitField0_ |= 1;
        embeddedHomeAdEvent.eventName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static j6u m2833q() {
        return (j6u) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adId_", "adPlaybackId_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedHomeAdEvent();
        }
        if (iOrdinal == 4) {
            return new j6u(DEFAULT_INSTANCE);
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
        synchronized (EmbeddedHomeAdEvent.class) {
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
