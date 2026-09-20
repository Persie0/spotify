package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tz70 {

    /* JADX INFO: renamed from: a */
    public static final tz70 f225171a;

    /* JADX INFO: renamed from: b */
    public static final tz70 f225172b;

    /* JADX INFO: renamed from: c */
    public static final tz70 f225173c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ tz70[] f225174d;

    static {
        tz70 tz70Var = new tz70("CloseButton", 0);
        f225171a = tz70Var;
        tz70 tz70Var2 = new tz70("MoreButton", 1);
        f225172b = tz70Var2;
        tz70 tz70Var3 = new tz70("None", 2);
        f225173c = tz70Var3;
        f225174d = new tz70[]{tz70Var, tz70Var2, tz70Var3};
    }

    public static tz70 valueOf(String str) {
        return (tz70) Enum.valueOf(tz70.class, str);
    }

    public static tz70[] values() {
        return (tz70[]) f225174d.clone();
    }
}
