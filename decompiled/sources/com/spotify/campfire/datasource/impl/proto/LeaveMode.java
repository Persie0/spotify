package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum LeaveMode implements od50 {
    LEAVE_MODE_UNSPECIFIED(0),
    READ_ONLY(1),
    DELETE(2),
    UNRECOGNIZED(-1);

    public static final int DELETE_VALUE = 2;
    public static final int LEAVE_MODE_UNSPECIFIED_VALUE = 0;
    public static final int READ_ONLY_VALUE = 1;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.LeaveMode.1
        @Override // p204p.rd50
        public LeaveMode findValueByNumber(int i) {
            return LeaveMode.forNumber(i);
        }
    };
    private final int value;

    public static final class LeaveModeVerifier implements sd50 {
        static final sd50 INSTANCE = new LeaveModeVerifier();

        private LeaveModeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return LeaveMode.forNumber(i) != null;
        }
    }

    LeaveMode(int i) {
        this.value = i;
    }

    public static LeaveMode forNumber(int i) {
        if (i == 0) {
            return LEAVE_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return READ_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return DELETE;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return LeaveModeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LeaveMode valueOf(int i) {
        return forNumber(i);
    }
}
