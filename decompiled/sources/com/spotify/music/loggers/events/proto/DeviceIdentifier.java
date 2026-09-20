package com.spotify.music.loggers.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p6r;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceIdentifier extends AbstractC0269h implements sre0 {
    public static final int ANDROIDID_FIELD_NUMBER = 4;
    private static final DeviceIdentifier DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 2;
    public static final int GOOGLEAID_FIELD_NUMBER = 3;
    public static final int IDFA_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String idfa_ = "";
    private String deviceid_ = "";
    private String googleaid_ = "";
    private String androidid_ = "";

    static {
        DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
        DEFAULT_INSTANCE = deviceIdentifier;
        AbstractC0269h.registerDefaultInstance(DeviceIdentifier.class, deviceIdentifier);
    }

    private DeviceIdentifier() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15718n(DeviceIdentifier deviceIdentifier, String str) {
        deviceIdentifier.getClass();
        deviceIdentifier.bitField0_ |= 8;
        deviceIdentifier.androidid_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15719o(DeviceIdentifier deviceIdentifier, String str) {
        deviceIdentifier.getClass();
        deviceIdentifier.bitField0_ |= 2;
        deviceIdentifier.deviceid_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15720p(DeviceIdentifier deviceIdentifier, String str) {
        deviceIdentifier.getClass();
        str.getClass();
        deviceIdentifier.bitField0_ |= 4;
        deviceIdentifier.googleaid_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15721q(DeviceIdentifier deviceIdentifier) {
        deviceIdentifier.getClass();
        deviceIdentifier.bitField0_ |= 1;
        deviceIdentifier.idfa_ = "";
    }

    /* JADX INFO: renamed from: r */
    public static p6r m15722r() {
        return (p6r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "idfa_", "deviceid_", "googleaid_", "androidid_"});
        }
        if (iOrdinal == 3) {
            return new DeviceIdentifier();
        }
        if (iOrdinal == 4) {
            return new p6r(DEFAULT_INSTANCE);
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
        synchronized (DeviceIdentifier.class) {
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
