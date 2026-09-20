package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class wdw {

    /* JADX INFO: renamed from: a */
    public static final wdw f250357a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wdw[] f250358b;

    static {
        wdw wdwVar = new wdw("RetryButtonClicked", 0);
        f250357a = wdwVar;
        f250358b = new wdw[]{wdwVar};
    }

    public static wdw valueOf(String str) {
        return (wdw) Enum.valueOf(wdw.class, str);
    }

    public static wdw[] values() {
        return (wdw[]) f250358b.clone();
    }
}
