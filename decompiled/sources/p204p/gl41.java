package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gl41 {

    /* JADX INFO: renamed from: a */
    public final fl41 f80993a;

    /* JADX INFO: renamed from: b */
    public final boolean f80994b;

    public gl41(fl41 fl41Var, boolean z) {
        this.f80993a = fl41Var;
        this.f80994b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl41)) {
            return false;
        }
        gl41 gl41Var = (gl41) obj;
        return wj50.m88271j(this.f80993a, gl41Var.f80993a) && this.f80994b == gl41Var.f80994b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80994b) + (this.f80993a.hashCode() * 31);
    }
}
