package p204p;

import com.spotify.player.model.command.options.PlayOperation;
import com.spotify.player.model.command.options.PlayTrigger;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class ooo0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f167674a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f167675b;

    static {
        int[] iArr = new int[PlayOperation.values().length];
        try {
            iArr[PlayOperation.REPLACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayOperation.ENQUEUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayOperation.PUSH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f167674a = iArr;
        int[] iArr2 = new int[PlayTrigger.values().length];
        try {
            iArr2[PlayTrigger.IMMEDIATELY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlayTrigger.ADVANCED_PAST_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlayTrigger.ADVANCED_PAST_CONTEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f167675b = iArr2;
    }
}
