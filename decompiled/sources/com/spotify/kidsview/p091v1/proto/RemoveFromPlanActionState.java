package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum RemoveFromPlanActionState implements od50 {
    REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED(0),
    REMOVE_FROM_PLAN_ACTION_STATE_ENABLED(1),
    REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC(2),
    UNRECOGNIZED(-1);

    public static final int REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int REMOVE_FROM_PLAN_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.RemoveFromPlanActionState.1
        @Override // p204p.rd50
        public RemoveFromPlanActionState findValueByNumber(int i) {
            return RemoveFromPlanActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class RemoveFromPlanActionStateVerifier implements sd50 {
        static final sd50 INSTANCE = new RemoveFromPlanActionStateVerifier();

        private RemoveFromPlanActionStateVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return RemoveFromPlanActionState.forNumber(i) != null;
        }
    }

    RemoveFromPlanActionState(int i) {
        this.value = i;
    }

    public static RemoveFromPlanActionState forNumber(int i) {
        if (i == 0) {
            return REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return REMOVE_FROM_PLAN_ACTION_STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return RemoveFromPlanActionStateVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RemoveFromPlanActionState valueOf(int i) {
        return forNumber(i);
    }
}
