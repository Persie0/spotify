package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jo01 {

    /* JADX INFO: renamed from: a */
    public final String f114263a;

    /* JADX INFO: renamed from: b */
    public final String f114264b;

    /* JADX INFO: renamed from: c */
    public final String f114265c;

    public jo01(String str, String str2, String str3) {
        this.f114263a = str;
        this.f114264b = str2;
        this.f114265c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo01)) {
            return false;
        }
        jo01 jo01Var = (jo01) obj;
        return wj50.m88271j(this.f114263a, jo01Var.f114263a) && wj50.m88271j(this.f114264b, jo01Var.f114264b) && wj50.m88271j(this.f114265c, jo01Var.f114265c);
    }

    public final int hashCode() {
        int iHashCode = this.f114263a.hashCode() * 31;
        String str = this.f114264b;
        return this.f114265c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
