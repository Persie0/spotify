package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t0f1 {

    /* JADX INFO: renamed from: a */
    public final d1f1 f215878a;

    /* JADX INFO: renamed from: b */
    public final h1f1 f215879b;

    public t0f1(d1f1 d1f1Var, h1f1 h1f1Var) {
        this.f215878a = d1f1Var;
        this.f215879b = h1f1Var;
    }

    /* JADX INFO: renamed from: a */
    public final y7h1 m79785a(m2f1 m2f1Var) {
        long j = m2f1Var.f139334a;
        Object[] objArr = {Long.valueOf(j)};
        d1f1 d1f1Var = this.f215878a;
        d1f1Var.f44255a.m31382b("warmUpIntegrityToken(%s)", objArr);
        ev61 ev61Var = new ev61();
        z0f1 z0f1Var = new z0f1(d1f1Var, ev61Var, j, ev61Var);
        f0f1 f0f1Var = d1f1Var.f44259e;
        f0f1Var.getClass();
        f0f1Var.m40478a().post(new f3f1(f0f1Var, ev61Var, ev61Var, z0f1Var));
        s0f1 s0f1Var = new s0f1(0, this, m2f1Var);
        y7h1 y7h1Var = ev61Var.f63172a;
        y7h1Var.getClass();
        co50 co50Var = gv61.f84648a;
        y7h1 y7h1Var2 = new y7h1();
        y7h1Var.f270086b.m82451b(new d8g1(co50Var, s0f1Var, y7h1Var2));
        y7h1Var.m92999t();
        return y7h1Var2;
    }
}
