package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c2m {

    /* JADX INFO: renamed from: a */
    public static final c2m f33423a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ c2m[] f33424b;

    static {
        c2m c2mVar = new c2m("CardClicked", 0);
        f33423a = c2mVar;
        f33424b = new c2m[]{c2mVar};
    }

    public static c2m valueOf(String str) {
        return (c2m) Enum.valueOf(c2m.class, str);
    }

    public static c2m[] values() {
        return (c2m[]) f33424b.clone();
    }
}
