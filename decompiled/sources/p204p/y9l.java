package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y9l extends z9l {

    /* JADX INFO: renamed from: a */
    public final int f270615a;

    /* JADX INFO: renamed from: b */
    public final String f270616b;

    public y9l(int i, String str) {
        this.f270615a = i;
        this.f270616b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9l)) {
            return false;
        }
        y9l y9lVar = (y9l) obj;
        return this.f270615a == y9lVar.f270615a && wj50.m88271j(this.f270616b, y9lVar.f270616b);
    }

    public final int hashCode() {
        return this.f270616b.hashCode() + (Integer.hashCode(this.f270615a) * 31);
    }
}
