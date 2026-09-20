package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xme {

    /* JADX INFO: renamed from: a */
    public static final xme f263347a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xme[] f263348b;

    static {
        xme xmeVar = new xme("CardClicked", 0);
        f263347a = xmeVar;
        f263348b = new xme[]{xmeVar};
    }

    public static xme valueOf(String str) {
        return (xme) Enum.valueOf(xme.class, str);
    }

    public static xme[] values() {
        return (xme[]) f263348b.clone();
    }
}
