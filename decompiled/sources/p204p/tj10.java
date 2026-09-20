package p204p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class tj10 {

    /* JADX INFO: renamed from: a */
    public final Context f220795a;

    /* JADX INFO: renamed from: b */
    public final String f220796b;

    /* JADX INFO: renamed from: c */
    public final az1 f220797c;

    /* JADX INFO: renamed from: d */
    public final lh51 f220798d;

    /* JADX INFO: renamed from: e */
    public final n35 f220799e;

    /* JADX INFO: renamed from: f */
    public final i45 f220800f;

    /* JADX INFO: renamed from: g */
    public final Looper f220801g;

    /* JADX INFO: renamed from: h */
    public final int f220802h;

    /* JADX INFO: renamed from: i */
    public final r3f1 f220803i;

    /* JADX INFO: renamed from: j */
    public final e45 f220804j;

    /* JADX INFO: renamed from: k */
    public final yj10 f220805k;

    public tj10(Context context, Activity activity, lh51 lh51Var, n35 n35Var, sj10 sj10Var) {
        ac80 ac80VarM95461a;
        srf1 srf1Var;
        srf1 srf1Var2;
        ig31.m50507y(context, "Null context is not permitted.");
        ig31.m50507y(lh51Var, "Api must not be null.");
        ig31.m50507y(sj10Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        ig31.m50507y(applicationContext, "The provided context did not have an application context.");
        this.f220795a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strM60384t = i >= 30 ? lzj.m60384t(context) : null;
        this.f220796b = strM60384t;
        this.f220797c = i >= 31 ? new az1(context.getAttributionSource(), 25) : null;
        this.f220798d = lh51Var;
        this.f220799e = n35Var;
        this.f220801g = sj10Var.f209712b;
        i45 i45Var = new i45(lh51Var, n35Var, strM60384t);
        this.f220800f = i45Var;
        this.f220803i = new r3f1(this);
        yj10 yj10VarM93835d = yj10.m93835d(applicationContext);
        this.f220805k = yj10VarM93835d;
        this.f220802h = yj10VarM93835d.f273262h.getAndIncrement();
        this.f220804j = sj10Var.f209711a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if (activity instanceof m500) {
                m500 m500Var = (m500) activity;
                WeakHashMap weakHashMap = srf1.f213316B1;
                c700 c700VarMo15683g0 = m500Var.mo15683g0();
                WeakHashMap weakHashMap2 = srf1.f213316B1;
                WeakReference weakReference = (WeakReference) weakHashMap2.get(m500Var);
                if (weakReference == null || (srf1Var2 = (srf1) weakReference.get()) == null) {
                    try {
                        ac80VarM95461a = srf1Var2;
                        srf1 srf1Var3 = (srf1) c700VarMo15683g0.m31604F("SLifecycleFragmentImpl");
                        if (srf1Var3 == null || srf1Var3.f98687Y) {
                            srf1Var = srf1Var3;
                            srf1 srf1Var4 = new srf1();
                            xi8 xi8Var = new xi8(c700VarMo15683g0);
                            xi8Var.m91100k(0, srf1Var4, "SLifecycleFragmentImpl", 1);
                            xi8Var.m91096g(true, true);
                            srf1Var = srf1Var4;
                        }
                        srf1Var = srf1Var3;
                        weakHashMap2.put(m500Var, new WeakReference(srf1Var));
                        ac80VarM95461a = srf1Var;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                    }
                }
            } else {
                ac80VarM95461a = z5f1.m95461a(activity);
            }
            ac80VarM95461a = srf1Var2;
            l3f1 l3f1VarMo25447t = ac80VarM95461a.mo25447t();
            if (l3f1VarMo25447t == null) {
                Object obj = uj10.f230857d;
                l3f1VarMo25447t = new l3f1(ac80VarM95461a, yj10VarM93835d);
            }
            l3f1VarMo25447t.f129327f.add(i45Var);
            yj10VarM93835d.m93838e(l3f1VarMo25447t);
        }
        ywh0 ywh0Var = yj10VarM93835d.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    public final cxb m80958a() {
        cxb cxbVar = new cxb();
        Set set = Collections.EMPTY_SET;
        cxbVar.m34256t();
        Context context = this.f220795a;
        cxbVar.m34257u(context.getClass().getName());
        cxbVar.m34255s(context.getPackageName());
        return cxbVar;
    }

    /* JADX INFO: renamed from: b */
    public final y7h1 m80959b(cxq0 cxq0Var) {
        jij0 jij0Var = (jij0) cxq0Var.f43080b;
        ig31.m50507y(jij0Var.m53455b(), "Listener has already been released.");
        sqe1 sqe1Var = (sqe1) cxq0Var.f43081c;
        ig31.m50507y(sqe1Var.m78948c(), "Listener has already been released.");
        yj10 yj10Var = this.f220805k;
        yj10Var.getClass();
        ev61 ev61Var = new ev61();
        yj10Var.m93837b(ev61Var, jij0Var.m53461h(), this);
        z3f1 z3f1Var = new z3f1(new k4f1(new a4f1(jij0Var, sqe1Var), ev61Var), yj10Var.f273263i.get(), this);
        ywh0 ywh0Var = yj10Var.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(8, z3f1Var));
        return ev61Var.f63172a;
    }

    /* JADX INFO: renamed from: c */
    public final y7h1 m80960c(i890 i890Var, int i) {
        yj10 yj10Var = this.f220805k;
        yj10Var.getClass();
        ev61 ev61Var = new ev61();
        yj10Var.m93837b(ev61Var, i, this);
        z3f1 z3f1Var = new z3f1(new k4f1(i890Var, ev61Var), yj10Var.f273263i.get(), this);
        ywh0 ywh0Var = yj10Var.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(13, z3f1Var));
        return ev61Var.f63172a;
    }

    /* JADX INFO: renamed from: d */
    public final void m80961d(int i, fz8 fz8Var) {
        boolean z = true;
        if (!fz8Var.f1858V0 && !((Boolean) BasePendingResult.f1847W0.get()).booleanValue()) {
            z = false;
        }
        fz8Var.f1858V0 = z;
        yj10 yj10Var = this.f220805k;
        yj10Var.getClass();
        z3f1 z3f1Var = new z3f1(new g4f1(i, fz8Var), yj10Var.f273263i.get(), this);
        ywh0 ywh0Var = yj10Var.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(4, z3f1Var));
    }

    /* JADX INFO: renamed from: e */
    public final y7h1 m80962e(int i, h9p h9pVar) {
        ev61 ev61Var = new ev61();
        yj10 yj10Var = this.f220805k;
        yj10Var.getClass();
        yj10Var.m93837b(ev61Var, h9pVar.m46877B(), this);
        z3f1 z3f1Var = new z3f1(new n4f1(i, h9pVar, ev61Var, this.f220804j), yj10Var.f273263i.get(), this);
        ywh0 ywh0Var = yj10Var.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(4, z3f1Var));
        return ev61Var.f63172a;
    }
}
