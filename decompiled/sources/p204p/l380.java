package p204p;

import io.reactivex.rxjava3.functions.Function4;

/* JADX INFO: loaded from: classes11.dex */
public final class l380 implements Function4 {

    /* JADX INFO: renamed from: a */
    public final boolean f129229a;

    /* JADX INFO: renamed from: b */
    public final boolean f129230b;

    /* JADX INFO: renamed from: c */
    public final boolean f129231c;

    /* JADX INFO: renamed from: d */
    public final Object f129232d;

    public l380(n380 n380Var, boolean z, boolean z2, boolean z3) {
        this.f129232d = n380Var;
        this.f129229a = z;
        this.f129230b = z2;
        this.f129231c = z3;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        hqe1 hqe1Var = ((n380) this.f129232d).f149959b;
        boolean zM48246e = hqe1Var.m48246e();
        boolean zM48257p = hqe1Var.m48257p();
        boolean zM48266y = hqe1Var.m48266y();
        boolean zM48238I = hqe1Var.m48238I();
        boolean z = false;
        boolean z2 = this.f129229a;
        boolean z3 = (z2 || zBooleanValue || !zM48246e) ? false : true;
        boolean z4 = this.f129230b;
        boolean z5 = !z2 && z4 && !zBooleanValue2 && zM48257p;
        boolean z6 = z2 && z4 && !zBooleanValue3 && zM48266y;
        if (z4 && this.f129231c && !zBooleanValue4 && zM48238I) {
            z = true;
        }
        return new j380(z5, z3, z, z6);
    }

    public /* synthetic */ l380() {
        this((String) null, false, true, false);
    }

    public l380(String str, boolean z, boolean z2, boolean z3) {
        this.f129229a = z;
        this.f129230b = z2;
        this.f129231c = z3;
        this.f129232d = str;
    }
}
