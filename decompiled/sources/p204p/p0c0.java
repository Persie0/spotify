package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class p0c0 {

    /* JADX INFO: renamed from: a */
    public static final p0c0 f172639a;

    /* JADX INFO: renamed from: b */
    public static final p0c0 f172640b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ p0c0[] f172641c;

    static {
        p0c0 p0c0Var = new p0c0("CancelButtonClicked", 0);
        f172639a = p0c0Var;
        p0c0 p0c0Var2 = new p0c0("MakePlaylistVisibleOnProfileClicked", 1);
        f172640b = p0c0Var2;
        f172641c = new p0c0[]{p0c0Var, p0c0Var2};
    }

    public static p0c0 valueOf(String str) {
        return (p0c0) Enum.valueOf(p0c0.class, str);
    }

    public static p0c0[] values() {
        return (p0c0[]) f172641c.clone();
    }
}
