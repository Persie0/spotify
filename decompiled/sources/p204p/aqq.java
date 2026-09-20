package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aqq {

    /* JADX INFO: renamed from: a */
    public int f18758a;

    /* JADX INFO: renamed from: a */
    public final int m26888a() {
        return this.f18758a;
    }

    /* JADX INFO: renamed from: b */
    public final void m26889b(int i) {
        this.f18758a += i;
    }

    /* JADX INFO: renamed from: c */
    public final void m26890c(int i) {
        this.f18758a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqq) && this.f18758a == ((aqq) obj).f18758a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18758a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("DeltaCounter(count="), this.f18758a, ')');
    }
}
