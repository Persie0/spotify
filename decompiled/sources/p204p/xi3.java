package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class xi3 {

    /* JADX INFO: renamed from: b */
    public static final wi3 f261754b;

    /* JADX INFO: renamed from: c */
    public static final vi3 f261755c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xi3[] f261756d;

    /* JADX INFO: renamed from: a */
    public final String f261757a;

    static {
        wi3 wi3Var = new wi3("LIST", 0, "list");
        f261754b = wi3Var;
        vi3 vi3Var = new vi3("GRID", 1, "grid");
        f261755c = vi3Var;
        f261756d = new xi3[]{wi3Var, vi3Var};
    }

    public xi3(String str, int i, String str2) {
        super(str, i);
        this.f261757a = str2;
    }

    public static xi3 valueOf(String str) {
        return (xi3) Enum.valueOf(xi3.class, str);
    }

    public static xi3[] values() {
        return (xi3[]) f261756d.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract xi3 mo85582a();
}
