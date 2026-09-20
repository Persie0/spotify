package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d241 {

    /* JADX INFO: renamed from: a */
    public static final d241 f44477a;

    /* JADX INFO: renamed from: b */
    public static final d241 f44478b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ d241[] f44479c;

    static {
        d241 d241Var = new d241("OnCancelClicked", 0);
        f44477a = d241Var;
        d241 d241Var2 = new d241("OnSaveClicked", 1);
        f44478b = d241Var2;
        f44479c = new d241[]{d241Var, d241Var2};
    }

    public static d241 valueOf(String str) {
        return (d241) Enum.valueOf(d241.class, str);
    }

    public static d241[] values() {
        return (d241[]) f44479c.clone();
    }
}
