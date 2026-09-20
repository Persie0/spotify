package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45566a;

    /* JADX INFO: renamed from: b */
    public final boolean f45567b;

    /* JADX INFO: renamed from: c */
    public final boolean f45568c;

    /* JADX INFO: renamed from: d */
    public final bji f45569d;

    /* JADX INFO: renamed from: e */
    public final wg61 f45570e;

    public d64(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f45566a = z;
        this.f45567b = z2;
        this.f45568c = z3;
        this.f45569d = bjiVar;
        this.f45570e = new wg61(new o54(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35053a() {
        d64 d64Var = (d64) this.f45570e.getValue();
        return d64Var != null ? d64Var.m35053a() : this.f45566a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35054b() {
        d64 d64Var = (d64) this.f45570e.getValue();
        return d64Var != null ? d64Var.m35054b() : this.f45567b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m35055c() {
        d64 d64Var = (d64) this.f45570e.getValue();
        return d64Var != null ? d64Var.m35055c() : this.f45568c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("context_menu_in_toolbar_trailing_action_episode", "android-feature-podcast-episode-cwp", m35053a()), new k8a("enable_creative_work_full_slice_plugins_on_episode", "android-feature-podcast-episode-cwp", m35054b()), new k8a("media_prefetch_enabled", "android-feature-podcast-episode-cwp", m35055c()));
    }

    public d64(bji bjiVar) {
        this(false, true, false, bjiVar);
    }
}
