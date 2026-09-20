package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f225857a;

    public u1l(String str) {
        this.f225857a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1l) && wj50.m88271j(this.f225857a, ((u1l) obj).f225857a);
    }

    public final int hashCode() {
        return this.f225857a.hashCode();
    }
}
