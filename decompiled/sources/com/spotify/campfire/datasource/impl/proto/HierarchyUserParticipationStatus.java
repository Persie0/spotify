package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum HierarchyUserParticipationStatus implements od50 {
    HIERARCHY_USER_PARTICIPATION_STATUS_UNSPECIFIED(0),
    HIERARCHY_USER_PARTICIPATION_STATUS_INITIATOR(1),
    HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED(2),
    HIERARCHY_USER_PARTICIPATION_STATUS_PENDING(3),
    HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED(4),
    HIERARCHY_USER_PARTICIPATION_STATUS_BLOCKED(5),
    HIERARCHY_USER_PARTICIPATION_STATUS_DELETED(6),
    HIERARCHY_USER_PARTICIPATION_STATUS_LEFT(7),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED_VALUE = 2;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_BLOCKED_VALUE = 5;

    @Deprecated
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_DELETED_VALUE = 6;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_INITIATOR_VALUE = 1;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_LEFT_VALUE = 7;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_PENDING_VALUE = 3;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED_VALUE = 4;
    public static final int HIERARCHY_USER_PARTICIPATION_STATUS_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus.1
        @Override // p204p.rd50
        public HierarchyUserParticipationStatus findValueByNumber(int i) {
            return HierarchyUserParticipationStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyUserParticipationStatusVerifier implements sd50 {
        static final sd50 INSTANCE = new HierarchyUserParticipationStatusVerifier();

        private HierarchyUserParticipationStatusVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return HierarchyUserParticipationStatus.forNumber(i) != null;
        }
    }

    HierarchyUserParticipationStatus(int i) {
        this.value = i;
    }

    public static HierarchyUserParticipationStatus forNumber(int i) {
        switch (i) {
            case 0:
                return HIERARCHY_USER_PARTICIPATION_STATUS_UNSPECIFIED;
            case 1:
                return HIERARCHY_USER_PARTICIPATION_STATUS_INITIATOR;
            case 2:
                return HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED;
            case 3:
                return HIERARCHY_USER_PARTICIPATION_STATUS_PENDING;
            case 4:
                return HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED;
            case 5:
                return HIERARCHY_USER_PARTICIPATION_STATUS_BLOCKED;
            case 6:
                return HIERARCHY_USER_PARTICIPATION_STATUS_DELETED;
            case 7:
                return HIERARCHY_USER_PARTICIPATION_STATUS_LEFT;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return HierarchyUserParticipationStatusVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HierarchyUserParticipationStatus valueOf(int i) {
        return forNumber(i);
    }
}
