package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nm21 {

    /* JADX INFO: renamed from: a */
    public static final nm21 f155270a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nm21[] f155271b;

    static {
        nm21 nm21Var = new nm21("CONTENT_PICKER", 0);
        f155270a = nm21Var;
        f155271b = new nm21[]{nm21Var, new nm21("CAROUSEL", 1)};
    }

    public static nm21 valueOf(String str) {
        return (nm21) Enum.valueOf(nm21.class, str);
    }

    public static nm21[] values() {
        return (nm21[]) f155271b.clone();
    }
}
