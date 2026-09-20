package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oob1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qob1 f167527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oob1(qob1 qob1Var, int i) {
        super(0);
        this.f167526a = i;
        this.f167527b = qob1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f167526a) {
            case 0:
                qob1 qob1Var = this.f167527b;
                vh21 vh21Var = qob1Var.f190899a;
                vh21Var.mo34629g(new e651(0, qob1Var, qob1.class, "onActive", "onActive()V", 0, 0, 16));
                vh21Var.mo34623a(new e651(0, qob1Var, qob1.class, "onActive", "onActive()V", 0, 0, 17), new e651(0, qob1Var, qob1.class, "onInactive", "onInactive()V", 0, 0, 18));
                break;
            default:
                qob1 qob1Var2 = this.f167527b;
                qob1Var2.f190899a.mo34627e();
                qob1.m73387d(qob1Var2);
                break;
        }
        return w2a1.f247311a;
    }
}
