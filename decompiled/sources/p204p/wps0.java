package p204p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class wps0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f253835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f253836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wps0(int i, List list, gh00 gh00Var) {
        super(1);
        this.f253834a = i;
        this.f253835b = gh00Var;
        this.f253836c = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f253834a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                this.f253835b.invoke(new pb6(iIntValue, ((hqs0) this.f253836c.get(iIntValue)).f94247b));
                return w2a1.f247311a;
            default:
                duh duhVar = (duh) obj;
                boolean z = duhVar instanceof cuh;
                List list = this.f253836c;
                gh00 gh00Var = this.f253835b;
                if (z) {
                    cuh cuhVar = (cuh) duhVar;
                    tth tthVar = cuhVar.f42120a;
                    gh00Var.invoke(new nzy(tthVar.f223596a, cuhVar.f42121b));
                    list.add(tthVar);
                } else {
                    if (!(duhVar instanceof buh)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buh buhVar = (buh) duhVar;
                    tth tthVar2 = buhVar.f31136a;
                    gh00Var.invoke(new mzy(tthVar2.f223596a, buhVar.f31137b));
                    list.remove(tthVar2);
                }
                return w2a1.f247311a;
        }
    }
}
