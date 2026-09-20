package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xas {

    /* JADX INFO: renamed from: a */
    public static final xas f259752a;

    /* JADX INFO: renamed from: b */
    public static final xas f259753b;

    /* JADX INFO: renamed from: c */
    public static final xas f259754c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xas[] f259755d;

    static {
        xas xasVar = new xas("PLAYLIST", 0);
        f259752a = xasVar;
        xas xasVar2 = new xas("ALBUM", 1);
        f259753b = xasVar2;
        xas xasVar3 = new xas("LIKED_SONGS", 2);
        f259754c = xasVar3;
        f259755d = new xas[]{xasVar, xasVar2, xasVar3};
    }

    public static xas valueOf(String str) {
        return (xas) Enum.valueOf(xas.class, str);
    }

    public static xas[] values() {
        return (xas[]) f259755d.clone();
    }
}
