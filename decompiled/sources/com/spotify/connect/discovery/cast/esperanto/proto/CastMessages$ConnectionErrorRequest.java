package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zac;

/* JADX INFO: loaded from: classes6.dex */
public final class CastMessages$ConnectionErrorRequest extends AbstractC0269h implements sre0 {
    private static final CastMessages$ConnectionErrorRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_ERROR_CODE_FIELD_NUMBER = 3;
    private String deviceId_ = "";
    private int error_;
    private int platformErrorCode_;

    static {
        CastMessages$ConnectionErrorRequest castMessages$ConnectionErrorRequest = new CastMessages$ConnectionErrorRequest();
        DEFAULT_INSTANCE = castMessages$ConnectionErrorRequest;
        AbstractC0269h.registerDefaultInstance(CastMessages$ConnectionErrorRequest.class, castMessages$ConnectionErrorRequest);
    }

    private CastMessages$ConnectionErrorRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7286n(CastMessages$ConnectionErrorRequest castMessages$ConnectionErrorRequest, String str) {
        castMessages$ConnectionErrorRequest.getClass();
        str.getClass();
        castMessages$ConnectionErrorRequest.deviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7287o(CastMessages$ConnectionErrorRequest castMessages$ConnectionErrorRequest, int i) {
        castMessages$ConnectionErrorRequest.error_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m7288p(CastMessages$ConnectionErrorRequest castMessages$ConnectionErrorRequest, int i) {
        castMessages$ConnectionErrorRequest.platformErrorCode_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zac m7289q() {
        return (zac) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004", new Object[]{"deviceId_", "error_", "platformErrorCode_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$ConnectionErrorRequest();
        }
        if (iOrdinal == 4) {
            return new zac(DEFAULT_INSTANCE);
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
        synchronized (CastMessages$ConnectionErrorRequest.class) {
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
