package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b300 {

    /* JADX INFO: renamed from: a */
    public static final b300 f22754a;

    /* JADX INFO: renamed from: b */
    public static final b300 f22755b;

    /* JADX INFO: renamed from: c */
    public static final b300 f22756c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b300[] f22757d;

    static {
        b300 b300Var = new b300("FOREGROUND_KEEPER_SERVICE", 0);
        f22754a = b300Var;
        b300 b300Var2 = new b300("SPOTIFY_SERVICE", 1);
        f22755b = b300Var2;
        b300 b300Var3 = new b300("SPOTIFY_ALARM_LAUNCHER_SERVICE", 2);
        f22756c = b300Var3;
        f22757d = new b300[]{b300Var, b300Var2, b300Var3};
    }

    public static b300 valueOf(String str) {
        return (b300) Enum.valueOf(b300.class, str);
    }

    public static b300[] values() {
        return (b300[]) f22757d.clone();
    }
}
