package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.engage.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class dsg1 {

    /* JADX INFO: renamed from: n */
    public static final HashMap f52568n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f52569a;

    /* JADX INFO: renamed from: b */
    public final C2617yl f52570b;

    /* JADX INFO: renamed from: g */
    public boolean f52575g;

    /* JADX INFO: renamed from: h */
    public final Intent f52576h;

    /* JADX INFO: renamed from: l */
    public i8v f52580l;

    /* JADX INFO: renamed from: m */
    public gu30 f52581m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f52572d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f52573e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f52574f = new Object();

    /* JADX INFO: renamed from: j */
    public final y0g1 f52578j = new IBinder.DeathRecipient() { // from class: p.y0g1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            dsg1.m36770b(this.f267983a);
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f52579k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f52571c = "AppEngageService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f52577i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [p.y0g1] */
    public dsg1(Context context, C2617yl c2617yl, Intent intent) {
        this.f52569a = context;
        this.f52570b = c2617yl;
        this.f52576h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m36770b(dsg1 dsg1Var) {
        dsg1Var.f52570b.m94136g("reportBinderDeath", new Object[0]);
        if (dsg1Var.f52577i.get() != null) {
            throw new ClassCastException();
        }
        dsg1Var.f52570b.m94136g("%s : Binder has died.", dsg1Var.f52571c);
        for (bwf1 bwf1Var : dsg1Var.f52572d) {
            RemoteException remoteException = new RemoteException(String.valueOf(dsg1Var.f52571c).concat(" : Binder has died."));
            ev61 ev61Var = bwf1Var.f31649a;
            if (ev61Var != null) {
                ev61Var.m40098c(remoteException);
            }
        }
        dsg1Var.f52572d.clear();
        synchronized (dsg1Var.f52574f) {
            dsg1Var.m36775f();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m36771c(dsg1 dsg1Var, i8g1 i8g1Var) {
        gu30 gu30Var = dsg1Var.f52581m;
        C2617yl c2617yl = dsg1Var.f52570b;
        ArrayList<bwf1> arrayList = dsg1Var.f52572d;
        if (gu30Var != null || dsg1Var.f52575g) {
            if (!dsg1Var.f52575g) {
                i8g1Var.run();
                return;
            } else {
                c2617yl.m94136g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(i8g1Var);
                return;
            }
        }
        c2617yl.m94136g("Initiate binding to the service.", new Object[0]);
        arrayList.add(i8g1Var);
        i8v i8vVar = new i8v(dsg1Var, 6);
        dsg1Var.f52580l = i8vVar;
        dsg1Var.f52575g = true;
        if (dsg1Var.f52569a.bindService(dsg1Var.f52576h, i8vVar, 1)) {
            return;
        }
        c2617yl.m94136g("Failed to bind to the service.", new Object[0]);
        dsg1Var.f52575g = false;
        for (bwf1 bwf1Var : arrayList) {
            zzp zzpVar = new zzp();
            ev61 ev61Var = bwf1Var.f31649a;
            if (ev61Var != null) {
                ev61Var.m40098c(zzpVar);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m36772a() {
        Handler handler;
        HashMap map = f52568n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f52571c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f52571c, 10);
                    handlerThread.start();
                    map.put(this.f52571c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f52571c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: d */
    public final void m36773d(i8g1 i8g1Var, ev61 ev61Var) {
        m36772a().post(new i8g1(this, i8g1Var.f31649a, ev61Var, i8g1Var));
    }

    /* JADX INFO: renamed from: e */
    public final void m36774e(ev61 ev61Var) {
        synchronized (this.f52574f) {
            this.f52573e.remove(ev61Var);
        }
        m36772a().post(new qbg1(this, 0));
    }

    /* JADX INFO: renamed from: f */
    public final void m36775f() {
        HashSet hashSet = this.f52573e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ev61) it.next()).m40098c(new RemoteException(String.valueOf(this.f52571c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
