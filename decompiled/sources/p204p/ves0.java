package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ves0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f240806a;

    /* JADX INFO: renamed from: b */
    public final long f240807b;

    public ves0(String str, long j) {
        this.f240806a = str;
        this.f240807b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ves0)) {
            return false;
        }
        ves0 ves0Var = (ves0) obj;
        return wj50.m88271j(this.f240806a, ves0Var.f240806a) && this.f240807b == ves0Var.f240807b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f240807b) + (this.f240806a.hashCode() * 31);
    }
}
