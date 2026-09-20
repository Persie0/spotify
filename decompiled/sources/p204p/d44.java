package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45069a;

    /* JADX INFO: renamed from: b */
    public final boolean f45070b;

    /* JADX INFO: renamed from: c */
    public final bji f45071c;

    /* JADX INFO: renamed from: d */
    public final wg61 f45072d = new wg61(new y34(this, 4));

    public d44(boolean z, boolean z2, bji bjiVar) {
        this.f45069a = z;
        this.f45070b = z2;
        this.f45071c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34906a() {
        d44 d44Var = (d44) this.f45072d.getValue();
        return d44Var != null ? d44Var.m34906a() : this.f45069a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34907b() {
        d44 d44Var = (d44) this.f45072d.getValue();
        return d44Var != null ? d44Var.m34907b() : this.f45070b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("data_stories_enabled", "android-feature-blend-taste-match", m34906a()), new k8a("group_blends_enabled", "android-feature-blend-taste-match", m34907b()));
    }
}
