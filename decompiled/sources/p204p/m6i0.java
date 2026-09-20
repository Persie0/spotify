package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m6i0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6i0 f140530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6i0(r6i0 r6i0Var, int i) {
        super(1);
        this.f140529a = i;
        this.f140530b = r6i0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f140529a) {
            case 0:
                return new h6i0(f6i0.f66415a, this.f140530b.f196281L0 ? g6i0.f77058c : g6i0.f77056a);
            default:
                r6i0 r6i0Var = this.f140530b;
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192165d = new n6i0(r6i0Var, 0);
                qspVar.f192166e = new n6i0(r6i0Var, 1);
                return w2a1.f247311a;
        }
    }
}
