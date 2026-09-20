package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l5d0 implements o5d0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f129878a;

    public l5d0(Throwable th) {
        this.f129878a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5d0) && wj50.m88271j(this.f129878a, ((l5d0) obj).f129878a);
    }

    public final int hashCode() {
        return this.f129878a.hashCode();
    }
}
