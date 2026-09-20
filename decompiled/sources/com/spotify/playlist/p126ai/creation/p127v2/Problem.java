package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes9.dex */
public enum Problem implements od50 {
    PROBLEM_UNSPECIFIED(0),
    PROBLEM_NO_MUSIC(1),
    PROBLEM_UNTRUE_OR_INACCURATE(2),
    PROBLEM_OTHER_OR_GENERIC(3),
    UNRECOGNIZED(-1);

    public static final int PROBLEM_NO_MUSIC_VALUE = 1;
    public static final int PROBLEM_OTHER_OR_GENERIC_VALUE = 3;
    public static final int PROBLEM_UNSPECIFIED_VALUE = 0;
    public static final int PROBLEM_UNTRUE_OR_INACCURATE_VALUE = 2;
    private static final rd50 internalValueMap = new C11941();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Problem$1 */
    public class C11941 implements rd50 {
        @Override // p204p.rd50
        public final Problem findValueByNumber(int i) {
            return Problem.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return Problem.forNumber(i);
        }
    }

    public static final class ProblemVerifier implements sd50 {
        static final sd50 INSTANCE = new ProblemVerifier();

        private ProblemVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return Problem.forNumber(i) != null;
        }
    }

    Problem(int i) {
        this.value = i;
    }

    public static Problem forNumber(int i) {
        if (i == 0) {
            return PROBLEM_UNSPECIFIED;
        }
        if (i == 1) {
            return PROBLEM_NO_MUSIC;
        }
        if (i == 2) {
            return PROBLEM_UNTRUE_OR_INACCURATE;
        }
        if (i != 3) {
            return null;
        }
        return PROBLEM_OTHER_OR_GENERIC;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return ProblemVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Problem valueOf(int i) {
        return forNumber(i);
    }
}
