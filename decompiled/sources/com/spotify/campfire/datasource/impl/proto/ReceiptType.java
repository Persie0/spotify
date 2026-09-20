package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum ReceiptType implements od50 {
    RECEIPT_TYPE_UNDEFINED(0),
    RECEIPT_TYPE_PLAYED(1),
    RECEIPT_TYPE_SAVED(2),
    RECEIPT_TYPE_SEEN(3),
    UNRECOGNIZED(-1);

    public static final int RECEIPT_TYPE_PLAYED_VALUE = 1;
    public static final int RECEIPT_TYPE_SAVED_VALUE = 2;
    public static final int RECEIPT_TYPE_SEEN_VALUE = 3;
    public static final int RECEIPT_TYPE_UNDEFINED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ReceiptType.1
        @Override // p204p.rd50
        public ReceiptType findValueByNumber(int i) {
            return ReceiptType.forNumber(i);
        }
    };
    private final int value;

    public static final class ReceiptTypeVerifier implements sd50 {
        static final sd50 INSTANCE = new ReceiptTypeVerifier();

        private ReceiptTypeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return ReceiptType.forNumber(i) != null;
        }
    }

    ReceiptType(int i) {
        this.value = i;
    }

    public static ReceiptType forNumber(int i) {
        if (i == 0) {
            return RECEIPT_TYPE_UNDEFINED;
        }
        if (i == 1) {
            return RECEIPT_TYPE_PLAYED;
        }
        if (i == 2) {
            return RECEIPT_TYPE_SAVED;
        }
        if (i != 3) {
            return null;
        }
        return RECEIPT_TYPE_SEEN;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ReceiptTypeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ReceiptType valueOf(int i) {
        return forNumber(i);
    }
}
