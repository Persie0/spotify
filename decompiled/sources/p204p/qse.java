package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qse implements rse {

    /* JADX INFO: renamed from: a */
    public final int f192077a;

    public qse(int i) {
        this.f192077a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qse) && this.f192077a == ((qse) obj).f192077a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f192077a);
    }
}
