package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sf71 {

    /* JADX INFO: renamed from: i */
    public static final k971 f208486i = new k971(3);

    /* JADX INFO: renamed from: a */
    public final int f208487a;

    /* JADX INFO: renamed from: b */
    public final String f208488b;

    /* JADX INFO: renamed from: c */
    public final String f208489c;

    /* JADX INFO: renamed from: d */
    public final long f208490d;

    /* JADX INFO: renamed from: e */
    public final long f208491e;

    /* JADX INFO: renamed from: f */
    public final long f208492f;

    /* JADX INFO: renamed from: g */
    public final boolean f208493g;

    /* JADX INFO: renamed from: h */
    public final int f208494h;

    public sf71(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i2 & 64) != 0 ? true : z;
        this.f208487a = i;
        this.f208488b = str;
        this.f208489c = str2;
        this.f208490d = j;
        this.f208491e = j2;
        this.f208492f = j3;
        this.f208493g = z;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f208494h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? 3 : 2 : 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m77999a() {
        if (this.f208494h != 2) {
            return 4;
        }
        long j = this.f208491e;
        if (!ic71.m50236d(j)) {
            return 4;
        }
        long j2 = this.f208490d;
        if (ic71.m50236d(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? 1 : 2;
        }
        int i = (int) (j2 >> 32);
        return (i == ((int) (j >> 32)) && i == this.f208487a) ? 3 : 4;
    }
}
