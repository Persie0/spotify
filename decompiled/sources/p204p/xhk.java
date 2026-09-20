package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xhk {

    /* JADX INFO: renamed from: a */
    public final s5l f261662a;

    /* JADX INFO: renamed from: b */
    public final Throwable f261663b;

    public xhk(s5l s5lVar, Throwable th) {
        this.f261662a = s5lVar;
        this.f261663b = th;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m91063a() {
        return this.f261663b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhk)) {
            return false;
        }
        xhk xhkVar = (xhk) obj;
        return wj50.m88271j(this.f261662a, xhkVar.f261662a) && wj50.m88271j(this.f261663b, xhkVar.f261663b);
    }

    public final int hashCode() {
        return this.f261663b.hashCode() + (this.f261662a.hashCode() * 31);
    }
}
