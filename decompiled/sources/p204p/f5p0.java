package p204p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f5p0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66131a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.PLAYBACK_STUCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.PLAYBACK_START_SLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorType.PLAYBACK_STUCK_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ErrorType.PLAYBACK_START_TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f66131a = iArr;
    }
}
