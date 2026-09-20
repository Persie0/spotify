package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dcf implements qgx {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f47543f = 0;

    /* JADX INFO: renamed from: a */
    public final Context f47544a;

    /* JADX INFO: renamed from: b */
    public final HashMap f47545b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f47546c = new Object();

    /* JADX INFO: renamed from: d */
    public final qbn0 f47547d;

    /* JADX INFO: renamed from: e */
    public final hm11 f47548e;

    static {
        gaz.m44194g("CommandHandler");
    }

    public dcf(Context context, qbn0 qbn0Var, hm11 hm11Var) {
        this.f47544a = context;
        this.f47547d = qbn0Var;
        this.f47548e = hm11Var;
    }

    /* JADX INFO: renamed from: c */
    public static f0e1 m35647c(Intent intent) {
        return new f0e1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: d */
    public static void m35648d(Intent intent, f0e1 f0e1Var) {
        intent.putExtra("KEY_WORKSPEC_ID", f0e1Var.f64629a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", f0e1Var.f64630b);
    }

    @Override // p204p.qgx
    /* JADX INFO: renamed from: a */
    public final void mo1166a(f0e1 f0e1Var, boolean z) {
        synchronized (this.f47546c) {
            try {
                wkq wkqVar = (wkq) this.f47545b.remove(f0e1Var);
                this.f47548e.mo47912g(f0e1Var);
                if (wkqVar != null) {
                    wkqVar.m88370f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02c9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m35649b(Intent intent, int i, dh61 dh61Var) {
        List<pr41> listM47921w;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = 11;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            gaz gazVarM44190b = gaz.m44190b();
            Objects.toString(intent);
            gazVarM44190b.getClass();
            Context context = this.f47544a;
            d8j d8jVar = new d8j(context, this.f47547d, i, dh61Var);
            ArrayList<i1e1> arrayListM66057h = dh61Var.f48997e.f128405B0.mo1155F().m66057h();
            int i3 = t6j.f217565a;
            Iterator it = arrayListM66057h.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                a8j a8jVar = ((i1e1) it.next()).f97508j;
                z |= a8jVar.f13307e;
                z2 |= a8jVar.f13305c;
                z3 |= a8jVar.f13308f;
                z4 |= a8jVar.f13303a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i4 = ConstraintProxyUpdateReceiver.f1421a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList<i1e1> arrayList2 = new ArrayList(arrayListM66057h.size());
            d8jVar.f46469a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (i1e1 i1e1Var : arrayListM66057h) {
                if (jCurrentTimeMillis >= i1e1Var.m49411a() && (!i1e1Var.m49412c() || d8jVar.f46471c.m83595d(i1e1Var))) {
                    arrayList2.add(i1e1Var);
                }
            }
            for (i1e1 i1e1Var2 : arrayList2) {
                String str = i1e1Var2.f97499a;
                f0e1 f0e1VarM55001w = k0e1.m55001w(i1e1Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m35648d(intent3, f0e1VarM55001w);
                gaz.m44190b().getClass();
                dh61Var.f48994b.f160374d.execute(new ti3(dh61Var, intent3, d8jVar.f46470b, i2));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            gaz gazVarM44190b2 = gaz.m44190b();
            Objects.toString(intent);
            gazVarM44190b2.getClass();
            l0e1 l0e1Var = dh61Var.f48997e;
            jh3.m53324o(l0e1Var.f128404A0.f49375m, new es3(l0e1Var, 8));
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            gaz.m44190b().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f47544a;
            f0e1 f0e1VarM35647c = m35647c(intent);
            gaz gazVarM44190b3 = gaz.m44190b();
            f0e1VarM35647c.toString();
            gazVarM44190b3.getClass();
            WorkDatabase workDatabase = dh61Var.f48997e.f128405B0;
            workDatabase.m59183c();
            try {
                i1e1 i1e1VarM66059j = workDatabase.mo1155F().m66059j(f0e1VarM35647c.f64629a);
                if (i1e1VarM66059j == null) {
                    gaz gazVarM44190b4 = gaz.m44190b();
                    f0e1VarM35647c.toString();
                    gazVarM44190b4.getClass();
                    return;
                }
                if (i1e1VarM66059j.f97500b.m46346a()) {
                    gaz gazVarM44190b5 = gaz.m44190b();
                    f0e1VarM35647c.toString();
                    gazVarM44190b5.getClass();
                    return;
                }
                long jM49411a = i1e1VarM66059j.m49411a();
                if (i1e1VarM66059j.m49412c()) {
                    gaz gazVarM44190b6 = gaz.m44190b();
                    f0e1VarM35647c.toString();
                    gazVarM44190b6.getClass();
                    zv2.m97087b(context2, workDatabase, f0e1VarM35647c, jM49411a);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    dh61Var.f48994b.f160374d.execute(new ti3(dh61Var, intent4, i, i2));
                } else {
                    gaz gazVarM44190b7 = gaz.m44190b();
                    f0e1VarM35647c.toString();
                    gazVarM44190b7.getClass();
                    zv2.m97087b(context2, workDatabase, f0e1VarM35647c, jM49411a);
                }
                workDatabase.m59194x();
                return;
            } finally {
                workDatabase.m59184i();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f47546c) {
                try {
                    f0e1 f0e1VarM35647c2 = m35647c(intent);
                    gaz gazVarM44190b8 = gaz.m44190b();
                    f0e1VarM35647c2.toString();
                    gazVarM44190b8.getClass();
                    if (this.f47545b.containsKey(f0e1VarM35647c2)) {
                        gaz gazVarM44190b9 = gaz.m44190b();
                        f0e1VarM35647c2.toString();
                        gazVarM44190b9.getClass();
                    } else {
                        wkq wkqVar = new wkq(this.f47544a, i, dh61Var, this.f47548e.mo47911d(f0e1VarM35647c2));
                        this.f47545b.put(f0e1VarM35647c2, wkqVar);
                        wkqVar.m88369e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                gaz gazVarM44190b10 = gaz.m44190b();
                intent.toString();
                gazVarM44190b10.getClass();
                return;
            } else {
                f0e1 f0e1VarM35647c3 = m35647c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                gaz gazVarM44190b11 = gaz.m44190b();
                intent.toString();
                gazVarM44190b11.getClass();
                mo1166a(f0e1VarM35647c3, z5);
                return;
            }
        }
        hm11 hm11Var = this.f47548e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            pr41 pr41VarMo47912g = hm11Var.mo47912g(new f0e1(string, i5));
            if (pr41VarMo47912g != null) {
                listM47921w = arrayList;
                arrayList.add(pr41VarMo47912g);
                listM47921w = arrayList;
            }
        } else {
            listM47921w = hm11Var.m47921w(string);
        }
        listM47921w = arrayList;
        for (pr41 pr41Var : listM47921w) {
            gaz.m44190b().getClass();
            dh61Var.f49002t.m82363q(pr41Var, -512);
            f0e1 f0e1Var = pr41Var.f180499a;
            Context context3 = this.f47544a;
            WorkDatabase workDatabase2 = dh61Var.f48997e.f128405B0;
            int i6 = zv2.f286589a;
            nh61 nh61VarMo1152C = workDatabase2.mo1152C();
            lh61 lh61VarM64437g = nh61VarMo1152C.m64437g(f0e1Var);
            if (lh61VarM64437g != null) {
                zv2.m97086a(context3, f0e1Var, lh61VarM64437g.f133405c);
                gaz gazVarM44190b12 = gaz.m44190b();
                f0e1Var.toString();
                gazVarM44190b12.getClass();
                String str2 = f0e1Var.f64629a;
                int i7 = f0e1Var.f64630b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nh61VarMo1152C.f153884b;
                workDatabase_Impl.m59182b();
                mh61 mh61Var = (mh61) nh61VarMo1152C.f153886d;
                fa00 fa00VarM93329a = mh61Var.m93329a();
                fa00VarM93329a.mo38269L0(1, str2);
                fa00VarM93329a.mo38272u(2, i7);
                workDatabase_Impl.m59183c();
                try {
                    fa00VarM93329a.m41115a();
                    workDatabase_Impl.m59194x();
                    workDatabase_Impl.m59184i();
                    mh61Var.m93330c(fa00VarM93329a);
                } catch (Throwable th2) {
                    workDatabase_Impl.m59184i();
                    throw th2;
                }
            }
            dh61Var.mo1166a(f0e1Var, false);
        }
    }
}
