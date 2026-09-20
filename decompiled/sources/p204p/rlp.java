package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rlp implements h6d0 {

    /* JADX INFO: renamed from: a */
    public final h6d0 f200348a;

    /* JADX INFO: renamed from: b */
    public final int f200349b;

    /* JADX INFO: renamed from: c */
    public final int f200350c;

    public rlp(h6d0 h6d0Var, int i, int i2) {
        this.f200348a = h6d0Var;
        this.f200349b = i;
        this.f200350c = i2;
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: B */
    public final t5o0 mo39619B(long j) {
        int i = this.f200350c;
        int i2 = this.f200349b;
        h6d0 h6d0Var = this.f200348a;
        if (i == 1) {
            return new oez(i2 == 2 ? h6d0Var.mo39623w(b8j.m28429h(j)) : h6d0Var.mo39622u(b8j.m28429h(j)), b8j.m28425d(j) ? b8j.m28429h(j) : 32767);
        }
        return new oez(b8j.m28426e(j) ? b8j.m28430i(j) : 32767, i2 == 2 ? h6d0Var.mo39620d(b8j.m28430i(j)) : h6d0Var.mo39621l(b8j.m28430i(j)));
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: d */
    public final int mo39620d(int i) {
        return this.f200348a.mo39620d(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: g */
    public final Object mo30025g() {
        return this.f200348a.mo30025g();
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: l */
    public final int mo39621l(int i) {
        return this.f200348a.mo39621l(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: u */
    public final int mo39622u(int i) {
        return this.f200348a.mo39622u(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: w */
    public final int mo39623w(int i) {
        return this.f200348a.mo39623w(i);
    }
}
