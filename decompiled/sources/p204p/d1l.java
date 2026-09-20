package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f44308a;

    public d1l(String str) {
        this.f44308a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1l) && wj50.m88271j(this.f44308a, ((d1l) obj).f44308a);
    }

    public final int hashCode() {
        return this.f44308a.hashCode();
    }
}
