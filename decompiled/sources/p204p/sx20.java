package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class sx20 implements vj51 {

    /* JADX INFO: renamed from: a */
    public final List f214787a;

    /* JADX INFO: renamed from: b */
    public int[] f214788b;

    /* JADX INFO: renamed from: c */
    public double f214789c;

    /* JADX INFO: renamed from: d */
    public int f214790d;

    /* JADX INFO: renamed from: e */
    public boolean f214791e;

    public sx20(List list) {
        this.f214787a = list;
        this.f214788b = new int[list.size() + 1];
    }

    @Override // p204p.vj51
    /* JADX INFO: renamed from: c */
    public final ybf0 mo31363c() {
        if (!this.f214791e) {
            return null;
        }
        List listM29616i1 = bk5.m29616i1(this.f214788b);
        int i = this.f214790d;
        double d = this.f214789c;
        List list = this.f214787a;
        wbf0 wbf0Var = new wbf0(new tx20(list, listM29616i1, i, d));
        this.f214788b = new int[list.size() + 1];
        this.f214789c = 0.0d;
        this.f214790d = 0;
        this.f214791e = false;
        return wbf0Var;
    }

    @Override // p204p.vj51
    public final ybf0 peek() {
        if (!this.f214791e) {
            return null;
        }
        return new wbf0(new tx20(this.f214787a, bk5.m29616i1(this.f214788b), this.f214790d, this.f214789c));
    }

    @Override // p204p.vj51
    public final void record(double d) {
        this.f214791e = true;
        List list = this.f214787a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = (i + size) / 2;
            if (d <= ((Number) list.get(i2)).doubleValue()) {
                size = i2;
            } else {
                i = i2 + 1;
            }
        }
        int[] iArr = this.f214788b;
        iArr[i] = iArr[i] + 1;
        this.f214789c += d;
        this.f214790d++;
    }
}
