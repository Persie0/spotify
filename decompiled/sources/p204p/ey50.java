package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ey50 {

    /* JADX INFO: renamed from: a */
    public final uku f63945a;

    /* JADX INFO: renamed from: b */
    public final uku f63946b;

    /* JADX INFO: renamed from: c */
    public final String f63947c;

    public ey50(uku ukuVar, uku ukuVar2, String str) {
        this.f63945a = ukuVar;
        this.f63946b = ukuVar2;
        this.f63947c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey50)) {
            return false;
        }
        ey50 ey50Var = (ey50) obj;
        return wj50.m88271j(this.f63945a, ey50Var.f63945a) && wj50.m88271j(this.f63946b, ey50Var.f63946b) && wj50.m88271j(this.f63947c, ey50Var.f63947c);
    }

    public final int hashCode() {
        return this.f63947c.hashCode() + ((this.f63946b.hashCode() + (this.f63945a.hashCode() * 31)) * 31);
    }
}
