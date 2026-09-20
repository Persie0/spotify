package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xik implements ht50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f261886a;

    /* JADX INFO: renamed from: b */
    public final String f261887b;

    /* JADX INFO: renamed from: c */
    public final ot21 f261888c;

    /* JADX INFO: renamed from: d */
    public final Object f261889d;

    /* JADX INFO: renamed from: e */
    public final Object f261890e;

    /* JADX INFO: renamed from: f */
    public final fl11 f261891f;

    public xik(String str, pgo pgoVar, wrf0 wrf0Var, bun bunVar, vvf0 vvf0Var) {
        this.f261886a = 1;
        this.f261887b = str;
        this.f261889d = pgoVar;
        this.f261890e = vvf0Var;
        this.f261888c = new ot21(3, new kjd0(14, bunVar, this));
        this.f261891f = new vw90(this);
    }

    @Override // p204p.lt50
    /* JADX INFO: renamed from: c */
    public final fl11 mo26385c() {
        switch (this.f261886a) {
            case 0:
                return (wik) this.f261891f;
            default:
                return (vw90) this.f261891f;
        }
    }

    @Override // p204p.lt50
    /* JADX INFO: renamed from: d */
    public final ot21 mo26386d() {
        switch (this.f261886a) {
            case 0:
                break;
        }
        return this.f261888c;
    }

    public xik(String str, dik dikVar, xrm xrmVar) {
        this.f261886a = 0;
        this.f261887b = str;
        this.f261889d = xrmVar;
        this.f261890e = dikVar.m36125a();
        this.f261888c = new ot21(3, new yfk(this, 1));
        this.f261891f = new wik(this);
    }
}
