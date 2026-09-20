package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rxt implements cut {

    /* JADX INFO: renamed from: a */
    public final uut f203722a;

    /* JADX INFO: renamed from: b */
    public final avt f203723b;

    /* JADX INFO: renamed from: c */
    public final uwt f203724c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ry8 f203725d;

    public rxt(ry8 ry8Var, ViewGroup.LayoutParams layoutParams, Object obj) {
        this.f203725d = ry8Var;
        this.f203722a = ry8Var.getBehavior();
        this.f203723b = ry8Var.mo24358a();
        this.f203724c = w9h1.m87518z(ry8Var.mo24359c(), layoutParams, obj);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f203723b;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: b */
    public final String mo29380b() {
        return this.f203725d.mo29771b();
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f203724c;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f203722a;
    }
}
