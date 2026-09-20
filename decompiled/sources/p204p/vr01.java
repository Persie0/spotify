package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vr01 {

    /* JADX INFO: renamed from: a */
    public static final vr01 f244042a;

    /* JADX INFO: renamed from: b */
    public static final vr01 f244043b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vr01[] f244044c;

    static {
        vr01 vr01Var = new vr01("UNKNOWN", 0);
        f244042a = vr01Var;
        vr01 vr01Var2 = new vr01("UGC", 1);
        f244043b = vr01Var2;
        f244044c = new vr01[]{vr01Var, vr01Var2};
    }

    public static vr01 valueOf(String str) {
        return (vr01) Enum.valueOf(vr01.class, str);
    }

    public static vr01[] values() {
        return (vr01[]) f244044c.clone();
    }
}
