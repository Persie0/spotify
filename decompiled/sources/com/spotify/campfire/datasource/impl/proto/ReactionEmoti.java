package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum ReactionEmoti implements od50 {
    REACTION_EMOTI_UNSPECIFIED(0),
    REACTION_EMOTI_THUMBS_UP(1),
    REACTION_EMOTI_HEART(2),
    REACTION_EMOTI_LAUGH(3),
    REACTION_EMOTI_PLEADING_FACE(7),
    REACTION_EMOTI_THUMBS_DOWN(8),
    REACTION_EMOTI_FIRE(9),
    REACTION_EMOTI_HEADPHONE(10),
    UNRECOGNIZED(-1);

    public static final int REACTION_EMOTI_FIRE_VALUE = 9;
    public static final int REACTION_EMOTI_HEADPHONE_VALUE = 10;
    public static final int REACTION_EMOTI_HEART_VALUE = 2;
    public static final int REACTION_EMOTI_LAUGH_VALUE = 3;
    public static final int REACTION_EMOTI_PLEADING_FACE_VALUE = 7;
    public static final int REACTION_EMOTI_THUMBS_DOWN_VALUE = 8;
    public static final int REACTION_EMOTI_THUMBS_UP_VALUE = 1;
    public static final int REACTION_EMOTI_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ReactionEmoti.1
        @Override // p204p.rd50
        public ReactionEmoti findValueByNumber(int i) {
            return ReactionEmoti.forNumber(i);
        }
    };
    private final int value;

    public static final class ReactionEmotiVerifier implements sd50 {
        static final sd50 INSTANCE = new ReactionEmotiVerifier();

        private ReactionEmotiVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return ReactionEmoti.forNumber(i) != null;
        }
    }

    ReactionEmoti(int i) {
        this.value = i;
    }

    public static ReactionEmoti forNumber(int i) {
        if (i == 0) {
            return REACTION_EMOTI_UNSPECIFIED;
        }
        if (i == 1) {
            return REACTION_EMOTI_THUMBS_UP;
        }
        if (i == 2) {
            return REACTION_EMOTI_HEART;
        }
        if (i == 3) {
            return REACTION_EMOTI_LAUGH;
        }
        switch (i) {
            case 7:
                return REACTION_EMOTI_PLEADING_FACE;
            case 8:
                return REACTION_EMOTI_THUMBS_DOWN;
            case 9:
                return REACTION_EMOTI_FIRE;
            case 10:
                return REACTION_EMOTI_HEADPHONE;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ReactionEmotiVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ReactionEmoti valueOf(int i) {
        return forNumber(i);
    }
}
