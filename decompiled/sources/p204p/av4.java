package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class av4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f20090a;

    /* JADX INFO: renamed from: b */
    public final bji f20091b;

    /* JADX INFO: renamed from: c */
    public final wg61 f20092c = new wg61(new uu4(this, 2));

    public av4(boolean z, bji bjiVar) {
        this.f20090a = z;
        this.f20091b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27222a() {
        av4 av4Var = (av4) this.f20092c.getValue();
        return av4Var != null ? av4Var.m27222a() : this.f20090a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("external_redirect_enabled", "android-webview-checkout", m27222a()));
    }
}
