package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b120 implements e120 {

    /* JADX INFO: renamed from: a */
    public final Throwable f22185a;

    public b120(Throwable th) {
        this.f22185a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b120) && wj50.m88271j(this.f22185a, ((b120) obj).f22185a);
    }

    public final int hashCode() {
        return this.f22185a.hashCode();
    }
}
