package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum HierarchySource implements od50 {
    HIERARCHY_SOURCE_UNSPECIFIED(0),
    HIERARCHY_SOURCE_IN_APP_SHARE(1),
    HIERARCHY_SOURCE_OFF_PLATFORM_SHARE(2),
    HIERARCHY_SOURCE_CHAT_INVITE(3),
    HIERARCHY_SOURCE_USER_CREATED(4),
    HIERARCHY_SOURCE_FRIEND_REQUEST(5),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_SOURCE_CHAT_INVITE_VALUE = 3;
    public static final int HIERARCHY_SOURCE_FRIEND_REQUEST_VALUE = 5;
    public static final int HIERARCHY_SOURCE_IN_APP_SHARE_VALUE = 1;
    public static final int HIERARCHY_SOURCE_OFF_PLATFORM_SHARE_VALUE = 2;
    public static final int HIERARCHY_SOURCE_UNSPECIFIED_VALUE = 0;
    public static final int HIERARCHY_SOURCE_USER_CREATED_VALUE = 4;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchySource.1
        @Override // p204p.rd50
        public HierarchySource findValueByNumber(int i) {
            return HierarchySource.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchySourceVerifier implements sd50 {
        static final sd50 INSTANCE = new HierarchySourceVerifier();

        private HierarchySourceVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return HierarchySource.forNumber(i) != null;
        }
    }

    HierarchySource(int i) {
        this.value = i;
    }

    public static HierarchySource forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_SOURCE_IN_APP_SHARE;
        }
        if (i == 2) {
            return HIERARCHY_SOURCE_OFF_PLATFORM_SHARE;
        }
        if (i == 3) {
            return HIERARCHY_SOURCE_CHAT_INVITE;
        }
        if (i == 4) {
            return HIERARCHY_SOURCE_USER_CREATED;
        }
        if (i != 5) {
            return null;
        }
        return HIERARCHY_SOURCE_FRIEND_REQUEST;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return HierarchySourceVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HierarchySource valueOf(int i) {
        return forNumber(i);
    }
}
