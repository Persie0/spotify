package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class aqc1 {

    /* JADX INFO: renamed from: a */
    public static final aqc1 f18211a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ aqc1[] f18212b;

    static {
        aqc1 aqc1Var = new aqc1("Visible", 0);
        f18211a = aqc1Var;
        f18212b = new aqc1[]{aqc1Var, new aqc1("Invisible", 1), new aqc1("Gone", 2)};
    }

    public static aqc1 valueOf(String str) {
        return (aqc1) Enum.valueOf(aqc1.class, str);
    }

    public static aqc1[] values() {
        return (aqc1[]) f18212b.clone();
    }
}
