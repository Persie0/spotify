package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ul2 {

    /* JADX INFO: renamed from: a */
    public final String f231412a;

    /* JADX INFO: renamed from: b */
    public final long f231413b;

    /* JADX INFO: renamed from: c */
    public final String f231414c;

    public ul2(long j, String str, String str2) {
        this.f231412a = str;
        this.f231413b = j;
        this.f231414c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul2)) {
            return false;
        }
        ul2 ul2Var = (ul2) obj;
        return wj50.m88271j(this.f231412a, ul2Var.f231412a) && this.f231413b == ul2Var.f231413b && wj50.m88271j(this.f231414c, ul2Var.f231414c);
    }

    public final int hashCode() {
        return this.f231414c.hashCode() + dq60.m36605e(this.f231412a.hashCode() * 31, this.f231413b, 31);
    }
}
