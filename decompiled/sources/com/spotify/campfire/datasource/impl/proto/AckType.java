package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum AckType implements od50 {
    ACKTYPE_UNDEFINED(0),
    ACKTYPE_USER_SEEN(1),
    ACKTYPE_SYSTEM_PROCESSED(3),
    UNRECOGNIZED(-1);

    public static final int ACKTYPE_SYSTEM_PROCESSED_VALUE = 3;
    public static final int ACKTYPE_UNDEFINED_VALUE = 0;
    public static final int ACKTYPE_USER_SEEN_VALUE = 1;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.AckType.1
        @Override // p204p.rd50
        public AckType findValueByNumber(int i) {
            return AckType.forNumber(i);
        }
    };
    private final int value;

    public static final class AckTypeVerifier implements sd50 {
        static final sd50 INSTANCE = new AckTypeVerifier();

        private AckTypeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return AckType.forNumber(i) != null;
        }
    }

    AckType(int i) {
        this.value = i;
    }

    public static AckType forNumber(int i) {
        if (i == 0) {
            return ACKTYPE_UNDEFINED;
        }
        if (i == 1) {
            return ACKTYPE_USER_SEEN;
        }
        if (i != 3) {
            return null;
        }
        return ACKTYPE_SYSTEM_PROCESSED;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return AckTypeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AckType valueOf(int i) {
        return forNumber(i);
    }
}
