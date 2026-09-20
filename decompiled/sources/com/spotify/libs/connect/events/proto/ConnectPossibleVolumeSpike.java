package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dui;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ConnectPossibleVolumeSpike extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_DEVICE_ID_FIELD_NUMBER = 1;
    public static final int APPLICATION_STATE_FIELD_NUMBER = 6;
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 7;
    private static final ConnectPossibleVolumeSpike DEFAULT_INSTANCE;
    public static final int DEVICE_BRAND_FIELD_NUMBER = 12;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 11;
    public static final int IS_CONNECTED_TO_ENTITY_FIELD_NUMBER = 10;
    public static final int IS_SOCIAL_CONNECT_FIELD_NUMBER = 8;
    public static final int NEW_VOLUME_FIELD_NUMBER = 2;
    public static final int OLD_VOLUME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 9;
    public static final int STEPS_DOWN_AFTER_FIELD_NUMBER = 4;
    public static final int TOTAL_VOLUME_DECREASE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isConnectedToEntity_;
    private boolean isSocialConnect_;
    private float newVolume_;
    private float oldVolume_;
    private int stepsDownAfter_;
    private float totalVolumeDecrease_;
    private String activeDeviceId_ = "";
    private String applicationState_ = "";
    private String currentRouteType_ = "";
    private String requestingFeature_ = "";
    private String deviceModel_ = "";
    private String deviceBrand_ = "";

    static {
        ConnectPossibleVolumeSpike connectPossibleVolumeSpike = new ConnectPossibleVolumeSpike();
        DEFAULT_INSTANCE = connectPossibleVolumeSpike;
        AbstractC0269h.registerDefaultInstance(ConnectPossibleVolumeSpike.class, connectPossibleVolumeSpike);
    }

    private ConnectPossibleVolumeSpike() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12738n(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        str.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 1;
        connectPossibleVolumeSpike.activeDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12739o(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 32;
        connectPossibleVolumeSpike.applicationState_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12740p(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 64;
        connectPossibleVolumeSpike.currentRouteType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12741q(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        str.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 2048;
        connectPossibleVolumeSpike.deviceBrand_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12742r(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        str.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 1024;
        connectPossibleVolumeSpike.deviceModel_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12743s(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, boolean z) {
        connectPossibleVolumeSpike.bitField0_ |= 512;
        connectPossibleVolumeSpike.isConnectedToEntity_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m12744t(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, boolean z) {
        connectPossibleVolumeSpike.bitField0_ |= 128;
        connectPossibleVolumeSpike.isSocialConnect_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m12745u(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, float f) {
        connectPossibleVolumeSpike.bitField0_ |= 2;
        connectPossibleVolumeSpike.newVolume_ = f;
    }

    /* JADX INFO: renamed from: v */
    public static void m12746v(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, float f) {
        connectPossibleVolumeSpike.bitField0_ |= 4;
        connectPossibleVolumeSpike.oldVolume_ = f;
    }

    /* JADX INFO: renamed from: w */
    public static void m12747w(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, String str) {
        connectPossibleVolumeSpike.getClass();
        str.getClass();
        connectPossibleVolumeSpike.bitField0_ |= 256;
        connectPossibleVolumeSpike.requestingFeature_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m12748x(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, int i) {
        connectPossibleVolumeSpike.bitField0_ |= 8;
        connectPossibleVolumeSpike.stepsDownAfter_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m12749y(ConnectPossibleVolumeSpike connectPossibleVolumeSpike, float f) {
        connectPossibleVolumeSpike.bitField0_ |= 16;
        connectPossibleVolumeSpike.totalVolumeDecrease_ = f;
    }

    /* JADX INFO: renamed from: z */
    public static dui m12750z() {
        return (dui) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ခ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဈ\b\nဇ\t\u000bဈ\n\fဈ\u000b", new Object[]{"bitField0_", "activeDeviceId_", "newVolume_", "oldVolume_", "stepsDownAfter_", "totalVolumeDecrease_", "applicationState_", "currentRouteType_", "isSocialConnect_", "requestingFeature_", "isConnectedToEntity_", "deviceModel_", "deviceBrand_"});
        }
        if (iOrdinal == 3) {
            return new ConnectPossibleVolumeSpike();
        }
        if (iOrdinal == 4) {
            return new dui(DEFAULT_INSTANCE);
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
        synchronized (ConnectPossibleVolumeSpike.class) {
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
