package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class nd80 {

    /* JADX INFO: renamed from: a */
    public static final nd80 f152702a;

    /* JADX INFO: renamed from: b */
    public static final nd80 f152703b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nd80[] f152704c;

    static {
        nd80 nd80Var = new nd80("Success", 0);
        f152702a = nd80Var;
        nd80 nd80Var2 = new nd80("Failure", 1);
        f152703b = nd80Var2;
        f152704c = new nd80[]{nd80Var, nd80Var2};
    }

    public static nd80 valueOf(String str) {
        return (nd80) Enum.valueOf(nd80.class, str);
    }

    public static nd80[] values() {
        return (nd80[]) f152704c.clone();
    }
}
