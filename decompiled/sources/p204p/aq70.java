package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class aq70 {

    /* JADX INFO: renamed from: a */
    public static final aq70 f18126a;

    /* JADX INFO: renamed from: b */
    public static final aq70 f18127b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ aq70[] f18128c;

    static {
        aq70 aq70Var = new aq70("PORTRAIT", 0);
        f18126a = aq70Var;
        aq70 aq70Var2 = new aq70("LANDSCAPE", 1);
        f18127b = aq70Var2;
        f18128c = new aq70[]{aq70Var, aq70Var2};
    }

    public static aq70 valueOf(String str) {
        return (aq70) Enum.valueOf(aq70.class, str);
    }

    public static aq70[] values() {
        return (aq70[]) f18128c.clone();
    }
}
