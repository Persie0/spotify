package p204p;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import com.spotify.player.model.FileOrigin;
import com.spotify.player.model.Format;
import com.spotify.player.model.HiFiStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class adp0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f14652a;

    static {
        int[] iArr = new int[ujw.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[7] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[8] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr2 = new int[BitrateLevel.values().length];
        try {
            iArr2[BitrateLevel.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BitrateLevel.LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[BitrateLevel.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BitrateLevel.HIGH.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BitrateLevel.VERY_HIGH.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[BitrateLevel.HIFI.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[BitrateLevel.HIFI_24.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        int[] iArr3 = new int[vjw.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[4] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[6] = 7;
        } catch (NoSuchFieldError unused23) {
        }
        int[] iArr4 = new int[BitrateStrategy.values().length];
        try {
            iArr4[BitrateStrategy.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[BitrateStrategy.BEST_MATCHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[BitrateStrategy.BACKEND_ADVISED.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[BitrateStrategy.OFFLINED_FILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[BitrateStrategy.CACHED_FILE.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[BitrateStrategy.LOCAL_FILE.ordinal()] = 6;
        } catch (NoSuchFieldError unused29) {
        }
        int[] iArr5 = new int[xjw.values().length];
        try {
            iArr5[0] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[1] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[2] = 3;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr5[3] = 4;
        } catch (NoSuchFieldError unused33) {
        }
        int[] iArr6 = new int[HiFiStatus.values().length];
        try {
            iArr6[HiFiStatus.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[HiFiStatus.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr6[HiFiStatus.ON.ordinal()] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        int[] iArr7 = new int[wjw.values().length];
        try {
            iArr7[0] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[1] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr7[2] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr7[3] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr7[4] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr7[5] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        int[] iArr8 = new int[FileOrigin.values().length];
        try {
            iArr8[FileOrigin.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr8[FileOrigin.INTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr8[FileOrigin.EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr8[FileOrigin.LOCAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr8[FileOrigin.GENERATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused47) {
        }
        int[] iArr9 = new int[sjw.values().length];
        try {
            iArr9[0] = 1;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr9[1] = 2;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr9[2] = 3;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr9[3] = 4;
        } catch (NoSuchFieldError unused51) {
        }
        int[] iArr10 = new int[Format.values().length];
        try {
            iArr10[Format.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr10[Format.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr10[Format.PARROT.ordinal()] = 3;
        } catch (NoSuchFieldError unused54) {
        }
        int[] iArr11 = new int[AudioStream.values().length];
        try {
            iArr11[AudioStream.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr11[AudioStream.ALARM.ordinal()] = 2;
        } catch (NoSuchFieldError unused56) {
        }
        int[] iArr12 = new int[nnw.values().length];
        try {
            iArr12[0] = 1;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr12[1] = 2;
        } catch (NoSuchFieldError unused58) {
        }
        f14652a = iArr12;
    }
}
