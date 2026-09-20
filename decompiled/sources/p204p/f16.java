package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class f16 implements d16 {

    /* JADX INFO: renamed from: a */
    public final am71 f64794a;

    /* JADX INFO: renamed from: b */
    public final sr4 f64795b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f64796c;

    /* JADX INFO: renamed from: d */
    public final wa81 f64797d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f64798e;

    /* JADX INFO: renamed from: f */
    public boolean f64799f;

    public f16(am71 am71Var, hc80 hc80Var) {
        this.f64794a = am71Var;
        sr4 sr4VarM76275a = ((rr4) am71Var).m76275a("cwp_page_load");
        this.f64795b = sr4VarM76275a;
        this.f64796c = new AtomicBoolean(false);
        this.f64797d = !wl51.m88496t0("profile", "release", false) ? jmj0.f113900a : wv4.f255393a;
        this.f64798e = new LinkedHashSet();
        sr4VarM76275a.m79014b("cwp_measurement_id", sr4VarM76275a.f213228c.toString());
        hc80Var.getLifecycle().mo31986a(new e16(this, 0));
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: a */
    public final void mo34582a() {
        m40525o("cwp_page_load");
        m40525o("initial_load");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: b */
    public final void mo34583b() {
        if (this.f64799f) {
            return;
        }
        this.f64799f = true;
        m40523m("make_groups");
        m40525o("row_hydration");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: c */
    public final void mo34584c() {
        m40523m("loaded_factory");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: d */
    public final void mo34585d(boolean z) {
        m40523m("initial_load");
        if (z) {
            return;
        }
        m40524n("failure");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: e */
    public final void mo34586e() {
        m40524n("cancelled");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: f */
    public final void mo34587f() {
        if (this.f64799f) {
            return;
        }
        m40525o("make_groups");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: g */
    public final void mo34588g() {
        m40525o("loaded_factory");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: h */
    public final void mo34589h() {
        m40525o("list_endpoint_load");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: i */
    public final void mo34590i() {
        m40523m("metadata_load");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: j */
    public final void mo34591j() {
        m40525o("metadata_load");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: k */
    public final void mo34592k() {
        m40523m("list_endpoint_load");
    }

    @Override // p204p.d16
    /* JADX INFO: renamed from: l */
    public final void mo34593l(boolean z) {
        m40523m("row_hydration");
        m40524n(z ? "success" : "failure");
    }

    /* JADX INFO: renamed from: m */
    public final void m40523m(String str) {
        if (this.f64796c.get()) {
            return;
        }
        synchronized (this.f64798e) {
            this.f64798e.remove(str);
        }
        this.f64795b.m79016f(str);
        this.f64797d.mo53786f(str, "creator_page");
    }

    /* JADX INFO: renamed from: n */
    public final void m40524n(String str) {
        if (this.f64796c.compareAndSet(false, true)) {
            synchronized (this.f64798e) {
                try {
                    for (String str2 : this.f64798e) {
                        this.f64795b.m79016f(str2);
                        this.f64797d.mo53786f(str2, "creator_page");
                    }
                    this.f64798e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f64795b.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
            this.f64795b.m79013a("page", "artist");
            ((rr4) this.f64794a).m76276b(this.f64795b.m79015d());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m40525o(String str) {
        if (this.f64796c.get()) {
            return;
        }
        synchronized (this.f64798e) {
            this.f64798e.add(str);
        }
        sr4 sr4Var = this.f64795b;
        sr4Var.getClass();
        sr4Var.m79019k(str, null, (4 & 4) != 0);
        wa81.m87586a(this.f64797d, str, "creator_page", 4);
    }
}
