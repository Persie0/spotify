package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wkq implements t7l0, t1e1 {

    /* JADX INFO: renamed from: L0 */
    public volatile di41 f252277L0;

    /* JADX INFO: renamed from: X */
    public boolean f252278X;

    /* JADX INFO: renamed from: Y */
    public final pr41 f252279Y;

    /* JADX INFO: renamed from: Z */
    public final luk f252280Z;

    /* JADX INFO: renamed from: a */
    public final Context f252281a;

    /* JADX INFO: renamed from: b */
    public final int f252282b;

    /* JADX INFO: renamed from: c */
    public final f0e1 f252283c;

    /* JADX INFO: renamed from: d */
    public final dh61 f252284d;

    /* JADX INFO: renamed from: e */
    public final uo80 f252285e;

    /* JADX INFO: renamed from: f */
    public final Object f252286f;

    /* JADX INFO: renamed from: g */
    public int f252287g;

    /* JADX INFO: renamed from: h */
    public final fc5 f252288h;

    /* JADX INFO: renamed from: i */
    public final zr20 f252289i;

    /* JADX INFO: renamed from: t */
    public PowerManager.WakeLock f252290t;

    static {
        gaz.m44194g("DelayMetCommandHandler");
    }

    public wkq(Context context, int i, dh61 dh61Var, pr41 pr41Var) {
        this.f252281a = context;
        this.f252282b = i;
        this.f252284d = dh61Var;
        this.f252283c = pr41Var.f180499a;
        this.f252279Y = pr41Var;
        ft81 ft81Var = dh61Var.f48997e.f128412I0;
        o0e1 o0e1Var = dh61Var.f48994b;
        this.f252288h = o0e1Var.f160371a;
        this.f252289i = o0e1Var.f160374d;
        this.f252280Z = o0e1Var.f160372b;
        this.f252285e = new uo80(ft81Var);
        this.f252278X = false;
        this.f252287g = 0;
        this.f252286f = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m88366a(wkq wkqVar) {
        int i = wkqVar.f252282b;
        zr20 zr20Var = wkqVar.f252289i;
        Context context = wkqVar.f252281a;
        dh61 dh61Var = wkqVar.f252284d;
        f0e1 f0e1Var = wkqVar.f252283c;
        String str = f0e1Var.f64629a;
        if (wkqVar.f252287g >= 2) {
            gaz.m44190b().getClass();
            return;
        }
        wkqVar.f252287g = 2;
        gaz.m44190b().getClass();
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        dcf.m35648d(intent, f0e1Var);
        zr20Var.execute(new ti3(dh61Var, intent, i, 11));
        if (!dh61Var.f48996d.m61912e(f0e1Var.f64629a)) {
            gaz.m44190b().getClass();
            return;
        }
        gaz.m44190b().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        dcf.m35648d(intent2, f0e1Var);
        zr20Var.execute(new ti3(dh61Var, intent2, i, 11));
    }

    /* JADX INFO: renamed from: b */
    public static void m88367b(wkq wkqVar) {
        if (wkqVar.f252287g != 0) {
            gaz gazVarM44190b = gaz.m44190b();
            Objects.toString(wkqVar.f252283c);
            gazVarM44190b.getClass();
            return;
        }
        wkqVar.f252287g = 1;
        gaz gazVarM44190b2 = gaz.m44190b();
        Objects.toString(wkqVar.f252283c);
        gazVarM44190b2.getClass();
        if (!wkqVar.f252284d.f48996d.m61914g(wkqVar.f252279Y, null)) {
            wkqVar.m88368d();
            return;
        }
        v1e1 v1e1Var = wkqVar.f252284d.f48995c;
        f0e1 f0e1Var = wkqVar.f252283c;
        synchronized (v1e1Var.f236355d) {
            gaz gazVarM44190b3 = gaz.m44190b();
            Objects.toString(f0e1Var);
            gazVarM44190b3.getClass();
            v1e1Var.m84462a(f0e1Var);
            u1e1 u1e1Var = new u1e1(v1e1Var, f0e1Var);
            v1e1Var.f236353b.put(f0e1Var, u1e1Var);
            v1e1Var.f236354c.put(f0e1Var, wkqVar);
            v1e1Var.f236352a.m35387h(u1e1Var, 600000L);
        }
    }

    @Override // p204p.t7l0
    /* JADX INFO: renamed from: c */
    public final void mo40286c(i1e1 i1e1Var, j8j j8jVar) {
        boolean z = j8jVar instanceof h8j;
        fc5 fc5Var = this.f252288h;
        if (z) {
            fc5Var.execute(new vkq(this, 1));
        } else {
            fc5Var.execute(new vkq(this, 0));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88368d() {
        synchronized (this.f252286f) {
            try {
                if (this.f252277L0 != null) {
                    this.f252277L0.mo26601e(null);
                }
                this.f252284d.f48995c.m84462a(this.f252283c);
                PowerManager.WakeLock wakeLock = this.f252290t;
                if (wakeLock != null && wakeLock.isHeld()) {
                    gaz gazVarM44190b = gaz.m44190b();
                    Objects.toString(this.f252290t);
                    Objects.toString(this.f252283c);
                    gazVarM44190b.getClass();
                    this.f252290t.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m88369e() {
        String str = this.f252283c.f64629a;
        Context context = this.f252281a;
        StringBuilder sbM75191i = rbz.m75191i(str, " (");
        sbM75191i.append(this.f252282b);
        sbM75191i.append(")");
        this.f252290t = m7d1.m61061a(context, sbM75191i.toString());
        gaz gazVarM44190b = gaz.m44190b();
        Objects.toString(this.f252290t);
        gazVarM44190b.getClass();
        this.f252290t.acquire();
        i1e1 i1e1VarM66059j = this.f252284d.f48997e.f128405B0.mo1155F().m66059j(str);
        if (i1e1VarM66059j == null) {
            this.f252288h.execute(new vkq(this, 0));
            return;
        }
        boolean zM49412c = i1e1VarM66059j.m49412c();
        this.f252278X = zM49412c;
        if (zM49412c) {
            this.f252277L0 = xzd1.m92449a(this.f252285e, i1e1VarM66059j, this.f252280Z, this);
        } else {
            gaz.m44190b().getClass();
            this.f252288h.execute(new vkq(this, 1));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m88370f(boolean z) {
        gaz gazVarM44190b = gaz.m44190b();
        f0e1 f0e1Var = this.f252283c;
        Objects.toString(f0e1Var);
        gazVarM44190b.getClass();
        m88368d();
        int i = this.f252282b;
        dh61 dh61Var = this.f252284d;
        zr20 zr20Var = this.f252289i;
        Context context = this.f252281a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            dcf.m35648d(intent, f0e1Var);
            zr20Var.execute(new ti3(dh61Var, intent, i, 11));
        }
        if (this.f252278X) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            zr20Var.execute(new ti3(dh61Var, intent2, i, 11));
        }
    }
}
