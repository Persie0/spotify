package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mvu0 {

    /* JADX INFO: renamed from: a */
    public final tvu0 f147651a;

    /* JADX INFO: renamed from: b */
    public final sgz f147652b;

    /* JADX INFO: renamed from: c */
    public final Object f147653c = new Object();

    public mvu0(tvu0 tvu0Var, sgz sgzVar) {
        this.f147651a = tvu0Var;
        this.f147652b = sgzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m62967a() {
        synchronized (this.f147653c) {
            this.f147651a.f224244c.m79499d(-1L);
            sgz sgzVar = this.f147652b;
            sgzVar.f208958b = 0;
            ((LinkedHashMap) sgzVar.f208959c).clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m62968b(pge0 pge0Var) {
        synchronized (this.f147653c) {
            svu0 svu0Var = this.f147651a.f224244c;
            Object objRemove = svu0Var.f214511a.remove(pge0Var);
            if (objRemove != null) {
                svu0Var.f214513c = svu0Var.m79497b() - svu0Var.m79498c(pge0Var, objRemove);
                svu0Var.m79496a(pge0Var, objRemove, null);
            }
            if (objRemove != null) {
            }
            if (((LinkedHashMap) this.f147652b.f208959c).remove(pge0Var) != null) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m62969c(long j) {
        synchronized (this.f147653c) {
            svu0 svu0Var = this.f147651a.f224244c;
            svu0Var.f214512b = j;
            svu0Var.m79499d(j);
        }
    }
}
