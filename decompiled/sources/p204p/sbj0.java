package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class sbj0 {

    /* JADX INFO: renamed from: a */
    public static final sbj0 f207519a;

    /* JADX INFO: renamed from: b */
    public static final sbj0 f207520b;

    /* JADX INFO: renamed from: c */
    public static final sbj0 f207521c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sbj0[] f207522d;

    static {
        sbj0 sbj0Var = new sbj0("Unset", 0);
        f207519a = sbj0Var;
        sbj0 sbj0Var2 = new sbj0("SystemDialog", 1);
        f207520b = sbj0Var2;
        sbj0 sbj0Var3 = new sbj0("EduDialog", 2);
        f207521c = sbj0Var3;
        f207522d = new sbj0[]{sbj0Var, sbj0Var2, sbj0Var3};
    }

    public static sbj0 valueOf(String str) {
        return (sbj0) Enum.valueOf(sbj0.class, str);
    }

    public static sbj0[] values() {
        return (sbj0[]) f207522d.clone();
    }
}
