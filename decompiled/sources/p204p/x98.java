package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x98 {

    /* JADX INFO: renamed from: a */
    public final String f259294a;

    public x98(String str) {
        this.f259294a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x98) && wj50.m88271j(this.f259294a, ((x98) obj).f259294a);
    }

    public final int hashCode() {
        return this.f259294a.hashCode();
    }
}
