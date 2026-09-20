package p204p;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class xc9 extends krg1 {

    /* JADX INFO: renamed from: A */
    public boolean f260130A;

    /* JADX INFO: renamed from: B */
    public boolean f260131B;

    /* JADX INFO: renamed from: C */
    public boolean f260132C;

    /* JADX INFO: renamed from: D */
    public boolean f260133D;

    /* JADX INFO: renamed from: E */
    public final er3 f260134E;

    /* JADX INFO: renamed from: F */
    public final boolean f260135F;

    /* JADX INFO: renamed from: G */
    public final boolean f260136G;

    /* JADX INFO: renamed from: H */
    public volatile md9 f260137H;

    /* JADX INFO: renamed from: I */
    public ExecutorService f260138I;

    /* JADX INFO: renamed from: J */
    public final Long f260139J;

    /* JADX INFO: renamed from: K */
    public final cjf1 f260140K;

    /* JADX INFO: renamed from: e */
    public final String f260143e;

    /* JADX INFO: renamed from: f */
    public final String f260144f;

    /* JADX INFO: renamed from: h */
    public volatile goc1 f260146h;

    /* JADX INFO: renamed from: i */
    public final Context f260147i;

    /* JADX INFO: renamed from: j */
    public final bka1 f260148j;

    /* JADX INFO: renamed from: k */
    public volatile wgf1 f260149k;

    /* JADX INFO: renamed from: l */
    public volatile vlf1 f260150l;

    /* JADX INFO: renamed from: m */
    public boolean f260151m;

    /* JADX INFO: renamed from: n */
    public boolean f260152n;

    /* JADX INFO: renamed from: p */
    public boolean f260154p;

    /* JADX INFO: renamed from: q */
    public boolean f260155q;

    /* JADX INFO: renamed from: r */
    public boolean f260156r;

    /* JADX INFO: renamed from: s */
    public boolean f260157s;

    /* JADX INFO: renamed from: t */
    public boolean f260158t;

    /* JADX INFO: renamed from: u */
    public boolean f260159u;

    /* JADX INFO: renamed from: v */
    public boolean f260160v;

    /* JADX INFO: renamed from: w */
    public boolean f260161w;

    /* JADX INFO: renamed from: x */
    public boolean f260162x;

    /* JADX INFO: renamed from: y */
    public boolean f260163y;

    /* JADX INFO: renamed from: z */
    public boolean f260164z;

    /* JADX INFO: renamed from: c */
    public final Object f260141c = new Object();

    /* JADX INFO: renamed from: d */
    public volatile int f260142d = 0;

    /* JADX INFO: renamed from: g */
    public final Handler f260145g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o */
    public int f260153o = 0;

    public xc9(er3 er3Var, Context context, tvx0 tvx0Var, fc9 fc9Var) {
        long jNextLong = new Random().nextLong();
        this.f260139J = Long.valueOf(jNextLong);
        this.f260140K = kjf1.f123361a;
        this.f260143e = "8.3.0";
        String strM90363u = m90363u();
        this.f260144f = strM90363u;
        this.f260147i = context.getApplicationContext();
        ugg1 ugg1VarM96097z = zgg1.m96097z();
        ugg1VarM96097z.m43489d();
        zgg1.m96095x((zgg1) ugg1VarM96097z.f76214b);
        if (strM90363u != null) {
            ugg1VarM96097z.m43489d();
            zgg1.m96096y((zgg1) ugg1VarM96097z.f76214b, strM90363u);
        }
        String packageName = this.f260147i.getPackageName();
        ugg1VarM96097z.m43489d();
        zgg1.m96088q((zgg1) ugg1VarM96097z.f76214b, packageName);
        ugg1VarM96097z.m43489d();
        zgg1.m96085D((zgg1) ugg1VarM96097z.f76214b, jNextLong);
        boolean z = fc9Var.f68034d;
        ugg1VarM96097z.m43489d();
        zgg1.m96094w((zgg1) ugg1VarM96097z.f76214b, z);
        int i = Build.VERSION.SDK_INT;
        ugg1VarM96097z.m43489d();
        zgg1.m96082A((zgg1) ugg1VarM96097z.f76214b, i);
        ugg1VarM96097z.m83041e();
        m90359M(ugg1VarM96097z, context);
        try {
            int i2 = this.f260147i.getPackageManager().getPackageInfo(this.f260147i.getPackageName(), 0).versionCode;
            ugg1VarM96097z.m43489d();
            zgg1.m96083B((zgg1) ugg1VarM96097z.f76214b, i2);
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
        this.f260148j = new bka1(this.f260147i, (zgg1) ugg1VarM96097z.m43487b());
        if (tvx0Var == null) {
            int i3 = mmf1.f145137a;
            Log.isLoggable("BillingClient", 5);
        }
        this.f260146h = new goc1(this.f260147i, tvx0Var, this.f260148j);
        this.f260134E = er3Var;
        this.f260136G = false;
        this.f260147i.getPackageName();
        this.f260135F = fc9Var.f68034d;
    }

    /* JADX INFO: renamed from: M */
    public static final void m90359M(ugg1 ugg1Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                ugg1Var.m43489d();
                zgg1.m96093v((zgg1) ugg1Var.f76214b, i);
                String str = Build.BRAND;
                ugg1Var.m43489d();
                zgg1.m96089r((zgg1) ugg1Var.f76214b);
                String str2 = Build.MODEL;
                ugg1Var.m43489d();
                zgg1.m96092u((zgg1) ugg1Var.f76214b);
                String str3 = Build.MANUFACTURER;
                ugg1Var.m43489d();
                zgg1.m96091t((zgg1) ugg1Var.f76214b);
                String str4 = Build.FINGERPRINT;
                ugg1Var.m43489d();
                zgg1.m96090s((zgg1) ugg1Var.f76214b);
            }
        } catch (RuntimeException unused) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: U */
    public static Bundle m90360U(xc9 xc9Var, String str, String str2) {
        Bundle bundleM62309c;
        wgf1 wgf1Var;
        try {
            synchronized (xc9Var.f260141c) {
                wgf1Var = xc9Var.f260149k;
            }
            if (wgf1Var == null) {
                return mmf1.m62309c(esf1.f62364h, Error.TOO_YOUNG_FIELD_NUMBER);
            }
            return ((ngf1) wgf1Var).m64383k2(xc9Var.f260147i.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            ye9 ye9Var = esf1.f62364h;
            String strM33737a = crf1.m33737a(e);
            bundleM62309c = mmf1.m62309c(ye9Var, 5);
            if (strM33737a != null) {
                bundleM62309c.putString("ADDITIONAL_LOG_DETAILS", strM33737a);
            }
            return bundleM62309c;
        } catch (Exception e2) {
            ye9 ye9Var2 = esf1.f62362f;
            String strM33737a2 = crf1.m33737a(e2);
            bundleM62309c = mmf1.m62309c(ye9Var2, 5);
            if (strM33737a2 != null) {
                bundleM62309c.putString("ADDITIONAL_LOG_DETAILS", strM33737a2);
            }
            return bundleM62309c;
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m90361W(xc9 xc9Var, b9v0 b9v0Var) {
        wgf1 wgf1Var;
        xc9Var.getClass();
        try {
            if (!xc9Var.m90376K()) {
                int i = mmf1.f145137a;
                Log.isLoggable("BillingClient", 5);
                ye9 ye9Var = esf1.f62364h;
                xc9Var.m90380P(2, 13, ye9Var);
                b9v0Var.m28543f(ye9Var);
                return;
            }
            if (!xc9Var.f260162x) {
                int i2 = mmf1.f145137a;
                Log.isLoggable("BillingClient", 5);
                ye9 ye9Var2 = esf1.f62379w;
                xc9Var.m90380P(32, 13, ye9Var2);
                b9v0Var.m28543f(ye9Var2);
                return;
            }
            synchronized (xc9Var.f260141c) {
                wgf1Var = xc9Var.f260149k;
            }
            if (wgf1Var == null) {
                xc9Var.m90388v(b9v0Var, esf1.f62364h, Error.TOO_YOUNG_FIELD_NUMBER, null);
                return;
            }
            String packageName = xc9Var.f260147i.getPackageName();
            String str = xc9Var.f260143e;
            String str2 = xc9Var.f260144f;
            long jLongValue = xc9Var.f260139J.longValue();
            int i3 = mmf1.f145137a;
            Bundle bundle = new Bundle();
            mmf1.m62308b(jLongValue, str, str2, bundle);
            ((ngf1) wgf1Var).m64388p2(packageName, bundle, new dnf1(b9v0Var, xc9Var.f260148j, xc9Var.f260153o));
        } catch (DeadObjectException e) {
            xc9Var.m90388v(b9v0Var, esf1.f62364h, 62, e);
        } catch (Exception e2) {
            xc9Var.m90388v(b9v0Var, esf1.f62362f, 62, e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static Future m90362s(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new wpa1(10, futureSubmit, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            mmf1.m62315i("BillingClient");
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m90363u() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m90364w(xc9 xc9Var, int i) {
        xc9Var.f260153o = i;
        xc9Var.f260133D = i >= 26;
        xc9Var.f260132C = i >= 24;
        xc9Var.f260131B = i >= 23;
        xc9Var.f260130A = i >= 21;
        xc9Var.f260164z = i >= 20;
        xc9Var.f260163y = i >= 19;
        xc9Var.f260162x = i >= 18;
        xc9Var.f260161w = i >= 17;
        xc9Var.f260160v = i >= 16;
        xc9Var.f260159u = i >= 15;
        xc9Var.f260158t = i >= 14;
        xc9Var.f260157s = i >= 12;
        xc9Var.f260156r = i >= 9;
        xc9Var.f260155q = i >= 8;
        xc9Var.f260154p = i >= 6;
    }

    /* JADX INFO: renamed from: x */
    public static void m90365x(xc9 xc9Var, int i) throws Throwable {
        if (i != 0) {
            xc9Var.m90372G(0);
            return;
        }
        synchronized (xc9Var.f260141c) {
            try {
                if (xc9Var.f260142d == 3) {
                    return;
                }
                xc9Var.m90372G(2);
                goc1 goc1Var = xc9Var.f260146h != null ? xc9Var.f260146h : null;
                if (goc1Var != null) {
                    boolean z = xc9Var.f260130A;
                    x6f1 x6f1Var = (x6f1) goc1Var.f82942e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    goc1Var.f82938a = z;
                    x6f1 x6f1Var2 = (x6f1) goc1Var.f82943f;
                    Context context = (Context) goc1Var.f82939b;
                    x6f1Var2.m90087a(context, intentFilter2);
                    if (goc1Var.f82938a) {
                        x6f1Var.m90088b(context, intentFilter);
                    } else {
                        x6f1Var.m90087a(context, intentFilter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final ye9 m90366A(int i) {
        mmf1.m62313g("BillingClient", "Service connection is valid. No need to re-initialize.");
        oeg1 oeg1VarM35888q = dfg1.m35888q();
        oeg1VarM35888q.m43489d();
        dfg1.m35887p((dfg1) oeg1VarM35888q.f76214b, 6);
        gkg1 gkg1VarM59276p = lkg1.m59276p();
        gkg1VarM59276p.m43489d();
        lkg1.m59281u((lkg1) gkg1VarM59276p.f76214b);
        gkg1VarM59276p.m45076e(i > 0);
        gkg1VarM59276p.m45077g(i);
        oeg1VarM35888q.m43489d();
        dfg1.m35892v((dfg1) oeg1VarM35888q.f76214b, (lkg1) gkg1VarM59276p.m43487b());
        m90370E((dfg1) oeg1VarM35888q.m43487b());
        return esf1.f62363g;
    }

    /* JADX INFO: renamed from: B */
    public final ye9 m90367B() {
        int[] iArr = {0, 3};
        synchronized (this.f260141c) {
            for (int i = 0; i < 2; i++) {
                if (this.f260142d == iArr[i]) {
                    return esf1.f62364h;
                }
            }
            return esf1.f62362f;
        }
    }

    /* JADX INFO: renamed from: C */
    public final dsf1 m90368C(int i) {
        if (this.f260135F && !m90377L()) {
            return kvf1.m57483u(new t9w0(this, i, 10));
        }
        mmf1.m62313g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new vrf1(esf1.f62363g);
    }

    /* JADX INFO: renamed from: D */
    public final void m90369D(leg1 leg1Var) {
        try {
            this.f260148j.m29665q(leg1Var, this.f260153o);
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m90370E(dfg1 dfg1Var) {
        try {
            bka1 bka1Var = this.f260148j;
            int i = this.f260153o;
            bka1Var.getClass();
            try {
                ugg1 ugg1Var = (ugg1) ((zgg1) bka1Var.f27887b).m74651l();
                ugg1Var.m43489d();
                zgg1.m96084C((zgg1) ugg1Var.f76214b, i);
                zgg1 zgg1Var = (zgg1) ugg1Var.m43487b();
                bka1Var.f27887b = zgg1Var;
                try {
                    bka1Var.m29671w(dfg1Var, zgg1Var);
                } catch (Throwable unused) {
                    mmf1.m62315i("BillingLogger");
                }
            } catch (Throwable unused2) {
                mmf1.m62315i("BillingLogger");
            }
        } catch (Throwable unused3) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m90371F(int i, int i2, ye9 ye9Var) {
        try {
            int i3 = crf1.f41290a;
            eeg1 eeg1Var = (eeg1) crf1.m33738b(i, 6, ye9Var, null, hgg1.BROADCAST_ACTION_UNSPECIFIED).m74651l();
            gkg1 gkg1VarM59276p = lkg1.m59276p();
            gkg1VarM59276p.m45076e(i2 > 0);
            gkg1VarM59276p.m45077g(i2);
            eeg1Var.m38659g(gkg1VarM59276p);
            m90369D((leg1) eeg1Var.m43487b());
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m90372G(int i) {
        String str;
        String str2;
        synchronized (this.f260141c) {
            try {
                if (this.f260142d == 3) {
                    return;
                }
                int i2 = this.f260142d;
                if (i2 == 0) {
                    str = "DISCONNECTED";
                } else if (i2 != 1) {
                    str = i2 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                mmf1.m62313g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f260142d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m90373H(md9 md9Var, int i) {
        int i2;
        ye9 ye9VarM90366A;
        ye9 ye9Var;
        synchronized (this.f260141c) {
            try {
                if (m90377L()) {
                    ye9VarM90366A = m90366A(i);
                } else {
                    if (this.f260142d == 1) {
                        int i3 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62359c;
                        m90371F(37, i, ye9Var);
                    } else if (this.f260142d == 3) {
                        int i4 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62364h;
                        m90371F(38, i, ye9Var);
                    } else {
                        m90372G(1);
                        if (i == 0) {
                            this.f260137H = md9Var;
                            i = 0;
                        }
                        m90374I();
                        mmf1.m62313g("BillingClient", "Starting in-app billing setup.");
                        this.f260150l = new vlf1(this, md9Var, i);
                        vlf1 vlf1Var = this.f260150l;
                        synchronized (vlf1Var.f242488e.f260141c) {
                            ikf1 ikf1Var = vlf1Var.f242485b;
                            ikf1Var.f103117c = 0L;
                            ikf1Var.f103116b = false;
                            ikf1Var.m50948a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f260147i.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f260143e);
                                    synchronized (this.f260141c) {
                                        try {
                                            if (this.f260142d == 2) {
                                                ye9VarM90366A = m90366A(i);
                                            } else if (this.f260142d != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                ye9Var = esf1.f62364h;
                                                m90371F(105, i, ye9Var);
                                            } else {
                                                vlf1 vlf1Var2 = this.f260150l;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.f260147i.bindService(intent2, vlf1Var2, 1) : this.f260147i.bindService(intent2, 1, m90386r(), vlf1Var2)) {
                                                    mmf1.m62313g("BillingClient", "Service was bonded successfully.");
                                                    ye9VarM90366A = null;
                                                } else {
                                                    Log.isLoggable("BillingClient", 5);
                                                    i2 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        m90372G(0);
                        mmf1.m62313g("BillingClient", "Billing service unavailable on device.");
                        ye9 ye9Var2 = esf1.f62357a;
                        m90371F(i2, i, ye9Var2);
                        ye9VarM90366A = ye9Var2;
                    }
                    ye9VarM90366A = ye9Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (ye9VarM90366A != null) {
            md9Var.mo42511f(ye9VarM90366A);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m90374I() {
        synchronized (this.f260141c) {
            if (this.f260150l != null) {
                try {
                    try {
                        this.f260147i.unbindService(this.f260150l);
                        this.f260149k = null;
                        this.f260150l = null;
                    } catch (Throwable th) {
                        this.f260149k = null;
                        this.f260150l = null;
                        throw th;
                    }
                } catch (Throwable unused) {
                    mmf1.m62315i("BillingClient");
                    this.f260149k = null;
                    this.f260150l = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m90375J() {
        try {
            int i = ((ye9) m90368C(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).f271939a;
            if (i == 0) {
                mmf1.m62313g("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                int i2 = mmf1.f145137a;
                Log.isLoggable("BillingClient", 5);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            mmf1.m62315i("BillingClient");
        }
        return m90377L();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m90376K() {
        cjf1 cjf1Var = this.f260140K;
        if (cjf1Var == null) {
            throw new NullPointerException("ticker");
        }
        long jM32986K = cjf1Var.m32986K();
        long j = 30000;
        int i = 1;
        long jConvert = 30000;
        while (i <= 3) {
            try {
                long jMax = Math.max(0L, jConvert);
                if (jMax <= 0) {
                    int i2 = mmf1.f145137a;
                    Log.isLoggable("BillingClient", 5);
                    return m90377L();
                }
                int i3 = ((ye9) m90368C(i).get(jMax, TimeUnit.MILLISECONDS)).f271939a;
                if (i3 == 0) {
                    mmf1.m62313g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return m90377L();
                }
                int i4 = mmf1.f145137a;
                Log.isLoggable("BillingClient", 5);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jM32986K2 = (cjf1Var.m32986K() - jM32986K) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j - timeUnit.convert(jM32986K2, timeUnit2);
                long j2 = j;
                long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (jConvert < jPow) {
                    Log.isLoggable("BillingClient", 5);
                    return m90377L();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j2 - timeUnit.convert((cjf1Var.m32986K() - jM32986K) + 0, timeUnit2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        mmf1.m62315i("BillingClient");
                    }
                }
                i++;
                j = j2;
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                mmf1.m62315i("BillingClient");
            }
        }
        int i5 = mmf1.f145137a;
        Log.isLoggable("BillingClient", 5);
        return m90377L();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m90377L() {
        boolean z;
        synchronized (this.f260141c) {
            try {
                z = false;
                if (this.f260142d == 2 && this.f260149k != null && this.f260150l != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: N */
    public final y3d1 m90378N(ye9 ye9Var, int i, Exception exc) {
        m90382R(i, 9, ye9Var, crf1.m33737a(exc));
        mmf1.m62315i("BillingClient");
        return new y3d1(ye9Var, null, false, 16);
    }

    /* JADX INFO: renamed from: O */
    public final void m90379O(int i, int i2, ye9 ye9Var) {
        dfg1 dfg1Var = null;
        leg1 leg1Var = null;
        if (ye9Var.f271939a == 0) {
            int i3 = crf1.f41290a;
            try {
                oeg1 oeg1VarM35888q = dfg1.m35888q();
                oeg1VarM35888q.m43489d();
                dfg1.m35887p((dfg1) oeg1VarM35888q.f76214b, 5);
                jhg1 jhg1VarM78137p = shg1.m78137p();
                jhg1VarM78137p.m43489d();
                shg1.m78138q((shg1) jhg1VarM78137p.f76214b, i2);
                shg1 shg1Var = (shg1) jhg1VarM78137p.m43487b();
                oeg1VarM35888q.m43489d();
                dfg1.m35890t((dfg1) oeg1VarM35888q.f76214b, shg1Var);
                dfg1Var = (dfg1) oeg1VarM35888q.m43487b();
            } catch (Exception unused) {
                mmf1.m62315i("BillingLogger");
            }
            m90370E(dfg1Var);
            return;
        }
        int i4 = crf1.f41290a;
        try {
            eeg1 eeg1VarM58784s = leg1.m58784s();
            hfg1 hfg1VarM80671q = tfg1.m80671q();
            int i5 = ye9Var.f271939a;
            hfg1VarM80671q.m43489d();
            tfg1.m80670p((tfg1) hfg1VarM80671q.f76214b, i5);
            String str = ye9Var.f271941c;
            hfg1VarM80671q.m43489d();
            tfg1.m80673s((tfg1) hfg1VarM80671q.f76214b, str);
            hfg1VarM80671q.m47340e(i);
            eeg1VarM58784s.m38658e(hfg1VarM80671q);
            eeg1VarM58784s.m38660h(5);
            jhg1 jhg1VarM78137p2 = shg1.m78137p();
            jhg1VarM78137p2.m43489d();
            shg1.m78138q((shg1) jhg1VarM78137p2.f76214b, i2);
            shg1 shg1Var2 = (shg1) jhg1VarM78137p2.m43487b();
            eeg1VarM58784s.m43489d();
            leg1.m58788x((leg1) eeg1VarM58784s.f76214b, shg1Var2);
            leg1Var = (leg1) eeg1VarM58784s.m43487b();
        } catch (Exception unused2) {
            mmf1.m62315i("BillingLogger");
        }
        m90369D(leg1Var);
    }

    /* JADX INFO: renamed from: P */
    public final void m90380P(int i, int i2, ye9 ye9Var) {
        try {
            int i3 = crf1.f41290a;
            m90369D(crf1.m33738b(i, i2, ye9Var, null, hgg1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m90381Q(int i, ye9 ye9Var, long j) {
        try {
            int i2 = crf1.f41290a;
            try {
                this.f260148j.m29666r(crf1.m33738b(i, 2, ye9Var, null, hgg1.BROADCAST_ACTION_UNSPECIFIED), this.f260153o, j);
            } catch (Throwable unused) {
                mmf1.m62315i("BillingClient");
            }
        } catch (Throwable unused2) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m90382R(int i, int i2, ye9 ye9Var, String str) {
        try {
            int i3 = crf1.f41290a;
            m90369D(crf1.m33738b(i, i2, ye9Var, str, hgg1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m90383S(int i, ye9 ye9Var, long j, boolean z) {
        try {
            int i2 = crf1.f41290a;
            try {
                this.f260148j.m29668t(crf1.m33738b(i, 2, ye9Var, null, hgg1.BROADCAST_ACTION_UNSPECIFIED), this.f260153o, j, z);
            } catch (Throwable unused) {
                mmf1.m62315i("BillingClient");
            }
        } catch (Throwable unused2) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m90384T(int i, ye9 ye9Var, String str, long j, boolean z) {
        try {
            int i2 = crf1.f41290a;
            try {
                this.f260148j.m29668t(crf1.m33738b(i, 2, ye9Var, str, hgg1.BROADCAST_ACTION_UNSPECIFIED), this.f260153o, j, z);
            } catch (Throwable unused) {
                mmf1.m62315i("BillingClient");
            }
        } catch (Throwable unused2) {
            mmf1.m62315i("BillingClient");
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m90385V(ye9 ye9Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.f260145g.post(new wpa1(9, this, ye9Var));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x0047, B:19:0x004b), top: B:39:0x0047, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public void mo88749n() {
        ExecutorService executorService;
        try {
            int i = crf1.f41290a;
            m90370E(crf1.m33739c(12, hgg1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
        synchronized (this.f260141c) {
            try {
                if (this.f260146h != null) {
                    goc1 goc1Var = this.f260146h;
                    x6f1 x6f1Var = (x6f1) goc1Var.f82942e;
                    Context context = (Context) goc1Var.f82939b;
                    x6f1Var.m90089c(context);
                    ((x6f1) goc1Var.f82943f).m90089c(context);
                    try {
                        mmf1.m62313g("BillingClient", "Unbinding from service.");
                        m90374I();
                    } catch (Throwable unused2) {
                        mmf1.m62315i("BillingClient");
                    }
                    try {
                        synchronized (this) {
                            try {
                                executorService = this.f260138I;
                                if (executorService != null) {
                                    executorService.shutdownNow();
                                    this.f260138I = null;
                                }
                            } catch (Throwable th) {
                                m90372G(3);
                                this.f260137H = null;
                                throw th;
                            }
                        }
                    } catch (Throwable unused3) {
                        mmf1.m62315i("BillingClient");
                    }
                    m90372G(3);
                    this.f260137H = null;
                } else {
                    mmf1.m62313g("BillingClient", "Unbinding from service.");
                    m90374I();
                    synchronized (this) {
                        executorService = this.f260138I;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f260138I = null;
                        }
                        m90372G(3);
                        this.f260137H = null;
                    }
                }
            } catch (Throwable unused4) {
                mmf1.m62315i("BillingClient");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x03b7 A[EDGE_INSN: B:176:0x03b7->B:127:0x02ae BREAK  A[LOOP:6: B:148:0x0336->B:444:0x0336]] */
    /* JADX WARN: Code duplicated, block: B:179:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:185:0x040f  */
    /* JADX WARN: Code duplicated, block: B:188:0x041e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0431  */
    /* JADX WARN: Code duplicated, block: B:194:0x0440  */
    /* JADX WARN: Code duplicated, block: B:197:0x045e  */
    /* JADX WARN: Code duplicated, block: B:200:0x046f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0477  */
    /* JADX WARN: Code duplicated, block: B:204:0x0486  */
    /* JADX WARN: Code duplicated, block: B:207:0x0498  */
    /* JADX WARN: Code duplicated, block: B:209:0x049f  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:213:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:221:0x0544  */
    /* JADX WARN: Code duplicated, block: B:222:0x0546  */
    /* JADX WARN: Code duplicated, block: B:223:0x0549  */
    /* JADX WARN: Code duplicated, block: B:224:0x054c  */
    /* JADX WARN: Code duplicated, block: B:225:0x054e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0550  */
    /* JADX WARN: Code duplicated, block: B:227:0x0552  */
    /* JADX WARN: Code duplicated, block: B:228:0x0554  */
    /* JADX WARN: Code duplicated, block: B:232:0x0570  */
    /* JADX WARN: Code duplicated, block: B:235:0x0593  */
    /* JADX WARN: Code duplicated, block: B:237:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:239:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:242:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:244:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:246:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:248:0x0601  */
    /* JADX WARN: Code duplicated, block: B:250:0x0606  */
    /* JADX WARN: Code duplicated, block: B:253:0x0637  */
    /* JADX WARN: Code duplicated, block: B:255:0x0649  */
    /* JADX WARN: Code duplicated, block: B:271:0x068f A[PHI: r4
      0x068f: PHI (r4v32 long) = (r4v31 long), (r4v31 long), (r4v31 long), (r4v35 long) binds: [B:257:0x0657, B:259:0x065b, B:261:0x0661, B:421:0x068f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0699  */
    /* JADX WARN: Code duplicated, block: B:276:0x069e  */
    /* JADX WARN: Code duplicated, block: B:280:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:283:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:286:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:289:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:298:0x072c  */
    /* JADX WARN: Code duplicated, block: B:300:0x073e  */
    /* JADX WARN: Code duplicated, block: B:303:0x0746  */
    /* JADX WARN: Code duplicated, block: B:306:0x0751  */
    /* JADX WARN: Code duplicated, block: B:307:0x0758  */
    /* JADX WARN: Code duplicated, block: B:309:0x0764  */
    /* JADX WARN: Code duplicated, block: B:319:0x0797  */
    /* JADX WARN: Code duplicated, block: B:321:0x079b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:326:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:328:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:346:0x0804 A[Catch: Exception -> 0x07ed, CancellationException -> 0x07f0, TimeoutException -> 0x07f3, TryCatch #9 {CancellationException -> 0x07f0, TimeoutException -> 0x07f3, Exception -> 0x07ed, blocks: (B:332:0x07e6, B:346:0x0804, B:348:0x0820, B:374:0x0893, B:370:0x087c, B:361:0x0851, B:382:0x08a1), top: B:408:0x07dd }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0820 A[Catch: Exception -> 0x07ed, CancellationException -> 0x07f0, TimeoutException -> 0x07f3, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x07f0, TimeoutException -> 0x07f3, Exception -> 0x07ed, blocks: (B:332:0x07e6, B:346:0x0804, B:348:0x0820, B:374:0x0893, B:370:0x087c, B:361:0x0851, B:382:0x08a1), top: B:408:0x07dd }] */
    /* JADX WARN: Code duplicated, block: B:350:0x082e  */
    /* JADX WARN: Code duplicated, block: B:353:0x0839  */
    /* JADX WARN: Code duplicated, block: B:354:0x083a A[Catch: all -> 0x084a, TryCatch #6 {all -> 0x084a, blocks: (B:351:0x0831, B:354:0x083a, B:356:0x083e, B:359:0x084c), top: B:396:0x0831 }] */
    /* JADX WARN: Code duplicated, block: B:356:0x083e A[Catch: all -> 0x084a, TryCatch #6 {all -> 0x084a, blocks: (B:351:0x0831, B:354:0x083a, B:356:0x083e, B:359:0x084c), top: B:396:0x0831 }] */
    /* JADX WARN: Code duplicated, block: B:359:0x084c A[Catch: all -> 0x084a, TRY_LEAVE, TryCatch #6 {all -> 0x084a, blocks: (B:351:0x0831, B:354:0x083a, B:356:0x083e, B:359:0x084c), top: B:396:0x0831 }] */
    /* JADX WARN: Code duplicated, block: B:363:0x0865  */
    /* JADX WARN: Code duplicated, block: B:366:0x086b  */
    /* JADX WARN: Code duplicated, block: B:382:0x08a1 A[Catch: Exception -> 0x07ed, CancellationException -> 0x07f0, TimeoutException -> 0x07f3, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x07f0, TimeoutException -> 0x07f3, Exception -> 0x07ed, blocks: (B:332:0x07e6, B:346:0x0804, B:348:0x0820, B:374:0x0893, B:370:0x087c, B:361:0x0851, B:382:0x08a1), top: B:408:0x07dd }] */
    /* JADX WARN: Code duplicated, block: B:396:0x0831 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0870 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x06b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [p.xc9] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p.djr0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p.djr0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r7v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v34, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:391:0x08f9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: o */
    public p204p.ye9 mo88750o(android.app.Activity r33, final p204p.i82 r34) {
        /*
            Method dump skipped, instruction units count: 2328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.xc9.mo88750o(android.app.Activity, p.i82):p.ye9");
    }

    /* JADX INFO: renamed from: p */
    public void mo88751p(n9r0 n9r0Var, gjv0 gjv0Var) {
        mc9 mc9Var = new mc9(this, gjv0Var, n9r0Var, 14);
        int i = 12;
        if (m90362s(mc9Var, 30000L, new vpa1(i, this, gjv0Var), m90389y(), m90386r()) == null) {
            ye9 ye9VarM90367B = m90367B();
            m90380P(25, 7, ye9VarM90367B);
            mlf1 mlf1Var = tlf1.f221461b;
            mnf1 mnf1Var = mnf1.f145422e;
            gjv0Var.m44973n(ye9VarM90367B, new aaq0(i, mnf1Var, mnf1Var));
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo88752q(frv0 frv0Var) {
        m90373H(frv0Var, 0);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized ExecutorService m90386r() {
        try {
            if (this.f260138I == null) {
                this.f260138I = Executors.newFixedThreadPool(mmf1.f145137a, new kkf1(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f260138I;
    }

    /* JADX INFO: renamed from: t */
    public final void m90387t() {
        if (TextUtils.isEmpty(null)) {
            this.f260147i.getPackageName();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m90388v(b9v0 b9v0Var, ye9 ye9Var, int i, Exception exc) {
        mmf1.m62315i("BillingClient");
        m90382R(i, 13, ye9Var, crf1.m33737a(exc));
        b9v0Var.m28543f(ye9Var);
    }

    /* JADX INFO: renamed from: y */
    public final Handler m90389y() {
        return Looper.myLooper() == null ? this.f260145g : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: z */
    public final yvz0 m90390z(ye9 ye9Var, int i, Exception exc) {
        mmf1.m62315i("BillingClient");
        m90382R(i, 7, ye9Var, crf1.m33737a(exc));
        return new yvz0(ye9Var.f271939a, ye9Var.f271941c, new ArrayList(), new ArrayList());
    }

    public xc9(er3 er3Var, Context context, fc9 fc9Var) {
        long jNextLong = new Random().nextLong();
        this.f260139J = Long.valueOf(jNextLong);
        this.f260140K = kjf1.f123361a;
        this.f260143e = "8.3.0";
        String strM90363u = m90363u();
        this.f260144f = strM90363u;
        this.f260147i = context.getApplicationContext();
        ugg1 ugg1VarM96097z = zgg1.m96097z();
        ugg1VarM96097z.m43489d();
        zgg1.m96095x((zgg1) ugg1VarM96097z.f76214b);
        if (strM90363u != null) {
            ugg1VarM96097z.m43489d();
            zgg1.m96096y((zgg1) ugg1VarM96097z.f76214b, strM90363u);
        }
        String packageName = this.f260147i.getPackageName();
        ugg1VarM96097z.m43489d();
        zgg1.m96088q((zgg1) ugg1VarM96097z.f76214b, packageName);
        ugg1VarM96097z.m43489d();
        zgg1.m96085D((zgg1) ugg1VarM96097z.f76214b, jNextLong);
        boolean z = fc9Var.f68034d;
        ugg1VarM96097z.m43489d();
        zgg1.m96094w((zgg1) ugg1VarM96097z.f76214b, z);
        int i = Build.VERSION.SDK_INT;
        ugg1VarM96097z.m43489d();
        zgg1.m96082A((zgg1) ugg1VarM96097z.f76214b, i);
        ugg1VarM96097z.m83041e();
        m90359M(ugg1VarM96097z, context);
        try {
            int i2 = this.f260147i.getPackageManager().getPackageInfo(this.f260147i.getPackageName(), 0).versionCode;
            ugg1VarM96097z.m43489d();
            zgg1.m96083B((zgg1) ugg1VarM96097z.f76214b, i2);
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
        this.f260148j = new bka1(this.f260147i, (zgg1) ugg1VarM96097z.m43487b());
        int i3 = mmf1.f145137a;
        Log.isLoggable("BillingClient", 5);
        this.f260146h = new goc1(this.f260147i, null, this.f260148j);
        this.f260134E = er3Var;
        this.f260147i.getPackageName();
        this.f260135F = fc9Var.f68034d;
    }
}
