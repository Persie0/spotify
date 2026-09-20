package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tt31 {

    /* JADX INFO: renamed from: a */
    public static final wy41 f223511a = new wy41(st31.f213791b);

    /* JADX INFO: renamed from: a */
    public static final wy41 m81494a() {
        return f223511a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static final void m81495b(qt31 qt31Var, rt31 rt31Var, o850 o850Var) {
        Object objM43733m0;
        nvo0 nvo0Var;
        List list = (List) rt31Var.f202488a.get(o850Var);
        fbk fbkVar = null;
        if (list == null) {
            nvo0Var = null;
        } else {
            v4u0 v4u0Var = w4u0.f247890a;
            if (list.isEmpty()) {
                objM43733m0 = null;
            } else {
                objM43733m0 = g6f.m43733m0(w4u0.f247891b.mo84665g(list.size()), list);
            }
            nvo0Var = (nvo0) objM43733m0;
        }
        if (nvo0Var == null || (qt31Var.f192273a.f72877b.getValue() instanceof bsi0)) {
            return;
        }
        x0h1.m89578u(qt31Var.f192277e, null, 0, new mt31(qt31Var, nvo0Var, fbkVar, 0), 3);
    }
}
