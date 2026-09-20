package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.f9t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PuffinHeadphonesOptimized extends AbstractC0269h implements sre0 {
    private static final PuffinHeadphonesOptimized DEFAULT_INSTANCE;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_BRAND_FIELD_NUMBER = 6;
    public static final int EXTERNAL_ACCESSORY_MAPPING_PREDICTED_MODEL_FIELD_NUMBER = 7;
    public static final int FILTER_BRAND_FIELD_NUMBER = 2;
    public static final int FILTER_MODEL_FIELD_NUMBER = 3;
    public static final int HAS_TUNER_FIELD_NUMBER = 1;
    public static final int HEADPHONE_NAME_OVER_BLUETOOTH_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int WAS_AMBIGUOUS_FIELD_NUMBER = 9;
    public static final int WAS_MANUALLY_SELECTED_FIELD_NUMBER = 10;
    public static final int WAS_MATCHED_FIELD_NUMBER = 8;
    public static final int WAS_PREDICTED_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasTuner_;
    private boolean wasAmbiguous_;
    private boolean wasManuallySelected_;
    private boolean wasMatched_;
    private boolean wasPredicted_;
    private String filterBrand_ = "";
    private String filterModel_ = "";
    private String headphoneNameOverBluetooth_ = "";
    private String externalAccessoryMappingPredictedBrand_ = "";
    private String externalAccessoryMappingPredictedModel_ = "";

    static {
        PuffinHeadphonesOptimized puffinHeadphonesOptimized = new PuffinHeadphonesOptimized();
        DEFAULT_INSTANCE = puffinHeadphonesOptimized;
        AbstractC0269h.registerDefaultInstance(PuffinHeadphonesOptimized.class, puffinHeadphonesOptimized);
    }

    private PuffinHeadphonesOptimized() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14362n(PuffinHeadphonesOptimized puffinHeadphonesOptimized, String str) {
        puffinHeadphonesOptimized.getClass();
        str.getClass();
        puffinHeadphonesOptimized.bitField0_ |= 32;
        puffinHeadphonesOptimized.externalAccessoryMappingPredictedBrand_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14363o(PuffinHeadphonesOptimized puffinHeadphonesOptimized, String str) {
        puffinHeadphonesOptimized.getClass();
        str.getClass();
        puffinHeadphonesOptimized.bitField0_ |= 64;
        puffinHeadphonesOptimized.externalAccessoryMappingPredictedModel_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14364p(PuffinHeadphonesOptimized puffinHeadphonesOptimized, String str) {
        puffinHeadphonesOptimized.getClass();
        str.getClass();
        puffinHeadphonesOptimized.bitField0_ |= 2;
        puffinHeadphonesOptimized.filterBrand_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14365q(PuffinHeadphonesOptimized puffinHeadphonesOptimized, String str) {
        puffinHeadphonesOptimized.getClass();
        str.getClass();
        puffinHeadphonesOptimized.bitField0_ |= 4;
        puffinHeadphonesOptimized.filterModel_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14366r(PuffinHeadphonesOptimized puffinHeadphonesOptimized, boolean z) {
        puffinHeadphonesOptimized.bitField0_ |= 1;
        puffinHeadphonesOptimized.hasTuner_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m14367s(PuffinHeadphonesOptimized puffinHeadphonesOptimized, String str) {
        puffinHeadphonesOptimized.getClass();
        str.getClass();
        puffinHeadphonesOptimized.bitField0_ |= 16;
        puffinHeadphonesOptimized.headphoneNameOverBluetooth_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14368t(PuffinHeadphonesOptimized puffinHeadphonesOptimized, boolean z) {
        puffinHeadphonesOptimized.bitField0_ |= 256;
        puffinHeadphonesOptimized.wasAmbiguous_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m14369u(PuffinHeadphonesOptimized puffinHeadphonesOptimized, boolean z) {
        puffinHeadphonesOptimized.bitField0_ |= 512;
        puffinHeadphonesOptimized.wasManuallySelected_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m14370v(PuffinHeadphonesOptimized puffinHeadphonesOptimized, boolean z) {
        puffinHeadphonesOptimized.bitField0_ |= 128;
        puffinHeadphonesOptimized.wasMatched_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m14371w(PuffinHeadphonesOptimized puffinHeadphonesOptimized, boolean z) {
        puffinHeadphonesOptimized.bitField0_ |= 8;
        puffinHeadphonesOptimized.wasPredicted_ = z;
    }

    /* JADX INFO: renamed from: x */
    public static f9t0 m14372x() {
        return (f9t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "hasTuner_", "filterBrand_", "filterModel_", "wasPredicted_", "headphoneNameOverBluetooth_", "externalAccessoryMappingPredictedBrand_", "externalAccessoryMappingPredictedModel_", "wasMatched_", "wasAmbiguous_", "wasManuallySelected_"});
        }
        if (iOrdinal == 3) {
            return new PuffinHeadphonesOptimized();
        }
        if (iOrdinal == 4) {
            return new f9t0(DEFAULT_INSTANCE);
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
        synchronized (PuffinHeadphonesOptimized.class) {
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
