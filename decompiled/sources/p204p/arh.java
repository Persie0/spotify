package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class arh implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19067a;

    /* JADX INFO: renamed from: b */
    public final y400 f19068b;

    public /* synthetic */ arh(y400 y400Var, int i) {
        this.f19067a = i;
        this.f19068b = y400Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f19067a) {
            case 0:
                return ((l25) obj).mo55148M(this.f19068b);
            default:
                y400 y400Var = (y400) obj;
                return Boolean.valueOf(!y400Var.f269048a.m95303c() && y400Var.m92786b().equals(this.f19068b));
        }
    }
}
