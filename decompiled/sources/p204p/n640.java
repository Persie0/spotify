package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n640 {

    /* JADX INFO: renamed from: a */
    public static final n640 f150681a;

    /* JADX INFO: renamed from: b */
    public static final n640 f150682b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ n640[] f150683c;

    static {
        n640 n640Var = new n640("BackButtonClicked", 0);
        f150681a = n640Var;
        n640 n640Var2 = new n640("ArtworkClicked", 1);
        f150682b = n640Var2;
        f150683c = new n640[]{n640Var, n640Var2};
    }

    public static n640 valueOf(String str) {
        return (n640) Enum.valueOf(n640.class, str);
    }

    public static n640[] values() {
        return (n640[]) f150683c.clone();
    }
}
