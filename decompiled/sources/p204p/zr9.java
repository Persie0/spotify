package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zr9 {

    /* JADX INFO: renamed from: a */
    public static final zr9 f285583a;

    /* JADX INFO: renamed from: b */
    public static final zr9 f285584b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zr9[] f285585c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f285586d;

    static {
        zr9 zr9Var = new zr9("PENDING_DISABLED", 0);
        f285583a = zr9Var;
        zr9 zr9Var2 = new zr9("REACTIVATED", 1);
        f285584b = zr9Var2;
        zr9[] zr9VarArr = {zr9Var, zr9Var2};
        f285585c = zr9VarArr;
        f285586d = new nzv(zr9VarArr);
    }

    public static zr9 valueOf(String str) {
        return (zr9) Enum.valueOf(zr9.class, str);
    }

    public static zr9[] values() {
        return (zr9[]) f285585c.clone();
    }
}
