package p204p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c480 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f33864a;

    static {
        int[] iArr = new int[AudioStream.values().length];
        try {
            iArr[AudioStream.ALARM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioStream.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f33864a = iArr;
    }
}
