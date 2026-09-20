package com.spotify.wear.wearabledatalayer.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qkd1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WearOSPairedDevice extends AbstractC0269h implements sre0 {
    private static final WearOSPairedDevice DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_WEAR_APP_INSTALLED_FIELD_NUMBER = 2;
    public static final int SPOTIFY_WEAR_APP_LOGGED_IN_FIELD_NUMBER = 4;
    public static final int WEARABLE_ID_FIELD_NUMBER = 1;
    public static final int WEARABLE_IS_NEARBY_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean spotifyWearAppInstalled_;
    private boolean spotifyWearAppLoggedIn_;
    private String wearableId_ = "";
    private boolean wearableIsNearby_;

    static {
        WearOSPairedDevice wearOSPairedDevice = new WearOSPairedDevice();
        DEFAULT_INSTANCE = wearOSPairedDevice;
        AbstractC0269h.registerDefaultInstance(WearOSPairedDevice.class, wearOSPairedDevice);
    }

    private WearOSPairedDevice() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23050n(WearOSPairedDevice wearOSPairedDevice, boolean z) {
        wearOSPairedDevice.bitField0_ |= 2;
        wearOSPairedDevice.spotifyWearAppInstalled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m23051o(WearOSPairedDevice wearOSPairedDevice, boolean z) {
        wearOSPairedDevice.bitField0_ |= 8;
        wearOSPairedDevice.spotifyWearAppLoggedIn_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m23052p(WearOSPairedDevice wearOSPairedDevice, String str) {
        wearOSPairedDevice.getClass();
        wearOSPairedDevice.bitField0_ |= 1;
        wearOSPairedDevice.wearableId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23053q(WearOSPairedDevice wearOSPairedDevice, boolean z) {
        wearOSPairedDevice.bitField0_ |= 4;
        wearOSPairedDevice.wearableIsNearby_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static qkd1 m23054r() {
        return (qkd1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "wearableId_", "spotifyWearAppInstalled_", "wearableIsNearby_", "spotifyWearAppLoggedIn_"});
        }
        if (iOrdinal == 3) {
            return new WearOSPairedDevice();
        }
        if (iOrdinal == 4) {
            return new qkd1(DEFAULT_INSTANCE);
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
        synchronized (WearOSPairedDevice.class) {
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
