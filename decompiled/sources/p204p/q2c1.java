package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q2c1 implements b3c1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f184587a;

    public q2c1(Throwable th) {
        this.f184587a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2c1) && wj50.m88271j(this.f184587a, ((q2c1) obj).f184587a);
    }

    public final int hashCode() {
        return this.f184587a.hashCode();
    }
}
