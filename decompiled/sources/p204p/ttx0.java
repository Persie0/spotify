package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ttx0 {

    /* JADX INFO: renamed from: a */
    public int f223692a = 0;

    /* JADX INFO: renamed from: b */
    public int f223693b = 0;

    /* JADX INFO: renamed from: c */
    public int f223694c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f223695d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f223696e = 0;

    /* JADX INFO: renamed from: f */
    public int f223697f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f223698g = false;

    /* JADX INFO: renamed from: h */
    public boolean f223699h = false;

    /* JADX INFO: renamed from: a */
    public final int m81537a() {
        return this.f223698g ? this.f223692a : this.f223693b;
    }

    /* JADX INFO: renamed from: b */
    public final int m81538b() {
        return this.f223692a;
    }

    /* JADX INFO: renamed from: c */
    public final int m81539c() {
        return this.f223693b;
    }

    /* JADX INFO: renamed from: d */
    public final int m81540d() {
        return this.f223698g ? this.f223693b : this.f223692a;
    }

    /* JADX INFO: renamed from: e */
    public final void m81541e(int i, int i2) {
        this.f223699h = false;
        if (i != Integer.MIN_VALUE) {
            this.f223696e = i;
            this.f223692a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f223697f = i2;
            this.f223693b = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m81542f(boolean z) {
        if (z == this.f223698g) {
            return;
        }
        this.f223698g = z;
        if (!this.f223699h) {
            this.f223692a = this.f223696e;
            this.f223693b = this.f223697f;
            return;
        }
        if (z) {
            int i = this.f223695d;
            if (i == Integer.MIN_VALUE) {
                i = this.f223696e;
            }
            this.f223692a = i;
            int i2 = this.f223694c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f223697f;
            }
            this.f223693b = i2;
            return;
        }
        int i3 = this.f223694c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f223696e;
        }
        this.f223692a = i3;
        int i4 = this.f223695d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f223697f;
        }
        this.f223693b = i4;
    }

    /* JADX INFO: renamed from: g */
    public final void m81543g(int i, int i2) {
        this.f223694c = i;
        this.f223695d = i2;
        this.f223699h = true;
        if (this.f223698g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f223692a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f223693b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f223692a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f223693b = i2;
        }
    }
}
