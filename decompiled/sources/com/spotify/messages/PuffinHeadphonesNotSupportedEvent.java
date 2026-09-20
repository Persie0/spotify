package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.e9t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PuffinHeadphonesNotSupportedEvent extends AbstractC0269h implements sre0 {
    private static final PuffinHeadphonesNotSupportedEvent DEFAULT_INSTANCE;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_BRAND_FIELD_NUMBER = 2;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_MODEL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VENDOR_NAME_FIELD_NUMBER = 4;
    public static final int WAS_PREDICTED_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean wasPredicted_;
    private String name_ = "";
    private String externalAccessoryMappingPredictedBrand_ = "";
    private String externalAccessoryMappingPredictedModel_ = "";
    private String vendorName_ = "";

    static {
        PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent = new PuffinHeadphonesNotSupportedEvent();
        DEFAULT_INSTANCE = puffinHeadphonesNotSupportedEvent;
        AbstractC0269h.registerDefaultInstance(PuffinHeadphonesNotSupportedEvent.class, puffinHeadphonesNotSupportedEvent);
    }

    private PuffinHeadphonesNotSupportedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14357n(PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent, String str) {
        puffinHeadphonesNotSupportedEvent.getClass();
        str.getClass();
        puffinHeadphonesNotSupportedEvent.bitField0_ |= 2;
        puffinHeadphonesNotSupportedEvent.externalAccessoryMappingPredictedBrand_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14358o(PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent, String str) {
        puffinHeadphonesNotSupportedEvent.getClass();
        str.getClass();
        puffinHeadphonesNotSupportedEvent.bitField0_ |= 4;
        puffinHeadphonesNotSupportedEvent.externalAccessoryMappingPredictedModel_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14359p(PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent, String str) {
        puffinHeadphonesNotSupportedEvent.getClass();
        str.getClass();
        puffinHeadphonesNotSupportedEvent.bitField0_ |= 1;
        puffinHeadphonesNotSupportedEvent.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14360q(PuffinHeadphonesNotSupportedEvent puffinHeadphonesNotSupportedEvent, boolean z) {
        puffinHeadphonesNotSupportedEvent.bitField0_ |= 16;
        puffinHeadphonesNotSupportedEvent.wasPredicted_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static e9t0 m14361r() {
        return (e9t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "name_", "externalAccessoryMappingPredictedBrand_", "externalAccessoryMappingPredictedModel_", "vendorName_", "wasPredicted_"});
        }
        if (iOrdinal == 3) {
            return new PuffinHeadphonesNotSupportedEvent();
        }
        if (iOrdinal == 4) {
            return new e9t0(DEFAULT_INSTANCE);
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
        synchronized (PuffinHeadphonesNotSupportedEvent.class) {
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
