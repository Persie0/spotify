package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s830 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f206530a;

    /* JADX INFO: renamed from: b */
    public final m730 f206531b;

    public s830(String str, m730 m730Var) {
        this.f206530a = str;
        this.f206531b = m730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s830)) {
            return false;
        }
        s830 s830Var = (s830) obj;
        return wj50.m88271j(this.f206530a, s830Var.f206530a) && wj50.m88271j(this.f206531b, s830Var.f206531b);
    }

    public final int hashCode() {
        return this.f206531b.hashCode() + (this.f206530a.hashCode() * 31);
    }
}
