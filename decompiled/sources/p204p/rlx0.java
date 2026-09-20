package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rlx0 implements ulx0 {

    /* JADX INFO: renamed from: a */
    public final String f200389a;

    /* JADX INFO: renamed from: b */
    public final long f200390b;

    public rlx0(String str, long j) {
        this.f200389a = str;
        this.f200390b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlx0)) {
            return false;
        }
        rlx0 rlx0Var = (rlx0) obj;
        return wj50.m88271j(this.f200389a, rlx0Var.f200389a) && this.f200390b == rlx0Var.f200390b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f200390b) + (this.f200389a.hashCode() * 31);
    }
}
