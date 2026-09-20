package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w6k {

    /* JADX INFO: renamed from: a */
    public final z6k f248412a;

    /* JADX INFO: renamed from: b */
    public final eh00 f248413b;

    public w6k(z6k z6kVar, eh00 eh00Var) {
        this.f248412a = z6kVar;
        this.f248413b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6k)) {
            return false;
        }
        w6k w6kVar = (w6k) obj;
        return wj50.m88271j(this.f248412a, w6kVar.f248412a) && wj50.m88271j(this.f248413b, w6kVar.f248413b);
    }

    public final int hashCode() {
        return this.f248413b.hashCode() + (this.f248412a.hashCode() * 31);
    }
}
