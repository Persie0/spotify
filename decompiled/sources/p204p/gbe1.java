package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gbe1 implements l630 {

    /* JADX INFO: renamed from: a */
    public final pbe1 f78286a;

    /* JADX INFO: renamed from: b */
    public final String f78287b;

    /* JADX INFO: renamed from: c */
    public final b250 f78288c;

    public gbe1(pbe1 pbe1Var, String str, b250 b250Var) {
        this.f78286a = pbe1Var;
        this.f78287b = str;
        this.f78288c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbe1)) {
            return false;
        }
        gbe1 gbe1Var = (gbe1) obj;
        return wj50.m88271j(this.f78286a, gbe1Var.f78286a) && wj50.m88271j(this.f78287b, gbe1Var.f78287b) && wj50.m88271j(this.f78288c, gbe1Var.f78288c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f78287b;
    }

    public final int hashCode() {
        return this.f78288c.hashCode() + s571.m77243b(this.f78286a.hashCode() * 31, 31, this.f78287b);
    }
}
