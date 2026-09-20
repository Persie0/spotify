package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v10 {

    /* JADX INFO: renamed from: a */
    public static final v10 f236204a;

    /* JADX INFO: renamed from: b */
    public static final v10 f236205b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ v10[] f236206c;

    static {
        v10 v10Var = new v10("AddButtonClicked", 0);
        f236204a = v10Var;
        v10 v10Var2 = new v10("ContextMenuButtonClicked", 1);
        f236205b = v10Var2;
        f236206c = new v10[]{v10Var, v10Var2};
    }

    public static v10 valueOf(String str) {
        return (v10) Enum.valueOf(v10.class, str);
    }

    public static v10[] values() {
        return (v10[]) f236206c.clone();
    }
}
