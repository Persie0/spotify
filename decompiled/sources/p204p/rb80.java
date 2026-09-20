package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rb80 implements gc80, vdb {

    /* JADX INFO: renamed from: b */
    public final hc80 f197525b;

    /* JADX INFO: renamed from: c */
    public final vgb f197526c;

    /* JADX INFO: renamed from: a */
    public final Object f197524a = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f197527d = false;

    public rb80(hc80 hc80Var, vgb vgbVar) {
        this.f197525b = hc80Var;
        this.f197526c = vgbVar;
        if (hc80Var.getLifecycle().mo31987b().m41223a(fb80.f67753d)) {
            vgbVar.m85418e();
        } else {
            vgbVar.m85422s();
        }
        hc80Var.getLifecycle().mo31986a(this);
    }

    @Override // p204p.vdb
    /* JADX INFO: renamed from: a */
    public final gfb mo50433a() {
        return this.f197526c.f241197N0;
    }

    /* JADX INFO: renamed from: b */
    public final List m75168b() {
        List listUnmodifiableList;
        synchronized (this.f197524a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f197526c.m85424w());
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: e */
    public final void m75169e() {
        synchronized (this.f197524a) {
            try {
                if (this.f197527d) {
                    return;
                }
                onStop(this.f197525b);
                this.f197527d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m75170i() {
        synchronized (this.f197524a) {
            try {
                if (this.f197527d) {
                    this.f197527d = false;
                    if (this.f197525b.getLifecycle().mo31987b().m41223a(fb80.f67753d)) {
                        onStart(this.f197525b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @zal0(ta80.ON_DESTROY)
    public void onDestroy(hc80 hc80Var) {
        synchronized (this.f197524a) {
            vgb vgbVar = this.f197526c;
            vgbVar.m85426z((ArrayList) vgbVar.m85424w());
        }
    }

    @zal0(ta80.ON_PAUSE)
    public void onPause(hc80 hc80Var) {
        this.f197526c.f241204a.mo50328f(false);
    }

    @zal0(ta80.ON_RESUME)
    public void onResume(hc80 hc80Var) {
        this.f197526c.f241204a.mo50328f(true);
    }

    @zal0(ta80.ON_START)
    public void onStart(hc80 hc80Var) {
        synchronized (this.f197524a) {
            try {
                if (!this.f197527d) {
                    this.f197526c.m85418e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @zal0(ta80.ON_STOP)
    public void onStop(hc80 hc80Var) {
        synchronized (this.f197524a) {
            try {
                if (!this.f197527d) {
                    this.f197526c.m85422s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
