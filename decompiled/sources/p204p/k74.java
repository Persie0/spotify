package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f119940a;

    /* JADX INFO: renamed from: b */
    public final boolean f119941b;

    /* JADX INFO: renamed from: c */
    public final bji f119942c;

    /* JADX INFO: renamed from: d */
    public final wg61 f119943d = new wg61(new f74(this, 4));

    public k74(boolean z, boolean z2, bji bjiVar) {
        this.f119940a = z;
        this.f119941b = z2;
        this.f119942c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55628a() {
        k74 k74Var = (k74) this.f119943d.getValue();
        return k74Var != null ? k74Var.m55628a() : this.f119940a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55629b() {
        k74 k74Var = (k74) this.f119943d.getValue();
        return k74Var != null ? k74Var.m55629b() : this.f119941b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_media_session", "android-feature-transcript-companion-content", m55628a()), new k8a("enable_player_transformer", "android-feature-transcript-companion-content", m55629b()));
    }
}
