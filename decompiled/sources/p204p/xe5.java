package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xe5 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sir0 f260636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe5(sir0 sir0Var, int i) {
        super(1);
        this.f260635a = i;
        this.f260636b = sir0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f260635a) {
            case 0:
                this.f260636b.mo30231j(null);
                break;
            default:
                this.f260636b.mo30231j((b450) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
