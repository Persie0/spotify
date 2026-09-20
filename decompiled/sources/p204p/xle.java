package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xle {

    /* JADX INFO: renamed from: a */
    public static final xle f263134a;

    /* JADX INFO: renamed from: b */
    public static final xle f263135b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xle[] f263136c;

    /* JADX INFO: Fake field, exist only in values array */
    xle EF0;

    static {
        xle xleVar = new xle("STATIC", 0);
        xle xleVar2 = new xle("SANDBOX", 1);
        xle xleVar3 = new xle("CARDASHIANS", 2);
        f263134a = xleVar3;
        xle xleVar4 = new xle("CARDASHIANS_MUSIC", 3);
        f263135b = xleVar4;
        f263136c = new xle[]{xleVar, xleVar2, xleVar3, xleVar4};
    }

    public static xle valueOf(String str) {
        return (xle) Enum.valueOf(xle.class, str);
    }

    public static xle[] values() {
        return (xle[]) f263136c.clone();
    }
}
