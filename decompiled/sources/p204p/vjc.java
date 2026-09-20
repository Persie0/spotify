package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class vjc extends l891 {

    /* JADX INFO: renamed from: a */
    public boolean f241943a = false;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f241944b;

    public vjc(ViewGroup viewGroup) {
        this.f241944b = viewGroup;
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: a */
    public final void mo32230a() {
        mif1.m61858K(this.f241944b, false);
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
        mif1.m61858K(this.f241944b, false);
        this.f241943a = true;
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: c */
    public final void mo32232c() {
        mif1.m61858K(this.f241944b, true);
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        if (!this.f241943a) {
            mif1.m61858K(this.f241944b, false);
        }
        z691Var.mo55874G(this);
    }
}
