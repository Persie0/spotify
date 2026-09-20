package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class it60 implements lt60 {

    /* JADX INFO: renamed from: a */
    public final paq f105444a;

    /* JADX INFO: renamed from: b */
    public final Object f105445b;

    public it60(paq paqVar, Object obj) {
        this.f105444a = paqVar;
        this.f105445b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it60)) {
            return false;
        }
        it60 it60Var = (it60) obj;
        return wj50.m88271j(this.f105444a, it60Var.f105444a) && wj50.m88271j(this.f105445b, it60Var.f105445b);
    }

    public final int hashCode() {
        return this.f105445b.hashCode() + (this.f105444a.hashCode() * 31);
    }
}
