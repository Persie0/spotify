package p204p;

import android.media.MediaCodec;
import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import com.spotify.betamax.player.exception.ManifestLoadException;
import com.spotify.betamax.player.exception.UnplayablePlaybackException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class d2p0 implements kh50 {

    /* JADX INFO: renamed from: L0 */
    public final qcz0 f44602L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f44603M0;

    /* JADX INFO: renamed from: N0 */
    public final gmm f44604N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f44605O0;

    /* JADX INFO: renamed from: P0 */
    public final ayt f44606P0;

    /* JADX INFO: renamed from: R0 */
    public int f44608R0;

    /* JADX INFO: renamed from: S0 */
    public BetamaxException f44609S0;

    /* JADX INFO: renamed from: T0 */
    public Long f44610T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f44611U0;

    /* JADX INFO: renamed from: W0 */
    public boolean f44613W0;

    /* JADX INFO: renamed from: X */
    public final boolean f44614X;

    /* JADX INFO: renamed from: X0 */
    public boolean f44615X0;

    /* JADX INFO: renamed from: Y */
    public final c9k f44616Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f44617Y0;

    /* JADX INFO: renamed from: Z */
    public final boolean f44618Z;

    /* JADX INFO: renamed from: Z0 */
    public long f44619Z0;

    /* JADX INFO: renamed from: a */
    public final xre f44620a;

    /* JADX INFO: renamed from: a1 */
    public long f44621a1;

    /* JADX INFO: renamed from: b */
    public final rg5 f44622b;

    /* JADX INFO: renamed from: c */
    public final jh50 f44624c;

    /* JADX INFO: renamed from: c1 */
    public boolean f44625c1;

    /* JADX INFO: renamed from: d */
    public final u99 f44626d;

    /* JADX INFO: renamed from: e */
    public final l89 f44628e;

    /* JADX INFO: renamed from: f */
    public final mqr f44630f;

    /* JADX INFO: renamed from: f1 */
    public ldz0 f44631f1;

    /* JADX INFO: renamed from: g */
    public final so5 f44632g;

    /* JADX INFO: renamed from: g1 */
    public ocz0 f44633g1;

    /* JADX INFO: renamed from: h */
    public final zs0 f44634h;

    /* JADX INFO: renamed from: i */
    public final yzo0 f44636i;

    /* JADX INFO: renamed from: i1 */
    public List f44637i1;

    /* JADX INFO: renamed from: j1 */
    public List f44638j1;

    /* JADX INFO: renamed from: k1 */
    public fv51 f44639k1;

    /* JADX INFO: renamed from: l1 */
    public Locale f44640l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f44641m1;

    /* JADX INFO: renamed from: n1 */
    public j9c1 f44642n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f44643o1;

    /* JADX INFO: renamed from: p1 */
    public int f44644p1;

    /* JADX INFO: renamed from: r1 */
    public int f44646r1;

    /* JADX INFO: renamed from: t */
    public final noo0 f44647t;

    /* JADX INFO: renamed from: Q0 */
    public int f44607Q0 = 1;

    /* JADX INFO: renamed from: V0 */
    public boolean f44612V0 = true;

    /* JADX INFO: renamed from: b1 */
    public long f44623b1 = System.currentTimeMillis();

    /* JADX INFO: renamed from: d1 */
    public o0m f44627d1 = o0m.f160423d;

    /* JADX INFO: renamed from: e1 */
    public vk51 f44629e1 = vk51.UNKNOWN;

    /* JADX INFO: renamed from: q1 */
    public int f44645q1 = 1;

    /* JADX INFO: renamed from: h1 */
    public boolean f44635h1 = true;

    public d2p0(xre xreVar, rg5 rg5Var, jh50 jh50Var, u99 u99Var, l89 l89Var, mqr mqrVar, so5 so5Var, zs0 zs0Var, yzo0 yzo0Var, noo0 noo0Var, boolean z, c9k c9kVar, boolean z2, boolean z3, qcz0 qcz0Var, boolean z4, gmm gmmVar, boolean z5, ayt aytVar) {
        ujx ujxVar;
        ozo0 ozo0VarMo32013a;
        this.f44620a = xreVar;
        this.f44622b = rg5Var;
        this.f44624c = jh50Var;
        this.f44626d = u99Var;
        this.f44628e = l89Var;
        this.f44630f = mqrVar;
        this.f44632g = so5Var;
        this.f44634h = zs0Var;
        this.f44636i = yzo0Var;
        this.f44647t = noo0Var;
        this.f44614X = z;
        this.f44616Y = c9kVar;
        this.f44618Z = z3;
        this.f44602L0 = qcz0Var;
        this.f44603M0 = z4;
        this.f44604N0 = gmmVar;
        this.f44605O0 = z5;
        this.f44606P0 = aytVar;
        lau lauVar = lau.f131415a;
        this.f44637i1 = lauVar;
        this.f44638j1 = lauVar;
        this.f44646r1 = 5;
        zmn0 zmn0Var = new zmn0(z2, new b2p0(this, 0), 7);
        hmm0 hmm0Var = new hmm0(1, jh50Var, jh50.class, "exoPlayer", "exoPlayer(Lkotlin/jvm/functions/Function1;)V", 0, 0, 10);
        ArrayList<ozo0> arrayList = new ArrayList();
        ujx ujxVar2 = new ujx(hmm0Var, (Handler) zs0Var.f285796c);
        for (pzo0 pzo0Var : (List) zs0Var.f285795b) {
            if (pzo0Var instanceof hh50) {
                ujx ujxVar3 = ujxVar2;
                xul0 xul0VarMo41797y = ((hh50) pzo0Var).mo41797y(yzo0Var, noo0Var, ujxVar3, (String) zs0Var.f285797d, zmn0Var);
                ujxVar = ujxVar3;
                ozo0VarMo32013a = xul0VarMo41797y.mo49279c() ? (ozo0) xul0VarMo41797y.mo49278b() : null;
            } else {
                ujxVar = ujxVar2;
                ozo0VarMo32013a = pzo0Var.mo32013a(yzo0Var, noo0Var, ujxVar, (String) zs0Var.f285797d);
            }
            if (ozo0VarMo32013a != null) {
                arrayList.add(ozo0VarMo32013a);
            }
            ujxVar2 = ujxVar;
        }
        ((LinkedHashMap) zs0Var.f285798e).put(yzo0Var, arrayList);
        ((LinkedHashMap) zs0Var.f285799f).put(yzo0Var, ujxVar2);
        be41 be41Var = (be41) zs0Var.f285801h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) be41Var.f26282e;
        zsb1 zsb1Var = (zsb1) linkedHashMap.remove(yzo0Var);
        if (zsb1Var != null) {
            zsb1Var.f285914a.invoke(new yaa1(zsb1Var, 24));
        }
        List listM96809r = ((zs0) ((jfo0) be41Var.f26281d).f111948b).m96809r(yzo0Var);
        if (!listM96809r.isEmpty()) {
            Iterator it = listM96809r.iterator();
            while (it.hasNext()) {
                if (((ozo0) it.next()) instanceof gh50) {
                    btb1 btb1Var = new btb1(hmm0Var, be41Var, yzo0Var);
                    linkedHashMap.put(yzo0Var, new zsb1(hmm0Var, btb1Var));
                    hmm0Var.invoke(new yaa1(btb1Var, 25));
                    break;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference(new nxb1(0L, 0L));
        hmm0Var.invoke(new jfo0(atomicReference, 19));
        a5j0 a5j0Var = new a5j0(22, atomicReference, hmm0Var);
        for (ozo0 ozo0Var : arrayList) {
            if (ozo0Var instanceof gh50) {
                ((gh50) ozo0Var).mo44721t(a5j0Var);
            }
        }
        mo34766d0(this.f44624c.mo53346d());
        zs0 zs0Var2 = this.f44634h;
        yzo0 yzo0Var2 = this.f44636i;
        boolean zM75469a = this.f44622b.m75469a();
        boolean zMo53341Y = this.f44624c.mo53341Y();
        float fMo53328B = this.f44624c.mo53328B();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = zs0Var2.m96809r(yzo0Var2).iterator();
        while (it2.hasNext()) {
            ((Handler) zs0Var2.f285796c).post(new hzo0((ozo0) it2.next(), zM75469a, zMo53341Y, fMo53328B, jCurrentTimeMillis));
        }
        this.f44622b.f198832a.add(this);
        this.f44624c.mo53335O(this);
        this.f44641m1 = true;
    }

    /* JADX INFO: renamed from: Z */
    public static void m34729Z(VideoSurfaceView videoSurfaceView) {
        if (videoSurfaceView != null) {
            videoSurfaceView.setSeekFrameLoader(null);
        }
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnScrubStart(null);
        }
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnScrubEnd(null);
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: A */
    public final void mo34730A(tt81 tt81Var) {
        pf40 pf40Var = tt81Var.f223555a;
        int size = pf40Var.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = ((st81) pf40Var.get(i2)).f213853a;
            for (int i4 = 0; i4 < i3; i4++) {
                String str = ((st81) pf40Var.get(i2)).f213854b.f122102d[i4].f195387p;
                if (str == null) {
                    break;
                }
                if (wl51.m88496t0(str, "video", false)) {
                    i = 3;
                    break;
                } else {
                    if (wl51.m88496t0(str, "audio", false)) {
                        i = 2;
                    }
                }
            }
            if (i == 3) {
                break;
            }
        }
        if (i != 1) {
            this.f44645q1 = i;
        }
        vk51 vk51Var = this.f44629e1;
        this.f44634h.m96817z(this.f44636i, this.f44645q1, vk51Var);
        x0h1.m89578u(this.f44616Y, null, 0, new d2n0(this, vk51Var, (fbk) null, 26), 3);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m34731A0() {
        String str;
        if (this.f44637i1.isEmpty()) {
            return;
        }
        fv51 fv51Var = this.f44639k1;
        List list = this.f44637i1;
        fv51 fv51Var2 = null;
        if (fv51Var != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (wj50.m88271j(((fv51) obj).f73688i, fv51Var.f73688i)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                Iterator it3 = arrayList.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        fv51Var2 = (fv51) g6f.m43741q0(arrayList);
                                        break;
                                    }
                                    fv51Var2 = (fv51) it3.next();
                                } while (fv51Var.f73686g != fv51Var2.f73686g);
                            } else {
                                fv51Var2 = (fv51) it2.next();
                            }
                        } while (!wj50.m88271j(fv51Var.f73685f, fv51Var2.f73685f));
                    } else {
                        fv51Var2 = (fv51) it.next();
                    }
                } while (!fv51Var.equals(fv51Var2));
            }
        }
        fv51 fv51Var3 = fv51Var2;
        if (fv51Var3 == null || (str = fv51Var3.f73687h) == null) {
            str = "";
        }
        boolean z = str.length() == 0;
        jh50 jh50Var = this.f44624c;
        jh50Var.mo53350g0(z);
        jh50Var.mo53331E(fv51Var3);
        long jMo53359u = jh50Var.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it4 = zs0Var.m96809r(this.f44636i).iterator();
        while (it4.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new azo0((ozo0) it4.next(), fv51Var3, jMo53359u, jCurrentTimeMillis, 3));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m34732B0() {
        m34742J0(true);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m34733C0(Exception exc) {
        BetamaxException betamaxException;
        if (exc instanceof BetamaxException) {
            betamaxException = (BetamaxException) exc;
        } else {
            BetamaxException betamaxPlaybackException = this.f44609S0;
            if (betamaxPlaybackException == null) {
                betamaxPlaybackException = new BetamaxPlaybackException("Error during playback", ahw.ERROR_UNKNOWN, exc);
            }
            betamaxException = betamaxPlaybackException;
        }
        yzo0 yzo0Var = this.f44636i;
        jh50 jh50Var = this.f44624c;
        this.f44634h.m96815x(yzo0Var, betamaxException, jh50Var.mo53359u());
        jh50Var.mo53343a();
        m34759W0(3, jh50Var.mo53359u(), null, qjg1.m72922n());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m34734D0() {
        this.f44617Y0 = false;
        m34742J0(false);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m34735E0() {
        jh50 jh50Var = this.f44624c;
        if (jh50Var.mo53355o()) {
            jh50Var.mo53343a();
            long jMo53359u = jh50Var.mo53359u();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zs0 zs0Var = this.f44634h;
            Iterator it = zs0Var.m96809r(this.f44636i).iterator();
            while (it.hasNext()) {
                ((Handler) zs0Var.f285796c).post(new czo0((ozo0) it.next(), jMo53359u, jCurrentTimeMillis, 4));
            }
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: F */
    public final void mo34736F(int i) {
        VideoSurfaceView videoSurfaceViewMo53348e0;
        VideoSurfaceView videoSurfaceViewMo53348e1;
        zs0 zs0Var = this.f44634h;
        Handler handler = (Handler) zs0Var.f285796c;
        yzo0 yzo0Var = this.f44636i;
        jh50 jh50Var = this.f44624c;
        int i2 = 2;
        if (i != 2) {
            if (i == 3) {
                Long l = this.f44610T0;
                if (this.f44607Q0 != 3 || l != null) {
                    if (l != null) {
                        zs0Var.m96798B(yzo0Var, l.longValue(), jh50Var.mo53359u(), this.f44635h1);
                    }
                    this.f44610T0 = null;
                    this.f44608R0 = 0;
                    VideoSurfaceView videoSurfaceViewMo53348e2 = jh50Var.mo53348e0();
                    if (videoSurfaceViewMo53348e2 != null) {
                        videoSurfaceViewMo53348e2.setCanPrefetchSeekFrames(this.f44603M0);
                    }
                    if (this.f44615X0 && (videoSurfaceViewMo53348e1 = jh50Var.mo53348e0()) != null) {
                        videoSurfaceViewMo53348e1.post(new kk00(this, 26));
                    }
                    if (this.f44607Q0 != 3) {
                        long jMo53359u = (jh50Var.mo53359u() >= 0 || jh50Var.mo53361w0()) ? jh50Var.mo53359u() : 0L;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator it = zs0Var.m96809r(yzo0Var).iterator();
                        while (it.hasNext()) {
                            handler.post(new czo0((ozo0) it.next(), jMo53359u, jCurrentTimeMillis, 6));
                        }
                    }
                }
            } else if (i == 4) {
                m34759W0(1, jh50Var.mo53359u(), null, qjg1.m72922n());
            }
            jh50Var = jh50Var;
            i2 = 2;
        } else {
            jh50Var = jh50Var;
            i2 = 2;
            long jMo53359u2 = jh50Var.mo53359u();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Iterator it2 = zs0Var.m96809r(yzo0Var).iterator();
            while (it2.hasNext()) {
                handler.post(new czo0((ozo0) it2.next(), jMo53359u2, jCurrentTimeMillis2, 1));
            }
            VideoSurfaceView videoSurfaceViewMo53348e3 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e3 != null) {
                videoSurfaceViewMo53348e3.setCanPrefetchSeekFrames(false);
            }
            if (this.f44610T0 != null) {
                if (videoSurfaceViewMo53348e3 != null) {
                    videoSurfaceViewMo53348e3.setIsBuffering(true);
                }
            } else if (videoSurfaceViewMo53348e3 != null) {
                videoSurfaceViewMo53348e3.f3049T0 = true;
                if (videoSurfaceViewMo53348e3.f3048S0) {
                    videoSurfaceViewMo53348e3.f3041L0.post(new oa9(videoSurfaceViewMo53348e3, 3));
                }
            }
        }
        if ((!jh50Var.mo53355o() || i != i2) && (videoSurfaceViewMo53348e0 = jh50Var.mo53348e0()) != null) {
            videoSurfaceViewMo53348e0.setIsBuffering(false);
        }
        if (i == 1 && this.f44613W0) {
            this.f44613W0 = false;
            VideoSurfaceView videoSurfaceViewMo53348e4 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e4 != null) {
                videoSurfaceViewMo53348e4.setIsJoining(false);
            }
        }
        this.f44607Q0 = i;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m34737F0() {
        yzo0 yzo0Var = this.f44636i;
        l1p0 l1p0Var = yzo0Var.f277859a;
        this.f44644p1 = 0;
        boolean z = this.f44614X;
        noo0 noo0Var = this.f44647t;
        if (!z && l1p0Var.f128767c) {
            m34764b0(yzo0Var, noo0Var.f156766a, new UnplayablePlaybackException("Unable to play royalty media without royalty support", ahw.ERROR_ROYALTY_MEDIA_UNSUPPORTED, null));
            return;
        }
        jh50 jh50Var = this.f44624c;
        if (jh50Var.mo53341Y() && !l1p0Var.f128766b) {
            m34764b0(yzo0Var, noo0Var.f156766a, new UnplayablePlaybackException("Unable to play media when video is disabled and audio only is not allowed", ahw.ERROR_AUDIO_ONLY_NOT_ALLOWED, null));
            return;
        }
        try {
            jh50Var.mo53337Q(yzo0Var, noo0Var);
        } catch (Exception e) {
            Logger.m3967c(e, "Could not initiate video playback", new Object[0]);
            m34764b0(yzo0Var, jh50Var.mo53359u(), new UnplayablePlaybackException("Failed to start playback", ahw.ERROR_UNKNOWN, e));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m34738G0() {
        this.f44644p1 = 0;
        jh50 jh50Var = this.f44624c;
        if (jh50Var.mo53355o()) {
            return;
        }
        if (jh50Var.mo53361w0() && this.f44647t.f156772g) {
            jh50Var.mo53338R();
        } else if (jh50Var.getPlaybackState() == v3p0.IDLE) {
            jh50Var.mo53353m();
        }
        jh50Var.mo53345c();
        long jMo53359u = jh50Var.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new czo0((ozo0) it.next(), jMo53359u, jCurrentTimeMillis, 7));
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: H */
    public final void mo34739H(int i, ufd0 ufd0Var) {
        if (i == 0) {
            this.f44634h.m96816y(this.f44636i, this.f44624c.mo53330D());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m34740H0(long j, boolean z) {
        this.f44635h1 = z;
        jh50 jh50Var = this.f44624c;
        long jMo53359u = jh50Var.mo53359u();
        long jMax = Math.max(0L, j);
        long duration = jh50Var.getDuration();
        yzo0 yzo0Var = this.f44636i;
        zs0 zs0Var = this.f44634h;
        if (duration > 0 && jMax > jh50Var.getDuration()) {
            zs0Var.m96799C(yzo0Var, jMo53359u, jh50Var.getDuration(), z);
            m34759W0(1, jh50Var.getDuration(), null, qjg1.m72922n());
            return;
        }
        if (jh50Var.mo53361w0() && jMax == Long.MAX_VALUE) {
            jMax = jh50Var.mo53344b0();
        }
        zs0Var.m96799C(yzo0Var, jMo53359u, jh50Var.mo53352j0(jMax), this.f44635h1);
        if (this.f44610T0 == null) {
            this.f44610T0 = Long.valueOf(jMo53359u);
        }
        if (this.f44605O0 && !jh50Var.mo53341Y()) {
            jh50Var.mo53336P(true);
            this.f44615X0 = true;
            VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e0 != null) {
                videoSurfaceViewMo53348e0.setIsJoining(true);
            }
        }
        jh50Var.mo53349f(jMax);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m34741I0(int i) {
        jh50 jh50Var = this.f44624c;
        jh50Var.mo53340W(i);
        long jMo53359u = jh50Var.mo53359u();
        zs0 zs0Var = this.f44634h;
        Handler handler = (Handler) zs0Var.f285796c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        yzo0 yzo0Var = this.f44636i;
        Iterator it = zs0Var.m96809r(yzo0Var).iterator();
        while (it.hasNext()) {
            handler.post(new bzo0((ozo0) it.next(), i, jMo53359u, jCurrentTimeMillis));
        }
        boolean z = i != 1;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Iterator it2 = zs0Var.m96809r(yzo0Var).iterator();
        while (it2.hasNext()) {
            handler.post(new zyo0((ozo0) it2.next(), z, jMo53359u, jCurrentTimeMillis2, 0));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m34742J0(boolean z) {
        long jMo53359u = this.f44624c.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new zyo0((ozo0) it.next(), z, jMo53359u, jCurrentTimeMillis, 1));
        }
        m34762Y0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m34743K0(int i) {
        this.f44624c.mo53342Z(i);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m34744L0(j9c1 j9c1Var) {
        this.f44624c.mo53339S(j9c1Var);
    }

    @Override // p204p.tdd0
    /* JADX INFO: renamed from: M */
    public final void mo34745M(List list, List list2, ldz0 ldz0Var, tz6 tz6Var, List list3, List list4, int i, Long l, Long l2, boolean z) {
        this.f44609S0 = null;
        this.f44637i1 = list;
        boolean zIsEmpty = list.isEmpty();
        jh50 jh50Var = this.f44624c;
        if (zIsEmpty) {
            this.f44637i1 = jh50Var.mo53362x();
        }
        this.f44638j1 = list2;
        this.f44646r1 = i == 0 ? 5 : i;
        if (list2.isEmpty()) {
            this.f44638j1 = jh50Var.mo53354n0();
        }
        m34731A0();
        m34784z0();
        this.f44631f1 = ldz0Var;
        m34780w0();
        if (tz6Var != null) {
            jh50Var.mo53356p(tz6Var);
        }
        if (this.f44618Z && z) {
            this.f44612V0 = false;
            boolean zM75469a = this.f44622b.m75469a();
            if (!this.f44611U0 && !zM75469a) {
                m34761Y();
            }
        }
        List list5 = this.f44637i1;
        List list6 = this.f44638j1;
        int i2 = this.f44646r1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new fzo0((ozo0) it.next(), list5, list3, list4, list6, i2, l, l2, jCurrentTimeMillis));
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m34746M0(j9c1 j9c1Var) {
        this.f44624c.mo53332G(j9c1Var);
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: N */
    public final void mo34747N() {
        boolean z = this.f44613W0;
        jh50 jh50Var = this.f44624c;
        if (z) {
            this.f44613W0 = false;
            VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e0 != null) {
                videoSurfaceViewMo53348e0.setIsJoining(false);
            }
            long jMo53359u = jh50Var.mo53359u();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zs0 zs0Var = this.f44634h;
            Iterator it = zs0Var.m96809r(this.f44636i).iterator();
            while (it.hasNext()) {
                ((Handler) zs0Var.f285796c).post(new lzo0((ozo0) it.next(), jMo53359u, jCurrentTimeMillis, 2));
            }
        }
        if (this.f44615X0) {
            this.f44615X0 = false;
            VideoSurfaceView videoSurfaceViewMo53348e1 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e1 != null) {
                videoSurfaceViewMo53348e1.setIsJoining(false);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m34748N0(float f) {
        jh50 jh50Var = this.f44624c;
        if (Float.compare(jh50Var.mo53328B(), f) != 0) {
            jh50Var.mo53347e(f);
            long jMo53359u = jh50Var.mo53359u();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zs0 zs0Var = this.f44634h;
            Iterator it = zs0Var.m96809r(this.f44636i).iterator();
            while (it.hasNext()) {
                ((Handler) zs0Var.f285796c).post(new kzo0((ozo0) it.next(), f, jMo53359u, jCurrentTimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m34749O0(Locale locale) {
        if (wj50.m88271j(this.f44640l1, locale)) {
            return;
        }
        this.f44640l1 = locale;
        m34784z0();
    }

    @Override // p204p.n5c1
    /* JADX INFO: renamed from: P */
    public final void mo29551P(int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new ezo0((ozo0) it.next(), i, jCurrentTimeMillis, 1));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m34750P0(fv51 fv51Var) {
        if (wj50.m88271j(this.f44639k1, fv51Var)) {
            return;
        }
        this.f44639k1 = fv51Var;
        m34731A0();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.tdd0
    /* JADX INFO: renamed from: Q */
    public final void mo34751Q(IOException iOException) {
        BetamaxException manifestLoadException;
        String strMo47869a;
        ahw ahwVar;
        Logger.m3974j(iOException, "onManifestError", new Object[0]);
        boolean z = iOException instanceof HttpDataSource$InvalidResponseCodeException;
        if (z && ((HttpDataSource$InvalidResponseCodeException) iOException).f973c == 410) {
            manifestLoadException = new ManifestLoadException("Gone, resource not longer available", ahw.ERROR_GONE, iOException);
        } else {
            ahw ahwVar2 = ahw.ERROR_UNKNOWN;
            if (z) {
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) iOException;
                int i = httpDataSource$InvalidResponseCodeException.f973c;
                String str = httpDataSource$InvalidResponseCodeException.f974d;
                byte[] bArr = httpDataSource$InvalidResponseCodeException.f976f;
                Object obj = sbc0.f207418a;
                Locale locale = Locale.ROOT;
                String str2 = String.format(locale, "Error loading manifest. HttpStatusCode=%d, httpStatusMessage=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str}, 2));
                try {
                    String str3 = new String(bArr, vuc.f244913a);
                    if (i == 404 && TextUtils.isEmpty(str3)) {
                        str3 = String.format(locale, "{\"reason\":\"%s\"}", Arrays.copyOf(new Object[]{"MANIFEST_DELETED"}, 1));
                    }
                    yk60 yk60Var = (yk60) zk60.m96308j(fk60.f70476d.m41882c(str3)).get("reason");
                    if (yk60Var != null && (strMo47869a = zk60.m96309k(yk60Var).mo47869a()) != null && (ahwVar = (ahw) sbc0.f207418a.get(strMo47869a)) != null) {
                        ahwVar2 = ahwVar;
                    }
                } catch (IllegalArgumentException e) {
                    Logger.m3974j(e, "Failed to get error type from response body", new Object[0]);
                }
                manifestLoadException = new ManifestLoadException(str2, ahwVar2, null);
            } else if (iOException instanceof BetamaxException) {
                manifestLoadException = (BetamaxException) iOException;
            } else {
                manifestLoadException = iOException.getCause() instanceof BetamaxException ? (BetamaxException) iOException.getCause() : new ManifestLoadException("Could not load manifest", ahwVar2, iOException);
            }
        }
        this.f44609S0 = manifestLoadException;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m34752Q0(boolean z) {
        this.f44624c.mo53351h0(z);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m34753R0(boolean z) {
        if (this.f44641m1 == z) {
            return;
        }
        this.f44641m1 = z;
        m34761Y();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m34754S0(et81 et81Var) {
        if (et81Var != null && et81Var.f62666b) {
            na6.m63957e("Tracker manager already allocated to another PlaybackSession");
            return;
        }
        if (et81Var != null) {
            et81Var.f62666b = true;
        }
        yzo0 yzo0Var = this.f44636i;
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(yzo0Var).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new vod0((ozo0) it.next(), et81Var, zs0Var));
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m34755T0(boolean z) {
        this.f44611U0 = z;
        m34762Y0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m34756U0(VideoSurfaceView videoSurfaceView) {
        fpc1 fpc1Var;
        jh50 jh50Var = this.f44624c;
        VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
        ayt aytVar = this.f44606P0;
        if (videoSurfaceViewMo53348e0 != null && aytVar != null && (fpc1Var = (fpc1) aytVar.f21354a.remove(videoSurfaceViewMo53348e0)) != null) {
            fpc1Var.m42326b();
        }
        m34729Z(jh50Var.mo53348e0());
        jh50Var.mo53334M(videoSurfaceView);
        m34761Y();
        VideoSurfaceView videoSurfaceViewMo53348e1 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e1 != null) {
            videoSurfaceViewMo53348e1.m4022d(this.f44627d1);
        }
        m34780w0();
        if (videoSurfaceView != null && aytVar != null) {
            LinkedHashMap linkedHashMap = aytVar.f21354a;
            b2p0 b2p0Var = new b2p0(this, 1);
            fpc1 fpc1Var2 = (fpc1) linkedHashMap.remove(videoSurfaceView);
            if (fpc1Var2 != null) {
                fpc1Var2.m42326b();
            }
            fpc1 fpc1Var3 = new fpc1();
            fpc1Var3.m42329e(videoSurfaceView, new C1704bh(videoSurfaceView, 6), null, new u0t(8, new rlv0(), b2p0Var), awt.f20671O0);
            linkedHashMap.put(videoSurfaceView, fpc1Var3);
        }
        long jMo53359u = jh50Var.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new azo0((ozo0) it.next(), videoSurfaceView, jMo53359u, jCurrentTimeMillis, 4));
        }
    }

    @Override // p204p.kh50
    /* JADX INFO: renamed from: V */
    public final void mo34757V(long j, boolean z) {
        if (z) {
            this.f44619Z0 += j;
        } else {
            this.f44621a1 += j;
        }
        long j2 = this.f44623b1 + 2000;
        xre xreVar = this.f44620a;
        ((wy3) xreVar).getClass();
        if (j2 <= System.currentTimeMillis()) {
            yzo0 yzo0Var = this.f44636i;
            zs0 zs0Var = this.f44634h;
            if (z) {
                zs0Var.m96814w(yzo0Var, this.f44619Z0);
                this.f44619Z0 = 0L;
            } else {
                zs0Var.m96813v(yzo0Var, this.f44621a1);
                this.f44621a1 = 0L;
            }
            ((wy3) xreVar).getClass();
            this.f44623b1 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m34758V0(float f) {
        this.f44624c.mo53358r(f);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m34759W0(int i, long j, yzo0 yzo0Var, clq clqVar) {
        int i2;
        List listM96809r;
        int i3;
        ayt aytVar;
        fpc1 fpc1Var;
        zs0 zs0Var = this.f44634h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) zs0Var.f285800g;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) zs0Var.f285798e;
        Handler handler = (Handler) zs0Var.f285796c;
        kk40.m56680v(this.f44616Y, null);
        this.f44645q1 = 1;
        jh50 jh50Var = this.f44624c;
        VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e0 != null && (aytVar = this.f44606P0) != null && (fpc1Var = (fpc1) aytVar.f21354a.remove(videoSurfaceViewMo53348e0)) != null) {
            fpc1Var.m42326b();
        }
        jh50Var.stop();
        jh50Var.mo53335O(null);
        jh50Var.mo53350g0(true);
        this.f44622b.f198832a.remove(this);
        long j2 = this.f44619Z0;
        yzo0 yzo0Var2 = this.f44636i;
        if (j2 > 0) {
            zs0Var.m96814w(yzo0Var2, j2);
        }
        long j3 = this.f44621a1;
        if (j3 > 0) {
            zs0Var.m96813v(yzo0Var2, j3);
        }
        if (yzo0Var != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = zs0Var.m96809r(yzo0Var2).iterator();
            while (it.hasNext()) {
                handler.post(new vod0((ozo0) it.next(), yzo0Var, jCurrentTimeMillis));
            }
        }
        zs0Var.m96816y(yzo0Var2, jh50Var.mo53330D());
        int i4 = this.f44644p1;
        int i5 = i4 == 0 ? -1 : a2p0.f11711a[edb.m38547C(i4)];
        if (i5 != -1) {
            if (i5 == 1) {
                i3 = 4;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 5;
            }
            i2 = i3;
        } else {
            i2 = i;
        }
        m34729Z(jh50Var.mo53348e0());
        boolean z = zs0Var.f285794a;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ujx ujxVar = (ujx) ((LinkedHashMap) zs0Var.f285799f).remove(yzo0Var2);
        if (ujxVar != null) {
            ujxVar.f231170a.invoke(new c7x(ujxVar, 6));
        }
        if (z) {
            listM96809r = (List) linkedHashMap2.remove(yzo0Var2);
            if (listM96809r == null) {
                listM96809r = lau.f131415a;
            }
        } else {
            listM96809r = zs0Var.m96809r(yzo0Var2);
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM96809r) {
                if (obj instanceof gh50) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put(yzo0Var2, arrayList);
            }
        }
        Iterator it2 = listM96809r.iterator();
        while (it2.hasNext()) {
            handler.post(new jzo0((ozo0) it2.next(), clqVar, i2, j, jCurrentTimeMillis2, clqVar.m33294c()));
        }
        this.f44632g.invoke();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        zsb1 zsb1Var = (zsb1) ((LinkedHashMap) ((be41) zs0Var.f285801h).f26282e).remove(yzo0Var2);
        if (zsb1Var != null) {
            zsb1Var.f285914a.invoke(new yaa1(zsb1Var, 24));
        }
        List list = (List) linkedHashMap.remove(yzo0Var2);
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                handler.post(new izo0((gh50) it3.next(), jCurrentTimeMillis3, 0));
            }
            return;
        }
        List<ozo0> list2 = (List) linkedHashMap2.remove(yzo0Var2);
        if (list2 != null) {
            for (ozo0 ozo0Var : list2) {
                if (ozo0Var instanceof gh50) {
                    handler.post(new izo0((gh50) ozo0Var, jCurrentTimeMillis3, 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m34760X0(int i, yzo0 yzo0Var, clq clqVar) {
        m34759W0(i, this.f44624c.mo53359u(), yzo0Var, clqVar);
    }

    /* JADX INFO: renamed from: Y */
    public final void m34761Y() {
        x0h1.m89578u(this.f44616Y, null, 0, new ta1(this, this.f44612V0 && this.f44641m1, (fbk) null, 23), 3);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m34762Y0() {
        jh50 jh50Var = this.f44624c;
        boolean zMo53341Y = jh50Var.mo53341Y();
        jh50Var.mo53336P(this.f44611U0 || this.f44622b.m75469a());
        boolean zMo53341Y2 = jh50Var.mo53341Y();
        zs0 zs0Var = this.f44634h;
        Handler handler = (Handler) zs0Var.f285796c;
        boolean zMo53341Y3 = jh50Var.mo53341Y();
        long jMo53359u = jh50Var.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        yzo0 yzo0Var = this.f44636i;
        Iterator it = zs0Var.m96809r(yzo0Var).iterator();
        while (it.hasNext()) {
            handler.post(new zyo0((ozo0) it.next(), zMo53341Y3, jMo53359u, jCurrentTimeMillis, 2));
            yzo0Var = yzo0Var;
        }
        yzo0 yzo0Var2 = yzo0Var;
        if (zMo53341Y && !zMo53341Y2) {
            m34761Y();
            this.f44613W0 = true;
            VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e0 != null) {
                videoSurfaceViewMo53348e0.setIsJoining(true);
            }
            long jMo53359u2 = jh50Var.mo53359u();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Iterator it2 = zs0Var.m96809r(yzo0Var2).iterator();
            while (it2.hasNext()) {
                handler.post(new lzo0((ozo0) it2.next(), jMo53359u2, jCurrentTimeMillis2, 3));
            }
        } else if (!zMo53341Y && zMo53341Y2) {
            this.f44613W0 = false;
            VideoSurfaceView videoSurfaceViewMo53348e1 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e1 != null) {
                videoSurfaceViewMo53348e1.setIsJoining(false);
            }
        }
        if (!jh50Var.mo53341Y() || yzo0Var2.f277859a.f128766b) {
            return;
        }
        m34735E0();
    }

    @Override // p204p.zs8
    /* JADX INFO: renamed from: a */
    public final void mo34763a(int i, long j, long j2) {
        long j3 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new czo0((ozo0) it.next(), j, j2, j3, jCurrentTimeMillis));
        }
    }

    @Override // p204p.kh50, p204p.d7p0, p204p.n5c1
    /* JADX INFO: renamed from: b */
    public final void mo29553b(k9c1 k9c1Var) {
        int i = k9c1Var.f120564b;
        int i2 = k9c1Var.f120563a;
        if (i2 == 0 || i == 0) {
            this.f44642n1 = null;
            return;
        }
        this.f44642n1 = new j9c1(i2, i);
        VideoSurfaceView videoSurfaceViewMo53348e0 = this.f44624c.mo53348e0();
        if (videoSurfaceViewMo53348e0 != null) {
            if (videoSurfaceViewMo53348e0.f3042M0 == i2 && videoSurfaceViewMo53348e0.f3043N0 == i) {
                return;
            }
            videoSurfaceViewMo53348e0.f3042M0 = i2;
            videoSurfaceViewMo53348e0.f3043N0 = i;
            videoSurfaceViewMo53348e0.f3041L0.post(new oa9(videoSurfaceViewMo53348e0, 2));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m34764b0(yzo0 yzo0Var, long j, UnplayablePlaybackException unplayablePlaybackException) {
        this.f44634h.m96815x(yzo0Var, unplayablePlaybackException, j);
        m34759W0(3, j, null, qjg1.m72922n());
    }

    @Override // p204p.tdd0, p204p.ygs
    /* JADX INFO: renamed from: c */
    public final void mo24959c() {
        if (this.f44618Z) {
            this.f44612V0 = false;
            boolean zM75469a = this.f44622b.m75469a();
            if (!this.f44611U0 && !zM75469a) {
                m34761Y();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new dzo0((ozo0) it.next(), jCurrentTimeMillis, 1));
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: c0 */
    public final void mo34765c0(int i, boolean z) {
        VideoSurfaceView videoSurfaceViewMo53348e0;
        jh50 jh50Var = this.f44624c;
        if ((!z || this.f44607Q0 != 2) && (videoSurfaceViewMo53348e0 = jh50Var.mo53348e0()) != null) {
            videoSurfaceViewMo53348e0.setIsBuffering(false);
        }
        if (z || !this.f44613W0) {
            return;
        }
        this.f44613W0 = false;
        VideoSurfaceView videoSurfaceViewMo53348e1 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e1 != null) {
            videoSurfaceViewMo53348e1.setIsJoining(false);
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: d0 */
    public final void mo34766d0(float f) {
        long jMo53359u = this.f44624c.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new nzo0((ozo0) it.next(), f, jMo53359u, jCurrentTimeMillis));
        }
    }

    @Override // p204p.tdd0, p204p.ygs
    /* JADX INFO: renamed from: e */
    public final void mo24961e(int i) {
        x0h1.m89578u(this.f44616Y, null, 0, new onm0(this, i, (fbk) null), 3);
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m34767e0() {
        return this.f44624c.mo53355o();
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: f0 */
    public final void mo34768f0(e7p0 e7p0Var, e7p0 e7p0Var2, int i) {
        jh50 jh50Var = this.f44624c;
        if (jh50Var.mo53357p0() && i == 0) {
            long duration = jh50Var.getDuration();
            boolean z = this.f44635h1;
            zs0 zs0Var = this.f44634h;
            yzo0 yzo0Var = this.f44636i;
            zs0Var.m96799C(yzo0Var, duration, 0L, z);
            zs0Var.m96798B(yzo0Var, e7p0Var.f56983f, e7p0Var2.f56983f, this.f44635h1);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final yzo0 m34769g0() {
        return this.f44636i;
    }

    /* JADX INFO: renamed from: h0 */
    public final v3p0 m34770h0() {
        return this.f44624c.getPlaybackState();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j0 */
    public final Enum m34771j0(ibk ibkVar) {
        c2p0 c2p0Var;
        Object c6x0Var;
        vk51 vk51Var;
        if (ibkVar instanceof c2p0) {
            c2p0Var = (c2p0) ibkVar;
            int i = c2p0Var.f33441c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2p0Var.f33441c = i - Integer.MIN_VALUE;
            } else {
                c2p0Var = new c2p0(this, ibkVar);
            }
        } else {
            c2p0Var = new c2p0(this, ibkVar);
        }
        Object objValueOf = c2p0Var.f33439a;
        int i2 = c2p0Var.f33441c;
        if (i2 == 0) {
            bga.m29073P(objValueOf);
            String str = this.f44636i.f277859a.f128765a;
            if (bm51.m29803n0(str, "file:", false)) {
                vk51Var = vk51.LOCAL;
            } else if (this.f44624c.mo53361w0()) {
                vk51Var = vk51.LIVE;
            } else {
                u99 u99Var = this.f44626d;
                if (u99Var == null || !vqg1.m86241s((p2s) u99Var.f228105b.f259092e.get(str))) {
                    c2p0Var.f33441c = 1;
                    mqr mqrVar = this.f44630f;
                    if (mqrVar == null || yif1.m93822y(str)) {
                        l89 l89Var = this.f44628e;
                        objValueOf = Boolean.valueOf(l89Var != null && l89Var.m58463b(str));
                    } else {
                        try {
                            c6x0Var = new URL(str);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            c6x0Var = new c6x0(th);
                        }
                        fbk fbkVar = null;
                        if (c6x0Var instanceof c6x0) {
                            c6x0Var = null;
                        }
                        URL url = (URL) c6x0Var;
                        objValueOf = url == null ? Boolean.FALSE : x0h1.m89557A((luk) mqrVar.f146344c, new dnc(mqrVar, url, fbkVar, 7), c2p0Var);
                    }
                    yuk yukVar = yuk.f276404a;
                    if (objValueOf == yukVar) {
                        return yukVar;
                    }
                } else {
                    vk51Var = vk51.OFFLINE;
                }
            }
            this.f44629e1 = vk51Var;
            return vk51Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objValueOf);
        vk51Var = ((Boolean) objValueOf).booleanValue() ? vk51.CACHE : vk51.ON_DEMAND;
        this.f44629e1 = vk51Var;
        return vk51Var;
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: k */
    public final void mo34772k(PlaybackException playbackException) {
        BetamaxPlaybackException betamaxPlaybackException;
        Logger.m3967c(playbackException, "Video playback error", new Object[0]);
        Throwable cause = playbackException.getCause();
        if (!(cause instanceof HttpDataSource$InvalidResponseCodeException) && !(cause instanceof MediaCodec.CryptoException)) {
            Exception exc = cause instanceof Exception ? (Exception) cause : null;
            if (!((exc != null ? exc.getCause() : null) instanceof SunsetUpgradeRequiredException)) {
                int i = playbackException.f965a;
                jh50 jh50Var = this.f44624c;
                if (i == 1002) {
                    jh50Var.mo53338R();
                    return;
                }
                if (i == 2001) {
                    betamaxPlaybackException = new BetamaxPlaybackException("Unable to connect", ahw.ERROR_NETWORK_CONNECTION_FAILED, playbackException);
                } else if (i == 2002) {
                    betamaxPlaybackException = new BetamaxPlaybackException("Connection timeout", ahw.ERROR_NETWORK_CONNECTION_TIMEOUT, playbackException);
                } else {
                    wj50.m88279p(cause);
                    betamaxPlaybackException = cause.getCause() instanceof NetworkAccessWhileInOfflineModeException ? new BetamaxPlaybackException("Error during playback", ahw.ERROR_IN_OFFLINE_MODE, playbackException) : new BetamaxPlaybackException("Error during playback", ahw.ERROR_UNKNOWN, playbackException);
                }
                BetamaxPlaybackException betamaxPlaybackException2 = betamaxPlaybackException;
                int i2 = 1;
                if (jh50Var.mo53361w0() && this.f44608R0 < 5) {
                    jh50Var.mo53338R();
                    this.f44608R0++;
                    return;
                }
                boolean z = this.f44617Y0;
                yzo0 yzo0Var = this.f44636i;
                if (!z && this.f44622b.m75469a() && jh50Var.mo53341Y() && jh50Var.mo53355o() && yzo0Var.f277859a.f128766b && i != 2001 && i != 2002) {
                    wj50.m88279p(cause);
                    if (!(cause.getCause() instanceof NetworkAccessWhileInOfflineModeException)) {
                        this.f44617Y0 = true;
                        jh50Var.mo53353m();
                        return;
                    }
                }
                if (i != 2001 && i != 2002) {
                    i2 = 2;
                }
                this.f44644p1 = i2;
                jh50Var.mo53343a();
                long jMo53359u = jh50Var.mo53359u();
                long jCurrentTimeMillis = System.currentTimeMillis();
                zs0 zs0Var = this.f44634h;
                Iterator it = zs0Var.m96809r(yzo0Var).iterator();
                while (it.hasNext()) {
                    ((Handler) zs0Var.f285796c).post(new azo0((ozo0) it.next(), betamaxPlaybackException2, jMo53359u, jCurrentTimeMillis, 2));
                }
                return;
            }
        }
        m34733C0(playbackException);
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: l */
    public final void mo34773l(o0m o0mVar) {
        this.f44627d1 = o0mVar;
        VideoSurfaceView videoSurfaceViewMo53348e0 = this.f44624c.mo53348e0();
        if (videoSurfaceViewMo53348e0 != null) {
            videoSurfaceViewMo53348e0.m4022d(o0mVar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final j9c1 m34774n0() {
        return this.f44642n1;
    }

    @Override // p204p.tdd0
    /* JADX INFO: renamed from: o */
    public final void mo34775o(int i, r300 r300Var) {
        if (r300Var == null) {
            return;
        }
        String str = r300Var.f195383l;
        jh50 jh50Var = this.f44624c;
        yzo0 yzo0Var = this.f44636i;
        zs0 zs0Var = this.f44634h;
        if (i != 0) {
            if (i == 1) {
                zs0Var.m96812u(yzo0Var, r300Var, jh50Var.mo53359u());
                return;
            } else if (i != 2) {
                Logger.m3973i("Unknown event source id for downstream format changed event", new Object[0]);
                return;
            } else {
                zs0Var.m96800D(yzo0Var, r300Var, jh50Var.mo53359u());
                return;
            }
        }
        if (r300Var.f195395x > 0 || h0b1.m46274B(2, str) != null) {
            zs0Var.m96800D(yzo0Var, r300Var, jh50Var.mo53359u());
        } else if (h0b1.m46274B(1, str) != null) {
            zs0Var.m96812u(yzo0Var, r300Var, jh50Var.mo53359u());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final VideoSurfaceView m34776p0() {
        return this.f44624c.mo53348e0();
    }

    @Override // p204p.kh50
    /* JADX INFO: renamed from: s */
    public final void mo34777s() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        for (ozo0 ozo0Var : zs0Var.m96809r(this.f44636i)) {
            if (ozo0Var instanceof gh50) {
                ((Handler) zs0Var.f285796c).post(new izo0((gh50) ozo0Var, jCurrentTimeMillis, 2));
            }
        }
    }

    @Override // p204p.kh50
    /* JADX INFO: renamed from: u0 */
    public final void mo34778u0() {
        x0h1.m89578u(this.f44616Y, null, 0, new bqf0(this, null, 16), 3);
    }

    /* JADX INFO: renamed from: v0 */
    public final ncz0 m34779v0(int i, long j, int i2) {
        ocz0 ocz0Var = this.f44633g1;
        if (ocz0Var != null) {
            return ocz0Var.mo66728a(i, j, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m34780w0() {
        rvw0 rvw0Var;
        ldz0 ldz0Var = this.f44631f1;
        jh50 jh50Var = this.f44624c;
        if (ldz0Var == null) {
            m34729Z(jh50Var.mo53348e0());
            return;
        }
        qcz0 qcz0Var = this.f44602L0;
        if (qcz0Var != null) {
            rcz0 rcz0VarMo24518a = qcz0Var.mo24518a(ldz0Var);
            VideoSurfaceView videoSurfaceViewMo53348e0 = jh50Var.mo53348e0();
            if (videoSurfaceViewMo53348e0 != null) {
                videoSurfaceViewMo53348e0.setSeekFrameLoader(new xcz0(rcz0VarMo24518a, this.f44620a));
            }
            this.f44633g1 = rcz0VarMo24518a;
        }
        VideoSurfaceView videoSurfaceViewMo53348e1 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e1 != null) {
            gmm gmmVar = this.f44604N0;
            if (gmmVar != null) {
                hmm hmmVar = gmmVar.f81428a;
                e60 e60Var = (e60) hmmVar.f93001d;
                rvw0Var = new rvw0(ldz0Var, (adz0) ((h4t0) e60Var.f56510g).get(), ((imm) hmmVar.f93000c).f103736h, (o59) ((h4t0) e60Var.f56512i).get());
            } else {
                rvw0Var = null;
            }
            videoSurfaceViewMo53348e1.setSeekFramePrefetcher(rvw0Var);
        }
        VideoSurfaceView videoSurfaceViewMo53348e2 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e2 != null) {
            videoSurfaceViewMo53348e2.setOnScrubStart(new e5m0(0, this, d2p0.class, "onScrubStart", "onScrubStart$src_main_java_com_spotify_betamax_playerimpl_playerimpl()V", 0, 0, 24));
        }
        VideoSurfaceView videoSurfaceViewMo53348e3 = jh50Var.mo53348e0();
        if (videoSurfaceViewMo53348e3 != null) {
            videoSurfaceViewMo53348e3.setOnScrubEnd(new e5m0(0, this, d2p0.class, "onScrubEnd", "onScrubEnd$src_main_java_com_spotify_betamax_playerimpl_playerimpl()V", 0, 0, 25));
        }
    }

    @Override // p204p.tdd0
    /* JADX INFO: renamed from: x */
    public final void mo34781x() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new dzo0((ozo0) it.next(), jCurrentTimeMillis, 2));
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: x0 */
    public final void mo34782x0(qp71 qp71Var, int i) {
        zs0 zs0Var = this.f44634h;
        Handler handler = (Handler) zs0Var.f285796c;
        jh50 jh50Var = this.f44624c;
        if (jh50Var.getDuration() >= 0) {
            boolean zMo53361w0 = jh50Var.mo53361w0();
            yzo0 yzo0Var = this.f44636i;
            if (!zMo53361w0) {
                long duration = jh50Var.getDuration();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = zs0Var.m96809r(yzo0Var).iterator();
                while (it.hasNext()) {
                    handler.post(new czo0((ozo0) it.next(), duration, jCurrentTimeMillis, 3));
                }
            }
            mp71 mp71VarMo53333J = jh50Var.mo53333J();
            if (mp71VarMo53333J != null) {
                kez0 kez0Var = new kez0(h0b1.m46326n0(mp71VarMo53333J.f145941p), h0b1.m46326n0(mp71VarMo53333J.f145938m));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Iterator it2 = zs0Var.m96809r(yzo0Var).iterator();
                while (it2.hasNext()) {
                    handler.post(new lzo0((ozo0) it2.next(), kez0Var, jCurrentTimeMillis2));
                }
            }
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: y0 */
    public final void mo34783y0(boolean z) {
        if (!z || this.f44625c1) {
            return;
        }
        long jMo53359u = this.f44624c.mo53359u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zs0 zs0Var = this.f44634h;
        Iterator it = zs0Var.m96809r(this.f44636i).iterator();
        while (it.hasNext()) {
            ((Handler) zs0Var.f285796c).post(new czo0((ozo0) it.next(), jMo53359u, jCurrentTimeMillis, 5));
        }
        this.f44625c1 = true;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m34784z0() {
        Locale localeM25232i;
        Locale locale;
        if (this.f44638j1.isEmpty()) {
            return;
        }
        Locale locale2 = this.f44640l1;
        List list = this.f44638j1;
        if (locale2 == null) {
            localeM25232i = aag1.m25232i(list);
        } else {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((by6) it.next()).f32085a);
            }
            ArrayList<Locale> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (wj50.m88271j(((Locale) obj).getLanguage(), locale2.getLanguage())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                localeM25232i = aag1.m25232i(list);
            } else {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                        locale = (Locale) it2.next();
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                locale = (Locale) it3.next();
                                if (wj50.m88271j(locale2.getLanguage(), locale.getLanguage()) && locale.getCountry().length() > 0) {
                                    break;
                                }
                            } else {
                                for (Locale locale3 : arrayList2) {
                                    if (wj50.m88271j(locale2.getLanguage(), locale3.getLanguage())) {
                                        localeM25232i = locale3;
                                    }
                                }
                                localeM25232i = aag1.m25232i(list);
                            }
                        }
                    }
                } while (!wj50.m88271j(locale2.toLanguageTag(), locale.toLanguageTag()));
                localeM25232i = locale;
            }
        }
        this.f44624c.mo53329C(localeM25232i);
    }
}
