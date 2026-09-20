package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h16 {

    /* JADX INFO: renamed from: a */
    public static final h16 f86518a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ h16[] f86519b;

    static {
        h16 h16Var = new h16("CardClicked", 0);
        f86518a = h16Var;
        f86519b = new h16[]{h16Var};
    }

    public static h16 valueOf(String str) {
        return (h16) Enum.valueOf(h16.class, str);
    }

    public static h16[] values() {
        return (h16[]) f86519b.clone();
    }
}
