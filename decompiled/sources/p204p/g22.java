package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g22 {

    /* JADX INFO: renamed from: a */
    public final Boolean f75819a;

    public g22(Boolean bool) {
        this.f75819a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g22) && wj50.m88271j(this.f75819a, ((g22) obj).f75819a);
    }

    public final int hashCode() {
        Boolean bool = this.f75819a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
