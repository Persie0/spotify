package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class hq81 {

    /* JADX INFO: renamed from: a */
    public static final hq81 f94062a;

    /* JADX INFO: renamed from: b */
    public static final hq81 f94063b;

    /* JADX INFO: renamed from: c */
    public static final hq81 f94064c;

    /* JADX INFO: renamed from: d */
    public static final hq81 f94065d;

    /* JADX INFO: renamed from: e */
    public static final hq81 f94066e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hq81[] f94067f;

    static {
        hq81 hq81Var = new hq81("RowClicked", 0);
        f94062a = hq81Var;
        hq81 hq81Var2 = new hq81("RowLongClicked", 1);
        f94063b = hq81Var2;
        hq81 hq81Var3 = new hq81("ContextMenuClicked", 2);
        f94064c = hq81Var3;
        hq81 hq81Var4 = new hq81("Swiped", 3);
        f94065d = hq81Var4;
        hq81 hq81Var5 = new hq81("AddToLibraryClicked", 4);
        f94066e = hq81Var5;
        f94067f = new hq81[]{hq81Var, hq81Var2, hq81Var3, hq81Var4, hq81Var5};
    }

    public static hq81 valueOf(String str) {
        return (hq81) Enum.valueOf(hq81.class, str);
    }

    public static hq81[] values() {
        return (hq81[]) f94067f.clone();
    }
}
