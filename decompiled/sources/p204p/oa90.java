package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class oa90 {

    /* JADX INFO: renamed from: a */
    public static final oa90 f163270a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ oa90[] f163271b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f163272c;

    static {
        oa90 oa90Var = new oa90("DM", 0);
        f163270a = oa90Var;
        oa90[] oa90VarArr = {oa90Var, new oa90("Following", 1), new oa90("Group", 2)};
        f163271b = oa90VarArr;
        f163272c = new nzv(oa90VarArr);
    }

    public static oa90 valueOf(String str) {
        return (oa90) Enum.valueOf(oa90.class, str);
    }

    public static oa90[] values() {
        return (oa90[]) f163271b.clone();
    }
}
