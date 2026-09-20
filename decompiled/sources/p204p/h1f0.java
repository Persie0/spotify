package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h1f0 {

    /* JADX INFO: renamed from: a */
    public static final h1f0 f86619a;

    /* JADX INFO: renamed from: b */
    public static final h1f0 f86620b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h1f0[] f86621c;

    static {
        h1f0 h1f0Var = new h1f0("OnYesReorderClicked", 0);
        f86619a = h1f0Var;
        h1f0 h1f0Var2 = new h1f0("OnKeepCurrentOrderClicked", 1);
        f86620b = h1f0Var2;
        f86621c = new h1f0[]{h1f0Var, h1f0Var2};
    }

    public static h1f0 valueOf(String str) {
        return (h1f0) Enum.valueOf(h1f0.class, str);
    }

    public static h1f0[] values() {
        return (h1f0[]) f86621c.clone();
    }
}
