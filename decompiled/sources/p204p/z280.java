package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z280 implements z380 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278513a;

    /* JADX INFO: renamed from: b */
    public final xoi0 f278514b;

    public z280(int i) {
        this.f278513a = i;
        switch (i) {
            case 1:
                this.f278514b = new xoi0();
                break;
            default:
                this.f278514b = new xoi0();
                break;
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        switch (this.f278513a) {
            case 0:
                return (lpo) this.f278514b.mo33098e();
            default:
                return (h380) this.f278514b.mo33098e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        switch (this.f278513a) {
            case 0:
                this.f278514b.mo33104m(new lpo(i500Var.getClass().getSimpleName()));
                break;
            default:
                boolean z = i500Var instanceof zfy;
                xoi0 xoi0Var = this.f278514b;
                if (!z) {
                    xoi0Var.mo33104m(null);
                } else {
                    xoi0Var.mo33104m(new h380(((zfy) i500Var).getF18210S1()));
                }
                break;
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        switch (this.f278513a) {
            case 0:
                this.f278514b.mo33102k(dqk0Var);
                break;
            default:
                this.f278514b.mo33102k(dqk0Var);
                break;
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        switch (this.f278513a) {
            case 0:
                this.f278514b.m33100g(dqk0Var);
                break;
            default:
                this.f278514b.m33100g(dqk0Var);
                break;
        }
    }
}
