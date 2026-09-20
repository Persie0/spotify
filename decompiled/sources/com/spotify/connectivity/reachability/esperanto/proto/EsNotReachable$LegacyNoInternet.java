package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tlw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsNotReachable$LegacyNoInternet extends AbstractC0269h implements sre0 {
    private static final EsNotReachable$LegacyNoInternet DEFAULT_INSTANCE;
    public static final int MOBILE_DATA_DISABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int WIFI_DISABLED_FIELD_NUMBER = 1;
    private boolean mobileDataDisabled_;
    private boolean wifiDisabled_;

    static {
        EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet = new EsNotReachable$LegacyNoInternet();
        DEFAULT_INSTANCE = esNotReachable$LegacyNoInternet;
        AbstractC0269h.registerDefaultInstance(EsNotReachable$LegacyNoInternet.class, esNotReachable$LegacyNoInternet);
    }

    private EsNotReachable$LegacyNoInternet() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7574n(EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet, boolean z) {
        esNotReachable$LegacyNoInternet.mobileDataDisabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m7575o(EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet, boolean z) {
        esNotReachable$LegacyNoInternet.wifiDisabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static tlw m7576p() {
        return (tlw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"wifiDisabled_", "mobileDataDisabled_"});
        }
        if (iOrdinal == 3) {
            return new EsNotReachable$LegacyNoInternet();
        }
        if (iOrdinal == 4) {
            return new tlw(DEFAULT_INSTANCE);
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
        synchronized (EsNotReachable$LegacyNoInternet.class) {
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
