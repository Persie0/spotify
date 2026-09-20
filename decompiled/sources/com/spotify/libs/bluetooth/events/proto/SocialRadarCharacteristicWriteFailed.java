package com.spotify.libs.bluetooth.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vj31;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SocialRadarCharacteristicWriteFailed extends AbstractC0269h implements sre0 {
    public static final int CHARACTERISTIC_UUID_FIELD_NUMBER = 2;
    private static final SocialRadarCharacteristicWriteFailed DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private String reason_ = "";
    private String characteristicUuid_ = "";
    private String deviceType_ = "";

    static {
        SocialRadarCharacteristicWriteFailed socialRadarCharacteristicWriteFailed = new SocialRadarCharacteristicWriteFailed();
        DEFAULT_INSTANCE = socialRadarCharacteristicWriteFailed;
        AbstractC0269h.registerDefaultInstance(SocialRadarCharacteristicWriteFailed.class, socialRadarCharacteristicWriteFailed);
    }

    private SocialRadarCharacteristicWriteFailed() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12630n(SocialRadarCharacteristicWriteFailed socialRadarCharacteristicWriteFailed, String str) {
        socialRadarCharacteristicWriteFailed.getClass();
        str.getClass();
        socialRadarCharacteristicWriteFailed.bitField0_ |= 2;
        socialRadarCharacteristicWriteFailed.characteristicUuid_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12631o(SocialRadarCharacteristicWriteFailed socialRadarCharacteristicWriteFailed, String str) {
        socialRadarCharacteristicWriteFailed.getClass();
        socialRadarCharacteristicWriteFailed.bitField0_ |= 4;
        socialRadarCharacteristicWriteFailed.deviceType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12632p(SocialRadarCharacteristicWriteFailed socialRadarCharacteristicWriteFailed, String str) {
        socialRadarCharacteristicWriteFailed.getClass();
        str.getClass();
        socialRadarCharacteristicWriteFailed.bitField0_ |= 1;
        socialRadarCharacteristicWriteFailed.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static vj31 m12633q() {
        return (vj31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "reason_", "characteristicUuid_", "deviceType_"});
        }
        if (iOrdinal == 3) {
            return new SocialRadarCharacteristicWriteFailed();
        }
        if (iOrdinal == 4) {
            return new vj31(DEFAULT_INSTANCE);
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
        synchronized (SocialRadarCharacteristicWriteFailed.class) {
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
