package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rcu {

    /* JADX INFO: renamed from: a */
    public final boolean f197927a;

    public rcu(boolean z) {
        this.f197927a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcu) && this.f197927a == ((rcu) obj).f197927a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197927a);
    }
}
