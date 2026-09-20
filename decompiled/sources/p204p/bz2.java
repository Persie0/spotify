package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bz2 {

    /* JADX INFO: renamed from: a */
    public static final bz2 f32377a;

    /* JADX INFO: renamed from: b */
    public static final bz2 f32378b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bz2[] f32379c;

    static {
        bz2 bz2Var = new bz2("Tour", 0);
        f32377a = bz2Var;
        bz2 bz2Var2 = new bz2("Concert", 1);
        f32378b = bz2Var2;
        f32379c = new bz2[]{bz2Var, bz2Var2};
    }

    public static bz2 valueOf(String str) {
        return (bz2) Enum.valueOf(bz2.class, str);
    }

    public static bz2[] values() {
        return (bz2[]) f32379c.clone();
    }
}
