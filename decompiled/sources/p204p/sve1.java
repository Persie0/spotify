package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class sve1 {

    /* JADX INFO: renamed from: a */
    public static final sve1 f214417a;

    /* JADX INFO: renamed from: b */
    public static final sve1 f214418b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ sve1[] f214419c;

    static {
        sve1 sve1Var = new sve1("MusicLinkClicked", 0);
        f214417a = sve1Var;
        sve1 sve1Var2 = new sve1("PodcastsLinkClicked", 1);
        f214418b = sve1Var2;
        f214419c = new sve1[]{sve1Var, sve1Var2};
    }

    public static sve1 valueOf(String str) {
        return (sve1) Enum.valueOf(sve1.class, str);
    }

    public static sve1[] values() {
        return (sve1[]) f214419c.clone();
    }
}
