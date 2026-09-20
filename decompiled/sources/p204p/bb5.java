package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bb5 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ db5 f25436b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb5(db5 db5Var, int i) {
        super(1);
        this.f25435a = i;
        this.f25436b = db5Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f25435a) {
            case 0:
                return this.f25436b.f47204d;
            default:
                db5 db5Var = this.f25436b;
                rf9 rf9Var = db5Var.f47205e;
                za5 za5VarM55931a = db5Var.f47203c.m55931a();
                List listM43728j1 = g6f.m43728j1((Iterable) rf9Var.f198547a.get());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM43728j1) {
                    ((ib5) obj2).getClass();
                    arrayList.add(obj2);
                }
                List<ib5> listM43711Y0 = g6f.m43711Y0(arrayList, new hwd(25));
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
                for (ib5 ib5Var : listM43711Y0) {
                    arrayList2.add(new pa5(ib5Var.f100436a, ib5Var.f100437b));
                }
                return new ab5(arrayList2, za5VarM55931a);
        }
    }
}
