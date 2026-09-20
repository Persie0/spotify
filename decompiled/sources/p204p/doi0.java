package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class doi0 {

    /* JADX INFO: renamed from: a */
    public static final doi0 f51050a;

    /* JADX INFO: renamed from: b */
    public static final doi0 f51051b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ doi0[] f51052c;

    static {
        doi0 doi0Var = new doi0("READ_ONLY", 0);
        f51050a = doi0Var;
        doi0 doi0Var2 = new doi0("MUTABLE", 1);
        f51051b = doi0Var2;
        f51052c = new doi0[]{doi0Var, doi0Var2};
    }

    public static doi0 valueOf(String str) {
        return (doi0) Enum.valueOf(doi0.class, str);
    }

    public static doi0[] values() {
        return (doi0[]) f51052c.clone();
    }
}
