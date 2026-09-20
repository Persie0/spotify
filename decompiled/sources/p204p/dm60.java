package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class dm60 extends bm60 {

    /* JADX INFO: renamed from: X */
    public final List f50432X;

    /* JADX INFO: renamed from: Y */
    public final int f50433Y;

    /* JADX INFO: renamed from: Z */
    public int f50434Z;

    /* JADX INFO: renamed from: t */
    public final nl60 f50435t;

    public dm60(fk60 fk60Var, nl60 nl60Var) {
        super(fk60Var, nl60Var, (String) null, 12);
        this.f50435t = nl60Var;
        List listM43728j1 = g6f.m43728j1(nl60Var.f155012a.keySet());
        this.f50432X = listM43728j1;
        this.f50433Y = listM43728j1.size() * 2;
        this.f50434Z = -1;
    }

    @Override // p204p.bm60, p204p.AbstractC1887g7
    /* JADX INFO: renamed from: G */
    public final yk60 mo29809G() {
        return this.f50435t;
    }

    @Override // p204p.bm60
    /* JADX INFO: renamed from: P */
    public final nl60 mo29809G() {
        return this.f50435t;
    }

    @Override // p204p.bm60, p204p.AbstractC1887g7
    /* JADX INFO: renamed from: e */
    public final yk60 mo29815e(String str) {
        return this.f50434Z % 2 == 0 ? zk60.m96301c(str) : (yk60) kkc0.m56692e0(str, this.f50435t);
    }

    @Override // p204p.bm60, p204p.frh
    /* JADX INFO: renamed from: p */
    public final int mo29816p(ktz0 ktz0Var) {
        int i = this.f50434Z;
        if (i >= this.f50433Y - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f50434Z = i2;
        return i2;
    }

    @Override // p204p.bm60, p204p.AbstractC1887g7
    /* JADX INFO: renamed from: z */
    public final String mo29817z(ktz0 ktz0Var, int i) {
        return (String) this.f50432X.get(i / 2);
    }

    @Override // p204p.bm60, p204p.AbstractC1887g7, p204p.frh
    /* JADX INFO: renamed from: a */
    public final void mo29813a(ktz0 ktz0Var) {
    }
}
