package p204p;

import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class i700 implements h9y0 {

    /* JADX INFO: renamed from: L0 */
    public boolean f99387L0;

    /* JADX INFO: renamed from: M0 */
    public prv0 f99388M0;

    /* JADX INFO: renamed from: X */
    public boolean f99389X;

    /* JADX INFO: renamed from: Y */
    public boolean f99390Y;

    /* JADX INFO: renamed from: Z */
    public boolean f99391Z;

    /* JADX INFO: renamed from: a */
    public final SpotifyMainActivity f99392a;

    /* JADX INFO: renamed from: b */
    public final SpotifyMainActivity f99393b;

    /* JADX INFO: renamed from: c */
    public final SpotifyMainActivity f99394c;

    /* JADX INFO: renamed from: d */
    public final w221 f99395d;

    /* JADX INFO: renamed from: e */
    public final fxi f99396e;

    /* JADX INFO: renamed from: f */
    public final fxi f99397f;

    /* JADX INFO: renamed from: g */
    public final z4y f99398g;

    /* JADX INFO: renamed from: h */
    public final oc80 f99399h;

    /* JADX INFO: renamed from: i */
    public final ltx0 f99400i;

    /* JADX INFO: renamed from: t */
    public final bsa f99401t;

    public i700(SpotifyMainActivity spotifyMainActivity, SpotifyMainActivity spotifyMainActivity2, SpotifyMainActivity spotifyMainActivity3, SpotifyMainActivity spotifyMainActivity4, SpotifyMainActivity spotifyMainActivity5, SpotifyMainActivity spotifyMainActivity6, w221 w221Var, edq edqVar) {
        this.f99392a = spotifyMainActivity;
        this.f99393b = spotifyMainActivity2;
        this.f99394c = spotifyMainActivity3;
        this.f99395d = w221Var;
        fxi fxiVar = new fxi();
        this.f99396e = fxiVar;
        fxi fxiVar2 = new fxi();
        this.f99397f = fxiVar2;
        this.f99398g = z4y.m95382b(new g700(this));
        this.f99399h = new oc80(this, true);
        this.f99400i = huf1.m48651k(this);
        this.f99401t = new bsa(spotifyMainActivity2, spotifyMainActivity4.f42745i, spotifyMainActivity6);
        this.f99387L0 = true;
        h700 h700Var = new h700(this, edqVar);
        fex fexVar = new fex(this, 1);
        spotifyMainActivity2.f42740d.m59915g().m41110c("FragmentManagerController.state", new p55(this, 1));
        int i = 0;
        spotifyMainActivity.mo32178X(new d700(this, i));
        spotifyMainActivity.mo34123G(new e700(this, i));
        spotifyMainActivity.mo34129c0(new e700(this, 1));
        spotifyMainActivity.mo34128b0(new e700(this, 2));
        spotifyMainActivity.f42736Y.add(new e700(this, 3));
        fxiVar.f74381d.mo31986a(h700Var);
        fxiVar2.f74381d.mo31986a(fexVar);
        spotifyMainActivity5.f6055d1.add(new f700(this));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m49826a(c700 c700Var) {
        boolean zM49826a = false;
        for (i500 i500Var : c700Var.f34668c.m89877x()) {
            if (i500Var != null) {
                c600 c600Var = i500Var.f98681T0;
                if ((c600Var == null ? null : c600Var.mo31499Z()) != null) {
                    zM49826a |= m49826a(i500Var.m49716o0());
                }
                y800 y800Var = i500Var.f98717r1;
                fb80 fb80Var = fb80.f67752c;
                fb80 fb80Var2 = fb80.f67753d;
                if (y800Var != null) {
                    y800 y800Var2 = (y800) i500Var.m49724w0();
                    y800Var2.m93034b();
                    if (y800Var2.f270161e.f163857d.m41223a(fb80Var2)) {
                        hc80 hc80VarM49724w0 = i500Var.m49724w0();
                        y800 y800Var3 = hc80VarM49724w0 != null ? (y800) hc80VarM49724w0 : null;
                        if (y800Var3 != null) {
                            y800Var3.f270161e.m66678i(fb80Var);
                        }
                        zM49826a = true;
                    }
                }
                if (i500Var.f98716q1.f163857d.m41223a(fb80Var2)) {
                    i500Var.f98716q1.m66678i(fb80Var);
                    zM49826a = true;
                }
            }
        }
        return zM49826a;
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f99399h;
    }

    @Override // p204p.h9y0
    /* JADX INFO: renamed from: x */
    public final f9y0 mo34135x() {
        return this.f99400i.m59915g();
    }
}
