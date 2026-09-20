package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class feq implements oeq, fr81 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ meq f68816a;

    public /* synthetic */ feq(meq meqVar) {
        this.f68816a = meqVar;
    }

    @Override // p204p.fr81
    /* JADX INFO: renamed from: a */
    public req mo41482a(Context context) {
        req reqVar = new req(context);
        reqVar.mo33116c(this.f68816a);
        return reqVar;
    }

    @Override // p204p.oeq
    /* JADX INFO: renamed from: b */
    public wsv0 mo41483b(int i, kf81 kf81Var, int[] iArr) {
        jf40 jf40VarM69788m = pf40.m69788m();
        for (int i2 = 0; i2 < kf81Var.f122099a; i2++) {
            jf40VarM69788m.m28985c(new jeq(i, kf81Var, i2, this.f68816a, iArr[i2]));
        }
        return jf40VarM69788m.m53150g();
    }
}
