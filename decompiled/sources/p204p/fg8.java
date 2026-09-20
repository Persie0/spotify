package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fg8 {

    /* JADX INFO: renamed from: a */
    public static final fg8 f69242a;

    /* JADX INFO: renamed from: b */
    public static final fg8 f69243b;

    /* JADX INFO: renamed from: c */
    public static final fg8 f69244c;

    /* JADX INFO: renamed from: d */
    public static final fg8 f69245d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fg8[] f69246e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f69247f;

    static {
        fg8 fg8Var = new fg8("IMMEDIATE", 0);
        f69242a = fg8Var;
        fg8 fg8Var2 = new fg8("CLOSE", 1);
        f69243b = fg8Var2;
        fg8 fg8Var3 = new fg8("FAR", 2);
        f69244c = fg8Var3;
        fg8 fg8Var4 = new fg8("UNKNOWN", 3);
        f69245d = fg8Var4;
        fg8[] fg8VarArr = {fg8Var, fg8Var2, fg8Var3, fg8Var4};
        f69246e = fg8VarArr;
        f69247f = new nzv(fg8VarArr);
    }

    public static fg8 valueOf(String str) {
        return (fg8) Enum.valueOf(fg8.class, str);
    }

    public static fg8[] values() {
        return (fg8[]) f69246e.clone();
    }
}
