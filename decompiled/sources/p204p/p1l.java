package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f173129a;

    public p1l(String str) {
        this.f173129a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1l) && wj50.m88271j(this.f173129a, ((p1l) obj).f173129a);
    }

    public final int hashCode() {
        return this.f173129a.hashCode();
    }
}
