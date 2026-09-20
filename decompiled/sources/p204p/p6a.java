package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p6a implements q6a {

    /* JADX INFO: renamed from: a */
    public final String f174331a;

    public p6a(String str) {
        this.f174331a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6a) && wj50.m88271j(this.f174331a, ((p6a) obj).f174331a);
    }

    public final int hashCode() {
        return this.f174331a.hashCode();
    }
}
