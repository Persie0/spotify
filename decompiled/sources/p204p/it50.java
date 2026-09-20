package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class it50 {

    /* JADX INFO: renamed from: a */
    public static final it50 f105436a;

    /* JADX INFO: renamed from: b */
    public static final it50 f105437b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ it50[] f105438c;

    static {
        it50 it50Var = new it50("Continue", 0);
        f105436a = it50Var;
        it50 it50Var2 = new it50("Break", 1);
        f105437b = it50Var2;
        f105438c = new it50[]{it50Var, it50Var2};
    }

    public static it50 valueOf(String str) {
        return (it50) Enum.valueOf(it50.class, str);
    }

    public static it50[] values() {
        return (it50[]) f105438c.clone();
    }
}
