package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum CreateNewManagedAccountActionState implements od50 {
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED(0),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED(1),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC(2),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED(3),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE(4),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS(5),
    UNRECOGNIZED(-1);

    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;

    /* JADX INFO: renamed from: CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED_VALUE */
    public static final int f4980x76b16960 = 3;

    /* JADX INFO: renamed from: CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE_VALUE */
    public static final int f4981x81008d87 = 4;

    /* JADX INFO: renamed from: CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS_VALUE */
    public static final int f4983x47cd585e = 5;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.CreateNewManagedAccountActionState.1
        @Override // p204p.rd50
        public CreateNewManagedAccountActionState findValueByNumber(int i) {
            return CreateNewManagedAccountActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class CreateNewManagedAccountActionStateVerifier implements sd50 {
        static final sd50 INSTANCE = new CreateNewManagedAccountActionStateVerifier();

        private CreateNewManagedAccountActionStateVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return CreateNewManagedAccountActionState.forNumber(i) != null;
        }
    }

    CreateNewManagedAccountActionState(int i) {
        this.value = i;
    }

    public static CreateNewManagedAccountActionState forNumber(int i) {
        if (i == 0) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED;
        }
        if (i == 2) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC;
        }
        if (i == 3) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED;
        }
        if (i == 4) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE;
        }
        if (i != 5) {
            return null;
        }
        return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return CreateNewManagedAccountActionStateVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CreateNewManagedAccountActionState valueOf(int i) {
        return forNumber(i);
    }
}
