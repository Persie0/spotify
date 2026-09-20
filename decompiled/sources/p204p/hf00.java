package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hf00 implements jf00 {

    /* JADX INFO: renamed from: a */
    public final String f90574a;

    /* JADX INFO: renamed from: b */
    public final long f90575b;

    public hf00(String str, long j) {
        this.f90574a = str;
        this.f90575b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf00)) {
            return false;
        }
        hf00 hf00Var = (hf00) obj;
        return wj50.m88271j(this.f90574a, hf00Var.f90574a) && this.f90575b == hf00Var.f90575b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f90575b) + (this.f90574a.hashCode() * 31);
    }
}
