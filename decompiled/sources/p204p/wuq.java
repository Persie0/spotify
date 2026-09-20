package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wuq {

    /* JADX INFO: renamed from: a */
    public static final wuq f255252a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wuq[] f255253b;

    static {
        wuq wuqVar = new wuq("LINK_TAPPED", 0);
        f255252a = wuqVar;
        f255253b = new wuq[]{wuqVar};
    }

    public static wuq valueOf(String str) {
        return (wuq) Enum.valueOf(wuq.class, str);
    }

    public static wuq[] values() {
        return (wuq[]) f255253b.clone();
    }
}
