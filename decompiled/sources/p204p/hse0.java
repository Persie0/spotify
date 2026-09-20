package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class hse0 implements jvb0 {

    /* JADX INFO: renamed from: a */
    public final ofm0 f94683a;

    /* JADX INFO: renamed from: b */
    public final gse0 f94684b;

    public hse0(ofm0 ofm0Var, gse0 gse0Var) {
        this.f94683a = ofm0Var;
        this.f94684b = gse0Var;
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: c */
    public final void mo26289c() {
        this.f94684b.f83948d = new uqd0(this, 17);
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: d */
    public final void mo26290d() {
        String str;
        gse0 gse0Var = this.f94684b;
        eh00 eh00Var = gse0Var.f83948d;
        gse0Var.f83948d = (eh00Var == null || (str = (String) eh00Var.invoke()) == null) ? null : new dl3(str, 2);
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: i */
    public final void mo26292i() {
        gse0 gse0Var = this.f94684b;
        ((wy3) gse0Var.f83945a).getClass();
        gse0Var.f83947c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: g */
    public final void mo26291g(ViewGroup viewGroup) {
    }
}
