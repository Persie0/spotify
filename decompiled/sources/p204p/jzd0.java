package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jzd0 extends kzd0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f117704a;

    /* JADX INFO: renamed from: b */
    public final String f117705b;

    /* JADX INFO: renamed from: c */
    public final b250 f117706c;

    public jzd0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f117704a = ezs0Var;
        this.f117705b = str;
        this.f117706c = b250Var;
    }

    @Override // p204p.kzd0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo51989a() {
        return this.f117704a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzd0)) {
            return false;
        }
        jzd0 jzd0Var = (jzd0) obj;
        return wj50.m88271j(this.f117704a, jzd0Var.f117704a) && wj50.m88271j(this.f117705b, jzd0Var.f117705b) && wj50.m88271j(this.f117706c, jzd0Var.f117706c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f117705b;
    }

    public final int hashCode() {
        return this.f117706c.hashCode() + s571.m77243b(this.f117704a.hashCode() * 31, 31, this.f117705b);
    }
}
