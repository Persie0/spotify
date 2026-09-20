package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class od51 {

    /* JADX INFO: renamed from: a */
    public static final od51 f164101a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ od51[] f164102b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f164103c;

    static {
        od51 od51Var = new od51("DEFAULT", 0);
        f164101a = od51Var;
        od51[] od51VarArr = {od51Var, new od51("DETAIL", 1)};
        f164102b = od51VarArr;
        f164103c = new nzv(od51VarArr);
    }

    public static od51 valueOf(String str) {
        return (od51) Enum.valueOf(od51.class, str);
    }

    public static od51[] values() {
        return (od51[]) f164102b.clone();
    }
}
