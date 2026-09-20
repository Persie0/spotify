package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j2z0 implements dut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108195a = 1;

    /* JADX INFO: renamed from: b */
    public final uut f108196b;

    /* JADX INFO: renamed from: c */
    public final avt f108197c;

    /* JADX INFO: renamed from: d */
    public final String f108198d;

    /* JADX INFO: renamed from: e */
    public final pwt f108199e;

    public j2z0(dut dutVar, gh00 gh00Var, Object obj) {
        this.f108196b = dutVar.getBehavior();
        this.f108197c = dutVar.mo24358a();
        this.f108198d = dutVar.mo29771b();
        this.f108199e = new jd80(gh00Var, obj, dutVar, 1);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f108195a) {
            case 0:
                break;
        }
        return this.f108197c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: b */
    public final String mo29771b() {
        switch (this.f108195a) {
            case 0:
                break;
        }
        return this.f108198d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f108195a) {
            case 0:
                break;
        }
        return (jd80) this.f108199e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f108195a) {
            case 0:
                break;
        }
        return this.f108196b;
    }

    public j2z0(Object obj, gh00 gh00Var, xjc0 xjc0Var) {
        this.f108196b = xjc0Var.f262103e;
        this.f108197c = xjc0Var.f262104f;
        this.f108198d = xjc0Var.f262099a.mo29380b();
        this.f108199e = new jd80(obj, gh00Var, xjc0Var);
    }
}
