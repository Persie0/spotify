package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129197a;

    /* JADX INFO: renamed from: b */
    public final boolean f129198b;

    /* JADX INFO: renamed from: c */
    public final boolean f129199c;

    /* JADX INFO: renamed from: d */
    public final bji f129200d;

    /* JADX INFO: renamed from: e */
    public final wg61 f129201e;

    public l34(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f129197a = z;
        this.f129198b = z2;
        this.f129199c = z3;
        this.f129200d = bjiVar;
        this.f129201e = new wg61(new u14(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57983a() {
        l34 l34Var = (l34) this.f129201e.getValue();
        return l34Var != null ? l34Var.m57983a() : this.f129197a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57984b() {
        l34 l34Var = (l34) this.f129201e.getValue();
        return l34Var != null ? l34Var.m57984b() : this.f129198b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57985c() {
        l34 l34Var = (l34) this.f129201e.getValue();
        return l34Var != null ? l34Var.m57985c() : this.f129199c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_autoplay_restriction_from_show", "android-episode-player", m57983a()), new k8a("enable_creator_timestamp", "android-episode-player", m57984b()), new k8a("use_show_esperanto_endpoint", "android-episode-player", m57985c()));
    }

    public l34(bji bjiVar) {
        this(false, false, false, bjiVar);
    }
}
