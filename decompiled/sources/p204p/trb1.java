package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class trb1 {

    /* JADX INFO: renamed from: a */
    public static final trb1 f223035a;

    /* JADX INFO: renamed from: b */
    public static final trb1 f223036b;

    /* JADX INFO: renamed from: c */
    public static final trb1 f223037c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ trb1[] f223038d;

    static {
        trb1 trb1Var = new trb1("H264", 0);
        f223035a = trb1Var;
        trb1 trb1Var2 = new trb1("HEVC", 1);
        f223036b = trb1Var2;
        trb1 trb1Var3 = new trb1("AV1", 2);
        f223037c = trb1Var3;
        f223038d = new trb1[]{trb1Var, trb1Var2, trb1Var3};
    }

    public static trb1 valueOf(String str) {
        return (trb1) Enum.valueOf(trb1.class, str);
    }

    public static trb1[] values() {
        return (trb1[]) f223038d.clone();
    }
}
