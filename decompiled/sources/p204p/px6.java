package p204p;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class px6 implements pzo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f182219a;

    /* JADX INFO: renamed from: b */
    public final Object f182220b;

    public /* synthetic */ px6(Object obj, int i) {
        this.f182219a = i;
        this.f182220b = obj;
    }

    @Override // p204p.pzo0
    /* JADX INFO: renamed from: a */
    public final ozo0 mo32013a(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar, String str) {
        switch (this.f182219a) {
            case 0:
                return new ox6((qe0) this.f182220b, yzo0Var, noo0Var);
            case 1:
                nlv0 nlv0Var = new nlv0();
                nlv0Var.f155174a = noo0Var.f156768c;
                return new p99(this, new rlv0(), nlv0Var);
            case 2:
                return new atb((ctb) this.f182220b);
            case 3:
                return new l3c(yzo0Var, noo0Var, this);
            case 4:
                return new arb((yhq) this.f182220b, 1);
            case 5:
                return new nhz((ImageView) this.f182220b);
            case 6:
                return (rd51) this.f182220b;
            case 7:
                return new s361((ya9) this.f182220b);
            case 8:
                return new ct0(new vr11((szb1) this.f182220b, 29));
            case 9:
                return new q0c1((svp) this.f182220b);
            case 10:
                return new c1c1((d1c1) this.f182220b);
            case 11:
                return (ozo0) this.f182220b;
            default:
                return (adc1) this.f182220b;
        }
    }

    /* JADX INFO: renamed from: b */
    public xv41 m71356b() {
        return (zv41) this.f182220b;
    }

    /* JADX INFO: renamed from: c */
    public void m71357c(gh00 gh00Var) {
        zv41 zv41Var = (zv41) this.f182220b;
        zv41Var.m97090l(gh00Var.invoke(zv41Var.getValue()));
    }

    public px6() {
        this.f182219a = 1;
        this.f182220b = jag1.m52819d(new sh50(null, false, fg21.f69183a, true, 0L, 0L, 0.0f, 0L, null));
    }
}
