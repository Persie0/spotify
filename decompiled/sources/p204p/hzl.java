package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hzl {

    /* JADX INFO: renamed from: a */
    public static final hzl f96967a;

    /* JADX INFO: renamed from: b */
    public static final hzl f96968b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hzl[] f96969c;

    static {
        hzl hzlVar = new hzl("CardClicked", 0);
        f96967a = hzlVar;
        hzl hzlVar2 = new hzl("CTAButtonClicked", 1);
        f96968b = hzlVar2;
        f96969c = new hzl[]{hzlVar, hzlVar2};
    }

    public static hzl valueOf(String str) {
        return (hzl) Enum.valueOf(hzl.class, str);
    }

    public static hzl[] values() {
        return (hzl[]) f96969c.clone();
    }
}
