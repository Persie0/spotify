package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jx50 {

    /* JADX INFO: renamed from: a */
    public static final jx50 f116806a;

    /* JADX INFO: renamed from: b */
    public static final jx50 f116807b;

    /* JADX INFO: renamed from: c */
    public static final jx50 f116808c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jx50[] f116809d;

    static {
        jx50 jx50Var = new jx50("ON", 0);
        f116806a = jx50Var;
        jx50 jx50Var2 = new jx50("OFF", 1);
        f116807b = jx50Var2;
        jx50 jx50Var3 = new jx50("HIDDEN", 2);
        f116808c = jx50Var3;
        f116809d = new jx50[]{jx50Var, jx50Var2, jx50Var3};
    }

    public static jx50 valueOf(String str) {
        return (jx50) Enum.valueOf(jx50.class, str);
    }

    public static jx50[] values() {
        return (jx50[]) f116809d.clone();
    }
}
