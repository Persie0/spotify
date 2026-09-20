package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class cq81 {

    /* JADX INFO: renamed from: a */
    public static final cq81 f40796a;

    /* JADX INFO: renamed from: b */
    public static final cq81 f40797b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cq81[] f40798c;

    static {
        cq81 cq81Var = new cq81("RowClicked", 0);
        f40796a = cq81Var;
        cq81 cq81Var2 = new cq81("ContextMenuClicked", 1);
        f40797b = cq81Var2;
        f40798c = new cq81[]{cq81Var, cq81Var2};
    }

    public static cq81 valueOf(String str) {
        return (cq81) Enum.valueOf(cq81.class, str);
    }

    public static cq81[] values() {
        return (cq81[]) f40798c.clone();
    }
}
