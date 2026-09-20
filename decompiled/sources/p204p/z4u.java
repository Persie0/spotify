package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z4u {

    /* JADX INFO: renamed from: a */
    public final String f279349a;

    /* JADX INFO: renamed from: b */
    public final String f279350b;

    /* JADX INFO: renamed from: c */
    public final String f279351c;

    /* JADX INFO: renamed from: d */
    public final boolean f279352d;

    public z4u(String str, String str2, String str3, boolean z) {
        this.f279349a = str;
        this.f279350b = str2;
        this.f279351c = str3;
        this.f279352d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4u)) {
            return false;
        }
        z4u z4uVar = (z4u) obj;
        return wj50.m88271j(this.f279349a, z4uVar.f279349a) && wj50.m88271j(this.f279350b, z4uVar.f279350b) && wj50.m88271j(this.f279351c, z4uVar.f279351c) && this.f279352d == z4uVar.f279352d;
    }

    public final int hashCode() {
        int iHashCode = this.f279349a.hashCode() * 31;
        String str = this.f279350b;
        return Boolean.hashCode(this.f279352d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f279351c);
    }
}
