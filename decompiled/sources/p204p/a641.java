package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a641 {

    /* JADX INFO: renamed from: a */
    public static final a641 f12693a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ a641[] f12694b;

    static {
        a641 a641Var = new a641("Unavailable", 0);
        f12693a = a641Var;
        f12694b = new a641[]{a641Var, new a641("Displaying", 1), new a641("Complete", 2)};
    }

    public static a641 valueOf(String str) {
        return (a641) Enum.valueOf(a641.class, str);
    }

    public static a641[] values() {
        return (a641[]) f12694b.clone();
    }
}
