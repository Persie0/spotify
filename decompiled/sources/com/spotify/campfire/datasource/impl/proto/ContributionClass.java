package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum ContributionClass implements od50 {
    CONTRIBUTION_CLASS_UNSPECIFIED(0),
    CONTRIBUTION_CLASS_TRACKED_SHARE(1),
    CONTRIBUTION_CLASS_FREE_TEXT(2),
    CONTRIBUTION_CLASS_OP_TRACKED_SHARE(3),
    CONTRIBUTION_CLASS_CHAT_INVITE(4),
    CONTRIBUTION_CLASS_PRE_OP_SHARE(5),
    CONTRIBUTION_CLASS_CHAT_EVENT(6),
    CONTRIBUTION_CLASS_RICH_MEDIA(7),
    UNRECOGNIZED(-1);

    public static final int CONTRIBUTION_CLASS_CHAT_EVENT_VALUE = 6;
    public static final int CONTRIBUTION_CLASS_CHAT_INVITE_VALUE = 4;
    public static final int CONTRIBUTION_CLASS_FREE_TEXT_VALUE = 2;
    public static final int CONTRIBUTION_CLASS_OP_TRACKED_SHARE_VALUE = 3;
    public static final int CONTRIBUTION_CLASS_PRE_OP_SHARE_VALUE = 5;
    public static final int CONTRIBUTION_CLASS_RICH_MEDIA_VALUE = 7;
    public static final int CONTRIBUTION_CLASS_TRACKED_SHARE_VALUE = 1;
    public static final int CONTRIBUTION_CLASS_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.ContributionClass.1
        @Override // p204p.rd50
        public ContributionClass findValueByNumber(int i) {
            return ContributionClass.forNumber(i);
        }
    };
    private final int value;

    public static final class ContributionClassVerifier implements sd50 {
        static final sd50 INSTANCE = new ContributionClassVerifier();

        private ContributionClassVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return ContributionClass.forNumber(i) != null;
        }
    }

    ContributionClass(int i) {
        this.value = i;
    }

    public static ContributionClass forNumber(int i) {
        switch (i) {
            case 0:
                return CONTRIBUTION_CLASS_UNSPECIFIED;
            case 1:
                return CONTRIBUTION_CLASS_TRACKED_SHARE;
            case 2:
                return CONTRIBUTION_CLASS_FREE_TEXT;
            case 3:
                return CONTRIBUTION_CLASS_OP_TRACKED_SHARE;
            case 4:
                return CONTRIBUTION_CLASS_CHAT_INVITE;
            case 5:
                return CONTRIBUTION_CLASS_PRE_OP_SHARE;
            case 6:
                return CONTRIBUTION_CLASS_CHAT_EVENT;
            case 7:
                return CONTRIBUTION_CLASS_RICH_MEDIA;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ContributionClassVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ContributionClass valueOf(int i) {
        return forNumber(i);
    }
}
