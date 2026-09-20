package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.integrity.internal.C0150af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f0f1 {

    /* JADX INFO: renamed from: o */
    public static final HashMap f64631o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f64632a;

    /* JADX INFO: renamed from: b */
    public final c3f1 f64633b;

    /* JADX INFO: renamed from: g */
    public boolean f64638g;

    /* JADX INFO: renamed from: h */
    public final Intent f64639h;

    /* JADX INFO: renamed from: i */
    public final ajp0 f64640i;

    /* JADX INFO: renamed from: m */
    public i8v f64644m;

    /* JADX INFO: renamed from: n */
    public v2f1 f64645n;

    /* JADX INFO: renamed from: d */
    public final ArrayList f64635d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f64636e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f64637f = new Object();

    /* JADX INFO: renamed from: k */
    public final e3f1 f64642k = new e3f1(this, 0);

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f64643l = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f64634c = "ExpressIntegrityService";

    /* JADX INFO: renamed from: j */
    public final WeakReference f64641j = new WeakReference(null);

    public f0f1(Context context, c3f1 c3f1Var, Intent intent, ajp0 ajp0Var) {
        this.f64632a = context;
        this.f64633b = c3f1Var;
        this.f64639h = intent;
        this.f64640i = ajp0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m40477b(f0f1 f0f1Var, c1f1 c1f1Var) {
        v2f1 v2f1Var = f0f1Var.f64645n;
        c3f1 c3f1Var = f0f1Var.f64633b;
        ArrayList arrayList = f0f1Var.f64635d;
        if (v2f1Var != null || f0f1Var.f64638g) {
            if (!f0f1Var.f64638g) {
                c1f1Var.run();
                return;
            } else {
                c3f1Var.m31382b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c1f1Var);
                return;
            }
        }
        c3f1Var.m31382b("Initiate binding to the service.", new Object[0]);
        arrayList.add(c1f1Var);
        i8v i8vVar = new i8v(f0f1Var, 2);
        f0f1Var.f64644m = i8vVar;
        f0f1Var.f64638g = true;
        if (f0f1Var.f64632a.bindService(f0f1Var.f64639h, i8vVar, 1)) {
            return;
        }
        c3f1Var.m31382b("Failed to bind to the service.", new Object[0]);
        f0f1Var.f64638g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d3f1) it.next()).mo31263a(new C0150af());
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m40478a() {
        Handler handler;
        HashMap map = f64631o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f64634c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f64634c, 10);
                    handlerThread.start();
                    map.put(this.f64634c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f64634c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m40479c(ev61 ev61Var) {
        synchronized (this.f64637f) {
            this.f64636e.remove(ev61Var);
        }
        m40478a().post(new h3f1(this));
    }

    /* JADX INFO: renamed from: d */
    public final void m40480d() {
        HashSet hashSet = this.f64636e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ev61) it.next()).m40098c(new RemoteException(String.valueOf(this.f64634c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
