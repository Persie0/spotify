package p204p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class pzx {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f183855a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        f183855a = iArr;
        try {
            iArr[ErrorType.TRACK_UNAVAILABLE_OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f183855a[ErrorType.ONE_TRACK_UNPLAYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f183855a[ErrorType.AUDIOBOOK_NOT_PLAYABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
