package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i111 {

    /* JADX INFO: renamed from: a */
    public static final i111 f97351a;

    /* JADX INFO: renamed from: b */
    public static final i111 f97352b;

    /* JADX INFO: renamed from: c */
    public static final i111 f97353c;

    /* JADX INFO: renamed from: d */
    public static final i111 f97354d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ i111[] f97355e;

    static {
        i111 i111Var = new i111("VERIFIED", 0);
        f97351a = i111Var;
        i111 i111Var2 = new i111("UNDERAGE", 1);
        f97352b = i111Var2;
        i111 i111Var3 = new i111("AGE_ASSURANCE_REQUIRED", 2);
        f97353c = i111Var3;
        i111 i111Var4 = new i111("UNKNOWN", 3);
        f97354d = i111Var4;
        f97355e = new i111[]{i111Var, i111Var2, i111Var3, i111Var4};
    }

    public static i111 valueOf(String str) {
        return (i111) Enum.valueOf(i111.class, str);
    }

    public static i111[] values() {
        return (i111[]) f97355e.clone();
    }
}
