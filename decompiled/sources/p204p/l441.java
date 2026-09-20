package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l441 {

    /* JADX INFO: renamed from: a */
    public static final l441 f129567a;

    /* JADX INFO: renamed from: b */
    public static final l441 f129568b;

    /* JADX INFO: renamed from: c */
    public static final l441 f129569c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ l441[] f129570d;

    static {
        l441 l441Var = new l441("ContinueButtonClicked", 0);
        f129567a = l441Var;
        l441 l441Var2 = new l441("CancelButtonClicked", 1);
        f129568b = l441Var2;
        l441 l441Var3 = new l441("DialogDismissed", 2);
        f129569c = l441Var3;
        f129570d = new l441[]{l441Var, l441Var2, l441Var3};
    }

    public static l441 valueOf(String str) {
        return (l441) Enum.valueOf(l441.class, str);
    }

    public static l441[] values() {
        return (l441[]) f129570d.clone();
    }
}
