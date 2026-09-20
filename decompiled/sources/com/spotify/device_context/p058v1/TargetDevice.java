package com.spotify.device_context.p058v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.ou61;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class TargetDevice extends AbstractC0269h implements sre0 {
    private static final TargetDevice DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTITY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REPORTED_ATTRIBUTES_FIELD_NUMBER = 2;
    private int bitField0_;
    private DeviceIdentity deviceIdentity_;
    private ReportedAttributes reportedAttributes_;

    static {
        TargetDevice targetDevice = new TargetDevice();
        DEFAULT_INSTANCE = targetDevice;
        AbstractC0269h.registerDefaultInstance(TargetDevice.class, targetDevice);
    }

    private TargetDevice() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9220n(TargetDevice targetDevice, DeviceIdentity deviceIdentity) {
        targetDevice.getClass();
        deviceIdentity.getClass();
        targetDevice.deviceIdentity_ = deviceIdentity;
        targetDevice.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m9221o(TargetDevice targetDevice, ReportedAttributes reportedAttributes) {
        targetDevice.getClass();
        reportedAttributes.getClass();
        targetDevice.reportedAttributes_ = reportedAttributes;
        targetDevice.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static ou61 m9222p() {
        return (ou61) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "deviceIdentity_", "reportedAttributes_"});
        }
        if (iOrdinal == 3) {
            return new TargetDevice();
        }
        if (iOrdinal == 4) {
            return new ou61(DEFAULT_INSTANCE);
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
        synchronized (TargetDevice.class) {
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
