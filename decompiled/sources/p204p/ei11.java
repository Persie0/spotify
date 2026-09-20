package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ei11 implements l630 {

    /* JADX INFO: renamed from: a */
    public final mi11 f59769a;

    /* JADX INFO: renamed from: b */
    public final String f59770b;

    /* JADX INFO: renamed from: c */
    public final b250 f59771c;

    public ei11(mi11 mi11Var, String str, b250 b250Var) {
        this.f59769a = mi11Var;
        this.f59770b = str;
        this.f59771c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei11)) {
            return false;
        }
        ei11 ei11Var = (ei11) obj;
        return wj50.m88271j(this.f59769a, ei11Var.f59769a) && wj50.m88271j(this.f59770b, ei11Var.f59770b) && wj50.m88271j(this.f59771c, ei11Var.f59771c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f59770b;
    }

    public final int hashCode() {
        return this.f59771c.hashCode() + s571.m77243b(this.f59769a.hashCode() * 31, 31, this.f59770b);
    }
}
