package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r740 implements l630 {

    /* JADX INFO: renamed from: a */
    public final d840 f196429a;

    /* JADX INFO: renamed from: b */
    public final String f196430b;

    /* JADX INFO: renamed from: c */
    public final b250 f196431c;

    public r740(d840 d840Var, String str, b250 b250Var) {
        this.f196429a = d840Var;
        this.f196430b = str;
        this.f196431c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r740)) {
            return false;
        }
        r740 r740Var = (r740) obj;
        return wj50.m88271j(this.f196429a, r740Var.f196429a) && wj50.m88271j(this.f196430b, r740Var.f196430b) && wj50.m88271j(this.f196431c, r740Var.f196431c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f196430b;
    }

    public final int hashCode() {
        return this.f196431c.hashCode() + s571.m77243b(this.f196429a.hashCode() * 31, 31, this.f196430b);
    }
}
