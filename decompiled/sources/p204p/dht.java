package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dht implements umt {

    /* JADX INFO: renamed from: a */
    public final boolean f49150a;

    public dht(boolean z) {
        this.f49150a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dht) && this.f49150a == ((dht) obj).f49150a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49150a);
    }
}
