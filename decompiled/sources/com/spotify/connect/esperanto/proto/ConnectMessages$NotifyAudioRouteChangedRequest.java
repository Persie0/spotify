package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fti;
import p204p.gti;
import p204p.hti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$NotifyAudioRouteChangedRequest extends AbstractC0269h implements sre0 {
    public static final int AUDIO_OUTPUT_DEVICE_BRAND_FIELD_NUMBER = 3;
    public static final int AUDIO_OUTPUT_DEVICE_CATEGORY_FIELD_NUMBER = 5;
    public static final int AUDIO_OUTPUT_DEVICE_CONNECTION_TYPE_FIELD_NUMBER = 2;
    public static final int AUDIO_OUTPUT_DEVICE_MODEL_FIELD_NUMBER = 4;
    public static final int AUDIO_OUTPUT_DEVICE_NAME_FIELD_NUMBER = 1;
    private static final ConnectMessages$NotifyAudioRouteChangedRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int audioOutputDeviceCategory_;
    private int audioOutputDeviceConnectionType_;
    private int bitField0_;
    private String audioOutputDeviceName_ = "";
    private String audioOutputDeviceBrand_ = "";
    private String audioOutputDeviceModel_ = "";

    static {
        ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest = new ConnectMessages$NotifyAudioRouteChangedRequest();
        DEFAULT_INSTANCE = connectMessages$NotifyAudioRouteChangedRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$NotifyAudioRouteChangedRequest.class, connectMessages$NotifyAudioRouteChangedRequest);
    }

    private ConnectMessages$NotifyAudioRouteChangedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7346n(ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest, String str) {
        connectMessages$NotifyAudioRouteChangedRequest.getClass();
        str.getClass();
        connectMessages$NotifyAudioRouteChangedRequest.bitField0_ |= 4;
        connectMessages$NotifyAudioRouteChangedRequest.audioOutputDeviceBrand_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7347o(ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest, gti gtiVar) {
        connectMessages$NotifyAudioRouteChangedRequest.getClass();
        connectMessages$NotifyAudioRouteChangedRequest.audioOutputDeviceCategory_ = gtiVar.getNumber();
        connectMessages$NotifyAudioRouteChangedRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: p */
    public static void m7348p(ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest, hti htiVar) {
        connectMessages$NotifyAudioRouteChangedRequest.getClass();
        connectMessages$NotifyAudioRouteChangedRequest.audioOutputDeviceConnectionType_ = htiVar.getNumber();
        connectMessages$NotifyAudioRouteChangedRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7349q(ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest, String str) {
        connectMessages$NotifyAudioRouteChangedRequest.getClass();
        str.getClass();
        connectMessages$NotifyAudioRouteChangedRequest.bitField0_ |= 8;
        connectMessages$NotifyAudioRouteChangedRequest.audioOutputDeviceModel_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m7350r(ConnectMessages$NotifyAudioRouteChangedRequest connectMessages$NotifyAudioRouteChangedRequest, String str) {
        connectMessages$NotifyAudioRouteChangedRequest.getClass();
        str.getClass();
        connectMessages$NotifyAudioRouteChangedRequest.bitField0_ |= 1;
        connectMessages$NotifyAudioRouteChangedRequest.audioOutputDeviceName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static fti m7351s() {
        return (fti) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "audioOutputDeviceName_", "audioOutputDeviceConnectionType_", "audioOutputDeviceBrand_", "audioOutputDeviceModel_", "audioOutputDeviceCategory_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$NotifyAudioRouteChangedRequest();
        }
        if (iOrdinal == 4) {
            return new fti(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$NotifyAudioRouteChangedRequest.class) {
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
