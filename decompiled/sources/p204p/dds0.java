package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dds0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cds0 f47866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dds0(cds0 cds0Var, int i) {
        super(1);
        this.f47865a = i;
        this.f47866b = cds0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f47865a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                zv41 zv41Var = this.f47866b.f36943a;
                gds0 gds0Var = gds0.f78943f;
                if (iIntValue != 0 && iIntValue != 1) {
                    if (iIntValue == 2) {
                        gds0Var = gds0.f78940c;
                    } else if (iIntValue != 3) {
                        gds0 gds0Var2 = gds0.f78942e;
                        if (iIntValue != 4) {
                            na6.m63957e("Unknown dismiss event: " + iIntValue);
                        }
                        gds0Var = gds0Var2;
                    } else {
                        gds0Var = gds0.f78941d;
                    }
                }
                zv41Var.getClass();
                zv41Var.m97091m(null, gds0Var);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zv41 zv41Var2 = this.f47866b.f36943a;
                gds0 gds0Var3 = zBooleanValue ? gds0.f78939b : gds0.f78944g;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, gds0Var3);
                break;
        }
        return w2a1.f247311a;
    }
}
