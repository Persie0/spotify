package p204p;

import android.app.Activity;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class wek0 {

    /* JADX INFO: renamed from: a */
    public final Activity f250572a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f250573b;

    /* JADX INFO: renamed from: c */
    public final w6j0 f250574c;

    /* JADX INFO: renamed from: d */
    public final efk0 f250575d;

    /* JADX INFO: renamed from: e */
    public final vek0 f250576e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f250577f;

    /* JADX INFO: renamed from: g */
    public final pdk0 f250578g;

    public wek0(Activity activity, z9j0 z9j0Var, w6j0 w6j0Var, efk0 efk0Var, vek0 vek0Var, h4t0 h4t0Var, pdk0 pdk0Var) {
        this.f250572a = activity;
        this.f250573b = z9j0Var;
        this.f250574c = w6j0Var;
        this.f250575d = efk0Var;
        this.f250576e = vek0Var;
        this.f250577f = h4t0Var;
        this.f250578g = pdk0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m87885d(wek0 wek0Var, z650 z650Var) {
        wek0Var.getClass();
        voc1 voc1Var = NowPlayingActivity.f6264u1;
        wek0Var.m87887a(cgg1.m32723u(t36.m79971q().f243453a, z650Var), false, z650Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m87886e(wek0 wek0Var, d850 d850Var) {
        wek0Var.getClass();
        z650 z650Var = d850Var.f46380a;
        voc1 voc1Var = NowPlayingActivity.f6264u1;
        wek0Var.m87887a(cgg1.m32723u(t36.m79971q().f243453a, z650Var), false, z650Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m87887a(b3j0 b3j0Var, boolean z, z650 z650Var) {
        bfk0 bfk0Var = (bfk0) vqg1.m86217B(this.f250575d.f59061a).getValue();
        eh00 eh00Var = this.f250576e.f240767b;
        if ((bfk0Var instanceof afk0) && ((afk0) bfk0Var).f15170a) {
            return;
        }
        if ((bfk0Var instanceof yek0) && ((yek0) bfk0Var).m93533a() && eh00Var != null && !z) {
            eh00Var.invoke();
            return;
        }
        if (((ej4) this.f250577f.get()).m39161b()) {
            m87888b(z650Var);
            return;
        }
        w6j0 w6j0Var = this.f250574c;
        w6j0Var.m87294e(b3j0Var);
        w6j0Var.m87295f(b3j0Var);
        this.f250578g.m69688a();
        voc1 voc1Var = NowPlayingActivity.f6264u1;
        Activity activity = this.f250572a;
        activity.startActivity(t36.m79973s(activity, false));
    }

    /* JADX INFO: renamed from: b */
    public final void m87888b(z650 z650Var) {
        z9j0 z9j0Var = this.f250573b;
        if (z650Var != null) {
            z9j0Var.mo47342b(xoc1.f264144n1.f243453a, new d850(z650Var, null), null);
        } else {
            z9j0Var.mo47346g(xoc1.f264144n1.f243453a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m87889c() {
        m87887a(x2j0.f257512a, false, null);
    }
}
