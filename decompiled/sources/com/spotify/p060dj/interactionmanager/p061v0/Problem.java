package com.spotify.p060dj.interactionmanager.p061v0;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes6.dex */
public enum Problem implements od50 {
    PROBLEM_UNSPECIFIED(0),
    PROBLEM_WRONG_MUSIC(1),
    PROBLEM_MISUNDERSTOOD_WORDS(2),
    PROBLEM_INACCURATE_STATEMENT(3),
    PROBLEM_MISPRONUNCIATION(4),
    PROBLEM_OTHER_OR_GENERIC(5),
    UNRECOGNIZED(-1);

    public static final int PROBLEM_INACCURATE_STATEMENT_VALUE = 3;
    public static final int PROBLEM_MISPRONUNCIATION_VALUE = 4;
    public static final int PROBLEM_MISUNDERSTOOD_WORDS_VALUE = 2;
    public static final int PROBLEM_OTHER_OR_GENERIC_VALUE = 5;
    public static final int PROBLEM_UNSPECIFIED_VALUE = 0;
    public static final int PROBLEM_WRONG_MUSIC_VALUE = 1;
    private static final rd50 internalValueMap = new C06991();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.Problem$1 */
    public class C06991 implements rd50 {
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
            return PROBLEM_WRONG_MUSIC;
        }
        if (i == 2) {
            return PROBLEM_MISUNDERSTOOD_WORDS;
        }
        if (i == 3) {
            return PROBLEM_INACCURATE_STATEMENT;
        }
        if (i == 4) {
            return PROBLEM_MISPRONUNCIATION;
        }
        if (i != 5) {
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
