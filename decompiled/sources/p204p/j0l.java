package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f107479a;

    public j0l(String str) {
        this.f107479a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0l) && wj50.m88271j(this.f107479a, ((j0l) obj).f107479a);
    }

    public final int hashCode() {
        return this.f107479a.hashCode();
    }
}
