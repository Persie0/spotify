package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class naz0 {

    /* JADX INFO: renamed from: a */
    public static final naz0 f152141a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ naz0[] f152142b;

    static {
        naz0 naz0Var = new naz0("Clicked", 0);
        f152141a = naz0Var;
        f152142b = new naz0[]{naz0Var};
    }

    public static naz0 valueOf(String str) {
        return (naz0) Enum.valueOf(naz0.class, str);
    }

    public static naz0[] values() {
        return (naz0[]) f152142b.clone();
    }
}
