package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VolumeMessages$VolumeSetRequest extends AbstractC0269h implements sre0 {
    private static final VolumeMessages$VolumeSetRequest DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String groupDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;
    private int volume_;

    static {
        VolumeMessages$VolumeSetRequest volumeMessages$VolumeSetRequest = new VolumeMessages$VolumeSetRequest();
        DEFAULT_INSTANCE = volumeMessages$VolumeSetRequest;
        AbstractC0269h.registerDefaultInstance(VolumeMessages$VolumeSetRequest.class, volumeMessages$VolumeSetRequest);
    }

    private VolumeMessages$VolumeSetRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7448n(VolumeMessages$VolumeSetRequest volumeMessages$VolumeSetRequest, String str) {
        volumeMessages$VolumeSetRequest.getClass();
        str.getClass();
        volumeMessages$VolumeSetRequest.bitField0_ |= 2;
        volumeMessages$VolumeSetRequest.groupDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7449o(VolumeMessages$VolumeSetRequest volumeMessages$VolumeSetRequest, CommonMessages$LoggingParams commonMessages$LoggingParams) {
        volumeMessages$VolumeSetRequest.getClass();
        volumeMessages$VolumeSetRequest.loggingParams_ = commonMessages$LoggingParams;
        volumeMessages$VolumeSetRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m7450p(VolumeMessages$VolumeSetRequest volumeMessages$VolumeSetRequest, int i) {
        volumeMessages$VolumeSetRequest.volume_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static gyc1 m7451q() {
        return (gyc1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "volume_", "loggingParams_", "groupDeviceIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new VolumeMessages$VolumeSetRequest();
        }
        if (iOrdinal == 4) {
            return new gyc1(DEFAULT_INSTANCE);
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
        synchronized (VolumeMessages$VolumeSetRequest.class) {
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
