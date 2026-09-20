package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gvd {

    /* JADX INFO: renamed from: a */
    public static final gvd f84720a;

    /* JADX INFO: renamed from: b */
    public static final gvd f84721b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ gvd[] f84722c;

    static {
        gvd gvdVar = new gvd("NEWEST_FIRST", 0);
        f84720a = gvdVar;
        gvd gvdVar2 = new gvd("OLDEST_FIRST", 1);
        f84721b = gvdVar2;
        f84722c = new gvd[]{gvdVar, gvdVar2};
    }

    public static gvd valueOf(String str) {
        return (gvd) Enum.valueOf(gvd.class, str);
    }

    public static gvd[] values() {
        return (gvd[]) f84722c.clone();
    }
}
