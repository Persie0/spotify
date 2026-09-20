package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p1d implements s1d {

    /* JADX INFO: renamed from: a */
    public final String f173051a;

    public p1d(String str) {
        this.f173051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1d) && wj50.m88271j(this.f173051a, ((p1d) obj).f173051a);
    }

    public final int hashCode() {
        return this.f173051a.hashCode();
    }
}
