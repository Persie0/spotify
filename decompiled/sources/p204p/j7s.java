package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j7s implements h7s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109659a;

    /* JADX INFO: renamed from: b */
    public final xv41 f109660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c851 f109661c;

    public j7s(c851 c851Var, int i) {
        this.f109659a = i;
        switch (i) {
            case 1:
                this.f109661c = c851Var;
                this.f109660b = ((a951) c851Var).m25076f(tas.class);
                break;
            default:
                this.f109661c = c851Var;
                this.f109660b = ((a951) c851Var).m25076f(tas.class);
                break;
        }
    }

    @Override // p204p.h7s
    /* JADX INFO: renamed from: a */
    public final void mo46784a(String str, String str2) {
        switch (this.f109659a) {
            case 0:
                ((a951) this.f109661c).m25075e(new t5s(str, str2));
                break;
            default:
                ((a951) this.f109661c).m25075e(new t5s(str, str2));
                break;
        }
    }

    @Override // p204p.h7s
    /* JADX INFO: renamed from: c */
    public final void mo46785c(String str, String str2) {
        switch (this.f109659a) {
            case 0:
                ((a951) this.f109661c).m25075e(new r5s(str, str2));
                break;
            default:
                ((a951) this.f109661c).m25075e(new r5s(str, str2));
                break;
        }
    }

    @Override // p204p.h7s
    public final xv41 getStatus() {
        switch (this.f109659a) {
            case 0:
                break;
        }
        return this.f109660b;
    }
}
