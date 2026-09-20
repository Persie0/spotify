package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dob implements gob {

    /* JADX INFO: renamed from: a */
    public final Throwable f51003a;

    public dob(Throwable th) {
        this.f51003a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dob) && wj50.m88271j(this.f51003a, ((dob) obj).f51003a);
    }

    public final int hashCode() {
        return this.f51003a.hashCode();
    }
}
