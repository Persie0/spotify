package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class eux0 {

    /* JADX INFO: renamed from: a */
    public static final eux0 f63104a;

    /* JADX INFO: renamed from: b */
    public static final eux0 f63105b;

    /* JADX INFO: renamed from: c */
    public static final eux0 f63106c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ eux0[] f63107d;

    static {
        eux0 eux0Var = new eux0("IDLE", 0);
        f63104a = eux0Var;
        eux0 eux0Var2 = new eux0("USER_INTERACTING", 1);
        f63105b = eux0Var2;
        eux0 eux0Var3 = new eux0("ANIMATING_EXTERNAL", 2);
        f63106c = eux0Var3;
        f63107d = new eux0[]{eux0Var, eux0Var2, eux0Var3};
    }

    public static eux0 valueOf(String str) {
        return (eux0) Enum.valueOf(eux0.class, str);
    }

    public static eux0[] values() {
        return (eux0[]) f63107d.clone();
    }
}
