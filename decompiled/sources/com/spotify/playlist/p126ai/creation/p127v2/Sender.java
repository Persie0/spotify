package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes9.dex */
public enum Sender implements od50 {
    SENDER_UNSPECIFIED(0),
    SENDER_USER(1),
    SENDER_AI(2),
    SENDER_SPOTIFY(3),
    UNRECOGNIZED(-1);

    public static final int SENDER_AI_VALUE = 2;
    public static final int SENDER_SPOTIFY_VALUE = 3;
    public static final int SENDER_UNSPECIFIED_VALUE = 0;
    public static final int SENDER_USER_VALUE = 1;
    private static final rd50 internalValueMap = new C11971();
    private final int value;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Sender$1 */
    public class C11971 implements rd50 {
        @Override // p204p.rd50
        public final Sender findValueByNumber(int i) {
            return Sender.forNumber(i);
        }

        @Override // p204p.rd50
        public final od50 findValueByNumber(int i) {
            return Sender.forNumber(i);
        }
    }

    public static final class SenderVerifier implements sd50 {
        static final sd50 INSTANCE = new SenderVerifier();

        private SenderVerifier() {
        }

        @Override // p204p.sd50
        public final boolean isInRange(int i) {
            return Sender.forNumber(i) != null;
        }
    }

    Sender(int i) {
        this.value = i;
    }

    public static Sender forNumber(int i) {
        if (i == 0) {
            return SENDER_UNSPECIFIED;
        }
        if (i == 1) {
            return SENDER_USER;
        }
        if (i == 2) {
            return SENDER_AI;
        }
        if (i != 3) {
            return null;
        }
        return SENDER_SPOTIFY;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return SenderVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Sender valueOf(int i) {
        return forNumber(i);
    }
}
