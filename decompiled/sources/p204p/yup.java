package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yup implements xsj0, mm21, om21, gdn0, wp20 {

    /* JADX INFO: renamed from: a */
    public final kv91 f276429a;

    /* JADX INFO: renamed from: b */
    public final hog0 f276430b = new hog0(xoc1.f263889G2.f243453a, 19);

    public yup(kv91 kv91Var) {
        this.f276429a = kv91Var;
    }

    @Override // p204p.xsj0
    /* JADX INFO: renamed from: a */
    public final boolean mo34575a(String str) {
        return str.equals("default");
    }

    @Override // p204p.wp20
    /* JADX INFO: renamed from: c */
    public final void mo51286c(String str) {
        this.f276429a.mo57453r(this.f276430b.m48036l("").m77485k().m81911i(str), null);
    }

    @Override // p204p.wp20
    /* JADX INFO: renamed from: d */
    public final void mo51287d(String str) {
        this.f276429a.mo57453r(this.f276430b.m48036l("").m77485k().m81909e(str), null);
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: f */
    public final void mo34578f(String str, String str2) {
        this.f276429a.mo57453r(this.f276430b.m48036l(str).m77495u().m81910h(str2), null);
    }

    @Override // p204p.mm21
    /* JADX INFO: renamed from: g */
    public final String mo34579g(String str, String str2, am81 am81Var) {
        return this.f276429a.mo57453r(this.f276430b.m48036l(str).m77472B().m81913k(str2, Integer.valueOf((int) am81Var.m26389b()), Integer.valueOf((int) am81Var.m26388a())), null).f46380a.f279709a;
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: h */
    public final void mo34580h(String str, String str2) {
        this.f276429a.mo57453r(this.f276430b.m48036l(str).m77495u().m81912j(str2), null);
    }

    @Override // p204p.om21
    /* JADX INFO: renamed from: i */
    public final void mo34581i(String str, String str2, am81 am81Var) {
        this.f276429a.mo57453r(this.f276430b.m48036l(str).m77476F().m81914l(str2, Integer.valueOf((int) am81Var.m26389b()), Integer.valueOf((int) am81Var.m26388a())), null);
    }
}
