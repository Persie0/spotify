package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class egk0 {

    /* JADX INFO: renamed from: a */
    public static final egk0 f59354a;

    /* JADX INFO: renamed from: b */
    public static final egk0 f59355b;

    /* JADX INFO: renamed from: c */
    public static final egk0 f59356c;

    /* JADX INFO: renamed from: d */
    public static final egk0 f59357d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ egk0[] f59358e;

    static {
        egk0 egk0Var = new egk0("Unspecified", 0);
        f59354a = egk0Var;
        egk0 egk0Var2 = new egk0("ChapterSkipEnabled", 1);
        f59355b = egk0Var2;
        egk0 egk0Var3 = new egk0("NpvContentLayerTapSkip15s", 2);
        f59356c = egk0Var3;
        egk0 egk0Var4 = new egk0("Unrecognized", 3);
        f59357d = egk0Var4;
        f59358e = new egk0[]{egk0Var, egk0Var2, egk0Var3, egk0Var4};
    }

    public static egk0 valueOf(String str) {
        return (egk0) Enum.valueOf(egk0.class, str);
    }

    public static egk0[] values() {
        return (egk0[]) f59358e.clone();
    }
}
