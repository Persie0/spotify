package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yy30 {

    /* JADX INFO: renamed from: a */
    public final wwu f277391a;

    /* JADX INFO: renamed from: b */
    public final long f277392b;

    public yy30(long j, wwu wwuVar) {
        this.f277391a = wwuVar;
        this.f277392b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy30)) {
            return false;
        }
        yy30 yy30Var = (yy30) obj;
        if (!wj50.m88271j(this.f277391a, yy30Var.f277391a)) {
            return false;
        }
        long j = yy30Var.f277392b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f277392b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f277391a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f277392b) + iHashCode;
    }
}
