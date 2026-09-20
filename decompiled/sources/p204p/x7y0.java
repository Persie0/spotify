package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x7y0 implements e9w0 {

    /* JADX INFO: renamed from: a */
    public s9y0 f259014a;

    /* JADX INFO: renamed from: b */
    public e8y0 f259015b;

    /* JADX INFO: renamed from: c */
    public String f259016c;

    /* JADX INFO: renamed from: d */
    public Object f259017d;

    /* JADX INFO: renamed from: e */
    public Object[] f259018e;

    /* JADX INFO: renamed from: f */
    public d8y0 f259019f;

    /* JADX INFO: renamed from: g */
    public final ew40 f259020g = new ew40(this, 15);

    public x7y0(s9y0 s9y0Var, e8y0 e8y0Var, String str, Object obj, Object[] objArr) {
        this.f259014a = s9y0Var;
        this.f259015b = e8y0Var;
        this.f259016c = str;
        this.f259017d = obj;
        this.f259018e = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m90176a() {
        e8y0 e8y0Var = this.f259015b;
        if (this.f259019f != null) {
            throw new IllegalArgumentException(("entry(" + this.f259019f + ") is not null").toString());
        }
        if (e8y0Var != null) {
            ew40 ew40Var = this.f259020g;
            dul.m37002e(e8y0Var, ew40Var.invoke());
            this.f259019f = e8y0Var.mo38136f(this.f259016c, ew40Var);
        }
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        m90176a();
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
        d8y0 d8y0Var = this.f259019f;
        if (d8y0Var != null) {
            ((ezw0) d8y0Var).m40407D();
        }
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
        d8y0 d8y0Var = this.f259019f;
        if (d8y0Var != null) {
            ((ezw0) d8y0Var).m40407D();
        }
    }
}
