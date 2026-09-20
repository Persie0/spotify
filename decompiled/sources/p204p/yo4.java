package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yo4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274547a;

    /* JADX INFO: renamed from: b */
    public final bji f274548b;

    /* JADX INFO: renamed from: c */
    public final wg61 f274549c = new wg61(new cn4(this, 25));

    public yo4(boolean z, bji bjiVar) {
        this.f274547a = z;
        this.f274548b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94264a() {
        yo4 yo4Var = (yo4) this.f274549c.getValue();
        return yo4Var != null ? yo4Var.m94264a() : this.f274547a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_page_enabled", "android-settings-page-parental-controls", m94264a()));
    }
}
