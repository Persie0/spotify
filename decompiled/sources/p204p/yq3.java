package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class yq3 {

    /* JADX INFO: renamed from: a */
    public static final yq3 f275128a;

    /* JADX INFO: renamed from: b */
    public static final yq3 f275129b;

    /* JADX INFO: renamed from: c */
    public static final yq3 f275130c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yq3[] f275131d;

    static {
        yq3 yq3Var = new yq3("START", 0);
        f275128a = yq3Var;
        yq3 yq3Var2 = new yq3("JUNCTION", 1);
        f275129b = yq3Var2;
        yq3 yq3Var3 = new yq3("END", 2);
        f275130c = yq3Var3;
        f275131d = new yq3[]{yq3Var, yq3Var2, yq3Var3};
    }

    public static yq3 valueOf(String str) {
        return (yq3) Enum.valueOf(yq3.class, str);
    }

    public static yq3[] values() {
        return (yq3[]) f275131d.clone();
    }
}
