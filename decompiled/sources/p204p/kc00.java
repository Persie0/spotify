package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kc00 {

    /* JADX INFO: renamed from: a */
    public final uku f121327a;

    /* JADX INFO: renamed from: b */
    public final uku f121328b;

    public kc00(uku ukuVar, uku ukuVar2) {
        this.f121327a = ukuVar;
        this.f121328b = ukuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc00)) {
            return false;
        }
        kc00 kc00Var = (kc00) obj;
        return wj50.m88271j(this.f121327a, kc00Var.f121327a) && wj50.m88271j(this.f121328b, kc00Var.f121328b);
    }

    public final int hashCode() {
        return this.f121328b.hashCode() + (this.f121327a.hashCode() * 31);
    }
}
