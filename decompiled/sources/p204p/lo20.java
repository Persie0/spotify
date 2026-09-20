package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lo20 implements l630 {

    /* JADX INFO: renamed from: a */
    public final String f135283a;

    /* JADX INFO: renamed from: b */
    public final ro20 f135284b;

    /* JADX INFO: renamed from: c */
    public final b250 f135285c;

    public lo20(String str, ro20 ro20Var, b250 b250Var) {
        this.f135283a = str;
        this.f135284b = ro20Var;
        this.f135285c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo20)) {
            return false;
        }
        lo20 lo20Var = (lo20) obj;
        return wj50.m88271j(this.f135283a, lo20Var.f135283a) && wj50.m88271j(this.f135284b, lo20Var.f135284b) && wj50.m88271j(this.f135285c, lo20Var.f135285c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f135283a;
    }

    public final int hashCode() {
        return this.f135285c.hashCode() + ((this.f135284b.hashCode() + (this.f135283a.hashCode() * 31)) * 31);
    }
}
