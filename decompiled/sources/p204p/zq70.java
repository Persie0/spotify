package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zq70 {

    /* JADX INFO: renamed from: a */
    public static final zq70 f285323a;

    /* JADX INFO: renamed from: b */
    public static final zq70 f285324b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zq70[] f285325c;

    static {
        zq70 zq70Var = new zq70("Compact", 0);
        f285323a = zq70Var;
        zq70 zq70Var2 = new zq70("Expanded", 1);
        f285324b = zq70Var2;
        f285325c = new zq70[]{zq70Var, zq70Var2};
    }

    public static zq70 valueOf(String str) {
        return (zq70) Enum.valueOf(zq70.class, str);
    }

    public static zq70[] values() {
        return (zq70[]) f285325c.clone();
    }
}
