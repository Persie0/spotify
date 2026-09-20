package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final String f39849a;

    /* JADX INFO: renamed from: b */
    public final kqy f39850b;

    public cn0(String str, kqy kqyVar) {
        this.f39849a = str;
        this.f39850b = kqyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj;
        return wj50.m88271j(this.f39849a, cn0Var.f39849a) && wj50.m88271j(this.f39850b, cn0Var.f39850b);
    }

    public final int hashCode() {
        return this.f39850b.hashCode() + (this.f39849a.hashCode() * 31);
    }
}
