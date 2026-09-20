package p204p;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class n1r0 extends d6a0 implements w3x0 {

    /* JADX INFO: renamed from: d */
    public final r1r0 f149492d;

    /* JADX INFO: renamed from: e */
    public final v2r0 f149493e;

    /* JADX INFO: renamed from: f */
    public final zv41 f149494f;

    /* JADX INFO: renamed from: g */
    public final nuu0 f149495g;

    /* JADX INFO: renamed from: h */
    public final c9k f149496h;

    /* JADX INFO: renamed from: i */
    public di41 f149497i;

    /* JADX INFO: renamed from: t */
    public icm f149498t;

    public n1r0(r1r0 r1r0Var, v2r0 v2r0Var) {
        this.f149492d = r1r0Var;
        this.f149493e = v2r0Var;
        zv41 zv41VarM52819d = jag1.m52819d(t1r0.f216343a);
        this.f149494f = zv41VarM52819d;
        this.f149495g = bzf1.m31021m(zv41VarM52819d);
        this.f149496h = kk40.m56661c(qlg1.m73202g());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Object m63519k(n1r0 n1r0Var, ibk ibkVar) {
        l1r0 l1r0Var;
        Object objM84525a;
        Object c6x0Var;
        if (ibkVar instanceof l1r0) {
            l1r0Var = (l1r0) ibkVar;
            int i = l1r0Var.f128777c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1r0Var.f128777c = i - Integer.MIN_VALUE;
            } else {
                l1r0Var = new l1r0(n1r0Var, ibkVar);
            }
        } else {
            l1r0Var = new l1r0(n1r0Var, ibkVar);
        }
        Object obj = l1r0Var.f128775a;
        int i2 = l1r0Var.f128777c;
        if (i2 == 0) {
            bga.m29073P(obj);
            v2r0 v2r0Var = n1r0Var.f149493e;
            String str = n1r0Var.f149492d.f194904a;
            l1r0Var.f128777c = 1;
            objM84525a = v2r0Var.m84525a(str, l1r0Var);
            yuk yukVar = yuk.f276404a;
            if (objM84525a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM84525a = ((s6x0) obj).f206218a;
        }
        if (!(objM84525a instanceof c6x0)) {
            try {
                c6x0Var = new o1r0((z2r0) objM84525a, null, false);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            objM84525a = c6x0Var;
        }
        if (!(objM84525a instanceof c6x0)) {
            zv41 zv41Var = n1r0Var.f149494f;
            s1r0 s1r0Var = new s1r0((o1r0) objM84525a);
            zv41Var.getClass();
            zv41Var.m97091m(null, s1r0Var);
        }
        return objM84525a;
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        this.f149498t = (icm) bundle.getParcelable("preset_details_customization_input");
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        if (this.f149495g.f158717a.getValue() instanceof s1r0) {
            m35106i();
            return;
        }
        this.f149497i = x0h1.m89578u(this.f149496h, null, 0, new onm0(this, (fbk) null, 24), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f149497i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m63520l(ibk ibkVar) {
        m1r0 m1r0Var;
        Object value;
        u1r0 s1r0Var;
        o1r0 o1r0Var;
        Object value2;
        u1r0 s1r0Var2;
        Object objM84527c;
        Object value3;
        u1r0 s1r0Var3;
        y2r0 y2r0Var;
        Object value4;
        u1r0 s1r0Var4;
        if (ibkVar instanceof m1r0) {
            m1r0Var = (m1r0) ibkVar;
            int i = m1r0Var.f139060c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1r0Var.f139060c = i - Integer.MIN_VALUE;
            } else {
                m1r0Var = new m1r0(this, ibkVar);
            }
        } else {
            m1r0Var = new m1r0(this, ibkVar);
        }
        Object obj = m1r0Var.f139058a;
        int i2 = m1r0Var.f139060c;
        t1r0 t1r0Var = t1r0.f216343a;
        zv41 zv41Var = this.f149494f;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Object value5 = this.f149495g.f158717a.getValue();
                s1r0 s1r0Var5 = value5 instanceof s1r0 ? (s1r0) value5 : null;
                if (s1r0Var5 == null || (o1r0Var = s1r0Var5.f204783a) == null || o1r0Var.f160838c) {
                    return null;
                }
                do {
                    value2 = zv41Var.getValue();
                    s1r0Var2 = (u1r0) value2;
                    if (s1r0Var2 instanceof s1r0) {
                        s1r0Var2 = new s1r0(o1r0.m66079a(((s1r0) s1r0Var2).f204783a, null, true, 3));
                    } else if (!wj50.m88271j(s1r0Var2, t1r0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!zv41Var.m97089k(value2, s1r0Var2));
                v2r0 v2r0Var = this.f149493e;
                String str = o1r0Var.f160836a.f278646a;
                m1r0Var.f139060c = 1;
                objM84527c = v2r0Var.m84527c(str, m1r0Var);
                yuk yukVar = yuk.f276404a;
                if (objM84527c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                objM84527c = ((s6x0) obj).f206218a;
            }
            if (s6x0.m77348a(objM84527c) == null) {
                y2r0Var = (y2r0) objM84527c;
                m63521m(new p0r0(y2r0Var, 1));
            } else {
                do {
                    value3 = zv41Var.getValue();
                    s1r0Var3 = (u1r0) value3;
                    if (s1r0Var3 instanceof s1r0) {
                        s1r0Var3 = new s1r0(o1r0.m66079a(((s1r0) s1r0Var3).f204783a, null, false, 3));
                    } else if (!wj50.m88271j(s1r0Var3, t1r0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!zv41Var.m97089k(value3, s1r0Var3));
                y2r0Var = null;
            }
            do {
                value4 = zv41Var.getValue();
                s1r0Var4 = (u1r0) value4;
                if (s1r0Var4 instanceof s1r0) {
                    s1r0Var4 = new s1r0(o1r0.m66079a(((s1r0) s1r0Var4).f204783a, null, false, 3));
                } else if (!wj50.m88271j(s1r0Var4, t1r0Var)) {
                    throw new NoWhenBranchMatchedException();
                }
            } while (!zv41Var.m97089k(value4, s1r0Var4));
            return y2r0Var;
        } catch (Throwable th) {
            do {
                value = zv41Var.getValue();
                s1r0Var = (u1r0) value;
                if (s1r0Var instanceof s1r0) {
                    s1r0Var = new s1r0(o1r0.m66079a(((s1r0) s1r0Var).f204783a, null, false, 3));
                } else if (!wj50.m88271j(s1r0Var, t1r0Var)) {
                    throw new NoWhenBranchMatchedException();
                }
            } while (!zv41Var.m97089k(value, s1r0Var));
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m63521m(p0r0 p0r0Var) {
        zv41 zv41Var;
        Object value;
        u1r0 s1r0Var;
        do {
            zv41Var = this.f149494f;
            value = zv41Var.getValue();
            s1r0Var = (u1r0) value;
            if (s1r0Var instanceof s1r0) {
                s1r0Var = new s1r0((o1r0) p0r0Var.invoke(((s1r0) s1r0Var).f204783a));
            } else if (!wj50.m88271j(s1r0Var, t1r0.f216343a)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!zv41Var.m97089k(value, s1r0Var));
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("preset_details_customization_input", this.f149498t);
        return bundle;
    }
}
