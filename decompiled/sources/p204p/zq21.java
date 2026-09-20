package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zq21 {

    /* JADX INFO: renamed from: a */
    public static final zq21 f285293a;

    /* JADX INFO: renamed from: b */
    public static final zq21 f285294b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zq21[] f285295c;

    static {
        zq21 zq21Var = new zq21("THUMB", 0);
        f285293a = zq21Var;
        zq21 zq21Var2 = new zq21("TRACK", 1);
        f285294b = zq21Var2;
        f285295c = new zq21[]{zq21Var, zq21Var2};
    }

    public static zq21 valueOf(String str) {
        return (zq21) Enum.valueOf(zq21.class, str);
    }

    public static zq21[] values() {
        return (zq21[]) f285295c.clone();
    }
}
