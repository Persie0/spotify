package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xbr {

    /* JADX INFO: renamed from: a */
    public static final xbr f259983a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xbr[] f259984b;

    static {
        xbr xbrVar = new xbr("ConnectTimestamps", 0);
        f259983a = xbrVar;
        f259984b = new xbr[]{xbrVar};
    }

    public static xbr valueOf(String str) {
        return (xbr) Enum.valueOf(xbr.class, str);
    }

    public static xbr[] values() {
        return (xbr[]) f259984b.clone();
    }
}
