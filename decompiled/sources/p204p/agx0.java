package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class agx0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mfx0 f15541b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f15542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agx0(gh00 gh00Var, mfx0 mfx0Var) {
        super(1);
        this.f15540a = 2;
        this.f15542c = gh00Var;
        this.f15541b = mfx0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f15540a) {
            case 0:
                this.f15541b.f143232s.invoke();
                this.f15542c.invoke(new vex0(((whu0) obj).f251445a));
                return w2a1.f247311a;
            case 1:
                d850 d850Var = (d850) obj;
                this.f15541b.f143232s.invoke();
                this.f15542c.invoke(new sex0(d850Var != null ? d850Var.f46380a : null));
                return w2a1.f247311a;
            default:
                egu0 egu0Var = (egu0) obj;
                boolean zEquals = egu0Var.equals(cgu0.f37811a);
                gh00 gh00Var = this.f15542c;
                if (zEquals) {
                    gh00Var.invoke(new rex0(this.f15541b.f143230q));
                } else {
                    if (!(egu0Var instanceof dgu0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(new yex0(((dgu0) egu0Var).f48898a));
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agx0(mfx0 mfx0Var, gh00 gh00Var, int i) {
        super(1);
        this.f15540a = i;
        this.f15541b = mfx0Var;
        this.f15542c = gh00Var;
    }
}
