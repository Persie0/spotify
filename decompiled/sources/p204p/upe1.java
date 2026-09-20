package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class upe1 {

    /* JADX INFO: renamed from: a */
    public static final upe1 f232664a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ upe1[] f232665b;

    /* JADX INFO: Fake field, exist only in values array */
    upe1 EF0;

    static {
        upe1 upe1Var = new upe1("PODCAST_DOWNLOADS", 0);
        upe1 upe1Var2 = new upe1("PODCAST_EPISODES", 1);
        f232664a = upe1Var2;
        f232665b = new upe1[]{upe1Var, upe1Var2, new upe1("PODCAST_FOLLOWED", 2)};
    }

    public static upe1 valueOf(String str) {
        return (upe1) Enum.valueOf(upe1.class, str);
    }

    public static upe1[] values() {
        return (upe1[]) f232665b.clone();
    }
}
