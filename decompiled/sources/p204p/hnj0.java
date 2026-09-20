package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hnj0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fnj0 f93350b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hnj0(fnj0 fnj0Var, int i) {
        super(1);
        this.f93349a = i;
        this.f93350b = fnj0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f93349a) {
            case 0:
                return new gnj0(this.f93350b, 0);
            default:
                return new gnj0(this.f93350b, 1);
        }
    }
}
