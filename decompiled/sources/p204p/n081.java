package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import com.comscore.streaming.AdvertisementType;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.zzx;
import com.spotify.adsdisplay.uiusecases.videocontrolsoverlay.VideoControlsOverlayView;
import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class n081 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148935a;

    /* JADX INFO: renamed from: b */
    public Object f148936b;

    public /* synthetic */ n081() {
        this.f148935a = 22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dsf1 dsf1Var;
        xof1 xof1Var;
        boolean zIsEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        int i = 0;
        switch (this.f148935a) {
            case 0:
                o081 o081Var = (o081) this.f148936b;
                Window.Callback callback = o081Var.f160271g;
                Menu menuM65982l0 = o081Var.m65982l0();
                zge0 zge0Var = menuM65982l0 instanceof zge0 ? (zge0) menuM65982l0 : null;
                if (zge0Var != null) {
                    zge0Var.m96060A();
                }
                try {
                    menuM65982l0.clear();
                    if (!callback.onCreatePanelMenu(0, menuM65982l0) || !callback.onPreparePanel(0, null, menuM65982l0)) {
                        menuM65982l0.clear();
                    }
                    if (zge0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (zge0Var != null) {
                        zge0Var.m96077z();
                    }
                }
                break;
            case 1:
                ii10 ii10Var = (ii10) ((kjp) this.f148936b).f123390b;
                hi10 hi10Var = ii10Var.f102402b;
                Context context = ii10Var.f102401a.getView().getContext();
                zge0 zge0Var2 = new zge0(context);
                zge0Var2.m96060A();
                try {
                    zge0Var2.clear();
                    if (!hi10Var.f53429a.onCreatePanelMenu(0, zge0Var2) || !hi10Var.onPreparePanel(0, null, zge0Var2)) {
                        zge0Var2.clear();
                        break;
                    }
                    return;
                } finally {
                    zge0Var2.m96077z();
                    ii10Var.m50675a(context, zge0Var2);
                }
            case 2:
                NativeTrafficSetupImpl nativeTrafficSetupImpl = ((fu81) this.f148936b).f73441b;
                if (nativeTrafficSetupImpl != null) {
                    nativeTrafficSetupImpl.destroy();
                    return;
                } else {
                    wj50.m88260d0("nativeTrafficSetup");
                    throw null;
                }
            case 3:
                ShimmerFrameLayout shimmerFrameLayout = ((s491) this.f148936b).f205526d;
                if (shimmerFrameLayout.f1665c) {
                    shimmerFrameLayout.m1430e();
                    shimmerFrameLayout.f1665c = false;
                    shimmerFrameLayout.invalidate();
                    return;
                }
                return;
            case 4:
                ((q831) ((oa81) this.f148936b).f163265b).m72300d();
                return;
            case 5:
                EditText editText = (EditText) this.f148936b;
                ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
                return;
            case 6:
                VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) this.f148936b;
                int i2 = VideoControlsOverlayView.f2720h;
                videoControlsOverlayView.f2722b = true;
                while (i < videoControlsOverlayView.getChildCount()) {
                    int i3 = i + 1;
                    View childAt = videoControlsOverlayView.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    tug1.m81577o(childAt);
                    i = i3;
                }
                return;
            case 7:
                com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView videoControlsOverlayView2 = (com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView) this.f148936b;
                qr60[] qr60VarArr = com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView.f2705P0;
                videoControlsOverlayView2.m2768e();
                return;
            case 8:
                ((ValueAnimator) this.f148936b).start();
                return;
            case 9:
                ((vec1) this.f148936b).m85313o(0);
                return;
            case 10:
                ((rjc1) this.f148936b).m75640t();
                return;
            case 11:
                ((ViewPager) this.f148936b).setScrollState(0);
                return;
            case 12:
                goc1 goc1Var = (goc1) this.f148936b;
                goc1Var.f82938a = false;
                if (((ComposeView) goc1Var.f82939b).getParent() != null) {
                    goc1Var.m45332a();
                    return;
                }
                return;
            case 13:
                fpc1 fpc1Var = (fpc1) this.f148936b;
                fpc1Var.f71814n = false;
                if (fpc1Var.f71803c == null || wj50.m88271j(fpc1Var.f71821u, Boolean.FALSE)) {
                    return;
                }
                fpc1Var.f71802b.getClass();
                fpc1Var.f71813m = SystemClock.uptimeMillis();
                fpc1Var.m42327c();
                return;
            case 14:
                rmd1 rmd1Var = (rmd1) this.f148936b;
                qr60[] qr60VarArr2 = rmd1.f200507P1;
                if (rmd1Var.m75945j1() == qmd1.f190203b) {
                    rmd1Var.f200521N1.onNext(Boolean.FALSE);
                    rmd1Var.mo75950t1();
                    rmd1Var.m75944h1(qmd1.f190204c);
                    return;
                }
                return;
            case 15:
                ((p3f1) this.f148936b).m69002a();
                return;
            case 16:
                p3f1 p3f1Var = (p3f1) ((vaa1) this.f148936b).f239173b;
                ((dz8) p3f1Var.f173637l).m37430g(p3f1Var.f173637l.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 17:
                ((b4f1) this.f148936b).f23350r.m49910D(new lzi(4, null, null));
                return;
            case 18:
                shf1 shf1Var = (shf1) this.f148936b;
                synchronized (shf1.f209199i) {
                    try {
                        if (shf1Var.m78130b()) {
                            shf1Var.m78134f(15);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 19:
                try {
                    ((xc9) ((g2a1) this.f148936b).f75877c).f260137H.mo42509c();
                    return;
                } catch (Throwable unused) {
                    mmf1.m62315i("BillingClient");
                    return;
                }
            case 20:
                vlf1 vlf1Var = (vlf1) this.f148936b;
                xc9 xc9Var = vlf1Var.f242488e;
                xc9Var.m90372G(0);
                ye9 ye9Var = esf1.f62365i;
                xc9Var.m90371F(24, vlf1Var.f242487d, ye9Var);
                vlf1Var.m85952d(ye9Var);
                return;
            case 21:
                tnf1 tnf1Var = (tnf1) this.f148936b;
                ura0 ura0Var = tnf1.f221963g;
                ura0Var.m83850c("transfer with type = %d has timed out", 0);
                ura0Var.m83848a("notify failed transfer with type = %d, reason = %d", 0, 101);
                for (tng1 tng1Var : new HashSet(tnf1Var.f221965b)) {
                    switch (tng1Var.f221973a) {
                        case 0:
                            ura0 ura0Var2 = fqg1.f72180i;
                            fqg1.f72180i.m83848a("onTransferFailed with type = %d and reason = %d", 0, 101);
                            fqg1 fqg1Var = (fqg1) tng1Var.f221974b;
                            fqg1Var.m42431o();
                            otg1 otg1Var = fqg1Var.f72183c;
                            csg1 csg1Var = fqg1Var.f72187g;
                            bfg1 bfg1Var = fqg1Var.f72181a;
                            dxg1 dxg1VarM67797f = otg1Var.m67797f(csg1Var);
                            fwg1 fwg1VarM51825n = iwg1.m51825n(dxg1VarM67797f.m37253e());
                            fwg1VarM51825n.m38389b();
                            ((iwg1) fwg1VarM51825n.f57940b).m51834w();
                            fwg1VarM51825n.m38389b();
                            ((iwg1) fwg1VarM51825n.f57940b).m51835x();
                            dxg1VarM67797f.m37254g((iwg1) fwg1VarM51825n.m38391d());
                            bfg1Var.m29026a((gxg1) dxg1VarM67797f.m38391d(), AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
                            break;
                        default:
                            ob31 ob31Var = new ob31(11);
                            ob31Var.f163529b = 101;
                            oyp0 oyp0Var = (oyp0) tng1Var.f221974b;
                            ob31Var.f163530c = Boolean.valueOf(((aif1) oyp0Var.f171833c).f15987m == 2);
                            oyp0Var.m68531D(new fqf1(ob31Var));
                            break;
                    }
                }
                tnf1Var.m81176a();
                return;
            case 22:
                wsf1 wsf1Var = (wsf1) this.f148936b;
                if (wsf1Var == null || (dsf1Var = wsf1Var.f254604h) == null) {
                    return;
                }
                this.f148936b = null;
                if (dsf1Var.isDone()) {
                    Object obj = wsf1Var.f135759a;
                    if (obj == null) {
                        if (dsf1Var.isDone()) {
                            if (lpf1.f135758g.mo36574C(wsf1Var, null, wsf1.m88891h(dsf1Var))) {
                                wsf1.m88892j(wsf1Var);
                                return;
                            }
                            return;
                        }
                        vof1 vof1Var = new vof1(wsf1Var, dsf1Var);
                        if (lpf1.f135758g.mo36574C(wsf1Var, null, vof1Var)) {
                            try {
                                dsf1Var.mo36769b(vof1Var, jqf1.f114907a);
                                return;
                            } catch (Throwable th2) {
                                try {
                                    xof1Var = new xof1(th2);
                                    break;
                                } catch (Error | Exception unused2) {
                                    xof1Var = xof1.f264277b;
                                }
                                lpf1.f135758g.mo36574C(wsf1Var, vof1Var, xof1Var);
                                return;
                            }
                        }
                        obj = wsf1Var.f135759a;
                    }
                    if (obj instanceof uof1) {
                        dsf1Var.cancel(((uof1) obj).f232423a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = wsf1Var.f254605i;
                    wsf1Var.f254605i = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th3) {
                            if (lpf1.f135758g.mo36574C(wsf1Var, null, new xof1(new osf1(str)))) {
                                wsf1.m88892j(wsf1Var);
                            }
                            throw th3;
                        }
                    }
                    if (lpf1.f135758g.mo36574C(wsf1Var, null, new xof1(new osf1(str + ": " + dsf1Var.toString())))) {
                        wsf1.m88892j(wsf1Var);
                    }
                    dsf1Var.cancel(true);
                    return;
                } catch (Throwable th4) {
                    dsf1Var.cancel(true);
                    throw th4;
                }
            case 23:
                myf1 myf1Var = (myf1) this.f148936b;
                synchronized (myf1Var.f148455h) {
                    zIsEmpty = myf1Var.f148452e.isEmpty();
                    break;
                }
                if (zIsEmpty || myf1Var.f148456i || (connectivityManager = myf1Var.f148450c) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    throw null;
                }
                activeNetworkInfo.isConnected();
                throw null;
            case 24:
                synchronized (((d8g1) this.f148936b).f46460c) {
                    ((k7l0) ((d8g1) this.f148936b).f46461d).mo31435b();
                    break;
                }
                return;
            case 25:
                fqg1 fqg1Var2 = (fqg1) this.f148936b;
                csg1 csg1Var2 = fqg1Var2.f72187g;
                if (csg1Var2 != null) {
                    fqg1Var2.f72181a.m29026a(fqg1Var2.f72183c.m67792a(csg1Var2), 223);
                }
                ywh0 ywh0Var = fqg1Var2.f72185e;
                ig31.m50506x(ywh0Var);
                n081 n081Var = fqg1Var2.f72184d;
                ig31.m50506x(n081Var);
                ywh0Var.postDelayed(n081Var, 300000L);
                return;
            case 26:
                Context context2 = (Context) this.f148936b;
                int i4 = SplitCompat.zza;
                try {
                    zzx.zzg(context2).zzc(true);
                    return;
                } catch (SecurityException unused3) {
                    return;
                }
            case 27:
                try {
                    ((SplitCompat) this.f148936b).zzc.m63016b();
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 28:
                ((s0h1) this.f148936b).m76882k(false);
                return;
            default:
                dyg1 dyg1Var = (dyg1) this.f148936b;
                SharedPreferences sharedPreferences = dyg1Var.f54343b;
                HashSet hashSet = dyg1Var.f54347f;
                if (hashSet.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = dyg1Var.f54348g;
                long j = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = dyg1Var.f54349h;
                if (j2 == 0 || jCurrentTimeMillis - j2 >= j) {
                    dyg1.f54339i.m83848a("Upload the feature usage report.", new Object[0]);
                    uvg1 uvg1VarM92235m = xvg1.m92235m();
                    uvg1VarM92235m.m84058g(dyg1.f54340j);
                    uvg1VarM92235m.m84057e(dyg1Var.f54344c);
                    xvg1 xvg1Var = (xvg1) uvg1VarM92235m.m38391d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    avg1 avg1VarM34060m = cvg1.m34060m();
                    avg1VarM34060m.m38389b();
                    ((cvg1) avg1VarM34060m.f57940b).m34062o(arrayList);
                    avg1VarM34060m.m38389b();
                    ((cvg1) avg1VarM34060m.f57940b).m34061n(xvg1Var);
                    cvg1 cvg1Var = (cvg1) avg1VarM34060m.m38391d();
                    dxg1 dxg1VarM46092n = gxg1.m46092n();
                    dxg1VarM46092n.m38389b();
                    ((gxg1) dxg1VarM46092n.f57940b).m46106z(cvg1Var);
                    dyg1Var.f54342a.m29026a((gxg1) dxg1VarM46092n.m38391d(), 243);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((kug1) it.next()).f126614a);
                            String strM38564m = edb.m38564m("feature_usage_timestamp_reported_feature_", string);
                            if (!sharedPreferences.contains(strM38564m)) {
                                strM38564m = edb.m38564m("feature_usage_timestamp_detected_feature_", string);
                            }
                            String strM38564m2 = edb.m38564m("feature_usage_timestamp_reported_feature_", string);
                            if (!TextUtils.equals(strM38564m, strM38564m2)) {
                                long j3 = sharedPreferences.getLong(strM38564m, 0L);
                                editorEdit.remove(strM38564m);
                                if (j3 != 0) {
                                    editorEdit.putLong(strM38564m2, j3);
                                }
                            }
                        }
                    }
                    dyg1Var.f54349h = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ n081(Object obj, int i) {
        this.f148935a = i;
        this.f148936b = obj;
    }
}
