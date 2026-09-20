package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ka3 {

    /* JADX INFO: renamed from: a */
    public static final ka3 f120767a;

    /* JADX INFO: renamed from: b */
    public static final ka3 f120768b;

    /* JADX INFO: renamed from: c */
    public static final ka3 f120769c;

    /* JADX INFO: renamed from: d */
    public static final ka3 f120770d;

    /* JADX INFO: renamed from: e */
    public static final ka3 f120771e;

    /* JADX INFO: renamed from: f */
    public static final ka3 f120772f;

    /* JADX INFO: renamed from: g */
    public static final ka3 f120773g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ka3[] f120774h;

    static {
        ka3 ka3Var = new ka3("Track", 0);
        f120767a = ka3Var;
        ka3 ka3Var2 = new ka3("Episode", 1);
        f120768b = ka3Var2;
        ka3 ka3Var3 = new ka3("Podcast", 2);
        f120769c = ka3Var3;
        ka3 ka3Var4 = new ka3("Audiobook", 3);
        f120770d = ka3Var4;
        ka3 ka3Var5 = new ka3("Highlight", 4);
        f120771e = ka3Var5;
        ka3 ka3Var6 = new ka3("Unsupported", 5);
        f120772f = ka3Var6;
        ka3 ka3Var7 = new ka3("PodcastChapter", 6);
        f120773g = ka3Var7;
        f120774h = new ka3[]{ka3Var, ka3Var2, ka3Var3, ka3Var4, ka3Var5, ka3Var6, ka3Var7};
    }

    public static ka3 valueOf(String str) {
        return (ka3) Enum.valueOf(ka3.class, str);
    }

    public static ka3[] values() {
        return (ka3[]) f120774h.clone();
    }
}
