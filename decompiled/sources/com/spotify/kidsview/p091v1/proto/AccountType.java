package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum AccountType implements od50 {
    ACCOUNT_TYPE_UNSPECIFIED(0),
    ACCOUNT_TYPE_PREMIUM_MANAGED(1),
    ACCOUNT_TYPE_FREE_MANAGED(2),
    ACCOUNT_TYPE_LEGACY_KIDS(3),
    ACCOUNT_TYPE_TEEN(4),
    UNRECOGNIZED(-1);

    public static final int ACCOUNT_TYPE_FREE_MANAGED_VALUE = 2;
    public static final int ACCOUNT_TYPE_LEGACY_KIDS_VALUE = 3;
    public static final int ACCOUNT_TYPE_PREMIUM_MANAGED_VALUE = 1;
    public static final int ACCOUNT_TYPE_TEEN_VALUE = 4;
    public static final int ACCOUNT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.AccountType.1
        @Override // p204p.rd50
        public AccountType findValueByNumber(int i) {
            return AccountType.forNumber(i);
        }
    };
    private final int value;

    public static final class AccountTypeVerifier implements sd50 {
        static final sd50 INSTANCE = new AccountTypeVerifier();

        private AccountTypeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return AccountType.forNumber(i) != null;
        }
    }

    AccountType(int i) {
        this.value = i;
    }

    public static AccountType forNumber(int i) {
        if (i == 0) {
            return ACCOUNT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ACCOUNT_TYPE_PREMIUM_MANAGED;
        }
        if (i == 2) {
            return ACCOUNT_TYPE_FREE_MANAGED;
        }
        if (i == 3) {
            return ACCOUNT_TYPE_LEGACY_KIDS;
        }
        if (i != 4) {
            return null;
        }
        return ACCOUNT_TYPE_TEEN;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return AccountTypeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AccountType valueOf(int i) {
        return forNumber(i);
    }
}
