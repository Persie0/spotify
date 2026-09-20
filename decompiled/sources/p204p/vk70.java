package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final pjn0 f242159a;

    /* JADX INFO: renamed from: b */
    public final acm f242160b;

    public vk70(pjn0 pjn0Var, acm acmVar) {
        this.f242159a = pjn0Var;
        this.f242160b = acmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk70)) {
            return false;
        }
        vk70 vk70Var = (vk70) obj;
        return wj50.m88271j(this.f242159a, vk70Var.f242159a) && wj50.m88271j(this.f242160b, vk70Var.f242160b);
    }

    public final int hashCode() {
        return this.f242160b.hashCode() + (this.f242159a.hashCode() * 31);
    }
}
