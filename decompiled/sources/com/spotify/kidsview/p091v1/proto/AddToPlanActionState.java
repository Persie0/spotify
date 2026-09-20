package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum AddToPlanActionState implements od50 {
    ADD_TO_PLAN_ACTION_STATE_UNSPECIFIED(0),
    ADD_TO_PLAN_ACTION_STATE_ENABLED(1),
    ADD_TO_PLAN_ACTION_STATE_DISABLED_GENERIC(2),
    ADD_TO_PLAN_ACTION_STATE_DISABLED_PLAN_IS_FULL(3),
    ADD_TO_PLAN_ACTION_STATE_DISABLED_NO_ADDRESS(4),
    UNRECOGNIZED(-1);

    public static final int ADD_TO_PLAN_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int ADD_TO_PLAN_ACTION_STATE_DISABLED_NO_ADDRESS_VALUE = 4;
    public static final int ADD_TO_PLAN_ACTION_STATE_DISABLED_PLAN_IS_FULL_VALUE = 3;
    public static final int ADD_TO_PLAN_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int ADD_TO_PLAN_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.AddToPlanActionState.1
        @Override // p204p.rd50
        public AddToPlanActionState findValueByNumber(int i) {
            return AddToPlanActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class AddToPlanActionStateVerifier implements sd50 {
        static final sd50 INSTANCE = new AddToPlanActionStateVerifier();

        private AddToPlanActionStateVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return AddToPlanActionState.forNumber(i) != null;
        }
    }

    AddToPlanActionState(int i) {
        this.value = i;
    }

    public static AddToPlanActionState forNumber(int i) {
        if (i == 0) {
            return ADD_TO_PLAN_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADD_TO_PLAN_ACTION_STATE_ENABLED;
        }
        if (i == 2) {
            return ADD_TO_PLAN_ACTION_STATE_DISABLED_GENERIC;
        }
        if (i == 3) {
            return ADD_TO_PLAN_ACTION_STATE_DISABLED_PLAN_IS_FULL;
        }
        if (i != 4) {
            return null;
        }
        return ADD_TO_PLAN_ACTION_STATE_DISABLED_NO_ADDRESS;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return AddToPlanActionStateVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AddToPlanActionState valueOf(int i) {
        return forNumber(i);
    }
}
