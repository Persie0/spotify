package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f7u0 {

    /* JADX INFO: renamed from: a */
    public static final f7u0 f66799a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ f7u0[] f66800b;

    static {
        f7u0 f7u0Var = new f7u0("Clicked", 0);
        f66799a = f7u0Var;
        f66800b = new f7u0[]{f7u0Var};
    }

    public static f7u0 valueOf(String str) {
        return (f7u0) Enum.valueOf(f7u0.class, str);
    }

    public static f7u0[] values() {
        return (f7u0[]) f66800b.clone();
    }
}
