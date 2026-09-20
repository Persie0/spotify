package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.car.app.model.Alert;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class pa9 implements fac1 {

    /* JADX INFO: renamed from: a */
    public z1p0 f175435a;

    /* JADX INFO: renamed from: b */
    public iac1 f175436b;

    /* JADX INFO: renamed from: c */
    public final String f175437c;

    /* JADX INFO: renamed from: d */
    public final boolean f175438d;

    /* JADX INFO: renamed from: f */
    public d2p0 f175440f;

    /* JADX INFO: renamed from: h */
    public int f175442h;

    /* JADX INFO: renamed from: i */
    public final float f175443i;

    /* JADX INFO: renamed from: j */
    public final int f175444j;

    /* JADX INFO: renamed from: k */
    public j9c1 f175445k;

    /* JADX INFO: renamed from: l */
    public j9c1 f175446l;

    /* JADX INFO: renamed from: m */
    public float f175447m;

    /* JADX INFO: renamed from: n */
    public fv51 f175448n;

    /* JADX INFO: renamed from: o */
    public Locale f175449o;

    /* JADX INFO: renamed from: p */
    public boolean f175450p;

    /* JADX INFO: renamed from: q */
    public et81 f175451q;

    /* JADX INFO: renamed from: r */
    public boolean f175452r;

    /* JADX INFO: renamed from: s */
    public boolean f175453s;

    /* JADX INFO: renamed from: e */
    public final Handler f175439e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public final String f175441g = bm51.m29801l0(UUID.randomUUID().toString(), "-", "");

    public pa9(z1p0 z1p0Var, iac1 iac1Var, String str, boolean z) {
        this.f175435a = z1p0Var;
        this.f175436b = iac1Var;
        this.f175437c = str;
        this.f175438d = z;
        iac1 iac1Var2 = this.f175436b;
        if (iac1Var2 != null) {
            iac1Var2.f100220c.add(this);
        }
        this.f175442h = 1;
        this.f175443i = 1.0f;
        this.f175444j = Alert.DURATION_SHOW_INDEFINITELY;
        this.f175445k = new j9c1(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
        this.f175446l = new j9c1(0, 0);
        this.f175447m = 1.0f;
        this.f175453s = true;
    }

    /* JADX INFO: renamed from: m */
    public static void m69438m(pa9 pa9Var, long j) {
        d2p0 d2p0Var = pa9Var.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34740H0(j, true);
        }
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: a */
    public final void mo33898a(VideoSurfaceView videoSurfaceView) {
        m69448n();
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: b */
    public final void mo33899b() {
        m69448n();
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: c */
    public final void mo33900c(VideoSurfaceView videoSurfaceView) {
        m69448n();
    }

    /* JADX INFO: renamed from: d */
    public final void m69439d(VideoSurfaceView videoSurfaceView) {
        iac1 iac1Var = this.f175436b;
        if (iac1Var != null) {
            iac1Var.m50050b(videoSurfaceView);
        }
    }

    /* JADX INFO: renamed from: e */
    public final yzo0 m69440e() {
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            return d2p0Var.m34769g0();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m69441f() {
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34735E0();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m69442g(l1p0 l1p0Var) {
        m69443h(l1p0Var, new noo0(0L, 0L, false, false, null, null, false, 255));
    }

    /* JADX INFO: renamed from: h */
    public final void m69443h(l1p0 l1p0Var, noo0 noo0Var) {
        yzo0 yzo0Var = new yzo0(l1p0Var, this.f175441g, this.f175437c);
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34760X0(2, yzo0Var, qjg1.m72922n());
        }
        z1p0 z1p0Var = this.f175435a;
        d2p0 d2p0VarM95157a = z1p0Var != null ? z1p0Var.m95157a(yzo0Var, noo0Var, new so5(this, 28)) : null;
        this.f175440f = d2p0VarM95157a;
        if (d2p0VarM95157a != null) {
            d2p0VarM95157a.m34754S0(this.f175451q);
        }
        d2p0 d2p0Var2 = this.f175440f;
        if (d2p0Var2 != null) {
            d2p0Var2.m34741I0(this.f175442h);
        }
        d2p0 d2p0Var3 = this.f175440f;
        if (d2p0Var3 != null) {
            d2p0Var3.m34743K0(this.f175444j);
        }
        d2p0 d2p0Var4 = this.f175440f;
        if (d2p0Var4 != null) {
            d2p0Var4.m34744L0(this.f175445k);
        }
        d2p0 d2p0Var5 = this.f175440f;
        if (d2p0Var5 != null) {
            d2p0Var5.m34746M0(this.f175446l);
        }
        d2p0 d2p0Var6 = this.f175440f;
        if (d2p0Var6 != null) {
            d2p0Var6.m34748N0(this.f175447m);
        }
        d2p0 d2p0Var7 = this.f175440f;
        if (d2p0Var7 != null) {
            d2p0Var7.m34750P0(this.f175448n);
        }
        d2p0 d2p0Var8 = this.f175440f;
        if (d2p0Var8 != null) {
            d2p0Var8.m34749O0(this.f175449o);
        }
        d2p0 d2p0Var9 = this.f175440f;
        if (d2p0Var9 != null) {
            d2p0Var9.m34752Q0(this.f175450p);
        }
        d2p0 d2p0Var10 = this.f175440f;
        if (d2p0Var10 != null) {
            d2p0Var10.m34755T0(this.f175452r);
        }
        d2p0 d2p0Var11 = this.f175440f;
        if (d2p0Var11 != null) {
            d2p0Var11.m34753R0(this.f175453s);
        }
        d2p0 d2p0Var12 = this.f175440f;
        if (d2p0Var12 != null) {
            d2p0Var12.m34758V0(this.f175443i);
        }
        d2p0 d2p0Var13 = this.f175440f;
        if (d2p0Var13 != null) {
            d2p0Var13.m34737F0();
        }
        m69448n();
    }

    /* JADX INFO: renamed from: i */
    public final void m69444i() {
        m69445j(qjg1.m72922n());
    }

    /* JADX INFO: renamed from: j */
    public final void m69445j(clq clqVar) {
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSessionStop");
            try {
                d2p0Var.m34760X0(6, null, clqVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        iac1 iac1Var = this.f175436b;
        if (iac1Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSurfaceManager");
            try {
                iac1Var.f100220c.remove(this);
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        z1p0 z1p0Var = this.f175435a;
        if (z1p0Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSessionFactory");
            try {
                z1p0Var.m95158b();
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        this.f175440f = null;
        this.f175436b = null;
        this.f175435a = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m69446k(VideoSurfaceView videoSurfaceView) {
        iac1 iac1Var = this.f175436b;
        if (iac1Var != null) {
            iac1Var.m50055g(videoSurfaceView);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m69447l() {
        d2p0 d2p0Var;
        yzo0 yzo0VarM34769g0;
        d2p0 d2p0Var2;
        d2p0 d2p0Var3 = this.f175440f;
        if ((d2p0Var3 != null && d2p0Var3.m34767e0()) || (d2p0Var = this.f175440f) == null || (yzo0VarM34769g0 = d2p0Var.m34769g0()) == null) {
            return;
        }
        if ((!this.f175452r || yzo0VarM34769g0.m94990d()) && (d2p0Var2 = this.f175440f) != null) {
            d2p0Var2.m34738G0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX INFO: renamed from: n */
    public final synchronized void m69448n() {
        yzo0 yzo0VarM34769g0;
        Object next;
        VideoSurfaceView videoSurfaceViewM50051c;
        boolean zMo29657f;
        try {
            d2p0 d2p0Var = this.f175440f;
            if (d2p0Var != null && (yzo0VarM34769g0 = d2p0Var.m34769g0()) != null) {
                d2p0 d2p0Var2 = this.f175440f;
                VideoSurfaceView videoSurfaceViewM34776p0 = d2p0Var2 != null ? d2p0Var2.m34776p0() : null;
                boolean z = true;
                if (this.f175438d) {
                    iac1 iac1Var = this.f175436b;
                    if (iac1Var != null) {
                        videoSurfaceViewM50051c = iac1Var.m50051c(yzo0VarM34769g0);
                    } else {
                        videoSurfaceViewM50051c = null;
                    }
                } else {
                    iac1 iac1Var2 = this.f175436b;
                    if (iac1Var2 != null) {
                        Iterator it = iac1Var2.f100219b.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) next;
                            boolean z2 = videoSurfaceView.useSurfaceView;
                            if (!(z2 && videoSurfaceView.f3060c == null) && (z2 || videoSurfaceView.f3056a != null)) {
                                cvo0 cvo0Var = videoSurfaceView.f3070h;
                                zMo29657f = cvo0Var != null ? cvo0Var.mo29657f(yzo0VarM34769g0) : true;
                            } else {
                                zMo29657f = false;
                            }
                        } while (!zMo29657f);
                        videoSurfaceViewM50051c = (VideoSurfaceView) next;
                    } else {
                        videoSurfaceViewM50051c = null;
                    }
                }
                if (videoSurfaceViewM34776p0 == null && videoSurfaceViewM50051c == null) {
                    return;
                }
                if (videoSurfaceViewM34776p0 != null && videoSurfaceViewM50051c != null && videoSurfaceViewM34776p0 != videoSurfaceViewM50051c && !videoSurfaceViewM50051c.isLaidOut() && videoSurfaceViewM34776p0.getConfiguration() != null) {
                    eac1 configuration = videoSurfaceViewM34776p0.getConfiguration();
                    String strM84922a = configuration != null ? ((v8k) configuration).m84922a() : null;
                    eac1 configuration2 = videoSurfaceViewM50051c.getConfiguration();
                    if (wj50.m88271j(strM84922a, configuration2 != null ? ((v8k) configuration2).m84922a() : null)) {
                        return;
                    }
                }
                if (videoSurfaceViewM34776p0 != videoSurfaceViewM50051c && videoSurfaceViewM34776p0 != null) {
                    oa9 oa9Var = new oa9(videoSurfaceViewM34776p0, 0);
                    if (wj50.m88271j(Looper.getMainLooper(), Looper.myLooper())) {
                        oa9Var.run();
                    } else {
                        this.f175439e.post(oa9Var);
                    }
                }
                if (videoSurfaceViewM50051c == null) {
                    d2p0 d2p0Var3 = this.f175440f;
                    if (d2p0Var3 != null) {
                        d2p0Var3.m34756U0(null);
                    }
                } else {
                    d2p0 d2p0Var4 = this.f175440f;
                    j9c1 j9c1VarM34774n0 = d2p0Var4 != null ? d2p0Var4.m34774n0() : null;
                    if (j9c1VarM34774n0 != null) {
                        int iM52741b = j9c1VarM34774n0.m52741b();
                        int iM52740a = j9c1VarM34774n0.m52740a();
                        if (videoSurfaceViewM50051c.f3042M0 != iM52741b || videoSurfaceViewM50051c.f3043N0 != iM52740a) {
                            videoSurfaceViewM50051c.f3042M0 = iM52741b;
                            videoSurfaceViewM50051c.f3043N0 = iM52740a;
                            videoSurfaceViewM50051c.f3041L0.post(new oa9(videoSurfaceViewM50051c, 2));
                        }
                    }
                    if (videoSurfaceViewM34776p0 != videoSurfaceViewM50051c) {
                        videoSurfaceViewM50051c.m4021c();
                        d2p0 d2p0Var5 = this.f175440f;
                        if ((d2p0Var5 != null ? d2p0Var5.m34770h0() : null) != v3p0.BUFFERING) {
                            z = false;
                        }
                        videoSurfaceViewM50051c.setIsBuffering(z);
                        d2p0 d2p0Var6 = this.f175440f;
                        if (d2p0Var6 != null) {
                            d2p0Var6.m34756U0(videoSurfaceViewM50051c);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m69449o(boolean z) {
        if (z) {
            m69450p(2);
        } else if (this.f175442h == 2) {
            m69450p(1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m69450p(int i) {
        this.f175442h = i;
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34741I0(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m69451q(boolean z) {
        this.f175450p = z;
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34752Q0(z);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m69452r(boolean z) {
        if (this.f175453s == z) {
            return;
        }
        this.f175453s = z;
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34753R0(z);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m69453s(et81 et81Var) {
        this.f175451q = et81Var;
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34754S0(et81Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m69454t(boolean z) {
        if (this.f175452r == z) {
            return;
        }
        this.f175452r = z;
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34755T0(z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m69455u() {
        d2p0 d2p0Var = this.f175440f;
        if (d2p0Var != null) {
            d2p0Var.m34760X0(2, null, qjg1.m72922n());
        }
    }
}
