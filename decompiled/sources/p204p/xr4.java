package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xr4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265259a;

    /* JADX INFO: renamed from: b */
    public final bji f265260b;

    /* JADX INFO: renamed from: c */
    public final wg61 f265261c = new wg61(new kp4(this, 28));

    public xr4(boolean z, bji bjiVar) {
        this.f265259a = z;
        this.f265260b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91913a() {
        xr4 xr4Var = (xr4) this.f265261c.getValue();
        return xr4Var != null ? xr4Var.m91913a() : this.f265259a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_debug_view_overlay", "android-tome-insets", m91913a()));
    }
}
