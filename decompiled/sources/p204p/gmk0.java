package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gmk0 {

    /* JADX INFO: renamed from: g */
    public static int f81414g;

    /* JADX INFO: renamed from: a */
    public int f81415a;

    /* JADX INFO: renamed from: b */
    public int f81416b;

    /* JADX INFO: renamed from: c */
    public Object[] f81417c;

    /* JADX INFO: renamed from: d */
    public int f81418d;

    /* JADX INFO: renamed from: e */
    public fmk0 f81419e;

    /* JADX INFO: renamed from: f */
    public float f81420f;

    /* JADX INFO: renamed from: a */
    public static synchronized gmk0 m45273a(int i, fmk0 fmk0Var) {
        gmk0 gmk0Var;
        gmk0Var = new gmk0();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        gmk0Var.f81416b = i;
        gmk0Var.f81417c = new Object[i];
        gmk0Var.f81418d = 0;
        gmk0Var.f81419e = fmk0Var;
        gmk0Var.f81420f = 1.0f;
        gmk0Var.m45276d();
        int i2 = f81414g;
        gmk0Var.f81415a = i2;
        f81414g = i2 + 1;
        return gmk0Var;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized fmk0 m45274b() {
        fmk0 fmk0Var;
        try {
            if (this.f81418d == -1 && this.f81420f > 0.0f) {
                m45276d();
            }
            Object[] objArr = this.f81417c;
            int i = this.f81418d;
            fmk0Var = (fmk0) objArr[i];
            fmk0Var.f71071a = -1;
            this.f81418d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return fmk0Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m45275c(fmk0 fmk0Var) {
        try {
            int i = fmk0Var.f71071a;
            if (i != -1) {
                if (i == this.f81415a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + fmk0Var.f71071a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.f81418d + 1;
            this.f81418d = i2;
            if (i2 >= this.f81417c.length) {
                int i3 = this.f81416b;
                int i4 = i3 * 2;
                this.f81416b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.f81417c[i5];
                }
                this.f81417c = objArr;
            }
            fmk0Var.f71071a = this.f81415a;
            this.f81417c[this.f81418d] = fmk0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m45276d() {
        float f = this.f81420f;
        int i = this.f81416b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f81417c[i3] = this.f81419e.mo36712a();
        }
        this.f81418d = i - 1;
    }
}
