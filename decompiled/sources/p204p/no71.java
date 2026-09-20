package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class no71 {
    public static final mo71 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f156615a;

    /* JADX INFO: renamed from: b */
    public static final no71 f156616b;

    /* JADX INFO: renamed from: c */
    public static final no71 f156617c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ no71[] f156618d;

    static {
        no71 no71Var = new no71("WORD_TIMESTAMP_ACCURACY_UNSPECIFIED", 0);
        f156616b = no71Var;
        no71 no71Var2 = new no71("WORD_TIMESTAMP_ACCURACY_PRECISE", 1);
        f156617c = no71Var2;
        f156618d = new no71[]{no71Var, no71Var2, new no71("WORD_TIMESTAMP_ACCURACY_APPROXIMATE", 2)};
        Companion = new mo71();
        f156615a = q3d0.m72078I(2, uv51.f234357X0);
    }

    public static no71 valueOf(String str) {
        return (no71) Enum.valueOf(no71.class, str);
    }

    public static no71[] values() {
        return (no71[]) f156618d.clone();
    }
}
