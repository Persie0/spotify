package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class rnk {

    /* JADX INFO: renamed from: a */
    public static final rnk f200935a;

    /* JADX INFO: renamed from: b */
    public static final rnk f200936b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ rnk[] f200937c;

    static {
        rnk rnkVar = new rnk("Resume", 0);
        f200935a = rnkVar;
        rnk rnkVar2 = new rnk("Clear", 1);
        f200936b = rnkVar2;
        f200937c = new rnk[]{rnkVar, rnkVar2};
    }

    public static rnk valueOf(String str) {
        return (rnk) Enum.valueOf(rnk.class, str);
    }

    public static rnk[] values() {
        return (rnk[]) f200937c.clone();
    }
}
