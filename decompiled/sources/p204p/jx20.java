package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class jx20 {

    /* JADX INFO: renamed from: a */
    public static final jx20 f116769a;

    /* JADX INFO: renamed from: b */
    public static final jx20 f116770b;

    /* JADX INFO: renamed from: c */
    public static final jx20 f116771c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jx20[] f116772d;

    static {
        jx20 jx20Var = new jx20("CardClicked", 0);
        f116769a = jx20Var;
        jx20 jx20Var2 = new jx20("ButtonClicked", 1);
        f116770b = jx20Var2;
        jx20 jx20Var3 = new jx20("DismissButtonClicked", 2);
        f116771c = jx20Var3;
        f116772d = new jx20[]{jx20Var, jx20Var2, jx20Var3};
    }

    public static jx20 valueOf(String str) {
        return (jx20) Enum.valueOf(jx20.class, str);
    }

    public static jx20[] values() {
        return (jx20[]) f116772d.clone();
    }
}
