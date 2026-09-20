package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ti90 {

    /* JADX INFO: renamed from: a */
    public static final ti90 f220581a;

    /* JADX INFO: renamed from: b */
    public static final ti90 f220582b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ti90[] f220583c;

    static {
        ti90 ti90Var = new ti90("Preview", 0);
        f220581a = ti90Var;
        ti90 ti90Var2 = new ti90("AlmostUp", 1);
        f220582b = ti90Var2;
        f220583c = new ti90[]{ti90Var, ti90Var2};
    }

    public static ti90 valueOf(String str) {
        return (ti90) Enum.valueOf(ti90.class, str);
    }

    public static ti90[] values() {
        return (ti90[]) f220583c.clone();
    }
}
