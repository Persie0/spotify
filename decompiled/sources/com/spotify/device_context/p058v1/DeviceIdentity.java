package com.spotify.device_context.p058v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.ubiquity.p167v1.ExternalAccessoryDescription;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q6r;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceIdentity extends AbstractC0269h implements sre0 {
    public static final int BRAND_FIELD_NUMBER = 5;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final DeviceIdentity DEFAULT_INSTANCE;
    public static final int DISPLAY_SPECS_FIELD_NUMBER = 9;
    public static final int EXTERNAL_ACCESSORY_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int MANUFACTURER_FIELD_NUMBER = 7;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int OS_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 4;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int VERSIONS_FIELD_NUMBER = 3;
    private int bitField0_;
    private DisplaySpecs displaySpecs_;
    private ExternalAccessoryDescription externalAccessoryDescription_;
    private String clientId_ = "";
    private String productId_ = "";
    private ae50 versions_ = AbstractC0269h.emptyProtobufList();
    private String platform_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String manufacturer_ = "";
    private String os_ = "";

    static {
        DeviceIdentity deviceIdentity = new DeviceIdentity();
        DEFAULT_INSTANCE = deviceIdentity;
        AbstractC0269h.registerDefaultInstance(DeviceIdentity.class, deviceIdentity);
    }

    private DeviceIdentity() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9215n(DeviceIdentity deviceIdentity, ExternalAccessoryDescription externalAccessoryDescription) {
        deviceIdentity.getClass();
        deviceIdentity.externalAccessoryDescription_ = externalAccessoryDescription;
        deviceIdentity.bitField0_ |= 256;
    }

    /* JADX INFO: renamed from: o */
    public static q6r m9216o() {
        return (q6r) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b\u0004ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ለ\u0005\bለ\u0006\tဉ\u0007\nဉ\b", new Object[]{"bitField0_", "clientId_", "productId_", "versions_", ComponentVersion.class, "platform_", "brand_", "model_", "manufacturer_", "os_", "displaySpecs_", "externalAccessoryDescription_"});
        }
        if (iOrdinal == 3) {
            return new DeviceIdentity();
        }
        if (iOrdinal == 4) {
            return new q6r(DEFAULT_INSTANCE);
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
        synchronized (DeviceIdentity.class) {
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
