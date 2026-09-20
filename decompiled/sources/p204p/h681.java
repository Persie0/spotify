package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h681 implements l630 {

    /* JADX INFO: renamed from: a */
    public final l681 f88030a;

    /* JADX INFO: renamed from: b */
    public final String f88031b;

    /* JADX INFO: renamed from: c */
    public final b250 f88032c;

    public h681(l681 l681Var, String str, b250 b250Var) {
        this.f88030a = l681Var;
        this.f88031b = str;
        this.f88032c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h681)) {
            return false;
        }
        h681 h681Var = (h681) obj;
        return wj50.m88271j(this.f88030a, h681Var.f88030a) && wj50.m88271j(this.f88031b, h681Var.f88031b) && wj50.m88271j(this.f88032c, h681Var.f88032c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f88031b;
    }

    public final int hashCode() {
        return this.f88032c.hashCode() + s571.m77243b(this.f88030a.hashCode() * 31, 31, this.f88031b);
    }
}
