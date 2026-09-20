package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final String f89976a;

    public hd30(String str) {
        this.f89976a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd30) && wj50.m88271j(this.f89976a, ((hd30) obj).f89976a);
    }

    public final int hashCode() {
        return this.f89976a.hashCode();
    }
}
