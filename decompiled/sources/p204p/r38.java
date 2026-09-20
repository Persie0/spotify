package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r38 {

    /* JADX INFO: renamed from: a */
    public static final r38 f195439a;

    /* JADX INFO: renamed from: b */
    public static final r38 f195440b;

    /* JADX INFO: renamed from: c */
    public static final r38 f195441c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ r38[] f195442d;

    static {
        r38 r38Var = new r38("RowClicked", 0);
        f195439a = r38Var;
        r38 r38Var2 = new r38("TapAheadClicked", 1);
        f195440b = r38Var2;
        r38 r38Var3 = new r38("RowSwiped", 2);
        f195441c = r38Var3;
        f195442d = new r38[]{r38Var, r38Var2, r38Var3};
    }

    public static r38 valueOf(String str) {
        return (r38) Enum.valueOf(r38.class, str);
    }

    public static r38[] values() {
        return (r38[]) f195442d.clone();
    }
}
