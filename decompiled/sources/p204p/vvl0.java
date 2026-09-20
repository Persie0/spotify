package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vvl0 {

    /* JADX INFO: renamed from: a */
    public static final vvl0 f245248a;

    /* JADX INFO: renamed from: b */
    public static final vvl0 f245249b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vvl0[] f245250c;

    static {
        vvl0 vvl0Var = new vvl0("Vertical", 0);
        f245248a = vvl0Var;
        vvl0 vvl0Var2 = new vvl0("Horizontal", 1);
        f245249b = vvl0Var2;
        f245250c = new vvl0[]{vvl0Var, vvl0Var2};
    }

    public static vvl0 valueOf(String str) {
        return (vvl0) Enum.valueOf(vvl0.class, str);
    }

    public static vvl0[] values() {
        return (vvl0[]) f245250c.clone();
    }
}
