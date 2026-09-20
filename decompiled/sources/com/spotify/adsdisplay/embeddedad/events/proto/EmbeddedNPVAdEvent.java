package com.spotify.adsdisplay.embeddedad.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k6u;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class EmbeddedNPVAdEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 7;
    public static final int CONTEXT_URI_FIELD_NUMBER = 5;
    private static final EmbeddedNPVAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    public static final int TRACK_URI_FIELD_NUMBER = 6;
    private int bitField0_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adId_ = "";
    private String contextUri_ = "";
    private String trackUri_ = "";
    private String adPlaybackId_ = "";

    static {
        EmbeddedNPVAdEvent embeddedNPVAdEvent = new EmbeddedNPVAdEvent();
        DEFAULT_INSTANCE = embeddedNPVAdEvent;
        AbstractC0269h.registerDefaultInstance(EmbeddedNPVAdEvent.class, embeddedNPVAdEvent);
    }

    private EmbeddedNPVAdEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2807n(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        str.getClass();
        embeddedNPVAdEvent.bitField0_ |= 8;
        embeddedNPVAdEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2808o(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        str.getClass();
        embeddedNPVAdEvent.bitField0_ |= 64;
        embeddedNPVAdEvent.adPlaybackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2809p(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        embeddedNPVAdEvent.bitField0_ |= 16;
        embeddedNPVAdEvent.contextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2810q(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        str.getClass();
        embeddedNPVAdEvent.bitField0_ |= 4;
        embeddedNPVAdEvent.eventData_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2811r(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        str.getClass();
        embeddedNPVAdEvent.bitField0_ |= 1;
        embeddedNPVAdEvent.eventName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2812s(EmbeddedNPVAdEvent embeddedNPVAdEvent, long j) {
        embeddedNPVAdEvent.bitField0_ |= 2;
        embeddedNPVAdEvent.timeStamp_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m2813t(EmbeddedNPVAdEvent embeddedNPVAdEvent, String str) {
        embeddedNPVAdEvent.getClass();
        embeddedNPVAdEvent.bitField0_ |= 32;
        embeddedNPVAdEvent.trackUri_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static k6u m2814u() {
        return (k6u) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adId_", "contextUri_", "trackUri_", "adPlaybackId_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedNPVAdEvent();
        }
        if (iOrdinal == 4) {
            return new k6u(DEFAULT_INSTANCE);
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
        synchronized (EmbeddedNPVAdEvent.class) {
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
