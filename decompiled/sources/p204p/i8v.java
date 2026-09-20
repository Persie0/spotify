package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class i8v implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f99849b;

    public /* synthetic */ i8v(Object obj, int i) {
        this.f99848a = i;
        this.f99849b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? r1 = 0;
        iif1 yhf1Var = null;
        switch (this.f99848a) {
            case 0:
                xpo xpoVar = (xpo) this.f99849b;
                synchronized (xpoVar.f264691a) {
                    if (((ArrayMap) xpoVar.f264695e).isEmpty()) {
                        ((Context) xpoVar.f264694d).unbindService((i8v) xpoVar.f264697g);
                    } else {
                        int i = tu30.f223756a;
                        if (iBinder != null) {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(uu30.f234098e);
                            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof uu30)) {
                                su30 su30Var = new su30();
                                su30Var.f213989a = iBinder;
                                r1 = su30Var;
                            } else {
                                r1 = (uu30) iInterfaceQueryLocalInterface;
                            }
                        }
                        xpoVar.f264692b = 10L;
                        if (r1 != 0) {
                            try {
                                ((su30) r1).m79375C((h8v) xpoVar.f264698h);
                                break;
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                }
                return;
            case 1:
                pzs0 pzs0Var = (pzs0) this.f99849b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) pzs0Var.f183796d;
                linkedBlockingDeque.size();
                pzs0Var.f183795c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                x0h1.m89578u(kk40.m56661c((juk) pzs0Var.f183794b), null, 0, new xay0(pzs0Var, arrayList, r1, 16), 3);
                return;
            case 2:
                f0f1 f0f1Var = (f0f1) this.f99849b;
                f0f1Var.f64633b.m31382b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                f0f1Var.m40478a().post(new d0f1(this, iBinder));
                return;
            case 3:
                mmf1.m62313g("BillingClientTesting", "Billing Override Service connected.");
                wqf1 wqf1Var = (wqf1) this.f99849b;
                int i2 = cif1.f38310l;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    yhf1Var = iInterfaceQueryLocalInterface2 instanceof iif1 ? (iif1) iInterfaceQueryLocalInterface2 : new yhf1(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 6);
                }
                wqf1Var.f254036N = yhf1Var;
                wqf1Var.f254035M = 2;
                wqf1Var.m88748a0(26);
                return;
            case 4:
                qrg1 qrg1Var = (qrg1) this.f99849b;
                qrg1Var.f191838b.m26899h("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qrg1Var.m73619a().post(new xhg1(this, iBinder));
                return;
            case 5:
                rrg1 rrg1Var = (rrg1) this.f99849b;
                rrg1Var.f202047b.m85082a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                rrg1Var.m76289a().post(new yhg1(this, iBinder));
                return;
            default:
                dsg1 dsg1Var = (dsg1) this.f99849b;
                dsg1Var.f52570b.m94136g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dsg1Var.m36772a().post(new cig1(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f99848a) {
            case 0:
                xpo xpoVar = (xpo) this.f99849b;
                synchronized (xpoVar.f264691a) {
                    xpoVar.f264696f = null;
                    if (!((ArrayMap) xpoVar.f264695e).isEmpty()) {
                        ((Handler) xpoVar.f264693c).postDelayed(new kep(xpoVar, 18), xpoVar.f264692b);
                        xpoVar.f264692b = Math.min(xpoVar.f264692b * ((long) 10), 5000L);
                    }
                    break;
                }
                return;
            case 1:
                pzs0 pzs0Var = (pzs0) this.f99849b;
                pzs0Var.f183795c = null;
                pzs0Var.getClass();
                return;
            case 2:
                f0f1 f0f1Var = (f0f1) this.f99849b;
                f0f1Var.f64633b.m31382b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                f0f1Var.m40478a().post(new e0f1(this));
                return;
            case 3:
                int i = mmf1.f145137a;
                Log.isLoggable("BillingClientTesting", 5);
                wqf1 wqf1Var = (wqf1) this.f99849b;
                wqf1Var.f254036N = null;
                wqf1Var.f254035M = 0;
                return;
            case 4:
                qrg1 qrg1Var = (qrg1) this.f99849b;
                qrg1Var.f191838b.m26899h("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qrg1Var.m73619a().post(new tbg1(this));
                return;
            case 5:
                rrg1 rrg1Var = (rrg1) this.f99849b;
                rrg1Var.f202047b.m85082a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                rrg1Var.m76289a().post(new kbg1(this));
                return;
            default:
                dsg1 dsg1Var = (dsg1) this.f99849b;
                dsg1Var.f52570b.m94136g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dsg1Var.m36772a().post(new qbg1(this, 1));
                return;
        }
    }

    public /* synthetic */ i8v(qrg1 qrg1Var) {
        this.f99848a = 4;
        Objects.requireNonNull(qrg1Var);
        this.f99849b = qrg1Var;
    }

    public /* synthetic */ i8v(rrg1 rrg1Var) {
        this.f99848a = 5;
        Objects.requireNonNull(rrg1Var);
        this.f99849b = rrg1Var;
    }
}
