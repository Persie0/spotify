package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z6l0 implements zb80, aqb {

    /* JADX INFO: renamed from: a */
    public final gb80 f279957a;

    /* JADX INFO: renamed from: b */
    public final w6l0 f279958b;

    /* JADX INFO: renamed from: c */
    public a7l0 f279959c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b7l0 f279960d;

    public z6l0(b7l0 b7l0Var, gb80 gb80Var, w6l0 w6l0Var) {
        this.f279960d = b7l0Var;
        this.f279957a = gb80Var;
        this.f279958b = w6l0Var;
        gb80Var.mo31986a(this);
    }

    @Override // p204p.aqb
    public final void cancel() {
        this.f279957a.mo31988d(this);
        this.f279958b.f248421b.remove(this);
        a7l0 a7l0Var = this.f279959c;
        if (a7l0Var != null) {
            a7l0Var.cancel();
        }
        this.f279959c = null;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        if (ta80Var == ta80.ON_START) {
            this.f279959c = this.f279960d.m28386b(this.f279958b);
            return;
        }
        if (ta80Var != ta80.ON_STOP) {
            if (ta80Var == ta80.ON_DESTROY) {
                cancel();
            }
        } else {
            a7l0 a7l0Var = this.f279959c;
            if (a7l0Var != null) {
                a7l0Var.cancel();
            }
        }
    }
}
