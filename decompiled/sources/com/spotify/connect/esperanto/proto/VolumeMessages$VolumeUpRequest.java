package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VolumeMessages$VolumeUpRequest extends AbstractC0269h implements sre0 {
    private static final VolumeMessages$VolumeUpRequest DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String groupDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;

    static {
        VolumeMessages$VolumeUpRequest volumeMessages$VolumeUpRequest = new VolumeMessages$VolumeUpRequest();
        DEFAULT_INSTANCE = volumeMessages$VolumeUpRequest;
        AbstractC0269h.registerDefaultInstance(VolumeMessages$VolumeUpRequest.class, volumeMessages$VolumeUpRequest);
    }

    private VolumeMessages$VolumeUpRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7452n(VolumeMessages$VolumeUpRequest volumeMessages$VolumeUpRequest, String str) {
        volumeMessages$VolumeUpRequest.getClass();
        str.getClass();
        volumeMessages$VolumeUpRequest.bitField0_ |= 2;
        volumeMessages$VolumeUpRequest.groupDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7453o(VolumeMessages$VolumeUpRequest volumeMessages$VolumeUpRequest, CommonMessages$LoggingParams commonMessages$LoggingParams) {
        volumeMessages$VolumeUpRequest.getClass();
        volumeMessages$VolumeUpRequest.loggingParams_ = commonMessages$LoggingParams;
        volumeMessages$VolumeUpRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static hyc1 m7454p() {
        return (hyc1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "loggingParams_", "groupDeviceIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new VolumeMessages$VolumeUpRequest();
        }
        if (iOrdinal == 4) {
            return new hyc1(DEFAULT_INSTANCE);
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
        synchronized (VolumeMessages$VolumeUpRequest.class) {
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
