package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class acd0 implements hcd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f14324d;

    public /* synthetic */ acd0(Object obj, int i, int i2, int i3) {
        this.f14321a = i3;
        this.f14322b = obj;
        this.f14323c = i;
        this.f14324d = i2;
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public final void mo25456d(jv30 jv30Var, int i) {
        switch (this.f14321a) {
            case 0:
                jcd0 jcd0Var = (jcd0) this.f14322b;
                jv30Var.mo45825Z0(jcd0Var.f111081c, i, this.f14323c, this.f14324d);
                break;
            case 1:
                jcd0 jcd0Var2 = (jcd0) this.f14322b;
                jv30Var.mo45794A(jcd0Var2.f111081c, i, this.f14323c, this.f14324d);
                break;
            case 2:
                jcd0 jcd0Var3 = (jcd0) this.f14322b;
                jv30Var.mo45798E1(jcd0Var3.f111081c, i, this.f14323c, this.f14324d);
                break;
            default:
                jv30Var.mo45841t1(((icd0) this.f14322b).f100804a.f111081c, i, this.f14323c, this.f14324d);
                break;
        }
    }
}
