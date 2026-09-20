package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s3c1 implements v3c1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f205263a;

    public s3c1(Throwable th) {
        this.f205263a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3c1) && wj50.m88271j(this.f205263a, ((s3c1) obj).f205263a);
    }

    public final int hashCode() {
        return this.f205263a.hashCode();
    }
}
