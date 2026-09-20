package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yrw0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final String f275605a;

    /* JADX INFO: renamed from: b */
    public final qm0 f275606b;

    public yrw0(String str, qm0 qm0Var) {
        this.f275605a = str;
        this.f275606b = qm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrw0)) {
            return false;
        }
        yrw0 yrw0Var = (yrw0) obj;
        return wj50.m88271j(this.f275605a, yrw0Var.f275605a) && this.f275606b == yrw0Var.f275606b;
    }

    public final int hashCode() {
        return this.f275606b.hashCode() + (this.f275605a.hashCode() * 31);
    }
}
