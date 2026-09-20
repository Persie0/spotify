package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class azj implements bzj {

    /* JADX INFO: renamed from: a */
    public final int f21628a;

    /* JADX INFO: renamed from: b */
    public final qf40 f21629b;

    public azj(int i, AbstractC2524w8 abstractC2524w8) {
        this.f21628a = i;
        this.f21629b = abstractC2524w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azj)) {
            return false;
        }
        azj azjVar = (azj) obj;
        return this.f21628a == azjVar.f21628a && wj50.m88271j(this.f21629b, azjVar.f21629b);
    }

    public final int hashCode() {
        return this.f21629b.hashCode() + (Integer.hashCode(this.f21628a) * 31);
    }
}
