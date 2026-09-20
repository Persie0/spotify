package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ss8 {

    /* JADX INFO: renamed from: a */
    public static final ss8 f213524a;

    /* JADX INFO: renamed from: b */
    public static final ss8 f213525b;

    /* JADX INFO: renamed from: c */
    public static final ss8 f213526c;

    /* JADX INFO: renamed from: d */
    public static final ss8 f213527d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ss8[] f213528e;

    static {
        ss8 ss8Var = new ss8("UNKNOWN", 0);
        f213524a = ss8Var;
        ss8 ss8Var2 = new ss8("DEFAULT", 1);
        f213525b = ss8Var2;
        ss8 ss8Var3 = new ss8("BANNED", 2);
        f213526c = ss8Var3;
        ss8 ss8Var4 = new ss8("ALLOWED", 3);
        f213527d = ss8Var4;
        f213528e = new ss8[]{ss8Var, ss8Var2, ss8Var3, ss8Var4};
    }

    public static ss8 valueOf(String str) {
        return (ss8) Enum.valueOf(ss8.class, str);
    }

    public static ss8[] values() {
        return (ss8[]) f213528e.clone();
    }
}
