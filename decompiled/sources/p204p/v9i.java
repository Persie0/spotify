package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f238972a;

    /* JADX INFO: renamed from: b */
    public final String f238973b;

    public v9i(String str, String str2) {
        this.f238972a = str;
        this.f238973b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9i)) {
            return false;
        }
        v9i v9iVar = (v9i) obj;
        return wj50.m88271j(this.f238972a, v9iVar.f238972a) && wj50.m88271j(this.f238973b, v9iVar.f238973b);
    }

    public final int hashCode() {
        return this.f238973b.hashCode() + (this.f238972a.hashCode() * 31);
    }
}
