package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class obc extends axz0 {

    /* JADX INFO: renamed from: m */
    public static final ura0 f163599m = new ura0("CastSession", null);

    /* JADX INFO: renamed from: c */
    public final Context f163600c;

    /* JADX INFO: renamed from: d */
    public final HashSet f163601d;

    /* JADX INFO: renamed from: e */
    public final zdf1 f163602e;

    /* JADX INFO: renamed from: f */
    public final ebc f163603f;

    /* JADX INFO: renamed from: g */
    public final wlf1 f163604g;

    /* JADX INFO: renamed from: h */
    public final s0h1 f163605h;

    /* JADX INFO: renamed from: i */
    public lkf1 f163606i;

    /* JADX INFO: renamed from: j */
    public ydw0 f163607j;

    /* JADX INFO: renamed from: k */
    public CastDevice f163608k;

    /* JADX INFO: renamed from: l */
    public c4d1 f163609l;

    public obc(Context context, String str, String str2, ebc ebcVar, wlf1 wlf1Var, s0h1 s0h1Var) {
        super(context, str, str2);
        this.f163601d = new HashSet();
        this.f163600c = context.getApplicationContext();
        this.f163603f = ebcVar;
        this.f163604g = wlf1Var;
        this.f163605h = s0h1Var;
        tv30 tv30VarM27444d = m27444d();
        o4h1 o4h1Var = new o4h1(this);
        ura0 ura0Var = fif1.f69885a;
        zdf1 zdf1VarM26154k2 = null;
        if (tv30VarM27444d != null) {
            try {
                zdf1VarM26154k2 = fif1.m41718b(context).m26154k2(ebcVar, tv30VarM27444d, o4h1Var);
            } catch (RemoteException | ModuleUnavailableException unused) {
                fif1.f69885a.m83849b("Unable to call %s on %s.", "newCastSessionImpl", ajf1.class.getSimpleName());
            }
        }
        this.f163602e = zdf1VarM26154k2;
    }

    /* JADX INFO: renamed from: e */
    public final void m66639e(String str, Task task) {
        ura0 ura0Var = f163599m;
        zdf1 zdf1Var = this.f163602e;
        if (zdf1Var == null) {
            return;
        }
        try {
            if (task.mo1518j()) {
                byg1 byg1Var = (byg1) task.mo1515g();
                if (byg1Var.getStatus() != null && byg1Var.getStatus().m1489k()) {
                    ura0Var.m83848a("%s() -> success result", str);
                    ydw0 ydw0Var = new ydw0(new dhf1());
                    this.f163607j = ydw0Var;
                    ydw0Var.m93511n(this.f163606i);
                    this.f163607j.m93509l(new aqg1(this));
                    this.f163607j.m93512o();
                    s0h1 s0h1Var = this.f163605h;
                    ydw0 ydw0Var2 = this.f163607j;
                    ig31.m50501s("Must be called from the main thread.");
                    s0h1Var.m76872a(ydw0Var2, this.f163608k);
                    lg5 lg5VarM30887a = byg1Var.m30887a();
                    ig31.m50506x(lg5VarM30887a);
                    String strM30888b = byg1Var.m30888b();
                    String strM30889c = byg1Var.m30889c();
                    ig31.m50506x(strM30889c);
                    ((ecf1) zdf1Var).m38501j2(lg5VarM30887a, strM30888b, strM30889c, byg1Var.m30890d());
                    return;
                }
                if (byg1Var.getStatus() != null) {
                    ura0Var.m83848a("%s() -> failure result", str);
                    ((ecf1) zdf1Var).m38500g0(byg1Var.getStatus().f1842a);
                    return;
                }
            } else {
                Exception excMo1514f = task.mo1514f();
                if (excMo1514f instanceof ApiException) {
                    ((ecf1) zdf1Var).m38500g0(((ApiException) excMo1514f).getStatusCode());
                    return;
                }
            }
            ((ecf1) zdf1Var).m38500g0(2476);
        } catch (RemoteException unused) {
            ura0Var.m83849b("Unable to call %s on %s.", "methods", zdf1.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m66640f(int i) {
        this.f163605h.m76873b(i);
        lkf1 lkf1Var = this.f163606i;
        if (lkf1Var != null) {
            lkf1Var.m59264o();
            this.f163606i = null;
        }
        this.f163608k = null;
        ydw0 ydw0Var = this.f163607j;
        if (ydw0Var != null) {
            ydw0Var.m93511n(null);
            this.f163607j = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m66641g(Bundle bundle) {
        CastDevice castDeviceM1481M = CastDevice.m1481M(bundle);
        this.f163608k = castDeviceM1481M;
        boolean zM47516m2 = false;
        if (castDeviceM1481M == null) {
            ig31.m50501s("Must be called from the main thread.");
            ura0 ura0Var = axz0.f21053b;
            ohf1 ohf1Var = this.f21054a;
            if (ohf1Var != null) {
                try {
                    zM47516m2 = ((hhf1) ohf1Var).m47516m2();
                } catch (RemoteException unused) {
                    ura0Var.m83849b("Unable to call %s on %s.", "isResuming", ohf1.class.getSimpleName());
                }
            }
            if (zM47516m2) {
                if (ohf1Var == null) {
                    return;
                }
                try {
                    ((hhf1) ohf1Var).m47520q2();
                    return;
                } catch (RemoteException unused2) {
                    ura0Var.m83849b("Unable to call %s on %s.", "notifyFailedToResumeSession", ohf1.class.getSimpleName());
                    return;
                }
            }
            if (ohf1Var == null) {
                return;
            }
            try {
                ((hhf1) ohf1Var).m47518o2();
                return;
            } catch (RemoteException unused3) {
                ura0Var.m83849b("Unable to call %s on %s.", "notifyFailedToStartSession", ohf1.class.getSimpleName());
                return;
            }
        }
        lkf1 lkf1Var = this.f163606i;
        if (lkf1Var != null) {
            lkf1Var.m59264o();
            this.f163606i = null;
        }
        f163599m.m83848a("Acquiring a connection to Google Play Services for %s", this.f163608k);
        CastDevice castDevice = this.f163608k;
        ig31.m50506x(castDevice);
        Bundle bundle2 = new Bundle();
        ebc ebcVar = this.f163603f;
        wac wacVar = ebcVar == null ? null : ebcVar.f57895f;
        v0k0 v0k0Var = wacVar != null ? wacVar.f249445d : null;
        boolean z = wacVar != null && wacVar.f249446e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", v0k0Var != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        wlf1 wlf1Var = this.f163604g;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", wlf1Var.m88516c2());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", wlf1Var.f252550r);
        cxb cxbVar = new cxb(castDevice, new m6h1(this));
        cxbVar.m34260x(bundle2);
        lkf1 lkf1VarM28580a = bac.m28580a(this.f163600c, cxbVar.m34247i());
        lkf1VarM28580a.m59262m(new bbh1(this));
        this.f163606i = lkf1VarM28580a;
        lkf1VarM28580a.m59263n();
    }
}
