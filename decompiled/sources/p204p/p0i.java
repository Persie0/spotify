package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p0i implements r0i {

    /* JADX INFO: renamed from: a */
    public final String f172685a;

    /* JADX INFO: renamed from: b */
    public final int f172686b;

    public p0i(String str, int i) {
        this.f172685a = str;
        this.f172686b = i;
    }

    @Override // p204p.r0i
    /* JADX INFO: renamed from: a */
    public final int mo68698a() {
        return this.f172686b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0i)) {
            return false;
        }
        p0i p0iVar = (p0i) obj;
        return wj50.m88271j(this.f172685a, p0iVar.f172685a) && this.f172686b == p0iVar.f172686b;
    }

    @Override // p204p.r0i
    public final String getLabel() {
        return this.f172685a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f172686b) + f710.m40938f(3, this.f172685a.hashCode() * 31, 31);
    }
}
