package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p2s {

    /* JADX INFO: renamed from: a */
    public final j9s f173420a;

    /* JADX INFO: renamed from: b */
    public final int f173421b;

    /* JADX INFO: renamed from: c */
    public final long f173422c;

    /* JADX INFO: renamed from: d */
    public final long f173423d;

    /* JADX INFO: renamed from: e */
    public final long f173424e;

    /* JADX INFO: renamed from: f */
    public final int f173425f;

    /* JADX INFO: renamed from: g */
    public final int f173426g;

    /* JADX INFO: renamed from: h */
    public final l8s f173427h;

    public p2s(j9s j9sVar, int i, long j, long j2, int i2) {
        this(j9sVar, i, j, j2, -1L, i2, 0, new l8s());
    }

    /* JADX INFO: renamed from: a */
    public final long m68964a() {
        return this.f173427h.f130925a;
    }

    /* JADX INFO: renamed from: b */
    public final float m68965b() {
        return this.f173427h.f130926b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m68966c() {
        int i = this.f173421b;
        return i == 3 || i == 4;
    }

    public p2s(j9s j9sVar, int i, long j, long j2, long j3, int i2, int i3, l8s l8sVar) {
        l8sVar.getClass();
        boolean z = false;
        c95.m31843i((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            c95.m31843i(z);
        }
        this.f173420a = j9sVar;
        this.f173421b = i;
        this.f173422c = j;
        this.f173423d = j2;
        this.f173424e = j3;
        this.f173425f = i2;
        this.f173426g = i3;
        this.f173427h = l8sVar;
    }
}
