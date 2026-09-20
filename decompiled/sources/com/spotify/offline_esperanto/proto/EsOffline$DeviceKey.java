package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ylw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$DeviceKey extends AbstractC0269h implements sre0 {
    public static final int CACHE_ID_FIELD_NUMBER = 2;
    private static final EsOffline$DeviceKey DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String deviceId_ = "";
    private String cacheId_ = "";

    static {
        EsOffline$DeviceKey esOffline$DeviceKey = new EsOffline$DeviceKey();
        DEFAULT_INSTANCE = esOffline$DeviceKey;
        AbstractC0269h.registerDefaultInstance(EsOffline$DeviceKey.class, esOffline$DeviceKey);
    }

    private EsOffline$DeviceKey() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16110n(EsOffline$DeviceKey esOffline$DeviceKey, String str) {
        esOffline$DeviceKey.getClass();
        str.getClass();
        esOffline$DeviceKey.cacheId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16111o(EsOffline$DeviceKey esOffline$DeviceKey, String str) {
        esOffline$DeviceKey.getClass();
        str.getClass();
        esOffline$DeviceKey.deviceId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ylw m16113q() {
        return (ylw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"deviceId_", "cacheId_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$DeviceKey();
        }
        if (iOrdinal == 4) {
            return new ylw();
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
        synchronized (EsOffline$DeviceKey.class) {
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
