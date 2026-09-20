package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f119393a;

    /* JADX INFO: renamed from: b */
    public final boolean f119394b;

    /* JADX INFO: renamed from: c */
    public final bji f119395c;

    /* JADX INFO: renamed from: d */
    public final wg61 f119396d = new wg61(new y34(this, 26));

    public k54(boolean z, boolean z2, bji bjiVar) {
        this.f119393a = z;
        this.f119394b = z2;
        this.f119395c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55420a() {
        k54 k54Var = (k54) this.f119396d.getValue();
        return k54Var != null ? k54Var.m55420a() : this.f119393a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55421b() {
        k54 k54Var = (k54) this.f119396d.getValue();
        return k54Var != null ? k54Var.m55421b() : this.f119394b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("clear_cache_on_trim_enabled", "android-feature-lyrics-repository", m55420a()), new k8a("enable_dynamic_colors", "android-feature-lyrics-repository", m55421b()));
    }
}
