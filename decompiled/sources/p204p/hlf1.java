package p204p;

import com.google.android.gms.internal.wearable.zzed;

/* JADX INFO: loaded from: classes.dex */
public abstract class hlf1 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final qlf1 f92684a;

    /* JADX INFO: renamed from: b */
    public qlf1 f92685b;

    /* JADX INFO: renamed from: c */
    public boolean f92686c = false;

    public hlf1(qlf1 qlf1Var) {
        this.f92684a = qlf1Var;
        this.f92685b = (qlf1) qlf1Var.mo58162b(4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m47880b(qlf1 qlf1Var) {
        if (this.f92686c) {
            m47883e();
            this.f92686c = false;
        }
        qlf1 qlf1Var2 = this.f92685b;
        mtf1.f147064c.m62822a(qlf1Var2.getClass()).mo36936d(qlf1Var2, qlf1Var);
    }

    /* JADX INFO: renamed from: c */
    public final qlf1 m47881c() {
        qlf1 qlf1VarM47882d = m47882d();
        if (qlf1VarM47882d.m73184g()) {
            return qlf1VarM47882d;
        }
        throw new zzed();
    }

    public final Object clone() {
        hlf1 hlf1Var = (hlf1) this.f92684a.mo58162b(5, null);
        hlf1Var.m47880b(m47882d());
        return hlf1Var;
    }

    /* JADX INFO: renamed from: d */
    public final qlf1 m47882d() {
        if (this.f92686c) {
            return this.f92685b;
        }
        qlf1 qlf1Var = this.f92685b;
        mtf1.f147064c.m62822a(qlf1Var.getClass()).zzf(qlf1Var);
        this.f92686c = true;
        return this.f92685b;
    }

    /* JADX INFO: renamed from: e */
    public final void m47883e() {
        qlf1 qlf1Var = (qlf1) this.f92685b.mo58162b(4, null);
        mtf1.f147064c.m62822a(qlf1Var.getClass()).mo36936d(qlf1Var, this.f92685b);
        this.f92685b = qlf1Var;
    }
}
