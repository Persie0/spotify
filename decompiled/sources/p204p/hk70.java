package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hk70 {

    /* JADX INFO: renamed from: a */
    public final String f92379a;

    public hk70(String str) {
        this.f92379a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk70) && wj50.m88271j(this.f92379a, ((hk70) obj).f92379a);
    }

    public final int hashCode() {
        String str = this.f92379a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
