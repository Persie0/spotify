package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ldc1 {

    /* JADX INFO: renamed from: a */
    public static final ldc1 f132140a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ldc1[] f132141b;

    static {
        ldc1 ldc1Var = new ldc1("RowClicked", 0);
        f132140a = ldc1Var;
        f132141b = new ldc1[]{ldc1Var};
    }

    public static ldc1 valueOf(String str) {
        return (ldc1) Enum.valueOf(ldc1.class, str);
    }

    public static ldc1[] values() {
        return (ldc1[]) f132141b.clone();
    }
}
