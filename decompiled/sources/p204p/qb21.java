package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qb21 implements l630 {

    /* JADX INFO: renamed from: a */
    public final tb21 f186984a;

    /* JADX INFO: renamed from: b */
    public final String f186985b;

    public qb21(tb21 tb21Var, String str) {
        this.f186984a = tb21Var;
        this.f186985b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb21)) {
            return false;
        }
        qb21 qb21Var = (qb21) obj;
        return this.f186984a.equals(qb21Var.f186984a) && this.f186985b.equals(qb21Var.f186985b);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f186985b;
    }

    public final int hashCode() {
        return s571.m77243b(this.f186984a.hashCode() * 31, 31, this.f186985b);
    }
}
