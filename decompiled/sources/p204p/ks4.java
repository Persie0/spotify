package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ks4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125828a;

    /* JADX INFO: renamed from: b */
    public final boolean f125829b;

    /* JADX INFO: renamed from: c */
    public final bji f125830c;

    /* JADX INFO: renamed from: d */
    public final wg61 f125831d;

    public ks4(boolean z, boolean z2, bji bjiVar) {
        this.f125828a = z;
        this.f125829b = z2;
        this.f125830c = bjiVar;
        this.f125831d = new wg61(new zr4(this, 9));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57188a() {
        ks4 ks4Var = (ks4) this.f125831d.getValue();
        return ks4Var != null ? ks4Var.m57188a() : this.f125828a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57189b() {
        ks4 ks4Var = (ks4) this.f125831d.getValue();
        return ks4Var != null ? ks4Var.m57189b() : this.f125829b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_translation", "android-transcript-selection", m57188a()), new k8a("use_compose_page", "android-transcript-selection", m57189b()));
    }

    public ks4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
