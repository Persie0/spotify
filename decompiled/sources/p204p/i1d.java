package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i1d implements s1d {

    /* JADX INFO: renamed from: a */
    public final String f97480a;

    public i1d(String str) {
        this.f97480a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1d) && wj50.m88271j(this.f97480a, ((i1d) obj).f97480a);
    }

    public final int hashCode() {
        return this.f97480a.hashCode();
    }
}
