package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class oiv0 {

    /* JADX INFO: renamed from: a */
    public static final oiv0 f165902a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ oiv0[] f165903b;

    static {
        oiv0 oiv0Var = new oiv0("Clicked", 0);
        f165902a = oiv0Var;
        f165903b = new oiv0[]{oiv0Var};
    }

    public static oiv0 valueOf(String str) {
        return (oiv0) Enum.valueOf(oiv0.class, str);
    }

    public static oiv0[] values() {
        return (oiv0[]) f165903b.clone();
    }
}
