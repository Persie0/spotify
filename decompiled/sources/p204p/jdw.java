package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jdw implements r820 {

    /* JADX INFO: renamed from: a */
    public final Throwable f111403a;

    public jdw(Throwable th) {
        this.f111403a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdw) && wj50.m88271j(this.f111403a, ((jdw) obj).f111403a);
    }

    public final int hashCode() {
        return this.f111403a.hashCode();
    }
}
