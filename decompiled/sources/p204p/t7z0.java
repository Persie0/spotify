package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t7z0 {

    /* JADX INFO: renamed from: a */
    public final String f217932a;

    public t7z0(String str) {
        this.f217932a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7z0) && wj50.m88271j(this.f217932a, ((t7z0) obj).f217932a);
    }

    public final int hashCode() {
        return edb.m38547C(2) + (this.f217932a.hashCode() * 31);
    }
}
