package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ve91 {

    /* JADX INFO: renamed from: a */
    public static final ve91 f240653a;

    /* JADX INFO: renamed from: b */
    public static final ve91 f240654b;

    /* JADX INFO: renamed from: c */
    public static final ve91 f240655c;

    /* JADX INFO: renamed from: d */
    public static final ve91 f240656d;

    /* JADX INFO: renamed from: e */
    public static final ve91 f240657e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ve91[] f240658f;

    static {
        ve91 ve91Var = new ve91("CardClicked", 0);
        f240653a = ve91Var;
        ve91 ve91Var2 = new ve91("ThumbnailClicked", 1);
        f240654b = ve91Var2;
        ve91 ve91Var3 = new ve91("PlayButtonClicked", 2);
        f240655c = ve91Var3;
        ve91 ve91Var4 = new ve91("ContextMenuButtonClicked", 3);
        f240656d = ve91Var4;
        ve91 ve91Var5 = new ve91("CardLockedClicked", 4);
        f240657e = ve91Var5;
        f240658f = new ve91[]{ve91Var, ve91Var2, ve91Var3, ve91Var4, ve91Var5};
    }

    public static ve91 valueOf(String str) {
        return (ve91) Enum.valueOf(ve91.class, str);
    }

    public static ve91[] values() {
        return (ve91[]) f240658f.clone();
    }
}
