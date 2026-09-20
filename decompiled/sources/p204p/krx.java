package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class krx implements prx {

    /* JADX INFO: renamed from: a */
    public final String f125737a;

    /* JADX INFO: renamed from: b */
    public final String f125738b;

    public krx(String str, String str2) {
        this.f125737a = str;
        this.f125738b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krx)) {
            return false;
        }
        krx krxVar = (krx) obj;
        return wj50.m88271j(this.f125737a, krxVar.f125737a) && wj50.m88271j(this.f125738b, krxVar.f125738b);
    }

    @Override // p204p.prx
    public final String getUri() {
        return this.f125737a;
    }

    public final int hashCode() {
        return this.f125738b.hashCode() + (this.f125737a.hashCode() * 31);
    }
}
