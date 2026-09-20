package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t1m {

    /* JADX INFO: renamed from: a */
    public static final t1m f216295a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ t1m[] f216296b;

    static {
        t1m t1mVar = new t1m("ActionClicked", 0);
        f216295a = t1mVar;
        f216296b = new t1m[]{t1mVar};
    }

    public static t1m valueOf(String str) {
        return (t1m) Enum.valueOf(t1m.class, str);
    }

    public static t1m[] values() {
        return (t1m[]) f216296b.clone();
    }
}
