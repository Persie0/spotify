package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum HierarchyType implements od50 {
    HIERARCHY_TYPE_UNSPECIFIED(0),
    HIERARCHY_TYPE_DM(1),
    HIERARCHY_TYPE_GROUP(2),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_TYPE_DM_VALUE = 1;
    public static final int HIERARCHY_TYPE_GROUP_VALUE = 2;
    public static final int HIERARCHY_TYPE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyType.1
        @Override // p204p.rd50
        public HierarchyType findValueByNumber(int i) {
            return HierarchyType.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyTypeVerifier implements sd50 {
        static final sd50 INSTANCE = new HierarchyTypeVerifier();

        private HierarchyTypeVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return HierarchyType.forNumber(i) != null;
        }
    }

    HierarchyType(int i) {
        this.value = i;
    }

    public static HierarchyType forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_TYPE_DM;
        }
        if (i != 2) {
            return null;
        }
        return HIERARCHY_TYPE_GROUP;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return HierarchyTypeVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HierarchyType valueOf(int i) {
        return forNumber(i);
    }
}
