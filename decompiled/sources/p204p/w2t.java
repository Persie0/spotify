package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w2t extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c3t f247421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2t(c3t c3tVar, int i) {
        super(2);
        this.f247420a = i;
        this.f247421b = c3tVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f247420a) {
            case 0:
                return (dut) this.f247421b.f33750b.get();
            case 1:
                return this.f247421b.f33755g;
            case 2:
                return (dut) this.f247421b.f33752d.get();
            case 3:
                return this.f247421b.f33755g;
            case 4:
                oq91 oq91Var = this.f247421b.f33755g;
                rq91 rq91Var = new rq91(((d7t0) obj).f46270c);
                Object lbfVar = fau.f67640b;
                if (!oq91Var.equals(lbfVar) || !rq91Var.equals(lbfVar)) {
                    if (oq91Var.equals(lbfVar)) {
                        return rq91Var;
                    }
                    if (rq91Var.equals(lbfVar)) {
                        return oq91Var;
                    }
                    lbfVar = new lbf(oq91Var, rq91Var);
                }
                return lbfVar;
            case 5:
                return (dut) this.f247421b.f33754f.get();
            case 6:
                return this.f247421b.f33756h;
            default:
                oq91 oq91Var2 = this.f247421b.f33756h;
                rq91 rq91Var2 = new rq91(((u6t0) obj).f227430c);
                Object lbfVar2 = fau.f67640b;
                if (!oq91Var2.equals(lbfVar2) || !rq91Var2.equals(lbfVar2)) {
                    if (oq91Var2.equals(lbfVar2)) {
                        return rq91Var2;
                    }
                    if (rq91Var2.equals(lbfVar2)) {
                        return oq91Var2;
                    }
                    lbfVar2 = new lbf(oq91Var2, rq91Var2);
                }
                return lbfVar2;
        }
    }
}
