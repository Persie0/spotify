package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ki50 {

    /* JADX INFO: renamed from: a */
    public static final ki50 f122819a;

    /* JADX INFO: renamed from: b */
    public static final ki50 f122820b;

    /* JADX INFO: renamed from: c */
    public static final ki50 f122821c;

    /* JADX INFO: renamed from: d */
    public static final ki50 f122822d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ki50[] f122823e;

    static {
        ki50 ki50Var = new ki50("Good", 0);
        f122819a = ki50Var;
        ki50 ki50Var2 = new ki50("Poor", 1);
        f122820b = ki50Var2;
        ki50 ki50Var3 = new ki50("Disabled", 2);
        f122821c = ki50Var3;
        ki50 ki50Var4 = new ki50("NotApplicable", 3);
        f122822d = ki50Var4;
        f122823e = new ki50[]{ki50Var, ki50Var2, ki50Var3, ki50Var4};
    }

    public static ki50 valueOf(String str) {
        return (ki50) Enum.valueOf(ki50.class, str);
    }

    public static ki50[] values() {
        return (ki50[]) f122823e.clone();
    }
}
