package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rce {

    /* JADX INFO: renamed from: a */
    public final uce f197851a;

    /* JADX INFO: renamed from: b */
    public final int f197852b;

    public rce(uce uceVar, int i) {
        this.f197851a = uceVar;
        this.f197852b = i;
    }

    /* JADX INFO: renamed from: a */
    public final uce m75295a() {
        return this.f197851a;
    }

    /* JADX INFO: renamed from: b */
    public final int m75296b() {
        return this.f197852b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce)) {
            return false;
        }
        rce rceVar = (rce) obj;
        return wj50.m88271j(this.f197851a, rceVar.f197851a) && this.f197852b == rceVar.f197852b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197852b) + (this.f197851a.hashCode() * 31);
    }
}
