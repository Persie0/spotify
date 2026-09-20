package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f56 {

    /* JADX INFO: renamed from: a */
    public final String f65944a;

    /* JADX INFO: renamed from: b */
    public final String f65945b;

    /* JADX INFO: renamed from: c */
    public final String f65946c;

    /* JADX INFO: renamed from: d */
    public final Integer f65947d;

    /* JADX INFO: renamed from: e */
    public final Integer f65948e;

    /* JADX INFO: renamed from: f */
    public final String f65949f;

    public f56(String str, String str2, String str3, Integer num, Integer num2, String str4) {
        this.f65944a = str;
        this.f65945b = str2;
        this.f65946c = str3;
        this.f65947d = num;
        this.f65948e = num2;
        this.f65949f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f56)) {
            return false;
        }
        f56 f56Var = (f56) obj;
        return wj50.m88271j(this.f65944a, f56Var.f65944a) && wj50.m88271j(this.f65945b, f56Var.f65945b) && wj50.m88271j(this.f65946c, f56Var.f65946c) && wj50.m88271j(this.f65947d, f56Var.f65947d) && wj50.m88271j(this.f65948e, f56Var.f65948e) && wj50.m88271j(this.f65949f, f56Var.f65949f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f65944a.hashCode() * 31, 31, this.f65945b);
        String str = this.f65946c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f65947d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f65948e;
        return this.f65949f.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
