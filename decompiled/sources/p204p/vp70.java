package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vp70 implements n6d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n6d0 f243610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zp70 f243611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f243612c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n6d0 f243613d;

    public vp70(n6d0 n6d0Var, zp70 zp70Var, int i, n6d0 n6d0Var2) {
        this.f243611b = zp70Var;
        this.f243612c = i;
        this.f243613d = n6d0Var2;
        this.f243610a = n6d0Var;
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: a */
    public final void mo27119a() {
        int i = this.f243612c;
        zp70 zp70Var = this.f243611b;
        zp70Var.f285004d = i;
        this.f243613d.mo27119a();
        if (zp70Var.f285001a.f135685i == null) {
            zp70Var.m96669h(zp70Var.f285004d);
        }
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: b */
    public final int mo27120b() {
        return this.f243610a.mo27120b();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: c */
    public final Map mo27121c() {
        return this.f243610a.mo27121c();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: d */
    public final int mo27122d() {
        return this.f243610a.mo27122d();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: e */
    public final gh00 mo31376e() {
        return this.f243610a.mo31376e();
    }
}
