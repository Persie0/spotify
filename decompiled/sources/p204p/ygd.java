package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ygd {

    /* JADX INFO: renamed from: a */
    public final dut f272561a;

    /* JADX INFO: renamed from: b */
    public final chd f272562b;

    public ygd(dut dutVar, chd chdVar) {
        this.f272561a = dutVar;
        this.f272562b = chdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygd)) {
            return false;
        }
        ygd ygdVar = (ygd) obj;
        return wj50.m88271j(this.f272561a, ygdVar.f272561a) && wj50.m88271j(this.f272562b, ygdVar.f272562b);
    }

    public final int hashCode() {
        return this.f272562b.hashCode() + (this.f272561a.hashCode() * 31);
    }
}
