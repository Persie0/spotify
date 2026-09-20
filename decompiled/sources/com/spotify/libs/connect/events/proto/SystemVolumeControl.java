package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi61;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemVolumeControl extends AbstractC0269h implements sre0 {
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 4;
    private static final SystemVolumeControl DEFAULT_INSTANCE;
    public static final int OLD_VOLUME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 1;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private int bitField0_;
    private float oldVolume_;
    private float volume_;
    private String requestingFeature_ = "";
    private String currentRouteType_ = "";

    static {
        SystemVolumeControl systemVolumeControl = new SystemVolumeControl();
        DEFAULT_INSTANCE = systemVolumeControl;
        AbstractC0269h.registerDefaultInstance(SystemVolumeControl.class, systemVolumeControl);
    }

    private SystemVolumeControl() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12771n(SystemVolumeControl systemVolumeControl, String str) {
        systemVolumeControl.getClass();
        systemVolumeControl.bitField0_ |= 8;
        systemVolumeControl.currentRouteType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12772o(SystemVolumeControl systemVolumeControl, float f) {
        systemVolumeControl.bitField0_ |= 4;
        systemVolumeControl.oldVolume_ = f;
    }

    /* JADX INFO: renamed from: p */
    public static void m12773p(SystemVolumeControl systemVolumeControl, String str) {
        systemVolumeControl.getClass();
        str.getClass();
        systemVolumeControl.bitField0_ |= 1;
        systemVolumeControl.requestingFeature_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12774q(SystemVolumeControl systemVolumeControl, float f) {
        systemVolumeControl.bitField0_ |= 2;
        systemVolumeControl.volume_ = f;
    }

    /* JADX INFO: renamed from: r */
    public static fi61 m12775r() {
        return (fi61) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "requestingFeature_", "volume_", "oldVolume_", "currentRouteType_"});
        }
        if (iOrdinal == 3) {
            return new SystemVolumeControl();
        }
        if (iOrdinal == 4) {
            return new fi61(DEFAULT_INSTANCE);
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
        synchronized (SystemVolumeControl.class) {
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
