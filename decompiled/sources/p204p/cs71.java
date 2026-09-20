package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cs71 {

    /* JADX INFO: renamed from: a */
    public final String f41486a;

    /* JADX INFO: renamed from: b */
    public final sp71 f41487b;

    public cs71(String str, sp71 sp71Var) {
        this.f41486a = str;
        this.f41487b = sp71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs71)) {
            return false;
        }
        cs71 cs71Var = (cs71) obj;
        return wj50.m88271j(this.f41486a, cs71Var.f41486a) && wj50.m88271j(this.f41487b, cs71Var.f41487b);
    }

    public final int hashCode() {
        int iHashCode = this.f41486a.hashCode() * 31;
        sp71 sp71Var = this.f41487b;
        return iHashCode + (sp71Var == null ? 0 : sp71Var.hashCode());
    }
}
