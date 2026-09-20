package p204p;

import com.google.android.gms.internal.play_billing.zzia;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g3g1 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final r3g1 f76213a;

    /* JADX INFO: renamed from: b */
    public r3g1 f76214b;

    public g3g1(r3g1 r3g1Var) {
        this.f76213a = r3g1Var;
        if (r3g1Var.m74649h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f76214b = r3g1Var.m74652n();
    }

    /* JADX INFO: renamed from: b */
    public final r3g1 m43487b() {
        r3g1 r3g1VarM43488c = m43488c();
        r3g1VarM43488c.getClass();
        if (r3g1.m74641i(r3g1VarM43488c, true)) {
            return r3g1VarM43488c;
        }
        throw new zzia();
    }

    /* JADX INFO: renamed from: c */
    public final r3g1 m43488c() {
        if (!this.f76214b.m74649h()) {
            return this.f76214b;
        }
        r3g1 r3g1Var = this.f76214b;
        r3g1Var.getClass();
        l9g1.f131088c.m58515a(r3g1Var.getClass()).zzf(r3g1Var);
        r3g1Var.m74647e();
        return this.f76214b;
    }

    public final Object clone() {
        g3g1 g3g1Var = (g3g1) this.f76213a.mo29132j(5);
        g3g1Var.f76214b = m43488c();
        return g3g1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m43489d() {
        if (this.f76214b.m74649h()) {
            return;
        }
        r3g1 r3g1VarM74652n = this.f76213a.m74652n();
        l9g1.f131088c.m58515a(r3g1VarM74652n.getClass()).zzg(r3g1VarM74652n, this.f76214b);
        this.f76214b = r3g1VarM74652n;
    }
}
