package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ywv {

    /* JADX INFO: renamed from: a */
    public static final ywv f277064a;

    /* JADX INFO: renamed from: b */
    public static final ywv f277065b;

    /* JADX INFO: renamed from: c */
    public static final ywv f277066c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ywv[] f277067d;

    static {
        ywv ywvVar = new ywv("SingleLine", 0);
        f277064a = ywvVar;
        ywv ywvVar2 = new ywv("TwoLines", 1);
        f277065b = ywvVar2;
        ywv ywvVar3 = new ywv("ThreeLines", 2);
        f277066c = ywvVar3;
        f277067d = new ywv[]{ywvVar, ywvVar2, ywvVar3, new ywv("Multiline", 3)};
    }

    public static ywv valueOf(String str) {
        return (ywv) Enum.valueOf(ywv.class, str);
    }

    public static ywv[] values() {
        return (ywv[]) f277067d.clone();
    }
}
