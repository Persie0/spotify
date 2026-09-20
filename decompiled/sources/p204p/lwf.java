package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lwf {

    /* JADX INFO: renamed from: a */
    public final xuk f137557a;

    /* JADX INFO: renamed from: b */
    public final fiz f137558b;

    /* JADX INFO: renamed from: c */
    public final kwf f137559c;

    /* JADX INFO: renamed from: d */
    public final ae41 f137560d;

    /* JADX INFO: renamed from: e */
    public final u150 f137561e;

    public lwf(xuk xukVar, fiz fizVar, kwf kwfVar, ae41 ae41Var, u150 u150Var) {
        this.f137557a = xukVar;
        this.f137558b = fizVar;
        this.f137559c = kwfVar;
        this.f137560d = ae41Var;
        this.f137561e = u150Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwf)) {
            return false;
        }
        lwf lwfVar = (lwf) obj;
        return wj50.m88271j(this.f137557a, lwfVar.f137557a) && wj50.m88271j(this.f137558b, lwfVar.f137558b) && wj50.m88271j(this.f137559c, lwfVar.f137559c) && wj50.m88271j(this.f137560d, lwfVar.f137560d) && wj50.m88271j(this.f137561e, lwfVar.f137561e);
    }

    public final int hashCode() {
        return this.f137561e.hashCode() + ((this.f137560d.hashCode() + ((this.f137559c.hashCode() + ((this.f137558b.hashCode() + (this.f137557a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
