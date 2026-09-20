package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class kqp0 {

    /* JADX INFO: renamed from: a */
    public static final kqp0 f125376a;

    /* JADX INFO: renamed from: b */
    public static final kqp0 f125377b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kqp0[] f125378c;

    static {
        kqp0 kqp0Var = new kqp0("RowClicked", 0);
        f125376a = kqp0Var;
        kqp0 kqp0Var2 = new kqp0("AddToLibraryClicked", 1);
        f125377b = kqp0Var2;
        f125378c = new kqp0[]{kqp0Var, kqp0Var2};
    }

    public static kqp0 valueOf(String str) {
        return (kqp0) Enum.valueOf(kqp0.class, str);
    }

    public static kqp0[] values() {
        return (kqp0[]) f125378c.clone();
    }
}
