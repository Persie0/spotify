package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class tdr0 {

    /* JADX INFO: renamed from: a */
    public static final tdr0 f219464a;

    /* JADX INFO: renamed from: b */
    public static final tdr0 f219465b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tdr0[] f219466c;

    static {
        tdr0 tdr0Var = new tdr0("AskToJoinClicked", 0);
        f219464a = tdr0Var;
        tdr0 tdr0Var2 = new tdr0("JoinClicked", 1);
        f219465b = tdr0Var2;
        f219466c = new tdr0[]{tdr0Var, tdr0Var2};
    }

    public static tdr0 valueOf(String str) {
        return (tdr0) Enum.valueOf(tdr0.class, str);
    }

    public static tdr0[] values() {
        return (tdr0[]) f219466c.clone();
    }
}
