package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vq90 extends hr90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f243903a;

    public vq90(Throwable th) {
        this.f243903a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq90) && wj50.m88271j(this.f243903a, ((vq90) obj).f243903a);
    }

    public final int hashCode() {
        return this.f243903a.hashCode();
    }
}
