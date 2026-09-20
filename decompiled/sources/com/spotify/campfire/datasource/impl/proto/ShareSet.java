package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum ShareSet implements od50 {
    SHARE_SET_UNSPECIFIED(0),
    SHARE_SET_CHAT_VIEW(1),
    UNRECOGNIZED(-1);

    public static final int SHARE_SET_CHAT_VIEW_VALUE = 1;
    public static final int SHARE_SET_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ShareSet.1
        @Override // p204p.rd50
        public ShareSet findValueByNumber(int i) {
            return ShareSet.forNumber(i);
        }
    };
    private final int value;

    public static final class ShareSetVerifier implements sd50 {
        static final sd50 INSTANCE = new ShareSetVerifier();

        private ShareSetVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return ShareSet.forNumber(i) != null;
        }
    }

    ShareSet(int i) {
        this.value = i;
    }

    public static ShareSet forNumber(int i) {
        if (i == 0) {
            return SHARE_SET_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SHARE_SET_CHAT_VIEW;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ShareSetVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ShareSet valueOf(int i) {
        return forNumber(i);
    }
}
