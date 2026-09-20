package p204p;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.webkit.WebView;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bb41 extends ljm implements aii {

    /* JADX INFO: renamed from: b */
    public er70 f25429b;

    /* JADX INFO: renamed from: c */
    public er70 f25430c;

    /* JADX INFO: renamed from: d */
    public i4t0 f25431d;

    /* JADX INFO: renamed from: e */
    public er70 f25432e;

    /* JADX INFO: renamed from: f */
    public i4t0 f25433f;

    /* JADX INFO: renamed from: g */
    public final wg61 f25434g = new wg61(new i941(this, 3));

    static {
        ((xy3) qxe.m74116a()).m92398c();
        oxe oxeVarM74116a = qxe.m74116a();
        String string = kgr.f122439a.toString();
        sr4 sr4Var = ((xy3) oxeVarM74116a).f267194g;
        if (sr4Var != null) {
            sr4Var.m79014b("diagnostic_session_id", string);
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String processName;
        xy3 xy3Var = (xy3) qxe.m74116a();
        xy3Var.m92396a("app_init");
        xy3Var.m92400e("application_attach_base_context");
        super.attachBaseContext(context);
        SplitCompat.install(this);
        if (Build.VERSION.SDK_INT >= 28 && (processName = Application.getProcessName()) != null) {
            if (processName.equals(context.getPackageName())) {
                WebView.setDataDirectorySuffix("main_" + Process.myPid());
            } else {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        xy3 xy3Var2 = (xy3) qxe.m74116a();
        if (xy3Var2.f267203p == null) {
            xy3Var2.f267189b.getClass();
            xy3Var2.f267203p = Boolean.valueOf(xo4.m91527a(this));
        }
        xy3Var2.m92396a("application_attach_base_context");
        xy3Var2.m92400e("content_providers_on_create");
    }

    /* JADX INFO: renamed from: c */
    public final dii m28615c() {
        gl8 gl8Var = new gl8(15);
        er70 er70Var = this.f25430c;
        if (er70Var != null) {
            gl8Var.f81018b = new gz70(er70Var);
            return new dii(gl8Var);
        }
        wj50.m88260d0("musicAppWorkerFactory");
        throw null;
    }

    @Override // p204p.ljm, android.app.Application
    public final void onCreate() throws InterruptedException {
        Object obj;
        char c;
        String str;
        xy3 xy3Var = (xy3) qxe.m74116a();
        xy3Var.m92396a("content_providers_on_create");
        xy3Var.m92400e("application_on_create");
        sr4 sr4Var = xy3Var.f267194g;
        int i = 7;
        int i2 = 6;
        int i3 = 8;
        int i4 = 1;
        fbk fbkVar = null;
        if (sr4Var != null) {
            switch (new ActivityManager.RunningAppProcessInfo().importance) {
                case 100:
                    c = 3;
                    break;
                case 125:
                    c = 4;
                    break;
                case 130:
                    c = 7;
                    break;
                case 150:
                    c = '\n';
                    break;
                case 200:
                    c = 11;
                    break;
                case 230:
                    c = 6;
                    break;
                case 300:
                    c = '\b';
                    break;
                case 325:
                    c = '\t';
                    break;
                case 350:
                    c = 2;
                    break;
                case 400:
                    c = 1;
                    break;
                case 1000:
                    c = 5;
                    break;
                default:
                    c = '\f';
                    break;
            }
            switch (c) {
                case 1:
                    str = "IMPORTANCE_CACHED";
                    break;
                case 2:
                    str = "IMPORTANCE_CANT_SAVE_STATE";
                    break;
                case 3:
                    str = "IMPORTANCE_FOREGROUND";
                    break;
                case 4:
                    str = "IMPORTANCE_FOREGROUND_SERVICE";
                    break;
                case 5:
                    str = "IMPORTANCE_GONE";
                    break;
                case 6:
                    str = "IMPORTANCE_PERCEPTIBLE";
                    break;
                case 7:
                    str = "IMPORTANCE_PERCEPTIBLE_PRE_26";
                    break;
                case '\b':
                    str = "IMPORTANCE_SERVICE";
                    break;
                case '\t':
                    str = "IMPORTANCE_TOP_SLEEPING";
                    break;
                case '\n':
                    str = "IMPORTANCE_TOP_SLEEPING_PRE_28";
                    break;
                case 11:
                    str = "IMPORTANCE_VISIBLE";
                    break;
                case '\f':
                    str = "UNKNOWN";
                    break;
                default:
                    throw null;
            }
            sr4Var.m79014b("process_importance", str);
        }
        Logger.m3969e("onCreate", new Object[0]);
        pag1.m69463B(new zu3(this, 17));
        er70 er70Var = this.f25432e;
        if (er70Var == null) {
            wj50.m88260d0("uiVisibleLockManager");
            throw null;
        }
        ky91 ky91Var = (ky91) er70Var.get();
        ((Application) ky91Var.f127766a.getApplicationContext()).registerActivityLifecycleCallbacks(new jy91(ky91Var));
        i4t0 i4t0Var = this.f25431d;
        if (i4t0Var == null) {
            wj50.m88260d0("zeroScopeProvider");
            throw null;
        }
        qgy0 qgy0Var = (qgy0) i4t0Var.get();
        wj50.m88279p(qgy0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        rlv0 rlv0Var = new rlv0();
        iph0 iph0VarM53953f = ((jph0) qgy0Var).m53953f(new sgy0(i4, rlv0Var, countDownLatch), pwv0.f182136b1);
        boolean zAwait = countDownLatch.await(5L, timeUnit);
        iph0VarM53953f.m51278a();
        egz0 bs9Var = (!zAwait || (obj = rlv0Var.f200373a) == null) ? as9.f19355b : new bs9(obj);
        if (bs9Var instanceof bs9) {
            ((m55) ((n55) ((bs9) bs9Var).f30261b)).m60832a();
        } else {
            Logger.m3965a("Zero scope did not enter during Application.onCreate, deferring bootstrap", new Object[0]);
            dm6 dm6Var = dm6.f50428d;
            IllegalStateException illegalStateException = new IllegalStateException("Zero scope did not enter during Application.onCreate, deferring bootstrap");
            dm6Var.getClass();
            n5q n5qVar = xsr.f265651a;
            x0h1.m89578u(qg10.f188337a, tlp.f221498c, 0, new ez4(dm6Var, illegalStateException, fbkVar, i), 2);
            x0h1.m89578u((xuk) this.f25434g.getValue(), null, 0, new v831(qgy0Var, fbkVar, i2), 3);
        }
        xy3 xy3Var2 = (xy3) qxe.m74116a();
        xy3Var2.m92396a("application_on_create");
        if (wj50.m88271j(xy3Var2.f267193f, kmj0.f124171a)) {
            return;
        }
        xy3Var2.m92400e("trace_profiler_started");
        xy3Var2.f267193f.mo56930a(new ey3(xy3Var2, i3));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        er70 er70Var = this.f25429b;
        if (er70Var == null) {
            wj50.m88260d0("memoryLevelObservers");
            throw null;
        }
        Iterator it = ((Iterable) er70Var.get()).iterator();
        while (it.hasNext()) {
            ((rge0) it.next()).mo75485a(i);
        }
    }
}
