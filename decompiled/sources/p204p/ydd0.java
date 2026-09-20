package p204p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ydd0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f271736a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f271737b;

    static {
        int[] iArr = new int[AudioStream.values().length];
        try {
            iArr[AudioStream.ALARM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f271736a = iArr;
        int[] iArr2 = new int[wdd0.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        f271737b = iArr2;
    }
}
