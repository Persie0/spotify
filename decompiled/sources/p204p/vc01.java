package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vc01 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239631a;

    /* JADX INFO: renamed from: b */
    public final boolean f239632b;

    /* JADX INFO: renamed from: c */
    public final fnk0 f239633c;

    /* JADX INFO: renamed from: d */
    public final bji f239634d;

    /* JADX INFO: renamed from: e */
    public final wg61 f239635e;

    /* JADX INFO: renamed from: f */
    public final wg61 f239636f;

    public vc01(boolean z, boolean z2, fnk0 fnk0Var, bji bjiVar) {
        this.f239631a = z;
        this.f239632b = z2;
        this.f239633c = fnk0Var;
        this.f239634d = bjiVar;
        this.f239635e = new wg61(new uc01(this, 1));
        this.f239636f = new wg61(new uc01(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85177a() {
        vc01 vc01Var = (vc01) this.f239636f.getValue();
        return vc01Var != null ? vc01Var.m85177a() : this.f239631a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85178b() {
        vc01 vc01Var = (vc01) this.f239636f.getValue();
        return vc01Var != null ? vc01Var.m85178b() : this.f239632b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_quick_access_settings_customization", "settings-quickaccess", m85177a()), new k8a("show_quick_access_settings_in_settings", "settings-quickaccess", m85178b()));
    }

    public vc01(fnk0 fnk0Var, bji bjiVar) {
        this(false, false, fnk0Var, bjiVar);
    }
}
