package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yyn0 {

    /* JADX INFO: renamed from: a */
    public static final yyn0 f277546a;

    /* JADX INFO: renamed from: b */
    public static final yyn0 f277547b;

    /* JADX INFO: renamed from: c */
    public static final yyn0 f277548c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yyn0[] f277549d;

    static {
        yyn0 yyn0Var = new yyn0("VISIBLE", 0);
        f277546a = yyn0Var;
        yyn0 yyn0Var2 = new yyn0("HIDDEN", 1);
        f277547b = yyn0Var2;
        yyn0 yyn0Var3 = new yyn0("DISPOSED", 2);
        f277548c = yyn0Var3;
        f277549d = new yyn0[]{yyn0Var, yyn0Var2, yyn0Var3};
    }

    public static yyn0 valueOf(String str) {
        return (yyn0) Enum.valueOf(yyn0.class, str);
    }

    public static yyn0[] values() {
        return (yyn0[]) f277549d.clone();
    }
}
