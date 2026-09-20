package p204p;

import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class ay41 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f21098a;

    static {
        int[] iArr = new int[SeekToCommand.Relative.values().length];
        f21098a = iArr;
        try {
            iArr[SeekToCommand.Relative.BEGINNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21098a[SeekToCommand.Relative.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21098a[SeekToCommand.Relative.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
