package p204p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class kc60 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: L0 */
    public long f121376L0;

    /* JADX INFO: renamed from: M0 */
    public long f121377M0;

    /* JADX INFO: renamed from: N0 */
    public long f121378N0;

    /* JADX INFO: renamed from: O0 */
    public long f121379O0;

    /* JADX INFO: renamed from: X */
    public boolean f121380X;

    /* JADX INFO: renamed from: Y */
    public long f121381Y;

    /* JADX INFO: renamed from: Z */
    public long f121382Z;

    /* JADX INFO: renamed from: a */
    public final efy f121383a;

    /* JADX INFO: renamed from: b */
    public final csy f121384b;

    /* JADX INFO: renamed from: c */
    public final gh00 f121385c;

    /* JADX INFO: renamed from: d */
    public final Object f121386d;

    /* JADX INFO: renamed from: e */
    public final Object f121387e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f121388f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f121389g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f121390h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f121391i;

    /* JADX INFO: renamed from: t */
    public boolean f121392t;

    public kc60() {
        efy efyVar = efy.f59155Z;
        csy csyVar = new csy(28);
        if50 if50Var = if50.f101673c1;
        this.f121383a = efyVar;
        this.f121384b = csyVar;
        this.f121385c = if50Var;
        this.f121386d = new Object();
        this.f121387e = new Object();
        this.f121388f = new LinkedHashMap();
        this.f121389g = new LinkedHashSet();
        this.f121390h = new LinkedHashSet();
        this.f121391i = new ArrayList();
        this.f121379O0 = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public static final dc60 m56012a(kc60 kc60Var, List list) {
        return new dc60(g6f.m43728j1(kc60Var.f121390h), list);
    }

    /* JADX INFO: renamed from: b */
    public static final List m56013b(kc60 kc60Var) {
        kc60Var.f121380X = false;
        ArrayList arrayList = kc60Var.f121391i;
        if (arrayList.isEmpty()) {
            return lau.f131415a;
        }
        List listM43711Y0 = g6f.m43711Y0(arrayList, new kxy(8));
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
        Iterator it = listM43711Y0.iterator();
        while (it.hasNext()) {
            arrayList2.add(kc60Var.m56014c((ec60) it.next()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public final lc60 m56014c(ec60 ec60Var) {
        if (ec60Var.f58238d) {
            this.f121382Z++;
            this.f121376L0 += ec60Var.f58236b;
        } else {
            this.f121377M0++;
            this.f121378N0 += ec60Var.f58236b;
        }
        long j = ec60Var.f58235a;
        hvi0 hvi0Var = cks.f39079b;
        return new lc60(j, jwg1.m54450E(ec60Var.f58236b, ils.NANOSECONDS), ec60Var.f58238d, ec60Var.f58237c);
    }

    /* JADX INFO: renamed from: d */
    public final tv4 m56015d(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        Window window = activity.getWindow();
        ndy ndyVar = new ndy(27, this, decorView);
        this.f121383a.getClass();
        tv4 tv4Var = new tv4(new pc60(window, ndyVar));
        tv4Var.m81603a(false);
        return tv4Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m56016e(eh00 eh00Var) {
        dc60 dc60Var;
        synchronized (this.f121386d) {
            try {
                synchronized (this.f121387e) {
                    dc60Var = (dc60) eh00Var.invoke();
                }
                if (dc60Var == null) {
                    return;
                }
                for (lc60 lc60Var : dc60Var.f47440b) {
                    Iterator it = dc60Var.f47439a.iterator();
                    while (it.hasNext()) {
                        ((kol0) it.next()).m57002a(lc60Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56017f(boolean z) {
        synchronized (this.f121387e) {
            if (z == this.f121392t) {
                return;
            }
            this.f121392t = z;
            ((Handler) this.f121384b.f41718b).postDelayed(new z04(1, new jc60(this, 0)), 0L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m56016e(new gc60(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        tv4 tv4Var;
        synchronized (this.f121387e) {
            this.f121389g.add(activity);
            z = this.f121392t && this.f121388f.get(activity) == null;
        }
        if (!z) {
            synchronized (this.f121387e) {
                if (this.f121392t && (tv4Var = (tv4) this.f121388f.get(activity)) != null) {
                    tv4Var.m81603a(true);
                }
            }
            return;
        }
        tv4 tv4VarM56015d = m56015d(activity);
        synchronized (this.f121387e) {
            try {
                tv4 tv4Var2 = (tv4) this.f121388f.get(activity);
                if (tv4Var2 != null) {
                    tv4VarM56015d.m81603a(false);
                    if (this.f121392t) {
                        tv4Var2.m81603a(true);
                    }
                } else {
                    this.f121388f.put(activity, tv4VarM56015d);
                    if (this.f121392t) {
                        tv4VarM56015d.m81603a(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m56016e(new gc60(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
