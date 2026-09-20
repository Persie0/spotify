package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final c3e1 f237137a;

    /* JADX INFO: renamed from: b */
    public final String f237138b;

    /* JADX INFO: renamed from: c */
    public final String f237139c;

    public v4e1(c3e1 c3e1Var, String str, String str2) {
        this.f237137a = c3e1Var;
        this.f237138b = str;
        this.f237139c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4e1)) {
            return false;
        }
        v4e1 v4e1Var = (v4e1) obj;
        return wj50.m88271j(this.f237137a, v4e1Var.f237137a) && wj50.m88271j(this.f237138b, v4e1Var.f237138b) && wj50.m88271j(this.f237139c, v4e1Var.f237139c);
    }

    public final int hashCode() {
        return this.f237139c.hashCode() + s571.m77243b(this.f237137a.hashCode() * 31, 31, this.f237138b);
    }
}
