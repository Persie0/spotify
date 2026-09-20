package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r5q0 {

    /* JADX INFO: renamed from: a */
    public final String f196092a;

    /* JADX INFO: renamed from: b */
    public final String f196093b;

    public r5q0(String str, String str2) {
        this.f196092a = str;
        this.f196093b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5q0)) {
            return false;
        }
        r5q0 r5q0Var = (r5q0) obj;
        return wj50.m88271j(this.f196092a, r5q0Var.f196092a) && wj50.m88271j(this.f196093b, r5q0Var.f196093b);
    }

    public final int hashCode() {
        return this.f196093b.hashCode() + (this.f196092a.hashCode() * 31);
    }
}
