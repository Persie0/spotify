package com.spotify.p060dj.interactionmanager.p061v0;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes6.dex */
public enum Model implements od50 {
    MODEL_UNSPECIFIED(0),
    GPT_4O(1),
    GPT_41(2),
    GPT_4O_MINI(3),
    O4_MINI(4),
    GPT_41_MINI(5),
    GPT_41_NANO(6),
    GPT_5(7),
    GPT_5_MINI(8),
    GPT_5_NANO(9),
    GPT_35_TURBO(10),
    PRISM_V2_8B(11),
    PRISM_V2_8B_QUANTIZED(12),
    PRISM_V3_1B(13),
    UNRECOGNIZED(-1);

    public static final int GPT_35_TURBO_VALUE = 10;
    public static final int GPT_41_MINI_VALUE = 5;
    public static final int GPT_41_NANO_VALUE = 6;
    public static final int GPT_41_VALUE = 2;
    public static final int GPT_4O_MINI_VALUE = 3;
    public static final int GPT_4O_VALUE = 1;
    public static final int GPT_5_MINI_VALUE = 8;
    public static final int GPT_5_NANO_VALUE = 9;
    public static final int GPT_5_VALUE = 7;
    public static final int MODEL_UNSPECIFIED_VALUE = 0;
    public static final int O4_MINI_VALUE = 4;
    public static final int PRISM_V2_8B_QUANTIZED_VALUE = 12;
    public static final int PRISM_V2_8B_VALUE = 11;
    public static final int PRISM_V3_1B_VALUE = 13;
    private static final rd50 internalValueMap = new C06981();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.Model$1 */
    public class C06981 implements rd50 {
        @Override // p204p.rd50
        public final Model findValueByNumber(int i) {
            return Model.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return Model.forNumber(i);
        }
    }

    public static final class ModelVerifier implements sd50 {
        static final sd50 INSTANCE = new ModelVerifier();

        private ModelVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return Model.forNumber(i) != null;
        }
    }

    Model(int i) {
        this.value = i;
    }

    public static Model forNumber(int i) {
        switch (i) {
            case 0:
                return MODEL_UNSPECIFIED;
            case 1:
                return GPT_4O;
            case 2:
                return GPT_41;
            case 3:
                return GPT_4O_MINI;
            case 4:
                return O4_MINI;
            case 5:
                return GPT_41_MINI;
            case 6:
                return GPT_41_NANO;
            case 7:
                return GPT_5;
            case 8:
                return GPT_5_MINI;
            case 9:
                return GPT_5_NANO;
            case 10:
                return GPT_35_TURBO;
            case 11:
                return PRISM_V2_8B;
            case 12:
                return PRISM_V2_8B_QUANTIZED;
            case 13:
                return PRISM_V3_1B;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ModelVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Model valueOf(int i) {
        return forNumber(i);
    }
}
