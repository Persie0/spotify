package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class j381 {

    /* JADX INFO: renamed from: a */
    public static final j381 f108308a;

    /* JADX INFO: renamed from: b */
    public static final j381 f108309b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ j381[] f108310c;

    static {
        j381 j381Var = new j381("ANCHOR_NOT_ATTACHED", 0);
        f108308a = j381Var;
        j381 j381Var2 = new j381("POPUP_NOT_CREATED", 1);
        j381 j381Var3 = new j381("COMPOSABLE_ANCHOR_OR_CONTENT", 2);
        j381 j381Var4 = new j381("ORCHESTRATION", 3);
        f108309b = j381Var4;
        f108310c = new j381[]{j381Var, j381Var2, j381Var3, j381Var4, new j381("UNKNOWN", 4)};
    }

    public static j381 valueOf(String str) {
        return (j381) Enum.valueOf(j381.class, str);
    }

    public static j381[] values() {
        return (j381[]) f108310c.clone();
    }
}
