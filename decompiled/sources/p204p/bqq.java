package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bqq {

    /* JADX INFO: renamed from: a */
    public int f29869a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqq) && this.f29869a == ((bqq) obj).f29869a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29869a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("DeltaCounter(count="), this.f29869a, ')');
    }
}
