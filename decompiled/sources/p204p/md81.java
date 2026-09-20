package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class md81 {

    /* JADX INFO: renamed from: a */
    public static final md81 f142347a;

    /* JADX INFO: renamed from: b */
    public static final md81 f142348b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ md81[] f142349c;

    static {
        md81 md81Var = new md81("IN_PLAYLIST", 0);
        f142347a = md81Var;
        md81 md81Var2 = new md81("RECOMMENDATION", 1);
        f142348b = md81Var2;
        f142349c = new md81[]{md81Var, md81Var2};
    }

    public static md81 valueOf(String str) {
        return (md81) Enum.valueOf(md81.class, str);
    }

    public static md81[] values() {
        return (md81[]) f142349c.clone();
    }
}
