package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class v7h1 extends zbf1 {

    /* JADX INFO: renamed from: l */
    public final AtomicReference f238186l;

    /* JADX INFO: renamed from: m */
    public final ywh0 f238187m;

    public v7h1(v9h1 v9h1Var) {
        this.f238186l = new AtomicReference(v9h1Var);
        this.f238187m = new ywh0(v9h1Var.f54559d, 5);
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: A1 */
    public final void mo41919A1(int i, long j) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1Var.m84968X(i, j);
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: B1 */
    public final void mo41920B1(lg5 lg5Var, String str, String str2, boolean z) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1Var.f238953B = lg5Var;
        v9h1Var.f238968Q = lg5Var.f133080a;
        v9h1Var.f238969R = str2;
        v9h1Var.f238960I = str;
        synchronized (v9h1.f238951V) {
        }
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: K0 */
    public final void mo41921K0(String str, String str2) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1.f238950U.m83848a("Receive (type=text, ns=%s) %s", str, str2);
        this.f238187m.post(new nhy0(this, v9h1Var, str, str2, 11));
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: T */
    public final void mo41923T() {
        v9h1.f238950U.m83848a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: V1 */
    public final void mo41924V1(long j) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1Var.m84968X(0, j);
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: g0 */
    public final void mo41925g0(int i) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1Var.f238968Q = null;
        v9h1Var.f238969R = null;
        synchronized (v9h1.f238952W) {
        }
        if (v9h1Var.f238955D != null) {
            this.f238187m.post(new e9w(this, v9h1Var, i));
        }
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: k0 */
    public final void mo41926k0(g8f1 g8f1Var) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1.f238950U.m83848a("onDeviceStatusChanged", new Object[0]);
        this.f238187m.post(new wpa1(this, v9h1Var, g8f1Var));
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: s */
    public final void mo41927s(String str, byte[] bArr) {
        if (((v9h1) this.f238186l.get()) == null) {
            return;
        }
        ura0 ura0Var = v9h1.f238950U;
        v9h1.f238950U.m83848a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: u0 */
    public final void mo41928u0(l6f1 l6f1Var) {
        v9h1 v9h1Var = (v9h1) this.f238186l.get();
        if (v9h1Var == null) {
            return;
        }
        v9h1.f238950U.m83848a("onApplicationStatusChanged", new Object[0]);
        this.f238187m.post(new vpa1(this, v9h1Var, l6f1Var));
    }

    @Override // p204p.ycf1
    public final void zzb(int i) {
        v9h1 v9h1Var = null;
        v9h1 v9h1Var2 = (v9h1) this.f238186l.getAndSet(null);
        if (v9h1Var2 != null) {
            v9h1Var2.f238966O = -1;
            v9h1Var2.f238967P = -1;
            v9h1Var2.f238953B = null;
            v9h1Var2.f238960I = null;
            v9h1Var2.f238964M = 0.0d;
            v9h1Var2.m84967W();
            v9h1Var2.f238961J = false;
            v9h1Var2.f238965N = null;
            v9h1Var = v9h1Var2;
        }
        if (v9h1Var == null) {
            return;
        }
        v9h1.f238950U.m83848a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            int i2 = v9h1Var.f54579x.get();
            wif1 wif1Var = v9h1Var.f54561f;
            wif1Var.sendMessage(wif1Var.obtainMessage(6, i2, 2));
        }
    }

    @Override // p204p.ycf1
    public final void zzf(int i) {
        if (((v9h1) this.f238186l.get()) == null) {
            return;
        }
        synchronized (v9h1.f238951V) {
        }
    }

    @Override // p204p.ycf1
    public final void zzg(int i) {
        if (((v9h1) this.f238186l.get()) == null) {
            return;
        }
        synchronized (v9h1.f238952W) {
        }
    }

    @Override // p204p.ycf1
    public final void zzh(int i) {
        if (((v9h1) this.f238186l.get()) == null) {
            return;
        }
        synchronized (v9h1.f238952W) {
        }
    }

    @Override // p204p.ycf1
    /* JADX INFO: renamed from: P */
    public final void mo41922P(int i) {
    }

    @Override // p204p.ycf1
    public final void zzd(int i) {
    }
}
