package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f841 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x43 f66858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqq f66859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f841(x43 x43Var, yqq yqqVar, int i) {
        super(1);
        this.f66857a = i;
        this.f66858b = x43Var;
        this.f66859c = yqqVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f66857a) {
            case 0:
                ((yum0) this.f66858b.f257966i).setValue(new ybs(this.f66859c.mo35987O0((int) (((jo70) obj).mo30018b() >> 32))));
                break;
            case 1:
                ((yum0) this.f66858b.f257967t).setValue(new ybs(this.f66859c.mo35987O0((int) (((jo70) obj).mo30018b() & 4294967295L))));
                break;
            default:
                ((yum0) this.f66858b.f257955X).setValue(new ybs(this.f66859c.mo35987O0((int) (((jo70) obj).mo30018b() & 4294967295L))));
                break;
        }
        return w2a1.f247311a;
    }
}
