package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v1q0 implements xsj0, mm21, om21, gdn0, q0w0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f236439a;

    /* JADX INFO: renamed from: b */
    public final hog0 f236440b = new hog0(xoc1.f263889G2.f243453a, 23);

    public v1q0(kv91 kv91Var) {
        this.f236439a = kv91Var;
    }

    @Override // p204p.xsj0
    /* JADX INFO: renamed from: a */
    public final boolean mo34575a(String str) {
        return str.equals("podcast");
    }

    @Override // p204p.q0w0
    /* JADX INFO: renamed from: b */
    public final void mo34576b(String str) {
        this.f236439a.mo57453r(this.f236440b.m48039o(str).m77471A().m89267i(-15000), null);
    }

    @Override // p204p.q0w0
    /* JADX INFO: renamed from: e */
    public final void mo34577e(String str) {
        this.f236439a.mo57453r(this.f236440b.m48039o(str).m77471A().m89267i(15000), null);
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: f */
    public final void mo34578f(String str, String str2) {
        this.f236439a.mo57453r(this.f236440b.m48039o(str).m77498x().m89265e(str2), null);
    }

    @Override // p204p.mm21
    /* JADX INFO: renamed from: g */
    public final String mo34579g(String str, String str2, am81 am81Var) {
        return this.f236439a.mo57453r(this.f236440b.m48039o(str).m77475E().m89268j(str2, Integer.valueOf((int) am81Var.m26389b()), Integer.valueOf((int) am81Var.m26388a())), null).f46380a.f279709a;
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: h */
    public final void mo34580h(String str, String str2) {
        this.f236439a.mo57453r(this.f236440b.m48039o(str).m77498x().m89266h(str2), null);
    }

    @Override // p204p.om21
    /* JADX INFO: renamed from: i */
    public final void mo34581i(String str, String str2, am81 am81Var) {
        this.f236439a.mo57453r(this.f236440b.m48039o(str).m77479I().m89269k(str2, Integer.valueOf((int) am81Var.m26389b()), Integer.valueOf((int) am81Var.m26388a())), null);
    }
}
