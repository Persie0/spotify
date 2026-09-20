package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y4c1 {

    /* JADX INFO: renamed from: a */
    public static final y4c1 f269120a;

    /* JADX INFO: renamed from: b */
    public static final y4c1 f269121b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ y4c1[] f269122c;

    static {
        y4c1 y4c1Var = new y4c1("VideoOnly", 0);
        f269120a = y4c1Var;
        y4c1 y4c1Var2 = new y4c1("SessionOnly", 1);
        f269121b = y4c1Var2;
        f269122c = new y4c1[]{y4c1Var, y4c1Var2};
    }

    public static y4c1 valueOf(String str) {
        return (y4c1) Enum.valueOf(y4c1.class, str);
    }

    public static y4c1[] values() {
        return (y4c1[]) f269122c.clone();
    }
}
