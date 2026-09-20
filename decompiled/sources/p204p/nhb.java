package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nhb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f153915a;

    /* JADX INFO: renamed from: b */
    public final String f153916b;

    /* JADX INFO: renamed from: c */
    public final String f153917c;

    public nhb(boolean z, String str, String str2) {
        this.f153915a = z;
        this.f153916b = str;
        this.f153917c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhb)) {
            return false;
        }
        nhb nhbVar = (nhb) obj;
        return this.f153915a == nhbVar.f153915a && wj50.m88271j(this.f153916b, nhbVar.f153916b) && wj50.m88271j(this.f153917c, nhbVar.f153917c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f153915a) * 31, 31, this.f153916b);
        String str = this.f153917c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
