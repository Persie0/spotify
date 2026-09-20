package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class fnf {

    /* JADX INFO: renamed from: a */
    public static final fnf f71278a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fnf[] f71279b;

    static {
        fnf fnfVar = new fnf("PRODUCTION", 0);
        f71278a = fnfVar;
        f71279b = new fnf[]{fnfVar, new fnf("TESTING", 1)};
    }

    public static fnf valueOf(String str) {
        return (fnf) Enum.valueOf(fnf.class, str);
    }

    public static fnf[] values() {
        return (fnf[]) f71279b.clone();
    }
}
