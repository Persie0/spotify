package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o6s {

    /* JADX INFO: renamed from: a */
    public final Throwable f162407a;

    public o6s(Throwable th) {
        this.f162407a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6s) && wj50.m88271j(this.f162407a, ((o6s) obj).f162407a);
    }

    public final int hashCode() {
        return this.f162407a.hashCode();
    }
}
