package p204p;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface phi {
    /* JADX INFO: renamed from: m */
    static void m70005m(lpi0 lpi0Var, phi phiVar, phi phiVar2, sy7 sy7Var) {
        if (!Objects.equals(sy7Var, y940.f270505W)) {
            lpi0Var.m59674w(sy7Var, phiVar2.mo39831g(sy7Var), phiVar2.mo39828c(sy7Var));
            return;
        }
        pyw0 pyw0Var = (pyw0) phiVar2.mo39830f(sy7Var, null);
        lpi0Var.m59674w(sy7Var, phiVar2.mo39831g(sy7Var), s800.m77408I((pyw0) phiVar.mo39830f(sy7Var, null), pyw0Var));
    }

    /* JADX INFO: renamed from: r */
    static jvl0 m70006r(phi phiVar, phi phiVar2) {
        if (phiVar == null && phiVar2 == null) {
            return jvl0.m54383e();
        }
        lpi0 lpi0VarM59672u = phiVar2 != null ? lpi0.m59672u(phiVar2) : lpi0.m59671t();
        if (phiVar != null) {
            Iterator it = phiVar.mo39827b().iterator();
            while (it.hasNext()) {
                m70005m(lpi0VarM59672u, phiVar2, phiVar, (sy7) it.next());
            }
        }
        return jvl0.m54384j(lpi0VarM59672u);
    }

    /* JADX INFO: renamed from: a */
    void mo39826a(m94 m94Var);

    /* JADX INFO: renamed from: b */
    Set mo39827b();

    /* JADX INFO: renamed from: c */
    Object mo39828c(sy7 sy7Var);

    /* JADX INFO: renamed from: d */
    boolean mo39829d(sy7 sy7Var);

    /* JADX INFO: renamed from: f */
    Object mo39830f(sy7 sy7Var, Object obj);

    /* JADX INFO: renamed from: g */
    nhi mo39831g(sy7 sy7Var);

    /* JADX INFO: renamed from: h */
    Object mo39832h(sy7 sy7Var, nhi nhiVar);

    /* JADX INFO: renamed from: i */
    Set mo39833i(sy7 sy7Var);
}
