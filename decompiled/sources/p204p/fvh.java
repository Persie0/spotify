package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fvh {

    /* JADX INFO: renamed from: a */
    public final String f73797a;

    public fvh(String str) {
        this.f73797a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvh) && wj50.m88271j(this.f73797a, ((fvh) obj).f73797a);
    }

    public final int hashCode() {
        return this.f73797a.hashCode();
    }
}
