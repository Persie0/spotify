package p204p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class zsa0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f285898a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f285898a = iArr;
    }
}
