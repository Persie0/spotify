package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f22374a;

    public b1l(String str) {
        this.f22374a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1l) && wj50.m88271j(this.f22374a, ((b1l) obj).f22374a);
    }

    public final int hashCode() {
        return this.f22374a.hashCode();
    }
}
