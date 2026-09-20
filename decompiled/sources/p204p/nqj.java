package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final vbv f157285a;

    public nqj(vbv vbvVar) {
        this.f157285a = vbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqj) && wj50.m88271j(this.f157285a, ((nqj) obj).f157285a);
    }

    public final int hashCode() {
        return this.f157285a.hashCode();
    }
}
