package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t2k {

    /* JADX INFO: renamed from: a */
    public final boolean f216578a;

    /* JADX INFO: renamed from: b */
    public final String f216579b;

    /* JADX INFO: renamed from: c */
    public final gh00 f216580c;

    public t2k(boolean z, String str, gh00 gh00Var) {
        this.f216578a = z;
        this.f216579b = str;
        this.f216580c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2k)) {
            return false;
        }
        t2k t2kVar = (t2k) obj;
        return this.f216578a == t2kVar.f216578a && wj50.m88271j(this.f216579b, t2kVar.f216579b) && wj50.m88271j(this.f216580c, t2kVar.f216580c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f216578a) * 31;
        String str = this.f216579b;
        return this.f216580c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
