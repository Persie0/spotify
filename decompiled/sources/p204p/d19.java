package p204p;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d19 implements xjx {

    /* JADX INFO: renamed from: g */
    public static final C2109m f44197g = new C2109m(3);

    /* JADX INFO: renamed from: a */
    public final kf81 f44198a;

    /* JADX INFO: renamed from: b */
    public final int f44199b;

    /* JADX INFO: renamed from: c */
    public final int[] f44200c;

    /* JADX INFO: renamed from: d */
    public final r300[] f44201d;

    /* JADX INFO: renamed from: e */
    public final long[] f44202e;

    /* JADX INFO: renamed from: f */
    public int f44203f;

    public d19(kf81 kf81Var, int[] iArr, Object obj) {
        int i = 0;
        c95.m31855u(iArr.length > 0);
        kf81Var.getClass();
        this.f44198a = kf81Var;
        int length = iArr.length;
        this.f44199b = length;
        this.f44201d = new r300[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f44201d[i2] = kf81Var.f122102d[iArr[i2]];
        }
        Arrays.sort(this.f44201d, f44197g);
        this.f44200c = new int[this.f44199b];
        while (true) {
            int i3 = this.f44199b;
            if (i >= i3) {
                this.f44202e = new long[i3];
                return;
            } else {
                this.f44200c[i] = kf81Var.m56254b(this.f44201d[i]);
                i++;
            }
        }
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: a */
    public final boolean mo34611a(int i, long j) {
        return this.f44202e[i] > j;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: d */
    public final void mo34612d() {
        Arrays.fill(this.f44202e, 0L);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: e */
    public final r300 mo34613e(int i) {
        return this.f44201d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d19 d19Var = (d19) obj;
            if (this.f44198a.equals(d19Var.f44198a) && Arrays.equals(this.f44200c, d19Var.f44200c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: f */
    public final int mo34614f(int i) {
        return this.f44200c[i];
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: h */
    public final boolean mo34615h(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo34611a = mo34611a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f44199b && !zMo34611a) {
            zMo34611a = (i2 == i || mo34611a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo34611a) {
            return false;
        }
        long[] jArr = this.f44202e;
        jArr[i] = Math.max(jArr[i], h0b1.m46299a(jElapsedRealtime, j));
        return true;
    }

    public final int hashCode() {
        if (this.f44203f == 0) {
            this.f44203f = Arrays.hashCode(this.f44200c) + (System.identityHashCode(this.f44198a) * 31);
        }
        return this.f44203f;
    }

    @Override // p204p.xjx
    public final int length() {
        return this.f44200c.length;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: m */
    public final int mo34617m(int i) {
        for (int i2 = 0; i2 < this.f44199b; i2++) {
            if (this.f44200c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: n */
    public final kf81 mo34618n() {
        return this.f44198a;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: q */
    public int mo32622q(long j, List list) {
        return list.size();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: r */
    public final int mo34620r() {
        return this.f44200c[mo28306c()];
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: s */
    public final r300 mo34621s() {
        return this.f44201d[mo28306c()];
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: g */
    public void mo32620g() {
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: p */
    public void mo32621p() {
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: i */
    public void mo34616i(float f) {
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: o */
    public final void mo34619o(boolean z) {
    }
}
