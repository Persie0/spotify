package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class rs31 {

    /* JADX INFO: renamed from: a */
    public static final rs31 f202171a;

    /* JADX INFO: renamed from: b */
    public static final rs31 f202172b;

    /* JADX INFO: renamed from: c */
    public static final rs31 f202173c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rs31[] f202174d;

    static {
        rs31 rs31Var = new rs31("SortOrderClicked", 0);
        f202171a = rs31Var;
        rs31 rs31Var2 = new rs31("ViewDensityClicked", 1);
        f202172b = rs31Var2;
        rs31 rs31Var3 = new rs31("EditClicked", 2);
        f202173c = rs31Var3;
        f202174d = new rs31[]{rs31Var, rs31Var2, rs31Var3};
    }

    public static rs31 valueOf(String str) {
        return (rs31) Enum.valueOf(rs31.class, str);
    }

    public static rs31[] values() {
        return (rs31[]) f202174d.clone();
    }
}
