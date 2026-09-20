package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hd91 {

    /* JADX INFO: renamed from: a */
    public final t28 f90082a;

    /* JADX INFO: renamed from: b */
    public final String f90083b;

    /* JADX INFO: renamed from: c */
    public final keu f90084c;

    /* JADX INFO: renamed from: d */
    public final z591 f90085d;

    /* JADX INFO: renamed from: e */
    public final id91 f90086e;

    public hd91(t28 t28Var, String str, keu keuVar, z591 z591Var, id91 id91Var) {
        this.f90082a = t28Var;
        this.f90083b = str;
        this.f90084c = keuVar;
        this.f90085d = z591Var;
        this.f90086e = id91Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m47179a(s08 s08Var, kd91 kd91Var) {
        hol0 hol0VarM27942a = b28.m27942a();
        hol0VarM27942a.m48082E(this.f90082a);
        hol0VarM27942a.m48080C(s08Var);
        hol0VarM27942a.m48083F(this.f90083b);
        hol0VarM27942a.m48081D(this.f90085d);
        hol0VarM27942a.m48079B(this.f90084c);
        b28 b28VarM48090m = hol0VarM27942a.m48090m();
        id91 id91Var = this.f90086e;
        zfy0 zfy0Var = id91Var.f100990c;
        t28 t28VarM79892b = b28VarM48090m.m27946e().m79892b(b28VarM48090m.m27944c().f204318c);
        rk0 rk0Var = new rk0();
        rk0Var.m75689Q(new HashMap());
        rk0Var.m75692T(id91Var.f100988a.mo66379d());
        rk0Var.m75698Z(id91Var.f100989b.mo66379d());
        rk0Var.m75697Y(b28VarM48090m.m27947f());
        rk0Var.m75691S(new aeu(b28VarM48090m.m27943b(), b28VarM48090m.m27945d()));
        rk0Var.m75690R(b28VarM48090m.m27944c().f204316a);
        b28VarM48090m.m27944c().getClass();
        b28VarM48090m.m27944c().getClass();
        o5q o5qVar = (o5q) zfy0Var;
        o5qVar.f162050b.execute(new feb(o5qVar, t28VarM79892b, kd91Var, rk0Var.m75710z(), 3));
    }

    /* JADX INFO: renamed from: b */
    public final void m47180b(s08 s08Var) {
        m47179a(s08Var, new gx31(16));
    }
}
