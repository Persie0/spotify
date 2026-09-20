package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum GroupMemberStatus implements od50 {
    UNSPECIFIED(0),
    OPTED_OUT(1),
    PENDING(2),
    LEFT(3),
    UNRECOGNIZED(-1);

    public static final int LEFT_VALUE = 3;
    public static final int OPTED_OUT_VALUE = 1;
    public static final int PENDING_VALUE = 2;
    public static final int UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.GroupMemberStatus.1
        @Override // p204p.rd50
        public GroupMemberStatus findValueByNumber(int i) {
            return GroupMemberStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class GroupMemberStatusVerifier implements sd50 {
        static final sd50 INSTANCE = new GroupMemberStatusVerifier();

        private GroupMemberStatusVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return GroupMemberStatus.forNumber(i) != null;
        }
    }

    GroupMemberStatus(int i) {
        this.value = i;
    }

    public static GroupMemberStatus forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OPTED_OUT;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i != 3) {
            return null;
        }
        return LEFT;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return GroupMemberStatusVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static GroupMemberStatus valueOf(int i) {
        return forNumber(i);
    }
}
