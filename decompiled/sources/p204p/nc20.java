package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class nc20 {

    /* JADX INFO: renamed from: a */
    public static final nc20 f152403a;

    /* JADX INFO: renamed from: b */
    public static final nc20 f152404b;

    /* JADX INFO: renamed from: c */
    public static final nc20 f152405c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nc20[] f152406d;

    static {
        nc20 nc20Var = new nc20("SkipLimit", 0);
        f152403a = nc20Var;
        nc20 nc20Var2 = new nc20("TrackSelected", 1);
        f152404b = nc20Var2;
        nc20 nc20Var3 = new nc20("TrackSelectedOnSearch", 2);
        f152405c = nc20Var3;
        f152406d = new nc20[]{nc20Var, nc20Var2, nc20Var3, new nc20("Preview", 3)};
    }

    public static nc20 valueOf(String str) {
        return (nc20) Enum.valueOf(nc20.class, str);
    }

    public static nc20[] values() {
        return (nc20[]) f152406d.clone();
    }
}
