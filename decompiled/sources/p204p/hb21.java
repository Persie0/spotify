package p204p;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hb21 extends qp71 {

    /* JADX INFO: renamed from: e */
    public final pf40 f89368e;

    /* JADX INFO: renamed from: f */
    public final int[] f89369f;

    /* JADX INFO: renamed from: g */
    public final int[] f89370g;

    /* JADX INFO: renamed from: h */
    public final HashMap f89371h;

    public hb21(List list) {
        int size = list.size();
        this.f89368e = pf40.m69791p(list);
        this.f89369f = new int[size];
        int i = 0;
        int i2 = 0;
        while (true) {
            int size2 = 1;
            if (i >= size) {
                break;
            }
            eb21 eb21Var = (eb21) list.get(i);
            this.f89369f[i] = i2;
            if (!eb21Var.f57799p.isEmpty()) {
                size2 = eb21Var.f57799p.size();
            }
            i2 += size2;
            i++;
        }
        this.f89370g = new int[i2];
        this.f89371h = new HashMap();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            eb21 eb21Var2 = (eb21) list.get(i4);
            int i5 = 0;
            while (true) {
                if (i5 < (eb21Var2.f57799p.isEmpty() ? 1 : eb21Var2.f57799p.size())) {
                    this.f89371h.put(eb21.m38339a(eb21Var2, i5), Integer.valueOf(i3));
                    this.f89370g[i3] = i4;
                    i3++;
                    i5++;
                }
            }
        }
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: b */
    public final int mo26650b(Object obj) {
        Integer num = (Integer) this.f89371h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        int i2 = this.f89370g[i];
        int i3 = i - this.f89369f[i2];
        eb21 eb21Var = (eb21) this.f89368e.get(i2);
        pf40 pf40Var = eb21Var.f57799p;
        if (!pf40Var.isEmpty()) {
            ((fb21) pf40Var.get(i3)).getClass();
            bp71Var.m30112i(null, Pair.create(eb21Var.f57784a, null), i2, 0L, eb21Var.f57800q[i3], null, false);
            return bp71Var;
        }
        Object obj = eb21Var.f57784a;
        long j = eb21Var.f57797n;
        bp71Var.m30112i(obj, obj, i2, eb21Var.f57796m + j, -j, kt0.f126088f, eb21Var.f57798o);
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: g */
    public final bp71 mo46978g(Object obj, bp71 bp71Var) {
        Integer num = (Integer) this.f89371h.get(obj);
        num.getClass();
        mo26651f(num.intValue(), bp71Var, true);
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: h */
    public final int mo26652h() {
        return this.f89370g.length;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: l */
    public final Object mo26653l(int i) {
        int i2 = this.f89370g[i];
        return eb21.m38339a((eb21) this.f89368e.get(i2), i - this.f89369f[i2]);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        eb21 eb21Var = (eb21) this.f89368e.get(i);
        int i2 = this.f89369f[i];
        pf40 pf40Var = eb21Var.f57799p;
        mp71Var.m62447d(eb21Var.f57784a, eb21Var.f57786c, eb21Var.f57788e, eb21Var.f57790g, eb21Var.f57791h, eb21Var.f57792i, eb21Var.f57793j, eb21Var.f57794k, eb21Var.f57789f, eb21Var.f57795l, eb21Var.f57796m, i2, (i2 + (pf40Var.isEmpty() ? 1 : pf40Var.size())) - 1, eb21Var.f57797n);
        mp71Var.f145936k = eb21Var.f57798o;
        return mp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: o */
    public final int mo26655o() {
        return this.f89368e.size();
    }
}
