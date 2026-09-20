package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class da01 implements fa01 {

    /* JADX INFO: renamed from: a */
    public final int f46953a;

    /* JADX INFO: renamed from: b */
    public final String f46954b;

    /* JADX INFO: renamed from: c */
    public final mb61 f46955c;

    /* JADX INFO: renamed from: d */
    public final mb61 f46956d;

    /* JADX WARN: Multi-variable type inference failed */
    public da01(int i, String str, th00 th00Var, vh00 vh00Var) {
        this.f46953a = i;
        this.f46954b = str;
        this.f46955c = (mb61) th00Var;
        this.f46956d = (mb61) vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da01)) {
            return false;
        }
        da01 da01Var = (da01) obj;
        return this.f46953a == da01Var.f46953a && this.f46954b.equals(da01Var.f46954b) && this.f46955c.equals(da01Var.f46955c) && this.f46956d.equals(da01Var.f46956d);
    }

    @Override // p204p.fa01
    /* JADX INFO: renamed from: g */
    public final int mo35391g() {
        return this.f46953a;
    }

    public final int hashCode() {
        return this.f46956d.hashCode() + ((this.f46955c.hashCode() + s571.m77245d(s571.m77243b(Integer.hashCode(this.f46953a) * 31, 31, this.f46954b), 31, false)) * 31);
    }
}
