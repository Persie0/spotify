package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum DeleteActionState implements od50 {
    DELETE_ACTION_STATE_UNSPECIFIED(0),
    DELETE_ACTION_STATE_ENABLED(1),
    DELETE_ACTION_STATE_DISABLED_GENERIC(2),
    DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST(3),
    UNRECOGNIZED(-1);

    public static final int DELETE_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST_VALUE = 3;
    public static final int DELETE_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int DELETE_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.DeleteActionState.1
        @Override // p204p.rd50
        public DeleteActionState findValueByNumber(int i) {
            return DeleteActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class DeleteActionStateVerifier implements sd50 {
        static final sd50 INSTANCE = new DeleteActionStateVerifier();

        private DeleteActionStateVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return DeleteActionState.forNumber(i) != null;
        }
    }

    DeleteActionState(int i) {
        this.value = i;
    }

    public static DeleteActionState forNumber(int i) {
        if (i == 0) {
            return DELETE_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return DELETE_ACTION_STATE_ENABLED;
        }
        if (i == 2) {
            return DELETE_ACTION_STATE_DISABLED_GENERIC;
        }
        if (i != 3) {
            return null;
        }
        return DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return DeleteActionStateVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DeleteActionState valueOf(int i) {
        return forNumber(i);
    }
}
