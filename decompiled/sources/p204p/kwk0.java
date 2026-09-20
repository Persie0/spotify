package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kwk0 implements lwk0 {

    /* JADX INFO: renamed from: a */
    public final String f127106a;

    /* JADX INFO: renamed from: b */
    public final String f127107b;

    public kwk0(String str, String str2) {
        this.f127106a = str;
        this.f127107b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwk0)) {
            return false;
        }
        kwk0 kwk0Var = (kwk0) obj;
        return wj50.m88271j(this.f127106a, kwk0Var.f127106a) && wj50.m88271j(this.f127107b, kwk0Var.f127107b);
    }

    @Override // p204p.lwk0
    public final String getManifestId() {
        return this.f127107b;
    }

    @Override // p204p.lwk0
    public final String getUri() {
        return this.f127106a;
    }

    public final int hashCode() {
        int iHashCode = this.f127106a.hashCode() * 31;
        String str = this.f127107b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
