package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g480 implements jfm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f76361b;

    public /* synthetic */ g480(Object obj, int i) {
        this.f76360a = i;
        this.f76361b = obj;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        switch (this.f76360a) {
            case 0:
                jfm0 jfm0Var = (jfm0) this.f76361b;
                if (jfm0Var != null) {
                    return jfm0Var.mo31538a();
                }
                return null;
            default:
                return (qfm0) ((xoi0) this.f76361b).mo33098e();
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        switch (this.f76360a) {
            case 0:
                jfm0 jfm0Var = (jfm0) this.f76361b;
                if (jfm0Var != null) {
                    jfm0Var.mo31539c(dqk0Var);
                }
                break;
            default:
                ((xoi0) this.f76361b).mo33102k(dqk0Var);
                break;
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        switch (this.f76360a) {
            case 0:
                jfm0 jfm0Var = (jfm0) this.f76361b;
                if (jfm0Var != null) {
                    jfm0Var.mo31540d(dqk0Var);
                } else {
                    dqk0Var.mo31453b(null);
                }
                break;
            default:
                xoi0 xoi0Var = (xoi0) this.f76361b;
                if (xoi0Var.mo33098e() == null) {
                    dqk0Var.mo31453b(null);
                }
                xoi0Var.m33100g(dqk0Var);
                break;
        }
    }
}
