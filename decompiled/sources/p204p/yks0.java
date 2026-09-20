package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yks0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f273822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f273823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vum0 f273824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yks0(gh00 gh00Var, List list, vum0 vum0Var, int i) {
        super(0);
        this.f273821a = i;
        this.f273822b = gh00Var;
        this.f273823c = list;
        this.f273824d = vum0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f273821a) {
            case 0:
                this.f273822b.invoke(vks0.f242283a);
                vum0 vum0Var = this.f273824d;
                vum0Var.m86438w((vum0Var.m86437v() + (-1) < 0 ? this.f273823c.size() : vum0Var.m86437v()) - 1);
                break;
            default:
                this.f273822b.invoke(uks0.f231360a);
                vum0 vum0Var2 = this.f273824d;
                vum0Var2.m86438w((vum0Var2.m86437v() + 1) % this.f273823c.size());
                break;
        }
        return w2a1.f247311a;
    }
}
