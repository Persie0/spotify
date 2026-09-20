package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rk31 implements Comparable {

    /* JADX INFO: renamed from: Y */
    public int f199966Y;

    /* JADX INFO: renamed from: a */
    public boolean f199967a;

    /* JADX INFO: renamed from: e */
    public float f199971e;

    /* JADX INFO: renamed from: b */
    public int f199968b = -1;

    /* JADX INFO: renamed from: c */
    public int f199969c = -1;

    /* JADX INFO: renamed from: d */
    public int f199970d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f199972f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f199973g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f199974h = new float[9];

    /* JADX INFO: renamed from: i */
    public yj5[] f199975i = new yj5[16];

    /* JADX INFO: renamed from: t */
    public int f199976t = 0;

    /* JADX INFO: renamed from: X */
    public int f199965X = 0;

    public rk31(int i) {
        this.f199966Y = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m75715a(yj5 yj5Var) {
        int i = 0;
        while (true) {
            int i2 = this.f199976t;
            if (i >= i2) {
                yj5[] yj5VarArr = this.f199975i;
                if (i2 >= yj5VarArr.length) {
                    this.f199975i = (yj5[]) Arrays.copyOf(yj5VarArr, yj5VarArr.length * 2);
                }
                yj5[] yj5VarArr2 = this.f199975i;
                int i3 = this.f199976t;
                yj5VarArr2[i3] = yj5Var;
                this.f199976t = i3 + 1;
                return;
            }
            if (this.f199975i[i] == yj5Var) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75716b(yj5 yj5Var) {
        int i = this.f199976t;
        int i2 = 0;
        while (i2 < i) {
            if (this.f199975i[i2] == yj5Var) {
                while (i2 < i - 1) {
                    yj5[] yj5VarArr = this.f199975i;
                    int i3 = i2 + 1;
                    yj5VarArr[i2] = yj5VarArr[i3];
                    i2 = i3;
                }
                this.f199976t--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75717c() {
        this.f199966Y = 5;
        this.f199970d = 0;
        this.f199968b = -1;
        this.f199969c = -1;
        this.f199971e = 0.0f;
        this.f199972f = false;
        int i = this.f199976t;
        for (int i2 = 0; i2 < i; i2++) {
            this.f199975i[i2] = null;
        }
        this.f199976t = 0;
        this.f199965X = 0;
        this.f199967a = false;
        Arrays.fill(this.f199974h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f199968b - ((rk31) obj).f199968b;
    }

    /* JADX INFO: renamed from: d */
    public final void m75718d(kl80 kl80Var, float f) {
        this.f199971e = f;
        this.f199972f = true;
        int i = this.f199976t;
        this.f199969c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f199975i[i2].m93850h(kl80Var, this, false);
        }
        this.f199976t = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m75719e(kl80 kl80Var, yj5 yj5Var) {
        int i = this.f199976t;
        for (int i2 = 0; i2 < i; i2++) {
            this.f199975i[i2].mo61591i(kl80Var, yj5Var, false);
        }
        this.f199976t = 0;
    }

    public final String toString() {
        return "" + this.f199968b;
    }
}
