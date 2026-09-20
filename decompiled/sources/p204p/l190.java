package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l190 {

    /* JADX INFO: renamed from: a */
    public static final l190 f128655a;

    /* JADX INFO: renamed from: b */
    public static final l190 f128656b;

    /* JADX INFO: renamed from: c */
    public static final l190 f128657c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ l190[] f128658d;

    static {
        l190 l190Var = new l190("ShuffleOnly", 0);
        f128655a = l190Var;
        l190 l190Var2 = new l190("JumpInOnDemand", 1);
        f128656b = l190Var2;
        l190 l190Var3 = new l190("None", 2);
        f128657c = l190Var3;
        f128658d = new l190[]{l190Var, l190Var2, l190Var3};
    }

    public static l190 valueOf(String str) {
        return (l190) Enum.valueOf(l190.class, str);
    }

    public static l190[] values() {
        return (l190[]) f128658d.clone();
    }
}
