package com.spotify.adsdisplay.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ldl0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class OnSurfaceAdsEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 5;
    public static final int CONTEXT_URI_FIELD_NUMBER = 7;
    public static final int CONTROLLER_INSTANCE_ID_FIELD_NUMBER = 8;
    private static final OnSurfaceAdsEvent DEFAULT_INSTANCE;
    public static final int DEMAND_STATUS_FIELD_NUMBER = 9;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 10;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adId_ = "";
    private String adPlaybackId_ = "";
    private String format_ = "";
    private String contextUri_ = "";
    private String controllerInstanceId_ = "";
    private String demandStatus_ = "";
    private String surface_ = "";

    static {
        OnSurfaceAdsEvent onSurfaceAdsEvent = new OnSurfaceAdsEvent();
        DEFAULT_INSTANCE = onSurfaceAdsEvent;
        AbstractC0269h.registerDefaultInstance(OnSurfaceAdsEvent.class, onSurfaceAdsEvent);
    }

    private OnSurfaceAdsEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2815n(OnSurfaceAdsEvent onSurfaceAdsEvent, String str) {
        onSurfaceAdsEvent.getClass();
        str.getClass();
        onSurfaceAdsEvent.bitField0_ |= 8;
        onSurfaceAdsEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2816o(OnSurfaceAdsEvent onSurfaceAdsEvent, String str) {
        onSurfaceAdsEvent.getClass();
        str.getClass();
        onSurfaceAdsEvent.bitField0_ |= 16;
        onSurfaceAdsEvent.adPlaybackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2817p(OnSurfaceAdsEvent onSurfaceAdsEvent, String str) {
        onSurfaceAdsEvent.getClass();
        onSurfaceAdsEvent.bitField0_ |= 1;
        onSurfaceAdsEvent.eventName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2818q(OnSurfaceAdsEvent onSurfaceAdsEvent, String str) {
        onSurfaceAdsEvent.getClass();
        str.getClass();
        onSurfaceAdsEvent.bitField0_ |= 32;
        onSurfaceAdsEvent.format_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static ldl0 m2819r() {
        return (ldl0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adId_", "adPlaybackId_", "format_", "contextUri_", "controllerInstanceId_", "demandStatus_", "surface_"});
        }
        if (iOrdinal == 3) {
            return new OnSurfaceAdsEvent();
        }
        if (iOrdinal == 4) {
            return new ldl0(DEFAULT_INSTANCE);
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
        synchronized (OnSurfaceAdsEvent.class) {
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
