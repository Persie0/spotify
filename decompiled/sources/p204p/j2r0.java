package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j2r0 {

    /* JADX INFO: renamed from: a */
    public final String f108130a;

    /* JADX INFO: renamed from: b */
    public final String f108131b;

    public j2r0(String str, String str2) {
        this.f108130a = str;
        this.f108131b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2r0)) {
            return false;
        }
        j2r0 j2r0Var = (j2r0) obj;
        return wj50.m88271j(this.f108130a, j2r0Var.f108130a) && wj50.m88271j(this.f108131b, j2r0Var.f108131b);
    }

    public final int hashCode() {
        return this.f108131b.hashCode() + (this.f108130a.hashCode() * 31);
    }
}
