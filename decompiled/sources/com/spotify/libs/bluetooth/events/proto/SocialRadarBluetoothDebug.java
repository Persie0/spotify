package com.spotify.libs.bluetooth.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uj31;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialRadarBluetoothDebug extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ADDITIONAL_INFO_FIELD_NUMBER = 6;
    public static final int CONNECTION_ID_HASH_FIELD_NUMBER = 1;
    private static final SocialRadarBluetoothDebug DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int RSSI_FIELD_NUMBER = 3;
    private int bitField0_;
    private int rssi_;
    private String connectionIdHash_ = "";
    private String action_ = "";
    private String range_ = "";
    private String error_ = "";
    private String additionalInfo_ = "";

    static {
        SocialRadarBluetoothDebug socialRadarBluetoothDebug = new SocialRadarBluetoothDebug();
        DEFAULT_INSTANCE = socialRadarBluetoothDebug;
        AbstractC0269h.registerDefaultInstance(SocialRadarBluetoothDebug.class, socialRadarBluetoothDebug);
    }

    private SocialRadarBluetoothDebug() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12623n(SocialRadarBluetoothDebug socialRadarBluetoothDebug, String str) {
        socialRadarBluetoothDebug.getClass();
        socialRadarBluetoothDebug.bitField0_ |= 2;
        socialRadarBluetoothDebug.action_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12624o(SocialRadarBluetoothDebug socialRadarBluetoothDebug, String str) {
        socialRadarBluetoothDebug.getClass();
        socialRadarBluetoothDebug.bitField0_ |= 32;
        socialRadarBluetoothDebug.additionalInfo_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12625p(SocialRadarBluetoothDebug socialRadarBluetoothDebug, String str) {
        socialRadarBluetoothDebug.getClass();
        str.getClass();
        socialRadarBluetoothDebug.bitField0_ |= 1;
        socialRadarBluetoothDebug.connectionIdHash_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12626q(SocialRadarBluetoothDebug socialRadarBluetoothDebug, String str) {
        socialRadarBluetoothDebug.getClass();
        socialRadarBluetoothDebug.bitField0_ |= 16;
        socialRadarBluetoothDebug.error_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12627r(SocialRadarBluetoothDebug socialRadarBluetoothDebug, String str) {
        socialRadarBluetoothDebug.getClass();
        socialRadarBluetoothDebug.bitField0_ |= 8;
        socialRadarBluetoothDebug.range_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12628s(SocialRadarBluetoothDebug socialRadarBluetoothDebug, int i) {
        socialRadarBluetoothDebug.bitField0_ |= 4;
        socialRadarBluetoothDebug.rssi_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static uj31 m12629t() {
        return (uj31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "connectionIdHash_", "action_", "rssi_", "range_", "error_", "additionalInfo_"});
        }
        if (iOrdinal == 3) {
            return new SocialRadarBluetoothDebug();
        }
        if (iOrdinal == 4) {
            return new uj31(DEFAULT_INSTANCE);
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
        synchronized (SocialRadarBluetoothDebug.class) {
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
