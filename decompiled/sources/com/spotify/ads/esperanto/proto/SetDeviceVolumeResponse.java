package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h501;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class SetDeviceVolumeResponse extends AbstractC0269h implements sre0 {
    private static final SetDeviceVolumeResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        SetDeviceVolumeResponse setDeviceVolumeResponse = new SetDeviceVolumeResponse();
        DEFAULT_INSTANCE = setDeviceVolumeResponse;
        AbstractC0269h.registerDefaultInstance(SetDeviceVolumeResponse.class, setDeviceVolumeResponse);
    }

    private SetDeviceVolumeResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static SetDeviceVolumeResponse m2693p(byte[] bArr) {
        return (SetDeviceVolumeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new SetDeviceVolumeResponse();
        }
        if (iOrdinal == 4) {
            return new h8z0(22);
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
        synchronized (SetDeviceVolumeResponse.class) {
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
    public final h501 m2694o() {
        h501 h501Var;
        int i = this.status_;
        if (i != 0) {
            h501Var = i != 1 ? null : h501.BAD_REQUEST;
        } else {
            h501Var = h501.ACCEPTED;
        }
        return h501Var == null ? h501.UNRECOGNIZED : h501Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
