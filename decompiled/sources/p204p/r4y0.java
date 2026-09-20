package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r4y0 {

    /* JADX INFO: renamed from: a */
    public final String f195874a;

    /* JADX INFO: renamed from: b */
    public final Integer f195875b;

    /* JADX INFO: renamed from: c */
    public final String f195876c;

    public r4y0(Integer num, String str, String str2) {
        this.f195874a = str;
        this.f195875b = num;
        this.f195876c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4y0)) {
            return false;
        }
        r4y0 r4y0Var = (r4y0) obj;
        return wj50.m88271j(this.f195874a, r4y0Var.f195874a) && wj50.m88271j(this.f195875b, r4y0Var.f195875b) && wj50.m88271j(this.f195876c, r4y0Var.f195876c);
    }

    public final int hashCode() {
        int iHashCode = this.f195874a.hashCode() * 31;
        Integer num = this.f195875b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f195876c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
