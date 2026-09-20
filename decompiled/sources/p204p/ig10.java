package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ig10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f101860b;

    public /* synthetic */ ig10(Object obj, int i) {
        this.f101859a = i;
        this.f101860b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m50464a() {
        synchronized (((lrd0) this.f101860b).f136264b) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0026, B:19:0x002c, B:25:0x0038, B:27:0x003c, B:29:0x0042, B:31:0x004c, B:33:0x0056, B:35:0x0067, B:34:0x005b, B:36:0x0069, B:38:0x007d, B:40:0x0084), top: B:48:0x0017 }] */
    /* JADX INFO: renamed from: b */
    private final void m50465b() {
        String strM85615D;
        TelephonyManager telephonyManager;
        iij0 iij0Var = (iij0) this.f101860b;
        yzo yzoVar = (yzo) iij0Var.f102595a.get();
        if (yzoVar != null) {
            int iM53456c = iij0Var.f102597c.m53456c();
            zzo zzoVar = yzoVar.f277858a;
            synchronized (zzoVar) {
                int i = zzoVar.f288039L0;
                if (i == 0 || zzoVar.f288048e) {
                    if (i != iM53456c || zzoVar.f288040M0 == null) {
                        zzoVar.f288039L0 = iM53456c;
                        if (iM53456c != 1 && iM53456c != 0 && iM53456c != 8) {
                            if (zzoVar.f288040M0 == null) {
                                Context context = zzoVar.f288044a;
                                String str = h0b1.f86200a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strM85615D = vie1.m85615D(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strM85615D = vie1.m85615D(Locale.getDefault().getCountry());
                                    } else {
                                        strM85615D = vie1.m85615D(networkCountryIso);
                                    }
                                }
                                zzoVar.f288040M0 = strM85615D;
                            }
                            zzoVar.f288042Y = zzoVar.m97336f(iM53456c);
                            zzoVar.f288047d.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            zzoVar.m97337g(zzoVar.f288050g > 0 ? (int) (jElapsedRealtime - zzoVar.f288051h) : 0, zzoVar.f288052i, zzoVar.f288042Y);
                            zzoVar.f288051h = jElapsedRealtime;
                            zzoVar.f288052i = 0L;
                            zzoVar.f288041X = 0L;
                            zzoVar.f288053t = 0L;
                            nr21 nr21Var = zzoVar.f288049f;
                            nr21Var.f157429a.clear();
                            nr21Var.f157430b = -1;
                            nr21Var.f157431c = 0;
                            nr21Var.f157432d = 0;
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        fbk fbkVar = null;
        switch (this.f101859a) {
            case 0:
                jg10 jg10Var = (jg10) this.f101860b;
                zld0 zld0Var = jg10Var.f111994b;
                zld0Var.mo26396i(1);
                zld0Var.mo26392e();
                jg10Var.f111996d.removeCallbacks(jg10Var.f111997e);
                eg10 eg10Var = jg10Var.f111999g.f143259a;
                wmd0 wmd0Var = jg10Var.f111993a;
                tmd0 tmd0Var = jg10Var.f111998f;
                eg10Var.getClass();
                Message messageObtainMessage = eg10Var.obtainMessage(266, new kg10(wmd0Var, tmd0Var));
                messageObtainMessage.arg1 = 7;
                messageObtainMessage.sendToTarget();
                return;
            case 1:
                ((h7u) this.f101860b).m46790C();
                return;
            case 2:
                ((pq30) this.f101860b).f180170c.m12564B();
                return;
            case 3:
                c440 c440Var = (c440) this.f101860b;
                synchronized (c440Var.f33840S0) {
                    try {
                        c440Var.f33842U0 = null;
                        ua40 ua40Var = c440Var.f33841T0;
                        if (ua40Var != null) {
                            c440Var.f33841T0 = null;
                            c440Var.mo31422e(ua40Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 4:
                ((zb50) this.f101860b).f281252d.m60176b();
                return;
            case 5:
                ((je60) this.f101860b).f111476h++;
                return;
            case 6:
                zq4 zq4Var = (zq4) this.f101860b;
                why0.m88178a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  onFailed running callback");
                try {
                    zq4Var.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 7:
                re60 re60Var = (re60) this.f101860b;
                try {
                    ue60 ue60Var = re60Var.f198294d;
                    ue60Var.f229434u.mo33933t(ue60Var.f229433t, re60Var.m75382a());
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            case 8:
                te60 te60Var = (te60) this.f101860b;
                synchronized (te60Var.f219591c) {
                    try {
                        if (te60Var.f219592d) {
                            return;
                        }
                        Runnable runnable = (Runnable) te60Var.f219591c.pollFirst();
                        te60Var.f219592d = runnable != null;
                        while (runnable != null) {
                            try {
                                runnable.run();
                                synchronized (te60Var.f219591c) {
                                    runnable = (Runnable) te60Var.f219591c.pollFirst();
                                    te60Var.f219592d = runnable != null;
                                }
                            } catch (Throwable th4) {
                                synchronized (te60Var.f219591c) {
                                    te60Var.f219592d = false;
                                    try {
                                        te60Var.f219589a.execute(te60Var.f219590b);
                                        break;
                                    } catch (RejectedExecutionException unused2) {
                                    }
                                    throw th4;
                                }
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            case 9:
                ((NoAnimLauncherActivity) this.f101860b).f5302b = true;
                return;
            case 10:
                tf60 tf60Var = (tf60) this.f101860b;
                if (tf60Var != null) {
                    tf60Var.mo26601e(null);
                    return;
                }
                return;
            case 11:
                jk90 jk90Var = (jk90) this.f101860b;
                if (jk90Var.f113252e) {
                    jk90Var.f113250c.mo33102k(jk90Var);
                    jk90Var.f113252e = false;
                }
                jk90Var.f113254g = null;
                return;
            case 12:
                x0b1.m89550b((ByteArrayInputStream) this.f101860b);
                return;
            case 13:
                Drawable drawable = (r9b0) this.f101860b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            case 14:
                ((eab0) this.f101860b).m38282c();
                return;
            case 15:
                ((MainThreadDisposable) this.f101860b).mo23278a();
                return;
            case 16:
                ((lbd0) this.f101860b).m58659b1();
                return;
            case 17:
                ((kld0) this.f101860b).f123871n = -1;
                return;
            case 18:
                ((umd0) this.f101860b).m83431b();
                return;
            case 19:
                m50464a();
                return;
            case 20:
                try {
                    ((pci0) this.f101860b).f176117c.mo74988m(mjx0.m61998B());
                    return;
                } catch (Exception e) {
                    yif1.m93810s("Error releasing GlObjectsProvider", e);
                    return;
                }
            case 21:
                pci0 pci0Var = (pci0) ((wgb0) this.f101860b).f251018b;
                pci0Var.f176119e.mo40873c(pci0Var.f176134t);
                return;
            case 22:
                m50465b();
                return;
            case 23:
                ((f6p0) this.f101860b).f66477u--;
                return;
            case 24:
                ((g4r0) this.f101860b).m45118n();
                return;
            case 25:
                throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", (Throwable) this.f101860b);
            case 26:
                tgx0.setRippleState$lambda$1((tgx0) this.f101860b);
                return;
            case 27:
                djx0 djx0Var = (djx0) this.f101860b;
                boolean z = djx0Var.f38882c > 0;
                if (djx0Var.f49769M0.compareAndSet(false, true) && z) {
                    c9k c9kVar = djx0Var.f49774Y.f134164a;
                    if (c9kVar != null) {
                        x0h1.m89578u(c9kVar, djx0Var.f49772P0, 0, new pjx0(djx0Var, fbkVar, i), 2);
                        return;
                    } else {
                        wj50.m88260d0("coroutineScope");
                        throw null;
                    }
                }
                return;
            case 28:
                azu0 azu0Var = (azu0) this.f101860b;
                ((phr0) azu0Var.f21690b).m70048f();
                ((ExecutorService) azu0Var.f21691c).execute(new RunnableC2034k(8));
                return;
            default:
                usz0 usz0Var = (usz0) this.f101860b;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(-16777216);
                usz0Var.m83916i(bitmapCreateBitmap);
                return;
        }
    }
}
