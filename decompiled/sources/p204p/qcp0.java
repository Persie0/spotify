package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qcp0 extends scp0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f187397a;

    public qcp0(Throwable th) {
        this.f187397a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcp0) && wj50.m88271j(this.f187397a, ((qcp0) obj).f187397a);
    }

    public final int hashCode() {
        return this.f187397a.hashCode();
    }
}
