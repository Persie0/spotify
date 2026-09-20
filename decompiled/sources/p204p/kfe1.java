package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kfe1 {

    /* JADX INFO: renamed from: a */
    public static final kfe1 f122154a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kfe1[] f122155b;

    static {
        kfe1 kfe1Var = new kfe1("POST_FAILED", 0);
        f122154a = kfe1Var;
        f122155b = new kfe1[]{kfe1Var};
    }

    public static kfe1 valueOf(String str) {
        return (kfe1) Enum.valueOf(kfe1.class, str);
    }

    public static kfe1[] values() {
        return (kfe1[]) f122155b.clone();
    }
}
