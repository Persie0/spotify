package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z940 {

    /* JADX INFO: renamed from: a */
    public final String f280661a;

    /* JADX INFO: renamed from: b */
    public final Long f280662b;

    public z940(Long l, String str) {
        this.f280661a = str;
        this.f280662b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z940)) {
            return false;
        }
        z940 z940Var = (z940) obj;
        return wj50.m88271j(this.f280661a, z940Var.f280661a) && this.f280662b.equals(z940Var.f280662b);
    }

    public final int hashCode() {
        return (this.f280662b.hashCode() + (this.f280661a.hashCode() * 31)) * 31;
    }
}
