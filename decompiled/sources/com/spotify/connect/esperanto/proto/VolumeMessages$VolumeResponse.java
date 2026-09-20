package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.fyc1;
import p204p.hpf;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class VolumeMessages$VolumeResponse extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_DEVICE_CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 3;
    private static final VolumeMessages$VolumeResponse DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_VOLUMES_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VOLUME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;
    private int volume_;
    private ihc0 groupDeviceVolumes_ = ihc0.f102235b;
    private String activeDeviceConnectStateIdentifier_ = "";

    static {
        VolumeMessages$VolumeResponse volumeMessages$VolumeResponse = new VolumeMessages$VolumeResponse();
        DEFAULT_INSTANCE = volumeMessages$VolumeResponse;
        AbstractC0269h.registerDefaultInstance(VolumeMessages$VolumeResponse.class, volumeMessages$VolumeResponse);
    }

    private VolumeMessages$VolumeResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static VolumeMessages$VolumeResponse m7444r(byte[] bArr) {
        return (VolumeMessages$VolumeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001င\u0000\u0002\f\u0003ለ\u0001\u00042", new Object[]{"bitField0_", "volume_", "status_", "activeDeviceConnectStateIdentifier_", "groupDeviceVolumes_", fyc1.f74700a});
        }
        if (iOrdinal == 3) {
            return new VolumeMessages$VolumeResponse();
        }
        if (iOrdinal == 4) {
            return new eyc1(0);
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
        synchronized (VolumeMessages$VolumeResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m7445o() {
        return this.activeDeviceConnectStateIdentifier_;
    }

    /* JADX INFO: renamed from: p */
    public final hpf m7446p() {
        hpf hpfVarM48156a = hpf.m48156a(this.status_);
        return hpfVarM48156a == null ? hpf.UNRECOGNIZED : hpfVarM48156a;
    }

    /* JADX INFO: renamed from: q */
    public final int m7447q() {
        return this.volume_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
