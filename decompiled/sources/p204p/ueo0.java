package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ueo0 implements weo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f229574a;

    /* JADX INFO: renamed from: b */
    public final int f229575b;

    public ueo0(boolean z, int i) {
        this.f229574a = z;
        this.f229575b = i;
    }

    @Override // p204p.weo0
    /* JADX INFO: renamed from: a */
    public final int mo82909a() {
        return this.f229575b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueo0)) {
            return false;
        }
        ueo0 ueo0Var = (ueo0) obj;
        return this.f229574a == ueo0Var.f229574a && this.f229575b == ueo0Var.f229575b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229575b) + s571.m77245d(Boolean.hashCode(false) * 31, 31, this.f229574a);
    }
}
