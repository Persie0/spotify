package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.agr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y4r;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Device extends AbstractC0269h implements sre0 {
    private static final Device DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_DEVICE_FIELD_NUMBER = 1;
    public static final int TARGET_DEVICE_FIELD_NUMBER = 2;
    private int sourceDevice_;
    private int targetDevice_;

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        AbstractC0269h.registerDefaultInstance(Device.class, device);
    }

    private Device() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3047n(Device device, agr agrVar) {
        device.getClass();
        device.sourceDevice_ = agrVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m3048o(Device device, agr agrVar) {
        device.getClass();
        device.targetDevice_ = agrVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static y4r m3049p() {
        return (y4r) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"sourceDevice_", "targetDevice_"});
        }
        if (iOrdinal == 3) {
            return new Device();
        }
        if (iOrdinal == 4) {
            return new y4r(DEFAULT_INSTANCE);
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
        synchronized (Device.class) {
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
