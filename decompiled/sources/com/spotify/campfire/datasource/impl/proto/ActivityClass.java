package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum ActivityClass implements od50 {
    ACTIVITY_CLASS_UNSPECIFIED(0),
    ACTIVITY_CLASS_REACTION(1),
    ACTIVITY_CLASS_RECEIPT(2),
    ACTIVITY_CLASS_ACK(3),
    UNRECOGNIZED(-1);

    public static final int ACTIVITY_CLASS_ACK_VALUE = 3;
    public static final int ACTIVITY_CLASS_REACTION_VALUE = 1;
    public static final int ACTIVITY_CLASS_RECEIPT_VALUE = 2;
    public static final int ACTIVITY_CLASS_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ActivityClass.1
        @Override // p204p.rd50
        public ActivityClass findValueByNumber(int i) {
            return ActivityClass.forNumber(i);
        }
    };
    private final int value;

    public static final class ActivityClassVerifier implements sd50 {
        static final sd50 INSTANCE = new ActivityClassVerifier();

        private ActivityClassVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return ActivityClass.forNumber(i) != null;
        }
    }

    ActivityClass(int i) {
        this.value = i;
    }

    public static ActivityClass forNumber(int i) {
        if (i == 0) {
            return ACTIVITY_CLASS_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTIVITY_CLASS_REACTION;
        }
        if (i == 2) {
            return ACTIVITY_CLASS_RECEIPT;
        }
        if (i != 3) {
            return null;
        }
        return ACTIVITY_CLASS_ACK;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ActivityClassVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ActivityClass valueOf(int i) {
        return forNumber(i);
    }
}
