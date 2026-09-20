package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class rrg1 {

    /* JADX INFO: renamed from: n */
    public static final HashMap f202045n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f202046a;

    /* JADX INFO: renamed from: b */
    public final vah1 f202047b;

    /* JADX INFO: renamed from: g */
    public boolean f202052g;

    /* JADX INFO: renamed from: h */
    public final Intent f202053h;

    /* JADX INFO: renamed from: l */
    public i8v f202057l;

    /* JADX INFO: renamed from: m */
    public bu30 f202058m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f202049d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f202050e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f202051f = new Object();

    /* JADX INFO: renamed from: j */
    public final e3f1 f202055j = new e3f1(this, 2);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f202056k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f202048c = "AgeSignalsService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f202054i = new WeakReference(null);

    public rrg1(Context context, vah1 vah1Var, Intent intent) {
        this.f202046a = context;
        this.f202047b = vah1Var;
        this.f202053h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m76288b(rrg1 rrg1Var, lwf1 lwf1Var) {
        bu30 bu30Var = rrg1Var.f202058m;
        ArrayList arrayList = rrg1Var.f202049d;
        vah1 vah1Var = rrg1Var.f202047b;
        if (bu30Var != null || rrg1Var.f202052g) {
            if (!rrg1Var.f202052g) {
                lwf1Var.run();
                return;
            } else {
                vah1Var.m85082a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(lwf1Var);
                return;
            }
        }
        vah1Var.m85082a("Initiate binding to the service.", new Object[0]);
        arrayList.add(lwf1Var);
        i8v i8vVar = new i8v(rrg1Var);
        rrg1Var.f202057l = i8vVar;
        rrg1Var.f202052g = true;
        if (rrg1Var.f202046a.bindService(rrg1Var.f202053h, i8vVar, 1)) {
            return;
        }
        vah1Var.m85082a("Failed to bind to the service.", new Object[0]);
        rrg1Var.f202052g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((gwf1) it.next()).mo45926a(new zzp());
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m76289a() {
        Handler handler;
        HashMap map = f202045n;
        synchronized (map) {
            try {
                String str = this.f202048c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m76290c(ev61 ev61Var) {
        synchronized (this.f202051f) {
            this.f202050e.remove(ev61Var);
        }
        m76289a().post(new kbg1(this));
    }
}
