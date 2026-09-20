package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ajo {

    /* JADX INFO: renamed from: a */
    public final ArrayList f16296a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f16297b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f16298c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f16299d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m26168a(rio rioVar) {
        uz60 uz60Var = rioVar instanceof uz60 ? (uz60) rioVar : null;
        tn61 tn61VarMo28095d = uz60Var != null ? uz60Var.mo28095d() : null;
        if (tn61VarMo28095d != null) {
            na6.m63963k(!m26169b(tn61VarMo28095d), "addDataSource: a data source for %s already exists. It has either been added previously in this builder block, or is included in the default configuration. Use overrideDataSource() to replace it if this is intentional. Please inform #blink-support if you need to override a data source.", qpv0.f191387a.mo54112b(tn61VarMo28095d.getClass()).mo29111F());
        }
        this.f16296a.add(rioVar.mo24859a());
        this.f16297b.add(rioVar);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26169b(tn61 tn61Var) {
        k35 k35Var = new k35(tn61Var, w2a1.f247311a);
        ArrayList arrayList = this.f16296a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((a6a1) it.next()).mo24862e(k35Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m26170c(rio rioVar) {
        uz60 uz60Var = rioVar instanceof uz60 ? (uz60) rioVar : null;
        tn61 tn61VarMo28095d = uz60Var != null ? uz60Var.mo28095d() : null;
        if (tn61VarMo28095d != null) {
            na6.m63963k(m26169b(tn61VarMo28095d), "overrideDataSource: no existing data source for %s to override. Use addDataSource() instead.", qpv0.f191387a.mo54112b(tn61VarMo28095d.getClass()).mo29111F());
        }
        this.f16296a.add(0, rioVar.mo24859a());
        this.f16297b.add(rioVar);
    }
}
