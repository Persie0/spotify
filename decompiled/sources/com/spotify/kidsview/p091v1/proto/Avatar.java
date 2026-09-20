package com.spotify.kidsview.p091v1.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes7.dex */
public enum Avatar implements od50 {
    AVATAR_UNKNOWN(0),
    HEADPHONES(1),
    VINYL_PLAYER(2),
    SAXOPHONE(3),
    CASSETTE_RECORDER(4),
    SYNTHESIZER(5),
    GUITAR(6),
    BOOMBOX(7),
    MPC(8),
    MICROPHONE(9),
    DOUBLE_BASS(10),
    OUD(11),
    MODULAR_SYNTHESIS(12),
    BALAFON(13),
    KALIMBA(14),
    TABLA(15),
    UNRECOGNIZED(-1);

    public static final int AVATAR_UNKNOWN_VALUE = 0;
    public static final int BALAFON_VALUE = 13;
    public static final int BOOMBOX_VALUE = 7;
    public static final int CASSETTE_RECORDER_VALUE = 4;
    public static final int DOUBLE_BASS_VALUE = 10;
    public static final int GUITAR_VALUE = 6;
    public static final int HEADPHONES_VALUE = 1;
    public static final int KALIMBA_VALUE = 14;
    public static final int MICROPHONE_VALUE = 9;
    public static final int MODULAR_SYNTHESIS_VALUE = 12;
    public static final int MPC_VALUE = 8;
    public static final int OUD_VALUE = 11;
    public static final int SAXOPHONE_VALUE = 3;
    public static final int SYNTHESIZER_VALUE = 5;
    public static final int TABLA_VALUE = 15;
    public static final int VINYL_PLAYER_VALUE = 2;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.kidsview.v1.proto.Avatar.1
        @Override // p204p.rd50
        public Avatar findValueByNumber(int i) {
            return Avatar.forNumber(i);
        }
    };
    private final int value;

    public static final class AvatarVerifier implements sd50 {
        static final sd50 INSTANCE = new AvatarVerifier();

        private AvatarVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return Avatar.forNumber(i) != null;
        }
    }

    Avatar(int i) {
        this.value = i;
    }

    public static Avatar forNumber(int i) {
        switch (i) {
            case 0:
                return AVATAR_UNKNOWN;
            case 1:
                return HEADPHONES;
            case 2:
                return VINYL_PLAYER;
            case 3:
                return SAXOPHONE;
            case 4:
                return CASSETTE_RECORDER;
            case 5:
                return SYNTHESIZER;
            case 6:
                return GUITAR;
            case 7:
                return BOOMBOX;
            case 8:
                return MPC;
            case 9:
                return MICROPHONE;
            case 10:
                return DOUBLE_BASS;
            case 11:
                return OUD;
            case 12:
                return MODULAR_SYNTHESIS;
            case 13:
                return BALAFON;
            case 14:
                return KALIMBA;
            case 15:
                return TABLA;
            default:
                return null;
        }
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return AvatarVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Avatar valueOf(int i) {
        return forNumber(i);
    }
}
