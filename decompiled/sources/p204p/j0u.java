package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j0u extends o0u {

    /* JADX INFO: renamed from: a */
    public final String f107556a;

    public j0u(String str) {
        this.f107556a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0u) && wj50.m88271j(this.f107556a, ((j0u) obj).f107556a);
    }

    public final int hashCode() {
        return this.f107556a.hashCode();
    }
}
