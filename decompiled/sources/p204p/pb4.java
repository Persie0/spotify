package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f175703a;

    /* JADX INFO: renamed from: b */
    public final boolean f175704b;

    /* JADX INFO: renamed from: c */
    public final boolean f175705c;

    /* JADX INFO: renamed from: d */
    public final bji f175706d;

    /* JADX INFO: renamed from: e */
    public final wg61 f175707e = new wg61(new ga4(this, 27));

    public pb4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f175703a = z;
        this.f175704b = z2;
        this.f175705c = z3;
        this.f175706d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69513a() {
        pb4 pb4Var = (pb4) this.f175707e.getValue();
        return pb4Var != null ? pb4Var.m69513a() : this.f175703a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69514b() {
        pb4 pb4Var = (pb4) this.f175707e.getValue();
        return pb4Var != null ? pb4Var.m69514b() : this.f175704b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69515c() {
        pb4 pb4Var = (pb4) this.f175707e.getValue();
        return pb4Var != null ? pb4Var.m69515c() : this.f175705c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("audiobook_chapter_list_button_enabled", "android-libs-newplaying-podcast-mode", m69513a()), new k8a("use_element_api", "android-libs-newplaying-podcast-mode", m69514b()), new k8a("use_queue_on_free", "android-libs-newplaying-podcast-mode", m69515c()));
    }
}
