package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ubd0 implements hcd0, k890 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jcd0 f228698b;

    public /* synthetic */ ubd0(jcd0 jcd0Var, int i) {
        this.f228697a = i;
        this.f228698b = jcd0Var;
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public void mo25456d(jv30 jv30Var, int i) {
        switch (this.f228697a) {
            case 0:
                jv30Var.mo45817S(this.f228698b.f111081c, i);
                break;
            case 1:
                jv30Var.mo45840t(this.f228698b.f111081c, i);
                break;
            case 2:
                jv30Var.mo45844w(this.f228698b.f111081c, i);
                break;
            case 3:
                jv30Var.mo45826a0(this.f228698b.f111081c, i);
                break;
            case 4:
                jv30Var.mo45837o(this.f228698b.f111081c, i);
                break;
            case 5:
                jv30Var.mo45822W(this.f228698b.f111081c, i);
                break;
            case 6:
                jv30Var.mo45849z(this.f228698b.f111081c, i);
                break;
            case 7:
                jv30Var.mo45820U(this.f228698b.f111081c, i);
                break;
            case 8:
                jv30Var.mo45810N(this.f228698b.f111081c, i);
                break;
            case 9:
                jv30Var.mo45832k1(this.f228698b.f111081c, i);
                break;
            case 10:
                jv30Var.mo45804J1(this.f228698b.f111081c, i);
                break;
            case 11:
                jcd0 jcd0Var = this.f228698b;
                pcd0 pcd0Var = jcd0Var.f111081c;
                if (jcd0Var.m52957o() < 6) {
                    jv30Var.mo45829i(pcd0Var, i, 0.0f);
                } else {
                    jv30Var.mo45806L(pcd0Var, i);
                }
                break;
            case 12:
                jv30Var.mo45830i0(this.f228698b.f111081c, i);
                break;
            case 13:
                jv30Var.mo45802I1(this.f228698b.f111081c, i);
                break;
            default:
                jv30Var.mo45848y1(this.f228698b.f111081c, i);
                break;
        }
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        d7p0 d7p0Var = (d7p0) obj;
        switch (this.f228697a) {
            case 15:
                d7p0Var.mo35218k0(this.f228698b.f111103y);
                break;
            default:
                d7p0Var.mo35218k0(this.f228698b.f111103y);
                break;
        }
    }
}
