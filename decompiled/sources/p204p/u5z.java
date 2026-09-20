package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u5z {

    /* JADX INFO: renamed from: a */
    public final l7z f227138a;

    /* JADX INFO: renamed from: b */
    public final String f227139b;

    public u5z(l7z l7zVar, String str) {
        this.f227138a = l7zVar;
        this.f227139b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5z)) {
            return false;
        }
        u5z u5zVar = (u5z) obj;
        return wj50.m88271j(this.f227138a, u5zVar.f227138a) && wj50.m88271j(this.f227139b, u5zVar.f227139b);
    }

    public final int hashCode() {
        return this.f227139b.hashCode() + (this.f227138a.hashCode() * 31);
    }
}
