package p204p;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mir0 {

    /* JADX INFO: renamed from: b */
    public final Context f144080b;

    /* JADX INFO: renamed from: c */
    public final dii f144081c;

    /* JADX INFO: renamed from: d */
    public final o0e1 f144082d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f144083e;

    /* JADX INFO: renamed from: g */
    public final HashMap f144085g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f144084f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashSet f144087i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f144088j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f144079a = null;

    /* JADX INFO: renamed from: k */
    public final Object f144089k = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f144086h = new HashMap();

    static {
        gaz.m44194g("Processor");
    }

    public mir0(Context context, dii diiVar, o0e1 o0e1Var, WorkDatabase workDatabase) {
        this.f144080b = context;
        this.f144081c = diiVar;
        this.f144082d = o0e1Var;
        this.f144083e = workDatabase;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m61908d(k2e1 k2e1Var, int i) {
        if (k2e1Var == null) {
            gaz.m44190b().getClass();
            return false;
        }
        k2e1Var.f118618m.mo38779R(new WorkerStoppedException(i));
        gaz.m44190b().getClass();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m61909a(qgx qgxVar) {
        synchronized (this.f144089k) {
            this.f144088j.add(qgxVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final k2e1 m61910b(String str) {
        k2e1 k2e1Var = (k2e1) this.f144084f.remove(str);
        boolean z = k2e1Var != null;
        if (!z) {
            k2e1Var = (k2e1) this.f144085g.remove(str);
        }
        this.f144086h.remove(str);
        if (z) {
            synchronized (this.f144089k) {
                try {
                    if (this.f144084f.isEmpty()) {
                        try {
                            this.f144080b.startService(ih61.m50581d(this.f144080b));
                        } catch (Throwable unused) {
                            gaz.m44190b().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f144079a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f144079a = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k2e1Var;
    }

    /* JADX INFO: renamed from: c */
    public final k2e1 m61911c(String str) {
        k2e1 k2e1Var = (k2e1) this.f144084f.get(str);
        return k2e1Var == null ? (k2e1) this.f144085g.get(str) : k2e1Var;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61912e(String str) {
        boolean z;
        synchronized (this.f144089k) {
            z = m61911c(str) != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m61913f(qgx qgxVar) {
        synchronized (this.f144089k) {
            this.f144088j.remove(qgxVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61914g(pr41 pr41Var, red1 red1Var) throws Throwable {
        Throwable th;
        f0e1 f0e1Var = pr41Var.f180499a;
        String str = f0e1Var.f64629a;
        ArrayList arrayList = new ArrayList();
        i1e1 i1e1Var = (i1e1) this.f144083e.m59192v(new hmq(this, arrayList, str, 1));
        if (i1e1Var == null) {
            gaz gazVarM44190b = gaz.m44190b();
            f0e1Var.toString();
            gazVarM44190b.getClass();
            this.f144082d.f160374d.execute(new mpd0(15, this, f0e1Var));
            return false;
        }
        synchronized (this.f144089k) {
            try {
                try {
                    try {
                        if (m61912e(str)) {
                            Set set = (Set) this.f144086h.get(str);
                            if (((pr41) set.iterator().next()).f180499a.f64630b == f0e1Var.f64630b) {
                                set.add(pr41Var);
                                gaz gazVarM44190b2 = gaz.m44190b();
                                f0e1Var.toString();
                                gazVarM44190b2.getClass();
                            } else {
                                this.f144082d.f160374d.execute(new mpd0(15, this, f0e1Var));
                            }
                            return false;
                        }
                        if (i1e1Var.f97518t != f0e1Var.f64630b) {
                            this.f144082d.f160374d.execute(new mpd0(15, this, f0e1Var));
                            return false;
                        }
                        k2e1 k2e1Var = new k2e1(new h481(this.f144080b, this.f144081c, this.f144082d, this, this.f144083e, i1e1Var, arrayList));
                        luk lukVar = k2e1Var.f118609d.f160372b;
                        uf60 uf60VarM73202g = qlg1.m73202g();
                        lukVar.getClass();
                        jbb jbbVarM54970E = k0e1.m54970E(cct.m32296A(lukVar, uf60VarM73202g), new otd1(k2e1Var, null, 1));
                        jbbVarM54970E.f110727b.mo28322a(new kgd0(this, jbbVarM54970E, k2e1Var, 11), this.f144082d.f160374d);
                        this.f144085g.put(str, k2e1Var);
                        HashSet hashSet = new HashSet();
                        hashSet.add(pr41Var);
                        this.f144086h.put(str, hashSet);
                        gaz gazVarM44190b3 = gaz.m44190b();
                        f0e1Var.toString();
                        gazVarM44190b3.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }
}
