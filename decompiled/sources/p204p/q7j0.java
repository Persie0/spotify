package p204p;

import com.spotify.messages.PartnerBannerSessionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q7j0 {

    /* JADX INFO: renamed from: a */
    public final m4n0 f186143a;

    /* JADX INFO: renamed from: b */
    public final xre f186144b;

    /* JADX INFO: renamed from: c */
    public k4n0 f186145c;

    /* JADX INFO: renamed from: d */
    public boolean f186146d;

    public q7j0(m4n0 m4n0Var, xre xreVar) {
        this.f186143a = m4n0Var;
        this.f186144b = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m72291a() {
        k4n0 k4n0VarM55393a = this.f186145c;
        if (k4n0VarM55393a == null || k4n0VarM55393a.m55397e() == 0) {
            return 0L;
        }
        if (k4n0VarM55393a.m55396d() != 0) {
            k4n0VarM55393a = k4n0.m55393a(k4n0VarM55393a, k4n0VarM55393a.m55396d(), 0L, 0L, 223);
        }
        ((wy3) this.f186144b).getClass();
        return k4n0VarM55393a.m55395c() + ((System.currentTimeMillis() - k4n0VarM55393a.m55397e()) / ((long) 1000));
    }

    /* JADX INFO: renamed from: b */
    public final void m72292b() {
        k4n0 k4n0Var = this.f186145c;
        String str = null;
        if (k4n0Var == null) {
            k4n0Var = new k4n0(0L, 255, str);
        }
        this.f186143a.m60814a(k4n0Var.m55394b(), "manual_close", m72291a(), d6n0.f45729b, lau.f131415a, "waze");
        this.f186145c = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m72293c() {
        k4n0 k4n0Var = this.f186145c;
        String str = null;
        if (k4n0Var == null) {
            k4n0Var = new k4n0(0L, 255, str);
        }
        this.f186143a.m60814a(k4n0Var.m55394b(), "sent_to_waze", m72291a(), d6n0.f45729b, k4n0Var.m55401i(), "waze");
        this.f186145c = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m72294d(k4n0 k4n0Var) {
        String strM55394b = k4n0Var.m55394b();
        String strM55399g = k4n0Var.m55399g();
        String strM55400h = k4n0Var.m55400h();
        List listM55401i = k4n0Var.m55401i();
        String strM55398f = k4n0Var.m55398f();
        m4n0 m4n0Var = this.f186143a;
        m4n0Var.getClass();
        l4n0 l4n0VarM14337u = PartnerBannerSessionEvent.m14337u();
        l4n0VarM14337u.m58181q(strM55394b);
        l4n0VarM14337u.m58184t("start");
        l4n0VarM14337u.m58183s(strM55399g);
        l4n0VarM14337u.m58185u(0L);
        l4n0VarM14337u.m58186v(strM55400h);
        l4n0VarM14337u.m58180m(listM55401i);
        l4n0VarM14337u.m58182r(strM55398f);
        m4n0Var.f139996a.m73616a(l4n0VarM14337u.build());
    }
}
