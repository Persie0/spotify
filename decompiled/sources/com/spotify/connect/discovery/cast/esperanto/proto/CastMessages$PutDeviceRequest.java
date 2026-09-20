package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bbc;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CastMessages$PutDeviceRequest extends AbstractC0269h implements sre0 {
    private static final CastMessages$PutDeviceRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int JSON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String deviceId_ = "";
    private gva json_ = gva.f84678b;

    static {
        CastMessages$PutDeviceRequest castMessages$PutDeviceRequest = new CastMessages$PutDeviceRequest();
        DEFAULT_INSTANCE = castMessages$PutDeviceRequest;
        AbstractC0269h.registerDefaultInstance(CastMessages$PutDeviceRequest.class, castMessages$PutDeviceRequest);
    }

    private CastMessages$PutDeviceRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7293n(CastMessages$PutDeviceRequest castMessages$PutDeviceRequest, String str) {
        castMessages$PutDeviceRequest.getClass();
        str.getClass();
        castMessages$PutDeviceRequest.deviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7294o(CastMessages$PutDeviceRequest castMessages$PutDeviceRequest, cva cvaVar) {
        castMessages$PutDeviceRequest.getClass();
        castMessages$PutDeviceRequest.json_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static bbc m7295p() {
        return (bbc) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"deviceId_", "json_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$PutDeviceRequest();
        }
        if (iOrdinal == 4) {
            return new bbc(DEFAULT_INSTANCE);
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
        synchronized (CastMessages$PutDeviceRequest.class) {
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
