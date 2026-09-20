package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l0u extends o0u {

    /* JADX INFO: renamed from: a */
    public final String f128512a;

    public l0u(String str) {
        this.f128512a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0u) && wj50.m88271j(this.f128512a, ((l0u) obj).f128512a);
    }

    public final int hashCode() {
        return this.f128512a.hashCode();
    }
}
