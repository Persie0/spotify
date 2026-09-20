package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes9.dex */
public enum Action implements od50 {
    ACTION_UNSPECIFIED(0),
    ACTION_QUEUED(1),
    ACTION_PROCESSING(2),
    ACTION_TIMEOUT(3),
    ACTION_SUCCESS(4),
    ACTION_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int ACTION_ERROR_VALUE = 5;
    public static final int ACTION_PROCESSING_VALUE = 2;
    public static final int ACTION_QUEUED_VALUE = 1;
    public static final int ACTION_SUCCESS_VALUE = 4;
    public static final int ACTION_TIMEOUT_VALUE = 3;
    public static final int ACTION_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new C11721();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Action$1 */
    public class C11721 implements rd50 {
        @Override // p204p.rd50
        public final Action findValueByNumber(int i) {
            return Action.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return Action.forNumber(i);
        }
    }

    public static final class ActionVerifier implements sd50 {
        static final sd50 INSTANCE = new ActionVerifier();

        private ActionVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return Action.forNumber(i) != null;
        }
    }

    Action(int i) {
        this.value = i;
    }

    public static Action forNumber(int i) {
        if (i == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_QUEUED;
        }
        if (i == 2) {
            return ACTION_PROCESSING;
        }
        if (i == 3) {
            return ACTION_TIMEOUT;
        }
        if (i == 4) {
            return ACTION_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return ACTION_ERROR;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ActionVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Action valueOf(int i) {
        return forNumber(i);
    }
}
