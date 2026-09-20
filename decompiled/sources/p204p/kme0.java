package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class kme0 {

    /* JADX INFO: renamed from: a */
    public static final kme0 f124128a;

    /* JADX INFO: renamed from: b */
    public static final kme0 f124129b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kme0[] f124130c;

    static {
        kme0 kme0Var = new kme0("DismissButtonClicked", 0);
        f124128a = kme0Var;
        kme0 kme0Var2 = new kme0("ActionButtonClicked", 1);
        f124129b = kme0Var2;
        f124130c = new kme0[]{kme0Var, kme0Var2};
    }

    public static kme0 valueOf(String str) {
        return (kme0) Enum.valueOf(kme0.class, str);
    }

    public static kme0[] values() {
        return (kme0[]) f124130c.clone();
    }
}
