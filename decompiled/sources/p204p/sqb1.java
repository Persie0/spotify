package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sqb1 {

    /* JADX INFO: renamed from: a */
    public final String f213054a;

    /* JADX INFO: renamed from: b */
    public final String f213055b;

    public sqb1(String str, String str2) {
        this.f213054a = str;
        this.f213055b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqb1)) {
            return false;
        }
        sqb1 sqb1Var = (sqb1) obj;
        return wj50.m88271j(this.f213054a, sqb1Var.f213054a) && wj50.m88271j(this.f213055b, sqb1Var.f213055b);
    }

    public final int hashCode() {
        return this.f213055b.hashCode() + (this.f213054a.hashCode() * 31);
    }
}
