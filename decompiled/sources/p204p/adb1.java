package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class adb1 {

    /* JADX INFO: renamed from: a */
    public static final adb1 f14596a;

    /* JADX INFO: renamed from: b */
    public static final adb1 f14597b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ adb1[] f14598c;

    static {
        adb1 adb1Var = new adb1("PHOTO_ID", 0);
        f14596a = adb1Var;
        adb1 adb1Var2 = new adb1("CARD", 1);
        f14597b = adb1Var2;
        f14598c = new adb1[]{adb1Var, adb1Var2};
    }

    public static adb1 valueOf(String str) {
        return (adb1) Enum.valueOf(adb1.class, str);
    }

    public static adb1[] values() {
        return (adb1[]) f14598c.clone();
    }
}
