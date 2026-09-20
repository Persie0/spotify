package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mk5 implements qk5 {

    /* JADX INFO: renamed from: a */
    public final Throwable f144494a;

    public mk5(Throwable th) {
        this.f144494a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk5) && wj50.m88271j(this.f144494a, ((mk5) obj).f144494a);
    }

    public final int hashCode() {
        return this.f144494a.hashCode();
    }
}
