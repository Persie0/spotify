package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s630 {

    /* JADX INFO: renamed from: a */
    public final dut f205989a;

    /* JADX INFO: renamed from: b */
    public final Object f205990b;

    public s630(Object obj, dut dutVar) {
        this.f205989a = dutVar;
        this.f205990b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s630)) {
            return false;
        }
        s630 s630Var = (s630) obj;
        return wj50.m88271j(this.f205989a, s630Var.f205989a) && wj50.m88271j(this.f205990b, s630Var.f205990b);
    }

    public final int hashCode() {
        return this.f205990b.hashCode() + (this.f205989a.hashCode() * 31);
    }
}
