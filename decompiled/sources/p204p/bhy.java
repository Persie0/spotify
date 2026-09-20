package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bhy implements dhy {

    /* JADX INFO: renamed from: a */
    public final Throwable f27269a;

    public bhy(Throwable th) {
        this.f27269a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhy) && wj50.m88271j(this.f27269a, ((bhy) obj).f27269a);
    }

    public final int hashCode() {
        return this.f27269a.hashCode();
    }
}
