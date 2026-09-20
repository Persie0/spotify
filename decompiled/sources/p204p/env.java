package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class env {

    /* JADX INFO: renamed from: a */
    public static final env f61233a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ env[] f61234b;

    static {
        env envVar = new env("SingleLine", 0);
        f61233a = envVar;
        f61234b = new env[]{envVar, new env("TwoLines", 1), new env("ThreeLines", 2), new env("Multiline", 3)};
    }

    public static env valueOf(String str) {
        return (env) Enum.valueOf(env.class, str);
    }

    public static env[] values() {
        return (env[]) f61234b.clone();
    }
}
