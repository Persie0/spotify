package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class koe0 extends g3h1 {

    /* JADX INFO: renamed from: b */
    public final hhv f124771b;

    /* JADX INFO: renamed from: c */
    public final e2a f124772c;

    public koe0(hhv hhvVar, e2a e2aVar) {
        this.f124771b = hhvVar;
        this.f124772c = e2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koe0)) {
            return false;
        }
        koe0 koe0Var = (koe0) obj;
        return wj50.m88271j(this.f124771b, koe0Var.f124771b) && this.f124772c.equals(koe0Var.f124772c);
    }

    public final int hashCode() {
        return this.f124772c.hashCode() + (this.f124771b.hashCode() * 31);
    }
}
