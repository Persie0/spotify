package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final r0s f130789a;

    /* JADX INFO: renamed from: b */
    public final bs81 f130790b;

    public l821(r0s r0sVar, bs81 bs81Var) {
        this.f130789a = r0sVar;
        this.f130790b = bs81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l821)) {
            return false;
        }
        l821 l821Var = (l821) obj;
        return wj50.m88271j(this.f130789a, l821Var.f130789a) && wj50.m88271j(this.f130790b, l821Var.f130790b);
    }

    public final int hashCode() {
        return this.f130790b.hashCode() + (this.f130789a.hashCode() * 31);
    }
}
