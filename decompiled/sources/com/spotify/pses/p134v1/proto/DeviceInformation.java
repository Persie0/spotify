package com.spotify.pses.p134v1.proto;

import android.os.Build;
import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y6r;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceInformation extends AbstractC0269h implements sre0 {
    public static final int BRAND_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    public static final int DATE_TIME_FIELD_NUMBER = 6;
    private static final DeviceInformation DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RAM_FIELD_NUMBER = 4;
    private int ram_;
    private String osVersion_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String connectionType_ = "";
    private String dateTime_ = "";

    static {
        DeviceInformation deviceInformation = new DeviceInformation();
        DEFAULT_INSTANCE = deviceInformation;
        AbstractC0269h.registerDefaultInstance(DeviceInformation.class, deviceInformation);
    }

    private DeviceInformation() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19969n(DeviceInformation deviceInformation) {
        String str = Build.BRAND;
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.brand_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19970o(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        deviceInformation.connectionType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19971p(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.dateTime_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19972q(DeviceInformation deviceInformation) {
        String str = Build.MODEL;
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.model_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19973r(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.osVersion_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19974s(DeviceInformation deviceInformation, int i) {
        deviceInformation.ram_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static y6r m19975t() {
        return (y6r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"osVersion_", "brand_", "model_", "ram_", "connectionType_", "dateTime_"});
        }
        if (iOrdinal == 3) {
            return new DeviceInformation();
        }
        if (iOrdinal == 4) {
            return new y6r(DEFAULT_INSTANCE);
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
        synchronized (DeviceInformation.class) {
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
