package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u591 {

    /* JADX INFO: renamed from: a */
    public final u571 f226951a;

    /* JADX INFO: renamed from: b */
    public final mir f226952b;

    public u591(u571 u571Var, mir mirVar) {
        this.f226951a = u571Var;
        this.f226952b = mirVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u591)) {
            return false;
        }
        u591 u591Var = (u591) obj;
        return wj50.m88271j(this.f226951a, u591Var.f226951a) && wj50.m88271j(this.f226952b, u591Var.f226952b);
    }

    public final int hashCode() {
        return this.f226952b.hashCode() + (this.f226951a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f226951a) + ", offsetMapping=" + this.f226952b + ')';
    }
}
