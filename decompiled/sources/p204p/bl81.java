package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bl81 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28127a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f28128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f28129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f28130d;

    public bl81(kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3) {
        this.f28128b = kqi0Var;
        this.f28129c = kqi0Var2;
        this.f28130d = kqi0Var3;
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        switch (this.f28127a) {
            case 0:
                kqi0 kqi0Var = this.f28128b;
                lg21 lg21Var = (lg21) kqi0Var.getValue();
                if (lg21Var != null) {
                    lg21Var.m58926d();
                }
                lg21 lg21Var2 = (lg21) kqi0Var.getValue();
                if (lg21Var2 != null) {
                    lg21Var2.m58932k();
                }
                ((t9p0) this.f28129c).mo32674b((s9p0) this.f28130d);
                break;
            default:
                this.f28128b.setValue(Boolean.valueOf(((kqi0) this.f28129c).getValue() instanceof c0c1));
                pa9 pa9Var = (pa9) ((kqi0) this.f28130d).getValue();
                if (pa9Var != null) {
                    pa9Var.m69441f();
                }
                break;
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        pa9 pa9Var;
        switch (this.f28127a) {
            case 0:
                ((t9p0) this.f28129c).mo32673a((s9p0) this.f28130d);
                break;
            default:
                kqi0 kqi0Var = this.f28128b;
                if (((Boolean) kqi0Var.getValue()).booleanValue() && (pa9Var = (pa9) ((kqi0) this.f28130d).getValue()) != null) {
                    pa9Var.m69447l();
                }
                kqi0Var.setValue(Boolean.FALSE);
                break;
        }
    }

    public bl81(t9p0 t9p0Var, s9p0 s9p0Var, kqi0 kqi0Var) {
        this.f28129c = t9p0Var;
        this.f28130d = s9p0Var;
        this.f28128b = kqi0Var;
    }
}
