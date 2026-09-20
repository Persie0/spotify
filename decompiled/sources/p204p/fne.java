package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fne {

    /* JADX INFO: renamed from: a */
    public final String f71267a;

    /* JADX INFO: renamed from: b */
    public final String f71268b;

    /* JADX INFO: renamed from: c */
    public final String f71269c;

    /* JADX INFO: renamed from: d */
    public final boolean f71270d;

    public fne(String str, String str2, String str3, boolean z) {
        this.f71267a = str;
        this.f71268b = str2;
        this.f71269c = str3;
        this.f71270d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fne)) {
            return false;
        }
        fne fneVar = (fne) obj;
        return wj50.m88271j(this.f71267a, fneVar.f71267a) && wj50.m88271j(this.f71268b, fneVar.f71268b) && wj50.m88271j(this.f71269c, fneVar.f71269c) && this.f71270d == fneVar.f71270d;
    }

    public final int hashCode() {
        int iHashCode = this.f71267a.hashCode() * 31;
        String str = this.f71268b;
        return Boolean.hashCode(this.f71270d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f71269c);
    }
}
