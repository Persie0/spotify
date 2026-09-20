package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oei {

    /* JADX INFO: renamed from: a */
    public final luh f164445a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f164446b;

    /* JADX INFO: renamed from: c */
    public final i3i f164447c;

    public oei(luh luhVar, pfa0 pfa0Var, i3i i3iVar) {
        this.f164445a = luhVar;
        this.f164446b = pfa0Var;
        this.f164447c = i3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oei)) {
            return false;
        }
        oei oeiVar = (oei) obj;
        return wj50.m88271j(this.f164445a, oeiVar.f164445a) && wj50.m88271j(this.f164446b, oeiVar.f164446b) && wj50.m88271j(this.f164447c, oeiVar.f164447c);
    }

    public final int hashCode() {
        return this.f164447c.hashCode() + ((this.f164446b.hashCode() + (this.f164445a.hashCode() * 31)) * 31);
    }
}
