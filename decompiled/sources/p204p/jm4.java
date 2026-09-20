package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f113750a;

    /* JADX INFO: renamed from: b */
    public final boolean f113751b;

    /* JADX INFO: renamed from: c */
    public final boolean f113752c;

    /* JADX INFO: renamed from: d */
    public final boolean f113753d;

    /* JADX INFO: renamed from: e */
    public final bji f113754e;

    /* JADX INFO: renamed from: f */
    public final wg61 f113755f;

    public jm4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f113750a = z;
        this.f113751b = z2;
        this.f113752c = z3;
        this.f113753d = z4;
        this.f113754e = bjiVar;
        this.f113755f = new wg61(new jk4(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m53746a() {
        jm4 jm4Var = (jm4) this.f113755f.getValue();
        return jm4Var != null ? jm4Var.m53746a() : this.f113750a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m53747b() {
        jm4 jm4Var = (jm4) this.f113755f.getValue();
        return jm4Var != null ? jm4Var.m53747b() : this.f113751b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m53748c() {
        jm4 jm4Var = (jm4) this.f113755f.getValue();
        return jm4Var != null ? jm4Var.m53748c() : this.f113752c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m53749d() {
        jm4 jm4Var = (jm4) this.f113755f.getValue();
        return jm4Var != null ? jm4Var.m53749d() : this.f113753d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("delete_show_enabled", "android-podcastsettings-page", m53746a()), new k8a("enable_podcast_settings_page", "android-podcastsettings-page", m53747b()), new k8a("set_schedule_enabled", "android-podcastsettings-page", m53748c()), new k8a("skip_finished_episodes_enabled", "android-podcastsettings-page", m53749d()));
    }

    public jm4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
