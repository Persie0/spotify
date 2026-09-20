package p204p;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class rcz0 implements ocz0 {

    /* JADX INFO: renamed from: a */
    public final e940 f197976a;

    /* JADX INFO: renamed from: b */
    public final adz0 f197977b;

    /* JADX INFO: renamed from: c */
    public final ldz0 f197978c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f197979d;

    public rcz0(e940 e940Var, adz0 adz0Var, ldz0 ldz0Var) {
        this.f197976a = e940Var;
        this.f197977b = adz0Var;
        this.f197978c = ldz0Var;
        this.f197979d = ufg1.m83012n(ldz0Var);
    }

    @Override // p204p.ocz0
    /* JADX INFO: renamed from: a */
    public final ncz0 mo66728a(int i, long j, int i2) {
        Size size = new Size(i, i2);
        adz0 adz0Var = this.f197977b;
        ldz0 ldz0Var = this.f197978c;
        hdz0 hdz0VarM25634a = adz0Var.m25634a(ldz0Var, size);
        if (hdz0VarM25634a == null) {
            hdz0VarM25634a = (hdz0) g6f.m43689C0(ldz0Var.f132381c);
        }
        if (hdz0VarM25634a == null) {
            return null;
        }
        int i3 = hdz0VarM25634a.f90261f;
        int i4 = hdz0VarM25634a.f90262g;
        pqm0 pqm0VarM83013o = ufg1.m83013o(this.f197979d, j, hdz0VarM25634a);
        if (pqm0VarM83013o == null) {
            return null;
        }
        int iIntValue = ((Number) pqm0VarM83013o.f180350a).intValue();
        long jLongValue = ((Number) pqm0VarM83013o.f180351b).longValue();
        String strM83015q = ufg1.m83015q(ldz0Var, hdz0VarM25634a, iIntValue / (i3 * i4));
        int i5 = iIntValue % (i3 * i4);
        Integer numValueOf = Integer.valueOf(i5 % i4);
        Integer numValueOf2 = Integer.valueOf(i5 / i4);
        int iIntValue2 = numValueOf.intValue();
        int iIntValue3 = numValueOf2.intValue();
        int i6 = i4 * hdz0VarM25634a.f90260e;
        int i7 = i3 * hdz0VarM25634a.f90259d;
        lxe lxeVarMo24613j = this.f197976a.mo24613j(strM83015q);
        lxeVarMo24613j.f137796b.f197451k = h4b.DISABLED;
        lxeVarMo24613j.m60190p(i6, i7, 1);
        lxeVarMo24613j.m60192r(new s4i0(hdz0VarM25634a.f90262g, hdz0VarM25634a.f90261f, hdz0VarM25634a.f90260e, hdz0VarM25634a.f90259d, iIntValue2, iIntValue3, strM83015q));
        return new ncz0(jLongValue, lxeVarMo24613j);
    }
}
