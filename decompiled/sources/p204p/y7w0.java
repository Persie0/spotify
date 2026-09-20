package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y7w0 {

    /* JADX INFO: renamed from: a */
    public static final y7w0 f270140a;

    /* JADX INFO: renamed from: b */
    public static final y7w0 f270141b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ y7w0[] f270142c;

    static {
        y7w0 y7w0Var = new y7w0("ALBUM", 0);
        f270140a = y7w0Var;
        y7w0 y7w0Var2 = new y7w0("NOT_ALBUM", 1);
        f270141b = y7w0Var2;
        f270142c = new y7w0[]{y7w0Var, y7w0Var2};
    }

    public static y7w0 valueOf(String str) {
        return (y7w0) Enum.valueOf(y7w0.class, str);
    }

    public static y7w0[] values() {
        return (y7w0[]) f270142c.clone();
    }
}
