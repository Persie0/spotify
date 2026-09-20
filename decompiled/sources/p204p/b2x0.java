package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f22737a;

    public b2x0(String str) {
        this.f22737a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "bad_request";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f22737a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2x0) && wj50.m88271j(this.f22737a, ((b2x0) obj).f22737a);
    }

    public final int hashCode() {
        return this.f22737a.hashCode();
    }
}
