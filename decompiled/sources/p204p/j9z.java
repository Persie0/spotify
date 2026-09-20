package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j9z extends l9z {

    /* JADX INFO: renamed from: a */
    public final String f110268a;

    /* JADX INFO: renamed from: b */
    public final boolean f110269b;

    public j9z(String str, boolean z) {
        this.f110268a = str;
        this.f110269b = z;
    }

    @Override // p204p.l9z
    /* JADX INFO: renamed from: a */
    public final boolean mo50003a() {
        return this.f110269b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9z)) {
            return false;
        }
        j9z j9zVar = (j9z) obj;
        return wj50.m88271j(this.f110268a, j9zVar.f110268a) && this.f110269b == j9zVar.f110269b;
    }

    public final int hashCode() {
        String str = this.f110268a;
        return Boolean.hashCode(this.f110269b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
