package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b8c implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24556a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7i0 f24557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s9p0 f24558c;

    public b8c(r7i0 r7i0Var, s9p0 s9p0Var) {
        this.f24557b = r7i0Var;
        this.f24558c = s9p0Var;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f24556a) {
            case 0:
                r7i0 r7i0Var = this.f24557b;
                s9p0 s9p0Var = this.f24558c;
                if (s9p0Var != null) {
                    r7i0Var.mo32674b(s9p0Var);
                }
                r7i0Var.mo43758d();
                break;
            default:
                this.f24557b.mo32674b(this.f24558c);
                break;
        }
    }

    public b8c(s9p0 s9p0Var, r7i0 r7i0Var) {
        this.f24558c = s9p0Var;
        this.f24557b = r7i0Var;
    }
}
