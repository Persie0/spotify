package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ifz0 {

    /* JADX INFO: renamed from: a */
    public final int f101844a;

    /* JADX INFO: renamed from: b */
    public final String f101845b;

    /* JADX INFO: renamed from: c */
    public final tae1 f101846c;

    public ifz0(int i, String str, tae1 tae1Var) {
        this.f101844a = i;
        this.f101845b = str;
        this.f101846c = tae1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifz0)) {
            return false;
        }
        ifz0 ifz0Var = (ifz0) obj;
        return this.f101844a == ifz0Var.f101844a && wj50.m88271j(this.f101845b, ifz0Var.f101845b) && wj50.m88271j(this.f101846c, ifz0Var.f101846c);
    }

    public final int hashCode() {
        return this.f101846c.hashCode() + s571.m77243b(Integer.hashCode(this.f101844a) * 31, 31, this.f101845b);
    }
}
