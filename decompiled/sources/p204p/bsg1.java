package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bsg1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final HashMap f30318a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f30319b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f30320c;

    /* JADX INFO: renamed from: d */
    public IBinder f30321d;

    /* JADX INFO: renamed from: e */
    public final dqg1 f30322e;

    /* JADX INFO: renamed from: f */
    public ComponentName f30323f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ nvg1 f30324g;

    public bsg1(nvg1 nvg1Var, dqg1 dqg1Var) {
        this.f30324g = nvg1Var;
        this.f30322e = dqg1Var;
    }

    /* JADX INFO: renamed from: a */
    public final lzi m30435a(String str, Executor executor) throws Throwable {
        try {
            Intent intentM47029a = hbf1.m47029a(this.f30324g.f158896b, this.f30322e);
            this.f30319b = 3;
            StrictMode.VmPolicy vmPolicyM85444p = vgf1.m85444p();
            try {
                nvg1 nvg1Var = this.f30324g;
                d0j d0jVar = nvg1Var.f158898d;
                Context context = nvg1Var.f158896b;
                dqg1 dqg1Var = this.f30322e;
                try {
                    boolean zM34541c = d0jVar.m34541c(context, str, intentM47029a, this, 4225, executor);
                    this.f30320c = zM34541c;
                    if (zM34541c) {
                        nvg1Var.f158897c.sendMessageDelayed(nvg1Var.f158897c.obtainMessage(1, dqg1Var), nvg1Var.f158900f);
                        lzi lziVar = lzi.f138369f;
                        StrictMode.setVmPolicy(vmPolicyM85444p);
                        return lziVar;
                    }
                    this.f30319b = 2;
                    try {
                        nvg1Var.f158898d.m34540b(nvg1Var.f158896b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    lzi lziVar2 = new lzi(16, null, null);
                    StrictMode.setVmPolicy(vmPolicyM85444p);
                    return lziVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicyM85444p);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e) {
            return e.f1872a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        nvg1 nvg1Var = this.f30324g;
        synchronized (nvg1Var.f158895a) {
            try {
                nvg1Var.f158897c.removeMessages(1, this.f30322e);
                this.f30321d = iBinder;
                this.f30323f = componentName;
                Iterator it = this.f30318a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f30319b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        nvg1 nvg1Var = this.f30324g;
        synchronized (nvg1Var.f158895a) {
            try {
                nvg1Var.f158897c.removeMessages(1, this.f30322e);
                this.f30321d = null;
                this.f30323f = componentName;
                Iterator it = this.f30318a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f30319b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
