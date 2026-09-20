package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ur20 {

    /* JADX INFO: renamed from: a */
    public static final ur20 f233186a;

    /* JADX INFO: renamed from: b */
    public static final ur20 f233187b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ur20[] f233188c;

    static {
        ur20 ur20Var = new ur20("LikedSongs", 0);
        f233186a = ur20Var;
        ur20 ur20Var2 = new ur20("YourEpisodes", 1);
        f233187b = ur20Var2;
        f233188c = new ur20[]{ur20Var, ur20Var2};
    }

    public static ur20 valueOf(String str) {
        return (ur20) Enum.valueOf(ur20.class, str);
    }

    public static ur20[] values() {
        return (ur20[]) f233188c.clone();
    }
}
