package p204p;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class tjo implements mko {

    /* JADX INFO: renamed from: a */
    public final List f220970a;

    /* JADX INFO: renamed from: b */
    public final gh00 f220971b;

    /* JADX INFO: renamed from: c */
    public final Object f220972c = q3d0.m72078I(3, new sho(this, 2));

    public tjo(List list, gh00 gh00Var) {
        this.f220970a = list;
        this.f220971b = gh00Var;
    }

    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        int i;
        kho khoVar;
        r101 r101Var = r101.f194657X0;
        List<rko> list = this.f220970a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (rko rkoVar : list) {
            wag1 wag1Var = rkoVar.f200131d;
            int i2 = rkoVar.f200129b;
            int i3 = 1;
            if (wag1Var instanceof pko) {
                tn61 tn61Var = rkoVar.f200128a;
                Object objInvoke = ((pko) wag1Var).f178495d.invoke(obj);
                if (objInvoke == null) {
                    objInvoke = r101Var;
                }
                k35 k35Var = new k35(tn61Var, objInvoke);
                int iM38547C = edb.m38547C(i2);
                if (iM38547C != 0) {
                    if (iM38547C == 1) {
                        i3 = 2;
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 3;
                    }
                }
                khoVar = new kho(k35Var, i3, rkoVar.f200130c);
            } else {
                if (!(wag1Var instanceof qko)) {
                    throw new NoWhenBranchMatchedException();
                }
                qko qkoVar = (qko) wag1Var;
                tn61 tn61VarM71067b = ((pu60) g6f.m43741q0(qkoVar.m73130t().m73876a())).m71067b();
                Object objInvoke2 = qkoVar.m73129s().invoke(obj);
                if (objInvoke2 == null) {
                    objInvoke2 = r101Var;
                }
                k35 k35Var2 = new k35(tn61VarM71067b, objInvoke2);
                int iM38547C2 = edb.m38547C(i2);
                if (iM38547C2 == 0) {
                    i = 1;
                } else if (iM38547C2 == 1) {
                    i = 2;
                } else {
                    if (iM38547C2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
                khoVar = new kho(k35Var2, i, qkoVar.m73130t(), rkoVar.f200128a, rkoVar.f200130c);
            }
            arrayList.add(khoVar);
        }
        return new sko(list.size(), arrayList, this.f220971b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: b */
    public final List m80988b() {
        return (List) this.f220972c.getValue();
    }

    public final String toString() {
        return s571.m77251j("DataStatement(items=", g6f.m43753y0(this.f220970a, ", ", null, null, null, 62), ", shouldFailOptionalOnError=false)");
    }
}
