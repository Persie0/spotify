package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h2k {

    /* JADX INFO: renamed from: a */
    public static final h2k f87014a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ h2k[] f87015b;

    static {
        h2k h2kVar = new h2k("OnClicked", 0);
        f87014a = h2kVar;
        f87015b = new h2k[]{h2kVar};
    }

    public static h2k valueOf(String str) {
        return (h2k) Enum.valueOf(h2k.class, str);
    }

    public static h2k[] values() {
        return (h2k[]) f87015b.clone();
    }
}
