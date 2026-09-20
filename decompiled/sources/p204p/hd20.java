package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hd20 {

    /* JADX INFO: renamed from: a */
    public final Boolean f89972a;

    public hd20(Boolean bool) {
        this.f89972a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd20) && wj50.m88271j(this.f89972a, ((hd20) obj).f89972a);
    }

    public final int hashCode() {
        Boolean bool = this.f89972a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
