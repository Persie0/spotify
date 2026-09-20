package p204p;

import com.spotify.player.model.BitrateLevel;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class sk51 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f210022a;

    static {
        int[] iArr = new int[BitrateLevel.values().length];
        try {
            iArr[BitrateLevel.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BitrateLevel.LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BitrateLevel.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BitrateLevel.HIGH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BitrateLevel.VERY_HIGH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BitrateLevel.HIFI.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BitrateLevel.HIFI_24.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f210022a = iArr;
    }
}
