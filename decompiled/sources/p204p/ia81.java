package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ia81 {

    /* JADX INFO: renamed from: a */
    public static final ia81 f100179a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ia81[] f100180b;

    static {
        ia81 ia81Var = new ia81("CardClicked", 0);
        f100179a = ia81Var;
        f100180b = new ia81[]{ia81Var, new ia81("CtaButtonClicked", 1)};
    }

    public static ia81 valueOf(String str) {
        return (ia81) Enum.valueOf(ia81.class, str);
    }

    public static ia81[] values() {
        return (ia81[]) f100180b.clone();
    }
}
