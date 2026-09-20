package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r6m0 {

    /* JADX INFO: renamed from: a */
    public static final r6m0 f196325a;

    /* JADX INFO: renamed from: b */
    public static final r6m0 f196326b;

    /* JADX INFO: renamed from: c */
    public static final r6m0 f196327c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ r6m0[] f196328d;

    static {
        r6m0 r6m0Var = new r6m0("NEW", 0);
        f196325a = r6m0Var;
        r6m0 r6m0Var2 = new r6m0("EDIT", 1);
        f196326b = r6m0Var2;
        r6m0 r6m0Var3 = new r6m0("VIEW", 2);
        f196327c = r6m0Var3;
        f196328d = new r6m0[]{r6m0Var, r6m0Var2, r6m0Var3};
    }

    public static r6m0 valueOf(String str) {
        return (r6m0) Enum.valueOf(r6m0.class, str);
    }

    public static r6m0[] values() {
        return (r6m0[]) f196328d.clone();
    }
}
