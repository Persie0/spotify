package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes.dex */
public enum SortOrder implements od50 {
    SORT_ORDER_UNSPECIFIED(0),
    SORT_ORDER_ASCENDING_OCCURRED_AT(1),
    SORT_ORDER_DESCENDING_OCCURRED_AT(2),
    UNRECOGNIZED(-1);

    public static final int SORT_ORDER_ASCENDING_OCCURRED_AT_VALUE = 1;
    public static final int SORT_ORDER_DESCENDING_OCCURRED_AT_VALUE = 2;
    public static final int SORT_ORDER_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.SortOrder.1
        @Override // p204p.rd50
        public SortOrder findValueByNumber(int i) {
            return SortOrder.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class SortOrderVerifier implements sd50 {
        static final sd50 INSTANCE = new SortOrderVerifier();

        private SortOrderVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return SortOrder.forNumber(i) != null;
        }
    }

    SortOrder(int i) {
        this.value = i;
    }

    public static SortOrder forNumber(int i) {
        if (i == 0) {
            return SORT_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return SORT_ORDER_ASCENDING_OCCURRED_AT;
        }
        if (i != 2) {
            return null;
        }
        return SORT_ORDER_DESCENDING_OCCURRED_AT;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return SortOrderVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SortOrder valueOf(int i) {
        return forNumber(i);
    }
}
