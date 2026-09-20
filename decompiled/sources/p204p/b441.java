package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b441 {

    /* JADX INFO: renamed from: a */
    public static final b441 f23220a;

    /* JADX INFO: renamed from: b */
    public static final b441 f23221b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ b441[] f23222c;

    static {
        b441 b441Var = new b441("OnPreviewClicked", 0);
        f23220a = b441Var;
        b441 b441Var2 = new b441("OnPreviewStopped", 1);
        f23221b = b441Var2;
        f23222c = new b441[]{b441Var, b441Var2};
    }

    public static b441 valueOf(String str) {
        return (b441) Enum.valueOf(b441.class, str);
    }

    public static b441[] values() {
        return (b441[]) f23222c.clone();
    }
}
