package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u52 {

    /* JADX INFO: renamed from: a */
    public static final u52 f226879a;

    /* JADX INFO: renamed from: b */
    public static final u52 f226880b;

    /* JADX INFO: renamed from: c */
    public static final u52 f226881c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ u52[] f226882d;

    static {
        u52 u52Var = new u52("ContinueClick", 0);
        f226879a = u52Var;
        u52 u52Var2 = new u52("CancelClick", 1);
        f226880b = u52Var2;
        u52 u52Var3 = new u52("ReadMoreClick", 2);
        f226881c = u52Var3;
        f226882d = new u52[]{u52Var, u52Var2, u52Var3};
    }

    public static u52 valueOf(String str) {
        return (u52) Enum.valueOf(u52.class, str);
    }

    public static u52[] values() {
        return (u52[]) f226882d.clone();
    }
}
