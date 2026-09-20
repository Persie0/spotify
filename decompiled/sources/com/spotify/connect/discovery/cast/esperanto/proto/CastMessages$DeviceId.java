package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.abc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CastMessages$DeviceId extends AbstractC0269h implements sre0 {
    private static final CastMessages$DeviceId DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String deviceId_ = "";

    static {
        CastMessages$DeviceId castMessages$DeviceId = new CastMessages$DeviceId();
        DEFAULT_INSTANCE = castMessages$DeviceId;
        AbstractC0269h.registerDefaultInstance(CastMessages$DeviceId.class, castMessages$DeviceId);
    }

    private CastMessages$DeviceId() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7290n(CastMessages$DeviceId castMessages$DeviceId, String str) {
        castMessages$DeviceId.getClass();
        str.getClass();
        castMessages$DeviceId.deviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static abc m7291o() {
        return (abc) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: p */
    public static CastMessages$DeviceId m7292p(byte[] bArr) {
        return (CastMessages$DeviceId) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$DeviceId();
        }
        if (iOrdinal == 4) {
            return new abc(DEFAULT_INSTANCE);
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
        synchronized (CastMessages$DeviceId.class) {
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

    public final String getDeviceId() {
        return this.deviceId_;
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
