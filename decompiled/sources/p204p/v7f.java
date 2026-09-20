package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class v7f {

    /* JADX INFO: renamed from: a */
    public static final long f238171a;

    /* JADX INFO: renamed from: b */
    public static final long f238172b;

    /* JADX INFO: renamed from: c */
    public static final long f238173c;

    /* JADX INFO: renamed from: d */
    public static final long f238174d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f238175e = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        f238171a = (((long) 0) & 4294967295L) | j2;
        f238172b = (((long) 1) & 4294967295L) | j2;
        f238173c = j2 | (((long) 2) & 4294967295L);
        f238174d = (j & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m84848a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m84849b(long j) {
        if (m84848a(j, f238171a)) {
            return "Rgb";
        }
        if (m84848a(j, f238172b)) {
            return "Xyz";
        }
        if (m84848a(j, f238173c)) {
            return "Lab";
        }
        return m84848a(j, f238174d) ? "Cmyk" : "Unknown";
    }
}
