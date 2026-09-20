package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class i6o0 implements whc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99295a;

    /* JADX INFO: renamed from: b */
    public final t290 f99296b;

    /* JADX INFO: renamed from: c */
    public final qwf f99297c;

    public /* synthetic */ i6o0(t290 t290Var, qwf qwfVar, int i) {
        this.f99295a = i;
        this.f99296b = t290Var;
        this.f99297c = qwfVar;
    }

    @Override // p204p.whc1
    /* JADX INFO: renamed from: a */
    public final q19 mo39664a(ViewGroup viewGroup) {
        switch (this.f99295a) {
            case 0:
                return new h6o0(((uwa) this.f99297c).mo26174a(k6o0.f119803a), this.f99296b);
            case 1:
                return new h6o0(((uwa) this.f99297c).mo26174a(l6o0.f130417a), this.f99296b);
            default:
                return new h6o0(((cju) this.f99297c).mo26174a(null), qpv0.f191387a.mo54112b(khv.class), this.f99296b);
        }
    }
}
