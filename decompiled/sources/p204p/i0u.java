package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i0u extends o0u {

    /* JADX INFO: renamed from: a */
    public final String f97322a;

    public i0u(String str) {
        this.f97322a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0u) && wj50.m88271j(this.f97322a, ((i0u) obj).f97322a);
    }

    public final int hashCode() {
        return this.f97322a.hashCode();
    }
}
