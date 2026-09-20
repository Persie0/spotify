package p204p;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class yhq implements onp {

    /* JADX INFO: renamed from: X */
    public final rvw0 f272938X;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2609yd f272940a;

    /* JADX INFO: renamed from: b */
    public final boolean f272941b;

    /* JADX INFO: renamed from: c */
    public final am71 f272942c;

    /* JADX INFO: renamed from: d */
    public boolean f272943d;

    /* JADX INFO: renamed from: e */
    public boolean f272944e;

    /* JADX INFO: renamed from: f */
    public boolean f272945f;

    /* JADX INFO: renamed from: g */
    public xzb1 f272946g;

    /* JADX INFO: renamed from: i */
    public View f272948i;

    /* JADX INFO: renamed from: h */
    public final Handler f272947h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t */
    public boolean f272949t = true;

    /* JADX INFO: renamed from: Y */
    public final jwo f272939Y = new jwo(this, 14);

    public yhq(ra9 ra9Var, l89 l89Var, ab9 ab9Var, InterfaceC2609yd interfaceC2609yd, boolean z, am71 am71Var) {
        this.f272940a = interfaceC2609yd;
        this.f272941b = z;
        this.f272942c = am71Var;
        this.f272938X = new rvw0(ra9Var, l89Var, ab9Var, new px6(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public static l1p0 m93687a(xzb1 xzb1Var) {
        vsb1 vsb1Var = xzb1Var.f267573a;
        if (vsb1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = xzb1Var.f267577e;
        Map mapSingletonMap = str != null ? Collections.singletonMap("itemId", str) : nau.f152117a;
        if (vsb1Var instanceof tsb1) {
            return new l1p0(((tsb1) vsb1Var).f223277a, 4, mapSingletonMap);
        }
        if (vsb1Var instanceof usb1) {
            return new l1p0(yif1.m93802o(((usb1) vsb1Var).f233581a), 4, mapSingletonMap);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final void m93688b(xzb1 xzb1Var) {
        vsb1 vsb1Var;
        whr0.f251426i.f251432f.mo31986a(this);
        this.f272946g = xzb1Var;
        if (this.f272944e) {
            boolean z = xzb1Var.f267574b;
            wzb1 wzb1Var = xzb1Var.f267576d;
            sr4 sr4VarM76275a = null;
            rvw0 rvw0Var = this.f272938X;
            if (!z || (vsb1Var = xzb1Var.f267573a) == null || !vsb1Var.m86306c() || !this.f272940a.mo76359a(4) || this.f272941b) {
                this.f272945f = false;
                pa9 pa9Var = (pa9) rvw0Var.f203144f;
                if (pa9Var != null) {
                    ((ra9) rvw0Var.f203139a).mo72486b(pa9Var);
                    rvw0Var.f203144f = null;
                }
                m93691e();
                return;
            }
            this.f272945f = true;
            if (wj50.m88271j((l1p0) rvw0Var.f203145g, m93687a(xzb1Var))) {
                return;
            }
            if (!wzb1Var.f256564d || this.f272943d) {
                boolean z2 = wzb1Var.f256562b;
                am71 am71Var = this.f272942c;
                if (z2) {
                    sr4VarM76275a = ((rr4) am71Var).m76275a(wzb1Var.f256563c);
                    ConcurrentHashMap concurrentHashMap = sr4VarM76275a.f213230e;
                    concurrentHashMap.put("feature_id", xzb1Var.f267575c);
                    concurrentHashMap.put("media_loaded", "false");
                    concurrentHashMap.put("phase", "render");
                }
                if (sr4VarM76275a != null) {
                    sr4VarM76275a.m79019k("load", null, (4 & 4) != 0);
                }
                if (wzb1Var.f256561a) {
                    this.f272947h.postDelayed(new bz1(this, xzb1Var, sr4VarM76275a, 10), 200L);
                } else {
                    m93690d(xzb1Var, sr4VarM76275a);
                }
                if (sr4VarM76275a != null) {
                    sr4VarM76275a.m79016f("load");
                }
                if (sr4VarM76275a != null) {
                    ((rr4) am71Var).m76276b(sr4VarM76275a.m79015d());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93689c(vzg1 vzg1Var) {
        xzb1 xzb1Var;
        boolean z = vzg1Var instanceof t1x;
        rvw0 rvw0Var = this.f272938X;
        if (z) {
            t1x t1xVar = (t1x) vzg1Var;
            this.f272948i = t1xVar.f216377c;
            VideoSurfaceView videoSurfaceView = t1xVar.f216376b;
            videoSurfaceView.setBufferingThrobberEnabled(false);
            videoSurfaceView.setVideoSurfaceCallback(this.f272939Y);
            rvw0Var.f203143e = videoSurfaceView;
            pa9 pa9Var = (pa9) rvw0Var.f203144f;
            if (pa9Var != null) {
                pa9Var.m69439d(videoSurfaceView);
            }
            if (this.f272949t) {
                m93691e();
                return;
            }
            this.f272949t = false;
            View view = this.f272948i;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (vzg1Var instanceof vtw) {
            m93688b(((vtw) vzg1Var).f244781b);
            return;
        }
        sr4 sr4VarM76275a = null;
        if (!vzg1Var.equals(yuw.f276482b)) {
            if (vzg1Var.equals(yuw.f276483c)) {
                this.f272943d = false;
                pa9 pa9Var2 = (pa9) rvw0Var.f203144f;
                if (pa9Var2 != null) {
                    pa9Var2.m69441f();
                    return;
                }
                return;
            }
            if (!vzg1Var.equals(yuw.f276484d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f272943d = false;
            this.f272947h.removeCallbacksAndMessages(null);
            rvw0Var.f203145g = null;
            rvw0Var.f203146h = null;
            pa9 pa9Var3 = (pa9) rvw0Var.f203144f;
            if (pa9Var3 != null) {
                pa9Var3.m69455u();
            }
            pa9 pa9Var4 = (pa9) rvw0Var.f203144f;
            if (pa9Var4 != null) {
                ((ra9) rvw0Var.f203139a).mo72486b(pa9Var4);
                rvw0Var.f203144f = null;
            }
            m93691e();
            whr0.f251426i.f251432f.mo31988d(this);
            return;
        }
        this.f272943d = true;
        if (!this.f272945f || (xzb1Var = this.f272946g) == null) {
            return;
        }
        l1p0 l1p0VarM93687a = m93687a(xzb1Var);
        wzb1 wzb1Var = xzb1Var.f267576d;
        boolean z2 = wzb1Var.f256562b;
        am71 am71Var = this.f272942c;
        if (z2) {
            sr4VarM76275a = ((rr4) am71Var).m76275a(wzb1Var.f256563c);
            ConcurrentHashMap concurrentHashMap = sr4VarM76275a.f213230e;
            concurrentHashMap.put("feature_id", xzb1Var.f267575c);
            concurrentHashMap.put("media_loaded", String.valueOf(wj50.m88271j((l1p0) rvw0Var.f203145g, l1p0VarM93687a)));
            concurrentHashMap.put("phase", "gain_focus");
        }
        if (sr4VarM76275a != null) {
            sr4VarM76275a.m79019k("load", null, (4 & 4) != 0);
        }
        if (wj50.m88271j((l1p0) rvw0Var.f203145g, l1p0VarM93687a)) {
            rvw0Var.m76502r(sr4VarM76275a);
        } else {
            m93690d(xzb1Var, sr4VarM76275a);
        }
        if (sr4VarM76275a != null) {
            sr4VarM76275a.m79016f("load");
        }
        if (sr4VarM76275a != null) {
            ((rr4) am71Var).m76276b(sr4VarM76275a.m79015d());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m93690d(xzb1 xzb1Var, sr4 sr4Var) {
        m93691e();
        vsb1 vsb1Var = xzb1Var.f267573a;
        if (vsb1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        l1p0 l1p0VarM93687a = m93687a(xzb1Var);
        noo0 noo0Var = new noo0(vsb1Var.mo81409b(), vsb1Var.mo81408a(), false, false, null, null, false, 240);
        String str = xzb1Var.f267575c;
        rvw0 rvw0Var = this.f272938X;
        rvw0Var.getClass();
        if (sr4Var != null) {
            sr4Var.m79019k("play", null, (4 & 4) != 0);
        }
        if (sr4Var != null) {
            sr4Var.m79019k("betamax_release_player", null, (4 & 4) != 0);
        }
        pa9 pa9Var = (pa9) rvw0Var.f203144f;
        if (pa9Var != null) {
            ((ra9) rvw0Var.f203139a).mo72486b(pa9Var);
            rvw0Var.f203144f = null;
        }
        if (sr4Var != null) {
            sr4Var.m79016f("betamax_release_player");
        }
        rvw0Var.f203147i = str;
        rvw0Var.f203145g = l1p0VarM93687a;
        rvw0Var.f203146h = noo0Var;
        if (sr4Var != null) {
            sr4Var.m79019k("betamax_acquire_player", null, (4 & 4) != 0);
        }
        pa9 pa9VarM76491d = rvw0Var.m76491d(str, l1p0VarM93687a);
        if (sr4Var != null) {
            sr4Var.m79016f("betamax_acquire_player");
        }
        rvw0Var.f203144f = pa9VarM76491d;
        if (((l1p0) rvw0Var.f203145g) != null && ((noo0) rvw0Var.f203146h) != null) {
            if (sr4Var != null) {
                sr4Var.m79019k("betamax_play_with_options", null, (4 & 4) != 0);
            }
            l1p0 l1p0Var = (l1p0) rvw0Var.f203145g;
            if (l1p0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            noo0 noo0Var2 = (noo0) rvw0Var.f203146h;
            if (noo0Var2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            pa9VarM76491d.m69443h(l1p0Var, noo0Var2);
            if (sr4Var != null) {
                sr4Var.m79016f("betamax_play_with_options");
            }
        }
        if (sr4Var != null) {
            sr4Var.m79016f("play");
        }
        if (this.f272943d) {
            rvw0Var.m76502r(sr4Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m93691e() {
        this.f272949t = true;
        View view = this.f272948i;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f272944e = false;
        pa9 pa9Var = (pa9) this.f272938X.f203144f;
        if (pa9Var != null) {
            pa9Var.m69441f();
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        this.f272944e = true;
        xzb1 xzb1Var = this.f272946g;
        if (xzb1Var != null) {
            m93688b(xzb1Var);
        }
    }
}
