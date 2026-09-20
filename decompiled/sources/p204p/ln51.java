package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ln51 implements on51 {

    /* JADX INFO: renamed from: a */
    public final Throwable f135095a;

    public ln51(Throwable th) {
        this.f135095a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln51) && wj50.m88271j(this.f135095a, ((ln51) obj).f135095a);
    }

    public final int hashCode() {
        return this.f135095a.hashCode();
    }
}
