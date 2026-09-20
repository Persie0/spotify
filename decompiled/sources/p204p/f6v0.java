package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f66507a;

    public f6v0(Throwable th) {
        this.f66507a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6v0) && wj50.m88271j(this.f66507a, ((f6v0) obj).f66507a);
    }

    public final int hashCode() {
        return this.f66507a.hashCode();
    }
}
