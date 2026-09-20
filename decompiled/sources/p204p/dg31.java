package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final String f48711a;

    public dg31(String str) {
        this.f48711a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg31) && wj50.m88271j(this.f48711a, ((dg31) obj).f48711a);
    }

    public final int hashCode() {
        return this.f48711a.hashCode();
    }
}
