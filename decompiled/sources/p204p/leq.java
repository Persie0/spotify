package p204p;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class leq extends cr81 {

    /* JADX INFO: renamed from: J */
    public boolean f132655J;

    /* JADX INFO: renamed from: K */
    public final boolean f132656K;

    /* JADX INFO: renamed from: L */
    public final boolean f132657L;

    /* JADX INFO: renamed from: M */
    public final boolean f132658M;

    /* JADX INFO: renamed from: N */
    public boolean f132659N;

    /* JADX INFO: renamed from: O */
    public final boolean f132660O;

    /* JADX INFO: renamed from: P */
    public final boolean f132661P;

    /* JADX INFO: renamed from: Q */
    public final SparseArray f132662Q;

    /* JADX INFO: renamed from: R */
    public final SparseBooleanArray f132663R;

    public leq(meq meqVar) {
        m33728d(meqVar);
        this.f132655J = meqVar.f142822w0;
        this.f132656K = meqVar.f142823x0;
        this.f132657L = meqVar.f142824y0;
        this.f132658M = meqVar.f142825z0;
        this.f132659N = meqVar.f142817A0;
        this.f132660O = meqVar.f142818B0;
        this.f132661P = meqVar.f142819C0;
        SparseArray sparseArray = meqVar.f142820D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f132662Q = sparseArray2;
        this.f132663R = meqVar.f142821E0.clone();
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: a */
    public final void mo33725a(zq81 zq81Var) {
        this.f41212H.put(zq81Var.f285331a, zq81Var);
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: b */
    public final dr81 mo33726b() {
        return new meq(this);
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: c */
    public final cr81 mo33727c() {
        super.mo33727c();
        return this;
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: f */
    public final cr81 mo33729f(zq81 zq81Var) {
        super.mo33729f(zq81Var);
        return this;
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: g */
    public final cr81 mo33730g(String[] strArr) {
        super.mo33730g(strArr);
        return this;
    }

    @Override // p204p.cr81
    /* JADX INFO: renamed from: h */
    public final cr81 mo33731h(String[] strArr) {
        super.mo33731h(strArr);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m58811j(Set set) {
        this.f41213I.clear();
        this.f41213I.addAll(set);
    }

    /* JADX INFO: renamed from: k */
    public final void m58812k(String str) {
        if (str == null) {
            mo33730g(new String[0]);
        } else {
            mo33730g(new String[]{str});
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58813l(String str) {
        mo33731h(new String[]{str});
    }

    /* JADX INFO: renamed from: m */
    public final void m58814m() {
        super.m33732i(5, true);
    }

    public leq() {
        this.f132662Q = new SparseArray();
        this.f132663R = new SparseBooleanArray();
        this.f132655J = true;
        this.f132656K = true;
        this.f132657L = true;
        this.f132658M = true;
        this.f132659N = true;
        this.f132660O = true;
        this.f132661P = true;
    }
}
