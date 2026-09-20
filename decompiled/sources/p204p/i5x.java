package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i5x implements avt {

    /* JADX INFO: renamed from: a */
    public final String f99047a;

    /* JADX INFO: renamed from: b */
    public final xh00 f99048b;

    /* JADX INFO: renamed from: c */
    public final xh00 f99049c;

    public i5x(String str, xh00 xh00Var, xh00 xh00Var2) {
        this.f99047a = str;
        this.f99048b = xh00Var;
        this.f99049c = xh00Var2;
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: a */
    public final b250 mo26459a(Object obj, Object obj2, b250 b250Var) {
        int iM61770n = mhf1.m61770n(b250Var);
        pv91 pv91Var = (pv91) this.f99048b.mo24818M(obj, obj2, Integer.valueOf(iM61770n), (st91) mhf1.m61769m(b250Var).invoke(Integer.valueOf(iM61770n)));
        return hhg1.m47529h(new nq91(pv91Var), new oq91(new j20(pv91Var, 28)));
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: b */
    public final Object mo26460b(Object obj, Object obj2, Object obj3, b250 b250Var) {
        mhf1.m61768l(this.f99047a, b250Var);
        pv91 pv91VarM61864Q = b250Var != null ? mif1.m61864Q(b250Var) : null;
        if (pv91VarM61864Q == null) {
            pv91VarM61864Q = null;
        }
        if (pv91VarM61864Q != null) {
            return (av91) this.f99049c.mo24818M(pv91VarM61864Q, obj, obj2, obj3);
        }
        return null;
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: c */
    public final boolean mo26461c(Object obj, Object obj2, b250 b250Var) {
        pv91 pv91VarM61864Q = b250Var != null ? mif1.m61864Q(b250Var) : null;
        pv91 pv91Var = pv91VarM61864Q != null ? pv91VarM61864Q : null;
        if (pv91Var != null) {
            return (pv91Var instanceof rv91) || (pv91Var instanceof qv91);
        }
        return false;
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: d */
    public final Object mo26462d(Object obj, Object obj2, b250 b250Var) {
        mhf1.m61768l(this.f99047a, b250Var);
        pv91 pv91VarM61864Q = b250Var != null ? mif1.m61864Q(b250Var) : null;
        if (pv91VarM61864Q == null) {
            pv91VarM61864Q = null;
        }
        if (pv91VarM61864Q instanceof rv91) {
            return ((rv91) pv91VarM61864Q).mo24514e();
        }
        if (pv91VarM61864Q instanceof qv91) {
            return ((qv91) pv91VarM61864Q).mo29028e();
        }
        return null;
    }
}
