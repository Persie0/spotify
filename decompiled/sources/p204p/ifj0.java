package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ifj0 {

    /* JADX INFO: renamed from: a */
    public final String f101773a;

    /* JADX INFO: renamed from: b */
    public final o221 f101774b;

    /* JADX INFO: renamed from: c */
    public final y5f f101775c;

    public ifj0(String str, o221 o221Var, y5f y5fVar) {
        this.f101773a = str;
        this.f101774b = o221Var;
        this.f101775c = y5fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifj0)) {
            return false;
        }
        ifj0 ifj0Var = (ifj0) obj;
        return wj50.m88271j(this.f101773a, ifj0Var.f101773a) && wj50.m88271j(this.f101774b, ifj0Var.f101774b) && wj50.m88271j(this.f101775c, ifj0Var.f101775c);
    }

    public final int hashCode() {
        return this.f101775c.hashCode() + ((this.f101774b.hashCode() + (this.f101773a.hashCode() * 31)) * 31);
    }
}
