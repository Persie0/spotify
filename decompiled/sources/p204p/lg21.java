package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public final class lg21 {

    /* JADX INFO: renamed from: a */
    public final wri0 f133055a;

    /* JADX INFO: renamed from: b */
    public final ty71 f133056b;

    /* JADX INFO: renamed from: c */
    public final v9p0 f133057c;

    /* JADX INFO: renamed from: d */
    public final sy71 f133058d;

    /* JADX INFO: renamed from: e */
    public final c9k f133059e;

    /* JADX INFO: renamed from: f */
    public final zv41 f133060f;

    /* JADX INFO: renamed from: g */
    public boolean f133061g;

    public lg21(xre xreVar, yo3 yo3Var, sy71 sy71Var, ty71 ty71Var, v9p0 v9p0Var) {
        this.f133055a = yo3Var;
        this.f133056b = ty71Var;
        this.f133057c = v9p0Var;
        this.f133058d = ty71Var.m81951c(sy71Var, true);
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), xsr.f265652b));
        this.f133059e = c9kVarM56661c;
        this.f133060f = jag1.m52819d(new cg21(null, 0, System.currentTimeMillis(), 0L, 0L, 0.0f, true, fg21.f69183a, null));
        ph50 ph50VarM84984a = v9p0Var.m84984a();
        if (ph50VarM84984a != null) {
            ph50VarM84984a.m69961n();
        }
        fbk fbkVar = null;
        x0h1.m89578u(c9kVarM56661c, null, 0, new yl00(this, fbkVar, 1), 3);
        x0h1.m89578u(c9kVarM56661c, null, 0, new yl00(this, fbkVar, 2), 3);
        x0h1.m89578u(c9kVarM56661c, null, 0, new yl00(this, fbkVar, 3), 3);
        x0h1.m89578u(c9kVarM56661c, null, 0, new yl00(this, fbkVar, 4), 3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m58922g(lg21 lg21Var, d850 d850Var, Long l, String str, ze8 ze8Var, int i) {
        if ((i & 1) != 0) {
            d850Var = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            ze8Var = null;
        }
        lg21Var.m58928f(d850Var, l, str, ze8Var);
    }

    /* JADX INFO: renamed from: a */
    public final ph50 m58923a() {
        v9p0 v9p0Var = this.f133057c;
        if (((Boolean) v9p0Var.m84985b().getValue()).booleanValue() || ((Boolean) this.f133058d.m79675a().getValue()).booleanValue()) {
            return null;
        }
        return v9p0Var.m84984a();
    }

    /* JADX INFO: renamed from: b */
    public final void m58924b(k7i0 k7i0Var) {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69958k(k7i0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58925c() {
        this.f133055a.mo29039k();
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69961n();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58926d() {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69962o();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58927e(String str) {
        d850 d850Var;
        if (str != null) {
            z650.Companion.getClass();
            d850Var = new d850(y650.m92949a(str), null);
        } else {
            d850Var = null;
        }
        m58922g(this, d850Var, null, null, null, 8);
    }

    /* JADX INFO: renamed from: f */
    public final void m58928f(d850 d850Var, Long l, String str, ze8 ze8Var) {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            k7i0 k7i0VarM78127b = ((sh50) ph50VarM58923a.m69957j().getValue()).m78127b();
            if (k7i0VarM78127b == null) {
                throw new IllegalStateException("must call load first");
            }
            ph50VarM58923a.m69963p(k7i0VarM78127b, d850Var, l, str, ze8Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m58929h() {
        kk40.m56680v(this.f133059e, null);
        v9p0 v9p0Var = this.f133057c;
        ph50 ph50VarM84984a = v9p0Var.m84984a();
        if (ph50VarM84984a != null) {
            ph50VarM84984a.m69968u(null);
        }
        ph50 ph50VarM84984a2 = v9p0Var.m84984a();
        if (ph50VarM84984a2 != null) {
            ph50VarM84984a2.m69969v();
        }
        ph50 ph50VarM84984a3 = v9p0Var.m84984a();
        if (ph50VarM84984a3 != null) {
            ph50VarM84984a3.m69961n();
        }
        v9p0Var.m84986c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zv41 zv41Var = this.f133060f;
        cg21 cg21Var = new cg21(null, 0, jCurrentTimeMillis, 0L, 0L, 0.0f, true, ((cg21) zv41Var.getValue()).f37544h instanceof eg21 ? ((cg21) zv41Var.getValue()).f37544h : new eg21(zf21.f282196a), null);
        zv41Var.getClass();
        zv41Var.m97091m(null, cg21Var);
        this.f133056b.m81950b(this.f133058d);
    }

    /* JADX INFO: renamed from: i */
    public final void m58930i(long j) {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69966s(j);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m58931j(VideoSurfaceView videoSurfaceView) {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69968u(videoSurfaceView);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m58932k() {
        ph50 ph50VarM58923a = m58923a();
        if (ph50VarM58923a != null) {
            ph50VarM58923a.m69969v();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58933l() {
        ph50 ph50VarM58923a;
        if (!this.f133055a.mo29041m() || (ph50VarM58923a = m58923a()) == null) {
            return;
        }
        ph50VarM58923a.m69970w();
    }
}
