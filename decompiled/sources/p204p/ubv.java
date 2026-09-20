package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ubv {

    /* JADX INFO: renamed from: a */
    public final String f228891a;

    /* JADX INFO: renamed from: b */
    public final String f228892b;

    /* JADX INFO: renamed from: c */
    public final boolean f228893c;

    public ubv(String str, String str2, boolean z) {
        this.f228891a = str;
        this.f228892b = str2;
        this.f228893c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubv)) {
            return false;
        }
        ubv ubvVar = (ubv) obj;
        return wj50.m88271j(this.f228891a, ubvVar.f228891a) && wj50.m88271j(this.f228892b, ubvVar.f228892b) && this.f228893c == ubvVar.f228893c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f228893c) + s571.m77243b(this.f228891a.hashCode() * 31, 31, this.f228892b);
    }
}
