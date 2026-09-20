package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum PayloadFormat implements od50 {
    PAYLOAD_FORMAT_UNSPECIFIED(0),
    PAYLOAD_FORMAT_PROTO(1),
    PAYLOAD_FORMAT_JSON(2),
    UNRECOGNIZED(-1);

    public static final int PAYLOAD_FORMAT_JSON_VALUE = 2;
    public static final int PAYLOAD_FORMAT_PROTO_VALUE = 1;
    public static final int PAYLOAD_FORMAT_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.PayloadFormat.1
        @Override // p204p.rd50
        public PayloadFormat findValueByNumber(int i) {
            return PayloadFormat.forNumber(i);
        }
    };
    private final int value;

    public static final class PayloadFormatVerifier implements sd50 {
        static final sd50 INSTANCE = new PayloadFormatVerifier();

        private PayloadFormatVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return PayloadFormat.forNumber(i) != null;
        }
    }

    PayloadFormat(int i) {
        this.value = i;
    }

    public static PayloadFormat forNumber(int i) {
        if (i == 0) {
            return PAYLOAD_FORMAT_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYLOAD_FORMAT_PROTO;
        }
        if (i != 2) {
            return null;
        }
        return PAYLOAD_FORMAT_JSON;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return PayloadFormatVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PayloadFormat valueOf(int i) {
        return forNumber(i);
    }
}
