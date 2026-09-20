package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class j6e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o5e0 f109297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f109298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f109299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vum0 f109300d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fyf f109301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6e0(o5e0 o5e0Var, float f, int i, vum0 vum0Var, fyf fyfVar) {
        super(1);
        this.f109297a = o5e0Var;
        this.f109298b = f;
        this.f109299c = i;
        this.f109300d = vum0Var;
        this.f109301e = fyfVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ArrayList arrayList = this.f109297a.f161951b;
        ((uw70) obj).mo30902e(arrayList.size(), new fw20(13, arrayList), new fw20(14, arrayList), new fyf(new i6e0(arrayList, this.f109298b, this.f109299c, this.f109300d, this.f109301e), true, 2039820996));
        return w2a1.f247311a;
    }
}
