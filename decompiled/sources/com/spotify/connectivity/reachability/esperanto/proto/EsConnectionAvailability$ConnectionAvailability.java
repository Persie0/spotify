package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yiw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsConnectionAvailability$ConnectionAvailability extends AbstractC0269h implements sre0 {
    private static final EsConnectionAvailability$ConnectionAvailability DEFAULT_INSTANCE;
    public static final int IS_CELLULAR_ENABLED_FIELD_NUMBER = 1;
    public static final int IS_WIFI_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean isCellularEnabled_;
    private boolean isWifiEnabled_;

    static {
        EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability = new EsConnectionAvailability$ConnectionAvailability();
        DEFAULT_INSTANCE = esConnectionAvailability$ConnectionAvailability;
        AbstractC0269h.registerDefaultInstance(EsConnectionAvailability$ConnectionAvailability.class, esConnectionAvailability$ConnectionAvailability);
    }

    private EsConnectionAvailability$ConnectionAvailability() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7549n(EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability, boolean z) {
        esConnectionAvailability$ConnectionAvailability.isCellularEnabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m7550o(EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability, boolean z) {
        esConnectionAvailability$ConnectionAvailability.isWifiEnabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsConnectionAvailability$ConnectionAvailability m7552q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static yiw m7553t() {
        return (yiw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isCellularEnabled_", "isWifiEnabled_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionAvailability$ConnectionAvailability();
        }
        if (iOrdinal == 4) {
            return new yiw();
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
        synchronized (EsConnectionAvailability$ConnectionAvailability.class) {
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

    /* JADX INFO: renamed from: r */
    public final boolean m7554r() {
        return this.isCellularEnabled_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7555s() {
        return this.isWifiEnabled_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
