package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class inl implements knl {

    /* JADX INFO: renamed from: a */
    public final String f104027a;

    /* JADX INFO: renamed from: b */
    public final String f104028b;

    public inl(String str, String str2) {
        this.f104027a = str;
        this.f104028b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inl)) {
            return false;
        }
        inl inlVar = (inl) obj;
        return wj50.m88271j(this.f104027a, inlVar.f104027a) && wj50.m88271j(this.f104028b, inlVar.f104028b);
    }

    public final int hashCode() {
        String str = this.f104027a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104028b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
