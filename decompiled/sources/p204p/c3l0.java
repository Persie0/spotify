package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c3l0 {

    /* JADX INFO: renamed from: a */
    public final String f33700a;

    /* JADX INFO: renamed from: b */
    public final z2l0 f33701b;

    public c3l0(String str, z2l0 z2l0Var) {
        this.f33700a = str;
        this.f33701b = z2l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3l0)) {
            return false;
        }
        c3l0 c3l0Var = (c3l0) obj;
        return wj50.m88271j(this.f33700a, c3l0Var.f33700a) && wj50.m88271j(this.f33701b, c3l0Var.f33701b);
    }

    public final int hashCode() {
        return this.f33701b.hashCode() + (this.f33700a.hashCode() * 31);
    }
}
