package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wr11 {

    /* JADX INFO: renamed from: a */
    public static final wr11 f254243a;

    /* JADX INFO: renamed from: b */
    public static final wr11 f254244b;

    /* JADX INFO: renamed from: c */
    public static final wr11 f254245c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wr11[] f254246d;

    static {
        wr11 wr11Var = new wr11("OTHER", 0);
        f254243a = wr11Var;
        wr11 wr11Var2 = new wr11("AUDIOBOOK", 1);
        f254244b = wr11Var2;
        wr11 wr11Var3 = new wr11("AUDIOBOOK_PRE_RELEASE", 2);
        f254245c = wr11Var3;
        f254246d = new wr11[]{wr11Var, wr11Var2, wr11Var3};
    }

    public static wr11 valueOf(String str) {
        return (wr11) Enum.valueOf(wr11.class, str);
    }

    public static wr11[] values() {
        return (wr11[]) f254246d.clone();
    }
}
