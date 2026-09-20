package com.spotify.cosmos.util.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes.dex */
public enum PlayabilityRestriction implements od50 {
    UNKNOWN(0),
    NO_RESTRICTION(1),
    EXPLICIT_CONTENT(2),
    AGE_RESTRICTED(3),
    NOT_IN_CATALOGUE(4),
    NOT_AVAILABLE_OFFLINE(5),
    PREMIUM_ONLY(6);

    public static final int AGE_RESTRICTED_VALUE = 3;
    public static final int EXPLICIT_CONTENT_VALUE = 2;
    public static final int NOT_AVAILABLE_OFFLINE_VALUE = 5;
    public static final int NOT_IN_CATALOGUE_VALUE = 4;
    public static final int NO_RESTRICTION_VALUE = 1;
    public static final int PREMIUM_ONLY_VALUE = 6;
    public static final int UNKNOWN_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.cosmos.util.proto.PlayabilityRestriction.1
        @Override // p204p.rd50
        public PlayabilityRestriction findValueByNumber(int i) {
            return PlayabilityRestriction.forNumber(i);
        }
    };
    private final int value;

    public static final class PlayabilityRestrictionVerifier implements sd50 {
        static final sd50 INSTANCE = new PlayabilityRestrictionVerifier();

        private PlayabilityRestrictionVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return PlayabilityRestriction.forNumber(i) != null;
        }
    }

    PlayabilityRestriction(int i) {
        this.value = i;
    }

    public static PlayabilityRestriction forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NO_RESTRICTION;
            case 2:
                return EXPLICIT_CONTENT;
            case 3:
                return AGE_RESTRICTED;
            case 4:
                return NOT_IN_CATALOGUE;
            case 5:
                return NOT_AVAILABLE_OFFLINE;
            case 6:
                return PREMIUM_ONLY;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return PlayabilityRestrictionVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static PlayabilityRestriction valueOf(int i) {
        return forNumber(i);
    }
}
