package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class x6d0 implements h6d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258640a;

    /* JADX INFO: renamed from: b */
    public final h6d0 f258641b;

    /* JADX INFO: renamed from: c */
    public final int f258642c;

    /* JADX INFO: renamed from: d */
    public final int f258643d;

    public /* synthetic */ x6d0(h6d0 h6d0Var, int i, int i2, int i3) {
        this.f258640a = i3;
        this.f258641b = h6d0Var;
        this.f258642c = i;
        this.f258643d = i2;
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: B */
    public final t5o0 mo39619B(long j) {
        switch (this.f258640a) {
            case 0:
                int i = this.f258643d;
                int i2 = this.f258642c;
                h6d0 h6d0Var = this.f258641b;
                if (i == 1) {
                    return new y6d0(i2 == 2 ? h6d0Var.mo39623w(b8j.m28429h(j)) : h6d0Var.mo39622u(b8j.m28429h(j)), b8j.m28425d(j) ? b8j.m28429h(j) : 32767, 0);
                }
                return new y6d0(b8j.m28426e(j) ? b8j.m28430i(j) : 32767, i2 == 2 ? h6d0Var.mo39620d(b8j.m28430i(j)) : h6d0Var.mo39621l(b8j.m28430i(j)), 0);
            default:
                int i3 = this.f258643d;
                int i4 = this.f258642c;
                h6d0 h6d0Var2 = this.f258641b;
                if (i3 == 1) {
                    return new y6d0(i4 == 2 ? h6d0Var2.mo39623w(b8j.m28429h(j)) : h6d0Var2.mo39622u(b8j.m28429h(j)), b8j.m28425d(j) ? b8j.m28429h(j) : 32767, 1);
                }
                return new y6d0(b8j.m28426e(j) ? b8j.m28430i(j) : 32767, i4 == 2 ? h6d0Var2.mo39620d(b8j.m28430i(j)) : h6d0Var2.mo39621l(b8j.m28430i(j)), 1);
        }
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: d */
    public final int mo39620d(int i) {
        switch (this.f258640a) {
            case 0:
                break;
        }
        return this.f258641b.mo39620d(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: g */
    public final Object mo30025g() {
        switch (this.f258640a) {
            case 0:
                break;
        }
        return this.f258641b.mo30025g();
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: l */
    public final int mo39621l(int i) {
        switch (this.f258640a) {
            case 0:
                break;
        }
        return this.f258641b.mo39621l(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: u */
    public final int mo39622u(int i) {
        switch (this.f258640a) {
            case 0:
                break;
        }
        return this.f258641b.mo39622u(i);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: w */
    public final int mo39623w(int i) {
        switch (this.f258640a) {
            case 0:
                break;
        }
        return this.f258641b.mo39623w(i);
    }
}
