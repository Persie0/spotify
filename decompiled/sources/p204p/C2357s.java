package p204p;

/* JADX INFO: renamed from: p.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C2357s extends AbstractC2395t {

    /* JADX INFO: renamed from: a */
    public final int f204267a;

    /* JADX INFO: renamed from: b */
    public final String f204268b;

    public C2357s(int i, String str) {
        this.f204267a = i;
        this.f204268b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2357s)) {
            return false;
        }
        C2357s c2357s = (C2357s) obj;
        return this.f204267a == c2357s.f204267a && wj50.m88271j(this.f204268b, c2357s.f204268b);
    }

    public final int hashCode() {
        return this.f204268b.hashCode() + (Integer.hashCode(this.f204267a) * 31);
    }
}
