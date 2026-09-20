package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w2e0 implements x2e0 {

    /* JADX INFO: renamed from: a */
    public final String f247328a;

    /* JADX INFO: renamed from: b */
    public final String f247329b;

    /* JADX INFO: renamed from: c */
    public final String f247330c;

    public w2e0(String str, String str2, String str3) {
        this.f247328a = str;
        this.f247329b = str2;
        this.f247330c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2e0)) {
            return false;
        }
        w2e0 w2e0Var = (w2e0) obj;
        return wj50.m88271j(this.f247328a, w2e0Var.f247328a) && wj50.m88271j(this.f247329b, w2e0Var.f247329b) && wj50.m88271j(this.f247330c, w2e0Var.f247330c);
    }

    @Override // p204p.x2e0
    public final String getText() {
        return this.f247330c;
    }

    public final int hashCode() {
        return this.f247330c.hashCode() + s571.m77243b(this.f247328a.hashCode() * 31, 31, this.f247329b);
    }
}
