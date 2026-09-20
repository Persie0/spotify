package p204p;

import android.R;
import android.os.Process;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.search.p018ui.BackKeyEditText;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.oauthsetupimpl.NativeOAuthSetupImpl;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.pubsubsetupv2impl.NativePubSubSetupV2Impl;
import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.fileaccess.fileio.NativeFileIO;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zu3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286333a;

    /* JADX INFO: renamed from: b */
    public final Object f286334b;

    public /* synthetic */ zu3(Object obj, int i) {
        this.f286333a = i;
        this.f286334b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [p.eh00, p.qe70] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        cv61 cv61VarM60066b;
        long jNanoTime;
        switch (this.f286333a) {
            case 0:
                av3 av3Var = (av3) this.f286334b;
                er70 er70Var = av3Var.f20080b;
                ta6 ta6Var = (ta6) er70Var.get();
                ((File) ta6Var.f218461a.get()).mkdirs();
                Iterator it = ta6Var.f218462b.entrySet().iterator();
                while (it.hasNext()) {
                    qa6 qa6Var = (qa6) ((Map.Entry) it.next()).getValue();
                    if (pxy.m71565Y((File) ta6Var.f218461a.get(), qa6Var.f186760a).exists()) {
                        ta6Var.f218463c.put(qa6Var.f186760a, gb6.f78207c);
                    }
                }
                Iterator it2 = g6f.m43728j1(((ta6) er70Var.get()).f218462b.values()).iterator();
                while (it2.hasNext()) {
                }
                av3Var.f20082d.countDown();
                return;
            case 1:
                l65 l65Var = (l65) this.f286334b;
                if ((l65Var.f130230x1 & 1) != 0) {
                    l65Var.m58304u(0);
                }
                if ((l65Var.f130230x1 & 4096) != 0) {
                    l65Var.m58304u(108);
                }
                l65Var.f130229w1 = false;
                l65Var.f130230x1 = 0;
                return;
            case 2:
                whr0 whr0Var = whr0.f251426i;
                oc80 oc80Var = cvf1.m34048k().f251432f;
                sb5 sb5Var = (sb5) this.f286334b;
                oc80Var.mo31986a(sb5Var);
                sb5Var.f207355d.post(new n10(sb5Var, 8));
                return;
            case 3:
                o2a o2aVar = (o2a) this.f286334b;
                if (o2aVar.f161004h) {
                    o2aVar.f161004h = false;
                    o2a.m66099a(o2aVar);
                    return;
                }
                return;
            case 4:
                ((qe70) this.f286334b).invoke();
                return;
            case 5:
                p1j p1jVar = (p1j) this.f286334b;
                kwi0 kwi0Var = NativeAuthenticatedScope.Companion;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = ((auk) p1jVar.f173109a).f19948a;
                NativeRouter nativeRouter = p1jVar.f173110b.getNativeRouter();
                NativeApplicationScope nativeApplicationScopeM66072a = ((o1j) p1jVar.f173111c).m66072a();
                NativeSession nativeSessionM27981a = p1jVar.f173114f.m27981a();
                NativePubSubSetupV2Impl nativePubSubSetupV2Impl = p1jVar.f173115g.f130005e;
                if (nativePubSubSetupV2Impl == null) {
                    wj50.m88260d0("nativePubSubSetup");
                    throw null;
                }
                AnalyticsDelegate analyticsDelegate = p1jVar.f173112d;
                AuthenticatedScopeConfiguration authenticatedScopeConfiguration = p1jVar.f173113e;
                NativeFileIO nativeFileIO = p1jVar.f173117i.f31742a;
                kwi0Var.getClass();
                p1jVar.f173118t = NativeAuthenticatedScope.create(nativeTimerManagerThreadImpl, nativeRouter, nativeApplicationScopeM66072a, nativeSessionM27981a, nativePubSubSetupV2Impl, analyticsDelegate, authenticatedScopeConfiguration, nativeFileIO);
                return;
            case 6:
                csk cskVar = (csk) this.f286334b;
                cskVar.f41636W0 = cskVar.m33775a();
                return;
            case 7:
                ago agoVar = (ago) this.f286334b;
                agoVar.f15450n.set(false);
                agoVar.m25873j();
                return;
            case 8:
                ((xcw) this.f286334b).invoke();
                return;
            case 9:
                synchronized (((ck90) this.f286334b).f38880a) {
                    obj = ((ck90) this.f286334b).f38885f;
                    ((ck90) this.f286334b).f38885f = ck90.f38879X;
                    break;
                }
                ((ck90) this.f286334b).mo33104m(obj);
                return;
            case 10:
                LoadingView loadingView = (LoadingView) this.f286334b;
                if (loadingView.f2974L0 == 2) {
                    loadingView.f2974L0 = 3;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    loadingView.f2987i = alphaAnimation;
                    alphaAnimation.setDuration(loadingView.f2982d);
                    loadingView.f2987i.setInterpolator(loadingView.getContext(), R.interpolator.decelerate_quad);
                    loadingView.f2987i.setAnimationListener(loadingView.f2978P0);
                    loadingView.startAnimation(loadingView.f2987i);
                    loadingView.setVisibility(0);
                    loadingView.postDelayed(loadingView.f2976N0, loadingView.f2980b.mo58465b());
                    return;
                }
                return;
            case 11:
                xod0 xod0Var = (xod0) this.f286334b;
                ood0 ood0Var = xod0Var.f264255i;
                if (ood0Var == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                if (ood0Var.m67499v()) {
                    return;
                }
                ood0 ood0Var2 = xod0Var.f264255i;
                if (ood0Var2 == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                ood0Var2.m67502y(true);
                ood0 ood0Var3 = xod0Var.f264255i;
                if (ood0Var3 == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                sod0 sod0Var = xod0Var.f264256j;
                if (sod0Var == null) {
                    wj50.m88260d0("callback");
                    throw null;
                }
                ood0Var3.m67503z(sod0Var, xod0Var.f264257k);
                ood0 ood0Var4 = xod0Var.f264255i;
                if (ood0Var4 == null || ood0Var4.m67494n().m46917d() == null) {
                    xod0Var.mo53395k(ard0.f19019o);
                    return;
                }
                return;
            case 12:
                l5t0 l5t0Var = (l5t0) this.f286334b;
                bxi0 bxi0Var = NativePubSubSetupV2Impl.Companion;
                zu4 zu4Var = l5t0Var.f130004d;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl2 = ((auk) l5t0Var.f130001a).f19948a;
                NativeOAuthSetupImpl nativeOAuthSetupImplM89206a = l5t0Var.f130002b.m89206a();
                NativeApplicationScope nativeApplicationScopeM66072a2 = ((o1j) l5t0Var.f130003c).m66072a();
                bxi0Var.getClass();
                l5t0Var.f130005e = NativePubSubSetupV2Impl.create(zu4Var, nativeTimerManagerThreadImpl2, nativeOAuthSetupImplM89206a, nativeApplicationScopeM66072a2);
                return;
            case 13:
                RecyclerView recyclerView = (RecyclerView) this.f286334b;
                if (!recyclerView.f1220V0 || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.f1216T0) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.f1226Y0) {
                    recyclerView.f1224X0 = true;
                    return;
                } else {
                    recyclerView.m1028s();
                    return;
                }
            case 14:
                b301 b301Var = (b301) this.f286334b;
                wi7 wi7Var = b301Var.f22762e.f143718a;
                UnencryptedCredentials unencryptedCredentials = new UnencryptedCredentials(wi7Var.f251542a, wi7Var.f251544c.f59235b);
                exi0 exi0Var = NativeSession.Companion;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl3 = ((auk) b301Var.f22759b).f19948a;
                NativeOAuthSetupImpl nativeOAuthSetupImplM89206a2 = b301Var.f22761d.m89206a();
                Map map = b301Var.f22758a;
                String str = ((edi0) b301Var.f22760c).f58524b;
                exi0Var.getClass();
                b301Var.f22763f = NativeSession.createNativeSessionWithoutAp(nativeTimerManagerThreadImpl3, unencryptedCredentials, nativeOAuthSetupImplM89206a2, map, str);
                return;
            case 15:
                l601 l601Var = (l601) this.f286334b;
                l601Var.f130132c.mo31986a(l601Var.f130135f);
                return;
            case 16:
                ((i031) this.f286334b).f97131i.m66678i(fb80.f67751b);
                return;
            case 17:
                super/*p.ljm*/.onCreate();
                return;
            case 18:
                lv61 lv61Var = (lv61) this.f286334b;
                synchronized (lv61Var) {
                    lv61Var.f137246g++;
                    cv61VarM60066b = lv61Var.m60066b();
                }
                if (cv61VarM60066b == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    cv61 cv61Var = cv61VarM60066b;
                    try {
                        threadCurrentThread.setName(cv61Var.f42320a);
                        Logger logger = ((lv61) this.f286334b).f137241b;
                        kv61 kv61Var = cv61Var.f42322c;
                        wj50.m88279p(kv61Var);
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            nqg1.m65436j(logger, cv61Var, kv61Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo33978a = cv61Var.mo33978a();
                            if (zIsLoggable) {
                                nqg1.m65436j(logger, cv61Var, kv61Var, "finished run in " + nqg1.m65439m(System.nanoTime() - jNanoTime));
                            }
                            lv61 lv61Var2 = (lv61) this.f286334b;
                            synchronized (lv61Var2) {
                                lv61.m60065a(lv61Var2, cv61Var, jMo33978a, true);
                                cv61VarM60066b = lv61Var2.m60066b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                nqg1.m65436j(logger, cv61Var, kv61Var, "failed a run in " + nqg1.m65439m(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            lv61 lv61Var3 = (lv61) this.f286334b;
                            synchronized (lv61Var3) {
                                lv61.m60065a(lv61Var3, cv61Var, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (cv61VarM60066b != null);
                threadCurrentThread.setName(name);
                return;
            case 19:
                fu81 fu81Var = (fu81) this.f286334b;
                NativeTrafficSetupImpl.Companion.getClass();
                fu81Var.f73441b = NativeTrafficSetupImpl.create();
                return;
            case 20:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.f286334b;
                if (videoSurfaceView.f3064e) {
                    return;
                }
                videoSurfaceView.m4025g(videoSurfaceView.getUseSurfaceView());
                return;
            case 21:
                tug1.m81588z((BackKeyEditText) this.f286334b);
                return;
            case 22:
                Process.setThreadPriority(0);
                ((Runnable) this.f286334b).run();
                return;
            case 23:
                i7d1.m49861d((i7d1) this.f286334b);
                return;
            case 24:
                tnf1 tnf1Var = (tnf1) this.f286334b;
                tnf1Var.getClass();
                bmf1 bmf1Var = new bmf1(tnf1Var);
                s101 s101Var = tnf1Var.f221969f;
                ig31.m50506x(s101Var);
                s101Var.m76907a(bmf1Var);
                return;
            default:
                ((rng1) this.f286334b).m76001a("Service disconnected");
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zu3(eh00 eh00Var) {
        this.f286333a = 4;
        this.f286334b = (qe70) eh00Var;
    }
}
