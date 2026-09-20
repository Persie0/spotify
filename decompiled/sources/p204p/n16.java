package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n16 {

    /* JADX INFO: renamed from: a */
    public static final n16 f149303a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ n16[] f149304b;

    static {
        n16 n16Var = new n16("CardClicked", 0);
        f149303a = n16Var;
        f149304b = new n16[]{n16Var};
    }

    public static n16 valueOf(String str) {
        return (n16) Enum.valueOf(n16.class, str);
    }

    public static n16[] values() {
        return (n16[]) f149304b.clone();
    }
}
