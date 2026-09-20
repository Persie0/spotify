package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class anh {

    /* JADX INFO: renamed from: a */
    public final vjn f17440a;

    /* JADX INFO: renamed from: b */
    public final yu71 f17441b;

    /* JADX INFO: renamed from: c */
    public final kv91 f17442c;

    /* JADX INFO: renamed from: d */
    public final lt91 f17443d;

    public anh(vjn vjnVar, yu71 yu71Var, kv91 kv91Var, lt91 lt91Var) {
        this.f17440a = vjnVar;
        this.f17441b = yu71Var;
        this.f17442c = kv91Var;
        this.f17443d = lt91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anh)) {
            return false;
        }
        anh anhVar = (anh) obj;
        return wj50.m88271j(this.f17440a, anhVar.f17440a) && wj50.m88271j(this.f17441b, anhVar.f17441b) && wj50.m88271j(this.f17442c, anhVar.f17442c) && wj50.m88271j(this.f17443d, anhVar.f17443d);
    }

    public final int hashCode() {
        return this.f17443d.hashCode() + ((this.f17442c.hashCode() + ((this.f17441b.hashCode() + (this.f17440a.hashCode() * 31)) * 31)) * 31);
    }
}
