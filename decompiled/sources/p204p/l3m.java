package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l3m {

    /* JADX INFO: renamed from: a */
    public static final l3m f129347a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ l3m[] f129348b;

    static {
        l3m l3mVar = new l3m("Clicked", 0);
        f129347a = l3mVar;
        f129348b = new l3m[]{l3mVar};
    }

    public static l3m valueOf(String str) {
        return (l3m) Enum.valueOf(l3m.class, str);
    }

    public static l3m[] values() {
        return (l3m[]) f129348b.clone();
    }
}
