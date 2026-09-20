package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum HierarchyUserRole implements od50 {
    HIERARCHY_USER_ROLE_UNSPECIFIED(0),
    HIERARCHY_USER_ROLE_MEMBER(1),
    HIERARCHY_USER_ROLE_ADMIN(2),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_USER_ROLE_ADMIN_VALUE = 2;
    public static final int HIERARCHY_USER_ROLE_MEMBER_VALUE = 1;
    public static final int HIERARCHY_USER_ROLE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyUserRole.1
        @Override // p204p.rd50
        public HierarchyUserRole findValueByNumber(int i) {
            return HierarchyUserRole.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyUserRoleVerifier implements sd50 {
        static final sd50 INSTANCE = new HierarchyUserRoleVerifier();

        private HierarchyUserRoleVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return HierarchyUserRole.forNumber(i) != null;
        }
    }

    HierarchyUserRole(int i) {
        this.value = i;
    }

    public static HierarchyUserRole forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_USER_ROLE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_USER_ROLE_MEMBER;
        }
        if (i != 2) {
            return null;
        }
        return HIERARCHY_USER_ROLE_ADMIN;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return HierarchyUserRoleVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HierarchyUserRole valueOf(int i) {
        return forNumber(i);
    }
}
