package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ge81 {

    /* JADX INFO: renamed from: a */
    public static final ge81 f79052a;

    /* JADX INFO: renamed from: b */
    public static final ge81 f79053b;

    /* JADX INFO: renamed from: c */
    public static final ge81 f79054c;

    /* JADX INFO: renamed from: d */
    public static final ge81 f79055d;

    /* JADX INFO: renamed from: e */
    public static final ge81 f79056e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ge81[] f79057f;

    static {
        ge81 ge81Var = new ge81("RowClicked", 0);
        f79052a = ge81Var;
        ge81 ge81Var2 = new ge81("RowLongClicked", 1);
        f79053b = ge81Var2;
        ge81 ge81Var3 = new ge81("ContextMenuClicked", 2);
        f79054c = ge81Var3;
        ge81 ge81Var4 = new ge81("Swiped", 3);
        f79055d = ge81Var4;
        ge81 ge81Var5 = new ge81("AddToLibraryClicked", 4);
        f79056e = ge81Var5;
        f79057f = new ge81[]{ge81Var, ge81Var2, ge81Var3, ge81Var4, ge81Var5};
    }

    public static ge81 valueOf(String str) {
        return (ge81) Enum.valueOf(ge81.class, str);
    }

    public static ge81[] values() {
        return (ge81[]) f79057f.clone();
    }
}
