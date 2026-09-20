package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bk11 {

    /* JADX INFO: renamed from: a */
    public final kk11 f27809a;

    /* JADX INFO: renamed from: b */
    public final kk11 f27810b;

    public bk11(kk11 kk11Var, kk11 kk11Var2) {
        this.f27809a = kk11Var;
        this.f27810b = kk11Var2;
    }

    /* JADX INFO: renamed from: a */
    public final kk11 m29572a() {
        return this.f27809a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk11)) {
            return false;
        }
        bk11 bk11Var = (bk11) obj;
        return wj50.m88271j(this.f27809a, bk11Var.f27809a) && wj50.m88271j(this.f27810b, bk11Var.f27810b);
    }

    public final int hashCode() {
        return this.f27810b.hashCode() + (this.f27809a.hashCode() * 31);
    }
}
