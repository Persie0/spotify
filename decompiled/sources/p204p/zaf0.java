package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class zaf0 {

    /* JADX INFO: renamed from: a */
    public static final zaf0 f281059a;

    /* JADX INFO: renamed from: b */
    public static final zaf0 f281060b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zaf0[] f281061c;

    static {
        zaf0 zaf0Var = new zaf0("OneLineMetadata", 0);
        f281059a = zaf0Var;
        zaf0 zaf0Var2 = new zaf0("TwoLineMetadata", 1);
        f281060b = zaf0Var2;
        f281061c = new zaf0[]{zaf0Var, zaf0Var2};
    }

    public static zaf0 valueOf(String str) {
        return (zaf0) Enum.valueOf(zaf0.class, str);
    }

    public static zaf0[] values() {
        return (zaf0[]) f281061c.clone();
    }
}
