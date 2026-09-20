package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l9d0 implements h9d0 {

    /* JADX INFO: renamed from: a */
    public final h9d0 f131066a;

    /* JADX INFO: renamed from: b */
    public final gd40 f131067b;

    public l9d0(h9d0 h9d0Var, gd40 gd40Var) {
        this.f131066a = h9d0Var;
        this.f131067b = gd40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.h9d0
    /* JADX INFO: renamed from: a */
    public final Object mo38243a(g9d0 g9d0Var, ibk ibkVar) {
        k9d0 k9d0Var;
        if (ibkVar instanceof k9d0) {
            k9d0Var = (k9d0) ibkVar;
            int i = k9d0Var.f120569c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k9d0Var.f120569c = i - Integer.MIN_VALUE;
            } else {
                k9d0Var = new k9d0(this, ibkVar);
            }
        } else {
            k9d0Var = new k9d0(this, ibkVar);
        }
        Object objMo38243a = k9d0Var.f120567a;
        int i2 = k9d0Var.f120569c;
        if (i2 == 0) {
            bga.m29073P(objMo38243a);
            k9d0Var.f120569c = 1;
            objMo38243a = this.f131066a.mo38243a(g9d0Var, k9d0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo38243a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo38243a);
        }
        List<axx> list = (List) objMo38243a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (axx axxVar : list) {
            Set set = dd41.f47702f;
            arrayList.add(axx.m27436b(axxVar, null, null, null, this.f131067b.m44346a(null, r46.m74726U(String.valueOf(axxVar.f21029i)).f47709c), null, null, 0, null, null, null, null, -32769, 3));
        }
        return arrayList;
    }
}
