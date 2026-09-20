package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gsv0 extends emd0 implements ServiceConnection {

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ int f84021O0 = 0;

    /* JADX INFO: renamed from: L0 */
    public bsv0 f84022L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f84023M0;

    /* JADX INFO: renamed from: N0 */
    public nrs0 f84024N0;

    /* JADX INFO: renamed from: X */
    public final ArrayList f84025X;

    /* JADX INFO: renamed from: Y */
    public boolean f84026Y;

    /* JADX INFO: renamed from: Z */
    public boolean f84027Z;

    /* JADX INFO: renamed from: i */
    public final ComponentName f84028i;

    /* JADX INFO: renamed from: t */
    public final ywh0 f84029t;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public gsv0(Context context, ComponentName componentName) {
        super(context, new t180(componentName, 18));
        this.f84025X = new ArrayList();
        this.f84028i = componentName;
        this.f84029t = new ywh0();
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: b */
    public final zld0 mo39413b(String str, cmd0 cmd0Var) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        fmd0 fmd0Var = this.f60893g;
        if (fmd0Var == null) {
            return null;
        }
        List listM42096q = fmd0Var.m42096q();
        int size = listM42096q.size();
        for (int i = 0; i < size; i++) {
            if (((tld0) listM42096q.get(i)).m81050g().equals(str)) {
                esv0 esv0Var = new esv0(this, str, cmd0Var);
                this.f84025X.add(esv0Var);
                if (this.f84023M0) {
                    esv0Var.mo33783c(this.f84022L0);
                }
                m45667m();
                return esv0Var;
            }
        }
        return null;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: d */
    public final amd0 mo36412d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m45664j(str, str2, cmd0.f39651b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: e */
    public final amd0 mo39414e(String str, cmd0 cmd0Var) {
        if (str != null) {
            return m45664j(str, null, cmd0Var);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: f */
    public final void mo36413f(uld0 uld0Var) {
        if (this.f84023M0) {
            bsv0 bsv0Var = this.f84022L0;
            int i = bsv0Var.f30404d;
            bsv0Var.f30404d = i + 1;
            bsv0Var.m30446b(10, i, 0, uld0Var != null ? uld0Var.f231530a : null, null);
        }
        m45667m();
    }

    /* JADX INFO: renamed from: i */
    public final void m45663i() {
        if (this.f84027Z) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f84028i);
        try {
            this.f84027Z = this.f60887a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final fsv0 m45664j(String str, String str2, cmd0 cmd0Var) {
        fmd0 fmd0Var = this.f60893g;
        if (fmd0Var == null) {
            return null;
        }
        List listM42096q = fmd0Var.m42096q();
        int size = listM42096q.size();
        for (int i = 0; i < size; i++) {
            if (((tld0) listM42096q.get(i)).m81050g().equals(str)) {
                fsv0 fsv0Var = new fsv0(this, str, str2, cmd0Var);
                this.f84025X.add(fsv0Var);
                if (this.f84023M0) {
                    fsv0Var.mo33783c(this.f84022L0);
                }
                m45667m();
                return fsv0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m45665k() {
        if (this.f84022L0 != null) {
            m39415g(null);
            this.f84023M0 = false;
            ArrayList arrayList = this.f84025X;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((csv0) arrayList.get(i)).mo33782b();
            }
            bsv0 bsv0Var = this.f84022L0;
            bsv0Var.m30446b(2, 0, 0, null, null);
            bsv0Var.f30402b.m32424a();
            bsv0Var.f30401a.getBinder().unlinkToDeath(bsv0Var, 0);
            bsv0Var.f30409i.f84029t.post(new asv0(bsv0Var, 0));
            this.f84022L0 = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m45666l() {
        if (this.f84027Z) {
            this.f84027Z = false;
            m45665k();
            try {
                this.f60887a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m45667m() {
        if (!this.f84026Y || (this.f60891e == null && this.f84025X.isEmpty())) {
            m45666l();
        } else {
            m45663i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f84027Z) {
            m45665k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!kwg1.m57541m(messenger)) {
                toString();
                return;
            }
            bsv0 bsv0Var = new bsv0(this, messenger);
            int i = bsv0Var.f30404d;
            bsv0Var.f30404d = i + 1;
            bsv0Var.f30407g = i;
            if (bsv0Var.m30446b(1, i, 4, null, null)) {
                try {
                    bsv0Var.f30401a.getBinder().linkToDeath(bsv0Var, 0);
                    this.f84022L0 = bsv0Var;
                } catch (RemoteException unused) {
                    bsv0Var.binderDied();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m45665k();
    }

    public final String toString() {
        return "Service connection " + this.f84028i.flattenToShortString();
    }
}
