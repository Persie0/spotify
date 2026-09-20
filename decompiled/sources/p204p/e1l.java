package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f55213a;

    public e1l(String str) {
        this.f55213a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1l) && wj50.m88271j(this.f55213a, ((e1l) obj).f55213a);
    }

    public final int hashCode() {
        return this.f55213a.hashCode();
    }
}
