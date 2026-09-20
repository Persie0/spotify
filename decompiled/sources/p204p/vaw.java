package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vaw {

    /* JADX INFO: renamed from: a */
    public final String f239335a;

    /* JADX INFO: renamed from: b */
    public final gf41 f239336b;

    public vaw(String str, gf41 gf41Var) {
        this.f239335a = str;
        this.f239336b = gf41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaw)) {
            return false;
        }
        vaw vawVar = (vaw) obj;
        return wj50.m88271j(this.f239335a, vawVar.f239335a) && wj50.m88271j(this.f239336b, vawVar.f239336b);
    }

    public final int hashCode() {
        return this.f239336b.hashCode() + (this.f239335a.hashCode() * 31);
    }
}
