package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final boolean f196502a;

    /* JADX INFO: renamed from: b */
    public final String f196503b;

    public r7e(boolean z, String str) {
        this.f196502a = z;
        this.f196503b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7e)) {
            return false;
        }
        r7e r7eVar = (r7e) obj;
        return this.f196502a == r7eVar.f196502a && wj50.m88271j(this.f196503b, r7eVar.f196503b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f196502a) * 31;
        String str = this.f196503b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
