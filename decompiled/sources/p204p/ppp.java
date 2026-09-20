package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class ppp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180088a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ umn f180089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppp(umn umnVar, int i) {
        super(1);
        this.f180088a = i;
        this.f180089b = umnVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v7, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v4, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f180088a) {
            case 0:
                ((qe70) this.f180089b.f231916c).invoke(mmc0.f145118a);
                return w2a1.f247311a;
            default:
                cmc0 cmc0Var = (cmc0) obj;
                boolean z = cmc0Var instanceof amc0;
                umn umnVar = this.f180089b;
                if (z) {
                    ((qe70) umnVar.f231916c).invoke(new kmc0(((amc0) cmc0Var).f17088a));
                } else {
                    if (!(cmc0Var instanceof bmc0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((qe70) umnVar.f231916c).invoke(new lmc0(((bmc0) cmc0Var).f28500a));
                }
                return w2a1.f247311a;
        }
    }
}
