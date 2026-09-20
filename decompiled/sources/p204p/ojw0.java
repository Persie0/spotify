package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ojw0 {

    /* JADX INFO: renamed from: a */
    public final int f166152a;

    /* JADX INFO: renamed from: b */
    public final String f166153b;

    /* JADX INFO: renamed from: c */
    public final bft0 f166154c;

    public ojw0(int i, String str, bft0 bft0Var) {
        this.f166152a = i;
        this.f166153b = str;
        this.f166154c = bft0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojw0)) {
            return false;
        }
        ojw0 ojw0Var = (ojw0) obj;
        return this.f166152a == ojw0Var.f166152a && wj50.m88271j(this.f166153b, ojw0Var.f166153b) && wj50.m88271j(this.f166154c, ojw0Var.f166154c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f166152a) * 31;
        String str = this.f166153b;
        return this.f166154c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
