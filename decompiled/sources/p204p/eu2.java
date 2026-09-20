package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eu2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f62854a;

    /* JADX INFO: renamed from: b */
    public final long f62855b;

    /* JADX INFO: renamed from: c */
    public final String f62856c;

    public eu2(long j, String str, String str2) {
        this.f62854a = str;
        this.f62855b = j;
        this.f62856c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu2)) {
            return false;
        }
        eu2 eu2Var = (eu2) obj;
        return wj50.m88271j(this.f62854a, eu2Var.f62854a) && this.f62855b == eu2Var.f62855b && wj50.m88271j(this.f62856c, eu2Var.f62856c);
    }

    public final int hashCode() {
        return this.f62856c.hashCode() + dq60.m36605e(this.f62854a.hashCode() * 31, this.f62855b, 31);
    }
}
