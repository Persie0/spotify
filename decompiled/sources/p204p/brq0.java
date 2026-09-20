package p204p;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.command.options.PrefetchLevel;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class brq0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f30160a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f30161b;

    static {
        int[] iArr = new int[PrefetchLevel.values().length];
        try {
            iArr[PrefetchLevel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrefetchLevel.MEDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f30160a = iArr;
        int[] iArr2 = new int[AudioStream.values().length];
        try {
            iArr2[AudioStream.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AudioStream.ALARM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f30161b = iArr2;
    }
}
