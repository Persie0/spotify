package p204p;

/* JADX INFO: renamed from: p.qw */
/* JADX INFO: loaded from: classes9.dex */
public final class C2316qw {

    /* JADX INFO: renamed from: a */
    public final String f193141a;

    /* JADX INFO: renamed from: b */
    public final hpg1 f193142b;

    public C2316qw(String str, hpg1 hpg1Var) {
        this.f193141a = str;
        this.f193142b = hpg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2316qw)) {
            return false;
        }
        C2316qw c2316qw = (C2316qw) obj;
        return wj50.m88271j(this.f193141a, c2316qw.f193141a) && wj50.m88271j(this.f193142b, c2316qw.f193142b);
    }

    public final int hashCode() {
        return this.f193142b.hashCode() + (this.f193141a.hashCode() * 31);
    }
}
