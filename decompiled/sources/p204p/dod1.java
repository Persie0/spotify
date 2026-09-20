package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dod1 {

    /* JADX INFO: renamed from: a */
    public final String f51025a;

    /* JADX INFO: renamed from: b */
    public final long f51026b;

    public dod1(String str, long j) {
        this.f51025a = str;
        this.f51026b = j;
    }

    /* JADX INFO: renamed from: a */
    public final String m36528a() {
        return this.f51025a;
    }

    /* JADX INFO: renamed from: b */
    public final long m36529b() {
        return this.f51026b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dod1)) {
            return false;
        }
        dod1 dod1Var = (dod1) obj;
        return wj50.m88271j(this.f51025a, dod1Var.f51025a) && this.f51026b == dod1Var.f51026b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f51026b) + (this.f51025a.hashCode() * 31);
    }
}
