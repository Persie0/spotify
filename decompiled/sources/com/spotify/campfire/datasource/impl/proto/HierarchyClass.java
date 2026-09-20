package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum HierarchyClass implements od50 {
    HIERARCHY_CLASS_UNSPECIFIED(0),
    HIERARCHY_CLASS_CHANNEL(1),
    HIERARCHY_CLASS_MEMBER(2),
    HIERARCHY_CLASS_ANNOTATION(3),
    HIERARCHY_CLASS_AGENT(4),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_CLASS_AGENT_VALUE = 4;
    public static final int HIERARCHY_CLASS_ANNOTATION_VALUE = 3;
    public static final int HIERARCHY_CLASS_CHANNEL_VALUE = 1;
    public static final int HIERARCHY_CLASS_MEMBER_VALUE = 2;
    public static final int HIERARCHY_CLASS_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyClass.1
        @Override // p204p.rd50
        public HierarchyClass findValueByNumber(int i) {
            return HierarchyClass.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyClassVerifier implements sd50 {
        static final sd50 INSTANCE = new HierarchyClassVerifier();

        private HierarchyClassVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return HierarchyClass.forNumber(i) != null;
        }
    }

    HierarchyClass(int i) {
        this.value = i;
    }

    public static HierarchyClass forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_CLASS_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_CLASS_CHANNEL;
        }
        if (i == 2) {
            return HIERARCHY_CLASS_MEMBER;
        }
        if (i == 3) {
            return HIERARCHY_CLASS_ANNOTATION;
        }
        if (i != 4) {
            return null;
        }
        return HIERARCHY_CLASS_AGENT;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return HierarchyClassVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HierarchyClass valueOf(int i) {
        return forNumber(i);
    }
}
