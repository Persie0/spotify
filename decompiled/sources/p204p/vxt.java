package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vxt {

    /* JADX INFO: renamed from: a */
    public final ry8 f245828a;

    /* JADX INFO: renamed from: b */
    public final th00 f245829b;

    /* JADX INFO: renamed from: c */
    public final vh00 f245830c;

    public vxt(ry8 ry8Var, th00 th00Var, vh00 vh00Var) {
        this.f245828a = ry8Var;
        this.f245829b = th00Var;
        this.f245830c = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxt)) {
            return false;
        }
        vxt vxtVar = (vxt) obj;
        return wj50.m88271j(this.f245828a, vxtVar.f245828a) && wj50.m88271j(this.f245829b, vxtVar.f245829b) && wj50.m88271j(this.f245830c, vxtVar.f245830c);
    }

    public final int hashCode() {
        return this.f245830c.hashCode() + ((this.f245829b.hashCode() + (this.f245828a.hashCode() * 31)) * 31);
    }
}
