package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bm50 {

    /* JADX INFO: renamed from: a */
    public static final bm50 f28379a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bm50[] f28380b;

    static {
        bm50 bm50Var = new bm50("Clicked", 0);
        f28379a = bm50Var;
        f28380b = new bm50[]{bm50Var};
    }

    public static bm50 valueOf(String str) {
        return (bm50) Enum.valueOf(bm50.class, str);
    }

    public static bm50[] values() {
        return (bm50[]) f28380b.clone();
    }
}
