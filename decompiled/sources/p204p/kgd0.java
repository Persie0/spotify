package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Size;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.AbstractC0042f;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.media3.transformer.ExportException;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kgd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f122372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f122373c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f122374d;

    public /* synthetic */ kgd0(IOnDoneCallback iOnDoneCallback, String str, sew0 sew0Var) {
        this.f122371a = 12;
        this.f122373c = iOnDoneCallback;
        this.f122372b = str;
        this.f122374d = sew0Var;
    }

    /* JADX WARN: Type inference failed for: r2v61, types: [p.eh00, p.qe70] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue = true;
        switch (this.f122371a) {
            case 0:
                pgd0 pgd0Var = (pgd0) this.f122373c;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = (MediaSessionManager.RemoteUserInfo) this.f122374d;
                String str = (String) this.f122372b;
                bxb bxbVar = pgd0Var.f157497c;
                tnd0 tnd0VarM30808v = bxbVar.m30808v(remoteUserInfo);
                if (tnd0VarM30808v != null && bxbVar.m30772C(tnd0VarM30808v, 50002)) {
                    pgd0Var.f177293d.m36021N(tnd0VarM30808v, str);
                    String str2 = h0b1.f86200a;
                    return;
                }
                return;
            case 1:
                ((dhd0) this.f122373c).m36023P((tnd0) this.f122374d, (String) this.f122372b);
                return;
            case 2:
                aid0 aid0Var = (aid0) this.f122373c;
                jf40 jf40Var = (jf40) this.f122374d;
                vsd0 vsd0Var = (vsd0) this.f122372b;
                xwo xwoVar = aid0Var.f15952c;
                wsv0 wsv0VarM53150g = jf40Var.m53150g();
                kcj0 kcj0Var = xwoVar.f266713d;
                g7p0 g7p0Var = xwoVar.f266716g;
                g7p0Var.getClass();
                kcj0Var.getClass();
                kcj0Var.f121499c = pf40.m69791p(wsv0VarM53150g);
                if (!wsv0VarM53150g.isEmpty()) {
                    kcj0Var.f121502f = (vsd0) wsv0VarM53150g.get(0);
                    vsd0Var.getClass();
                    kcj0Var.f121503g = vsd0Var;
                }
                if (((vsd0) kcj0Var.f121501e) == null) {
                    kcj0Var.f121501e = kcj0.m56055A(g7p0Var, (pf40) kcj0Var.f121499c, (vsd0) kcj0Var.f121502f, (bp71) kcj0Var.f121498b);
                }
                kcj0Var.m56093g0(g7p0Var.mo43876b0());
                return;
            case 3:
                rpd0 rpd0Var = (rpd0) this.f122373c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f122374d;
                CountDownLatch countDownLatch = (CountDownLatch) this.f122372b;
                ppd0 ppd0Var = rpd0Var.f201562v;
                if (ppd0Var != null) {
                    rpd0Var.f201560t.mo43850O(ppd0Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    rpd0Var.f201548h.m70642j();
                    rpd0Var.f201547g.m70786i2();
                }
                countDownLatch.countDown();
                return;
            case 4:
                rpd0 rpd0Var2 = (rpd0) this.f122373c;
                tnd0 tnd0Var = (tnd0) this.f122374d;
                Runnable runnable = (Runnable) this.f122372b;
                rpd0Var2.f201564x = tnd0Var;
                runnable.run();
                rpd0Var2.f201564x = null;
                return;
            case 5:
                npd0 npd0Var = (npd0) this.f122373c;
                tnd0 tnd0Var2 = (tnd0) this.f122374d;
                KeyEvent keyEvent = (KeyEvent) this.f122372b;
                rpd0 rpd0Var3 = npd0Var.f156951b;
                if (rpd0Var3.m76131r(tnd0Var2)) {
                    rpd0Var3.m76120d(keyEvent, false, false);
                } else {
                    pqd0 pqd0Var = rpd0Var3.f201548h;
                    MediaSessionManager.RemoteUserInfo remoteUserInfo2 = tnd0Var2.f221946a;
                    remoteUserInfo2.getClass();
                    pqd0Var.getClass();
                    pqd0Var.m70636c(1, new xpd0(pqd0Var, 7), remoteUserInfo2, true);
                }
                npd0Var.f156950a = null;
                return;
            case 6:
                rpd0 rpd0Var4 = (rpd0) this.f122373c;
                yrd0 yrd0Var = (yrd0) this.f122374d;
                und0 und0Var = (und0) this.f122372b;
                if (rpd0Var4.m76132s()) {
                    return;
                }
                rpd0Var4.m76119E();
                pdp0 pdp0Var = rpd0Var4.f201560t;
                yrd0Var.getClass();
                dzd0.m37451f(pdp0Var, und0Var);
                return;
            case 7:
                jtd0 jtd0Var = (jtd0) this.f122373c;
                Pair pair = (Pair) this.f122374d;
                jtd0Var.f115819b.f147053i.mo40364J(((Integer) pair.first).intValue(), (vsd0) pair.second, (m57) this.f122372b);
                return;
            case 8:
                jtd0 jtd0Var2 = (jtd0) this.f122373c;
                Pair pair2 = (Pair) this.f122374d;
                jtd0Var2.f115819b.f147053i.mo40363D(((Integer) pair2.first).intValue(), (vsd0) pair2.second, (Exception) this.f122372b);
                return;
            case 9:
                iwi0 iwi0Var = (iwi0) this.f122373c;
                awa0 awa0Var = (awa0) this.f122374d;
                Bundle bundle = (Bundle) this.f122372b;
                try {
                    iwi0Var.m30995u(bundle, awa0Var);
                    iwi0Var.m51842O(bundle, awa0Var);
                    return;
                } catch (FacebookServiceException e) {
                    e8y e8yVar = e.f1662b;
                    iwi0Var.m51841M(awa0Var, e8yVar.f57307d, e8yVar.m38132c(), String.valueOf(e8yVar.f57305b));
                    return;
                } catch (FacebookException e2) {
                    iwi0Var.m51841M(awa0Var, null, e2.getMessage(), null);
                    return;
                }
            case 10:
                c6p0 c6p0Var = (c6p0) this.f122373c;
                g9c1 g9c1Var = (g9c1) this.f122374d;
                VideoFrameProcessingException videoFrameProcessingException = (VideoFrameProcessingException) this.f122372b;
                r300 r300Var = c6p0Var.f34590c;
                r300Var.getClass();
                g9c1Var.mo24873c(new VideoSink$VideoSinkException(videoFrameProcessingException, r300Var));
                return;
            case 11:
                mir0 mir0Var = (mir0) this.f122373c;
                jbb jbbVar = (jbb) this.f122374d;
                k2e1 k2e1Var = (k2e1) this.f122372b;
                try {
                    zBooleanValue = ((Boolean) jbbVar.f110727b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (mir0Var.f144089k) {
                    try {
                        f0e1 f0e1VarM55001w = k0e1.m55001w(k2e1Var.f118606a);
                        String str3 = f0e1VarM55001w.f64629a;
                        if (mir0Var.m61911c(str3) == k2e1Var) {
                            mir0Var.m61910b(str3);
                        }
                        gaz.m44190b().getClass();
                        Iterator it = mir0Var.f144088j.iterator();
                        while (it.hasNext()) {
                            ((qgx) it.next()).mo1166a(f0e1VarM55001w, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 12:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f122373c;
                String str4 = (String) this.f122372b;
                try {
                    AbstractC0042f.m249f(iOnDoneCallback, str4, ((sew0) this.f122374d).mo205b());
                    return;
                } catch (BundlerException e3) {
                    AbstractC0042f.m248e(iOnDoneCallback, e3, str4);
                    return;
                } catch (RuntimeException e4) {
                    AbstractC0042f.m248e(iOnDoneCallback, e4, str4);
                    throw new RuntimeException(e4);
                }
            case 13:
                cu70 cu70Var = (cu70) this.f122373c;
                ucb ucbVar = (ucb) this.f122374d;
                u790 u790Var = (u790) this.f122372b;
                cu70Var.getClass();
                Objects.toString(ucbVar);
                cu70Var.f42068b.remove(u790Var);
                return;
            case 14:
                ((ay21) this.f122373c).m27470f((v761) this.f122374d, (Map.Entry) this.f122372b);
                return;
            case 15:
                z861 z861Var = (z861) this.f122373c;
                s861 s861Var = (s861) this.f122374d;
                jt4 jt4Var = (jt4) this.f122372b;
                y861 y861Var = z861Var.f280396f;
                y861Var.m93094a();
                if (y861Var.f270235g) {
                    y861Var.f270235g = false;
                    s861Var.m77464c();
                    s861Var.f206584i.m44211b(null);
                    return;
                }
                y861Var.f270230b = s861Var;
                y861Var.f270232d = jt4Var;
                Size size = s861Var.f206577b;
                y861Var.f270229a = size;
                y861Var.f270234f = false;
                if (y861Var.m93095b()) {
                    return;
                }
                vie1.m85624f("SurfaceViewImpl");
                y861Var.f270236h.f280395e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 16:
                g691 g691Var = (g691) this.f122373c;
                jf40 jf40Var2 = (jf40) this.f122374d;
                ExportException exportException = (ExportException) this.f122372b;
                bco bcoVar = g691Var.f76977e;
                wsv0 wsv0VarM53150g2 = jf40Var2.m53150g();
                cxb cxbVar = g691Var.f76976d;
                String str5 = (String) cxbVar.f42973c;
                String str6 = (String) cxbVar.f42974d;
                ahp ahpVar = (ahp) bcoVar.f25926b;
                mnx mnxVar = ahpVar.f15744s;
                v3h1.m84588U(mnxVar, wsv0VarM53150g2, str5, str6);
                d501 d501Var = ahpVar.f15735j;
                mnxVar.f145500q = exportException;
                d501Var.m34948s(mnxVar.m62371a(), exportException);
                return;
            case 17:
                ((hm91) this.f122373c).m47937a((sv6) this.f122374d, (ig10) this.f122372b);
                return;
            case 18:
                u790 u790Var2 = (u790) this.f122373c;
                t601 t601Var = (t601) this.f122374d;
                try {
                    try {
                        t601Var.m28332w(((hm6) this.f122372b).apply(vgg1.m85481v(u790Var2)));
                        return;
                    } catch (Throwable th2) {
                        t601Var.m28331v(th2);
                        return;
                    }
                } catch (Error e5) {
                    e = e5;
                    t601Var.m28331v(e);
                    return;
                } catch (CancellationException unused2) {
                    t601Var.cancel(false);
                    return;
                } catch (RuntimeException e6) {
                    e = e6;
                    t601Var.m28331v(e);
                    return;
                } catch (ExecutionException e7) {
                    e = e7;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    t601Var.m28331v(e);
                    return;
                }
            case 19:
                t601 t601Var2 = (t601) this.f122373c;
                kgd0 kgd0Var = (kgd0) this.f122374d;
                r201 r201Var = (r201) this.f122372b;
                try {
                    if (t601Var2.isCancelled()) {
                        return;
                    }
                    kgd0Var.run();
                    t601Var2.m28330u(r201Var);
                    return;
                } catch (Throwable th3) {
                    t601Var2.m28331v(th3);
                    return;
                }
            case 20:
                bka1 bka1Var = (bka1) this.f122373c;
                r300 r300Var2 = (r300) this.f122374d;
                kro kroVar = (kro) this.f122372b;
                n5c1 n5c1Var = (n5c1) bka1Var.f27888c;
                String str7 = h0b1.f86200a;
                n5c1Var.mo29550O(r300Var2, kroVar);
                return;
            case 21:
                dnd1 dnd1Var = (dnd1) this.f122373c;
                gc41 gc41Var = (gc41) this.f122374d;
                Context context = (Context) this.f122372b;
                i2h1.m49494j();
                if (mmd1.f145124a.m43518a()) {
                    smd1.f210637a.mo29959b(dnd1Var, gc41Var);
                    return;
                } else if (mmd1.f145125b.m43518a()) {
                    smd1.f210637a.mo29960d(dnd1Var, new zga1(gc41Var, 15));
                    return;
                } else {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                    new Handler(Looper.getMainLooper()).post(new cmd1(gc41Var));
                    return;
                }
            case 22:
                u4l0 u4l0Var = (u4l0) this.f122373c;
                ((mir0) u4l0Var.f226772b).m61914g((pr41) this.f122374d, (red1) this.f122372b);
                return;
            default:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f122373c;
                gbb gbbVar = (gbb) this.f122374d;
                ?? r2 = (qe70) this.f122372b;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    gbbVar.m44211b(r2.invoke());
                    return;
                } catch (Throwable th4) {
                    gbbVar.m44212c(th4);
                    return;
                }
        }
    }

    public /* synthetic */ kgd0(Object obj, Object obj2, Object obj3, int i) {
        this.f122371a = i;
        this.f122373c = obj;
        this.f122374d = obj2;
        this.f122372b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kgd0(AtomicBoolean atomicBoolean, gbb gbbVar, eh00 eh00Var) {
        this.f122371a = 23;
        this.f122373c = atomicBoolean;
        this.f122374d = gbbVar;
        this.f122372b = (qe70) eh00Var;
    }
}
