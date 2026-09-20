package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ud60 {

    /* JADX INFO: renamed from: a */
    public final vfe f229183a;

    /* JADX INFO: renamed from: b */
    public final vfe f229184b;

    /* JADX INFO: renamed from: c */
    public final vfe f229185c;

    public ud60(vfe vfeVar, vfe vfeVar2, vfe vfeVar3) {
        this.f229183a = vfeVar;
        this.f229184b = vfeVar2;
        this.f229185c = vfeVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud60)) {
            return false;
        }
        ud60 ud60Var = (ud60) obj;
        return wj50.m88271j(this.f229183a, ud60Var.f229183a) && wj50.m88271j(this.f229184b, ud60Var.f229184b) && wj50.m88271j(this.f229185c, ud60Var.f229185c);
    }

    public final int hashCode() {
        return this.f229185c.hashCode() + ((this.f229184b.hashCode() + (this.f229183a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f229183a + ", kotlinReadOnly=" + this.f229184b + ", kotlinMutable=" + this.f229185c + ')';
    }
}
