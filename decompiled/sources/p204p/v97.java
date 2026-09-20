package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class v97 {

    /* JADX INFO: renamed from: a */
    public static final v97 f238880a;

    /* JADX INFO: renamed from: b */
    public static final v97 f238881b;

    /* JADX INFO: renamed from: c */
    public static final v97 f238882c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v97[] f238883d;

    static {
        v97 v97Var = new v97("RowClicked", 0);
        f238880a = v97Var;
        v97 v97Var2 = new v97("AddToLibraryClicked", 1);
        f238881b = v97Var2;
        v97 v97Var3 = new v97("ContextMenuClicked", 2);
        f238882c = v97Var3;
        f238883d = new v97[]{v97Var, v97Var2, v97Var3};
    }

    public static v97 valueOf(String str) {
        return (v97) Enum.valueOf(v97.class, str);
    }

    public static v97[] values() {
        return (v97[]) f238883d.clone();
    }
}
