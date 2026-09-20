package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r301 {

    /* JADX INFO: renamed from: a */
    public final Object f195398a;

    /* JADX INFO: renamed from: b */
    public final vg0 f195399b;

    /* JADX INFO: renamed from: c */
    public boolean f195400c = false;

    public r301(Object obj, vg0 vg0Var) {
        this.f195398a = obj;
        this.f195399b = vg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r301)) {
            return false;
        }
        r301 r301Var = (r301) obj;
        return this.f195398a.equals(r301Var.f195398a) && wj50.m88271j(this.f195399b, r301Var.f195399b) && this.f195400c == r301Var.f195400c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195400c) + ((this.f195399b.hashCode() + (this.f195398a.hashCode() * 31)) * 31);
    }
}
