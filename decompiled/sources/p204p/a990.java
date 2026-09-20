package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a990 {

    /* JADX INFO: renamed from: a */
    public final xam f13522a;

    /* JADX INFO: renamed from: b */
    public final c990 f13523b;

    /* JADX INFO: renamed from: c */
    public final tdu f13524c;

    public a990(xam xamVar, c990 c990Var, tdu tduVar) {
        this.f13522a = xamVar;
        this.f13523b = c990Var;
        this.f13524c = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a990)) {
            return false;
        }
        a990 a990Var = (a990) obj;
        return wj50.m88271j(this.f13522a, a990Var.f13522a) && wj50.m88271j(this.f13523b, a990Var.f13523b) && wj50.m88271j(this.f13524c, a990Var.f13524c);
    }

    public final int hashCode() {
        return this.f13524c.hashCode() + ((this.f13523b.hashCode() + (this.f13522a.hashCode() * 31)) * 31);
    }
}
