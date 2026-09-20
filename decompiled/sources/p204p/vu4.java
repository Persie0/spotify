package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vu4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f244860a;

    /* JADX INFO: renamed from: b */
    public final bji f244861b;

    /* JADX INFO: renamed from: c */
    public final wg61 f244862c = new wg61(new uu4(this, 0));

    public vu4(boolean z, bji bjiVar) {
        this.f244860a = z;
        this.f244861b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86409a() {
        vu4 vu4Var = (vu4) this.f244862c.getValue();
        return vu4Var != null ? vu4Var.m86409a() : this.f244860a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("onboarding_enabled", "android-wear-activation", m86409a()));
    }
}
