package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class w53 {

    /* JADX INFO: renamed from: a */
    public static final w53 f247978a;

    /* JADX INFO: renamed from: b */
    public static final w53 f247979b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ w53[] f247980c;

    static {
        w53 w53Var = new w53("RowClicked", 0);
        f247978a = w53Var;
        w53 w53Var2 = new w53("AddToLibraryClicked", 1);
        f247979b = w53Var2;
        f247980c = new w53[]{w53Var, w53Var2};
    }

    public static w53 valueOf(String str) {
        return (w53) Enum.valueOf(w53.class, str);
    }

    public static w53[] values() {
        return (w53[]) f247980c.clone();
    }
}
