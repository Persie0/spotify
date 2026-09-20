package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ed70 {

    /* JADX INFO: renamed from: a */
    public static final ed70 f58468a;

    /* JADX INFO: renamed from: b */
    public static final ed70 f58469b;

    /* JADX INFO: renamed from: c */
    public static final ed70 f58470c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ed70[] f58471d;

    static {
        ed70 ed70Var = new ed70("RUNTIME", 0);
        f58468a = ed70Var;
        ed70 ed70Var2 = new ed70("BINARY", 1);
        f58469b = ed70Var2;
        ed70 ed70Var3 = new ed70("SOURCE", 2);
        f58470c = ed70Var3;
        f58471d = new ed70[]{ed70Var, ed70Var2, ed70Var3};
    }

    public static ed70 valueOf(String str) {
        return (ed70) Enum.valueOf(ed70.class, str);
    }

    public static ed70[] values() {
        return (ed70[]) f58471d.clone();
    }
}
