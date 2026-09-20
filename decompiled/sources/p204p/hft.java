package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hft extends u1h1 {

    /* JADX INFO: renamed from: b */
    public final String f90804b;

    public hft(String str) {
        this.f90804b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hft) && wj50.m88271j(this.f90804b, ((hft) obj).f90804b);
    }

    public final int hashCode() {
        return this.f90804b.hashCode();
    }
}
