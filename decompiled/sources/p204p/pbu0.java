package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pbu0 {

    /* JADX INFO: renamed from: a */
    public final String f175908a;

    /* JADX INFO: renamed from: b */
    public final t2b0 f175909b;

    public pbu0(String str, t2b0 t2b0Var) {
        this.f175908a = str;
        this.f175909b = t2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbu0)) {
            return false;
        }
        pbu0 pbu0Var = (pbu0) obj;
        return wj50.m88271j(this.f175908a, pbu0Var.f175908a) && this.f175909b.equals(pbu0Var.f175909b);
    }

    public final int hashCode() {
        return this.f175909b.hashCode() + (this.f175908a.hashCode() * 31);
    }
}
