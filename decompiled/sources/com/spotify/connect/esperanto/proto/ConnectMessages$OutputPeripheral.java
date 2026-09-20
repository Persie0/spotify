package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gti;
import p204p.hti;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$OutputPeripheral extends AbstractC0269h implements sre0 {
    public static final int BRAND_FIELD_NUMBER = 2;
    public static final int CATEGORY_FIELD_NUMBER = 4;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    private static final ConnectMessages$OutputPeripheral DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int category_;
    private int connectionType_;
    private String name_ = "";
    private String brand_ = "";
    private String model_ = "";

    static {
        ConnectMessages$OutputPeripheral connectMessages$OutputPeripheral = new ConnectMessages$OutputPeripheral();
        DEFAULT_INSTANCE = connectMessages$OutputPeripheral;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$OutputPeripheral.class, connectMessages$OutputPeripheral);
    }

    private ConnectMessages$OutputPeripheral() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ConnectMessages$OutputPeripheral m7352q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "name_", "brand_", "model_", "category_", "connectionType_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$OutputPeripheral();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 20);
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
        synchronized (ConnectMessages$OutputPeripheral.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final String m7353n() {
        return this.brand_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final gti m7354o() {
        gti gtiVar;
        switch (this.category_) {
            case 0:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_UNKNOWN;
                break;
            case 1:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_CAR;
                break;
            case 2:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_HEADPHONES;
                break;
            case 3:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_SPEAKER;
                break;
            case 4:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_WEARABLE;
                break;
            case 5:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_GLASSES;
                break;
            case 6:
                gtiVar = gti.OUTPUT_PERIPHERAL_CATEGORY_APP;
                break;
            default:
                gtiVar = null;
                break;
        }
        return gtiVar == null ? gti.UNRECOGNIZED : gtiVar;
    }

    /* JADX INFO: renamed from: p */
    public final hti m7355p() {
        hti htiVar;
        int i = this.connectionType_;
        if (i == 0) {
            htiVar = hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_UNKNOWN;
        } else if (i == 1) {
            htiVar = hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_WIRED;
        } else if (i == 2) {
            htiVar = hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_CAR_PROJECTED;
        } else if (i == 3) {
            htiVar = hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_BLUETOOTH;
        } else if (i != 4) {
            htiVar = i != 5 ? null : hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_BUILT_IN_SPEAKER;
        } else {
            htiVar = hti.OUTPUT_PERIPHERAL_CONNECTION_TYPE_AIRPLAY;
        }
        return htiVar == null ? hti.UNRECOGNIZED : htiVar;
    }

    /* JADX INFO: renamed from: r */
    public final String m7356r() {
        return this.model_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7357s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7358t() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7359u() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7360v() {
        return (this.bitField0_ & 4) != 0;
    }
}
