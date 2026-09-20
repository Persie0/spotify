package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sdk0 {

    /* JADX INFO: renamed from: a */
    public final zam0 f208027a;

    /* JADX INFO: renamed from: b */
    public final m7i0 f208028b;

    /* JADX INFO: renamed from: e */
    public gb80 f208031e;

    /* JADX INFO: renamed from: f */
    public s7i0 f208032f;

    /* JADX INFO: renamed from: c */
    public final r12 f208029c = new r12(this, 7);

    /* JADX INFO: renamed from: d */
    public final boolean f208030d = true;

    /* JADX INFO: renamed from: g */
    public final g6m0 f208033g = new g6m0(new qdk0(this, 0), new qdk0(this, 1), new rdk0(this, 0));

    public sdk0(l7i0 l7i0Var, zam0 zam0Var) {
        this.f208027a = zam0Var;
        this.f208028b = l7i0Var.m58415a(new xo3(2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m77846a(sdk0 sdk0Var) {
        fb80 fb80VarMo31987b;
        gb80 gb80Var = sdk0Var.f208031e;
        if (gb80Var != null && (fb80VarMo31987b = gb80Var.mo31987b()) != null && fb80VarMo31987b.m41223a(fb80.f67753d) && sdk0Var.f208030d) {
            if (sdk0Var.f208032f != null) {
                return;
            }
            sdk0Var.f208032f = sdk0Var.f208028b.m61064a(new e7i0("npv", new rdk0(sdk0Var, 1)), 3);
        } else {
            s7i0 s7i0Var = sdk0Var.f208032f;
            if (s7i0Var != null) {
                s7i0Var.mo43758d();
            }
            sdk0Var.f208032f = null;
        }
    }
}
