package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dyl0 extends eyl0 {

    /* JADX INFO: renamed from: a */
    public final Object f54411a;

    public dyl0(Object obj) {
        this.f54411a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyl0) && wj50.m88271j(this.f54411a, ((dyl0) obj).f54411a);
    }

    public final int hashCode() {
        return this.f54411a.hashCode();
    }

    public final String toString() {
        return "Success(model=" + this.f54411a + ")";
    }
}
