package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e82 {

    /* JADX INFO: renamed from: a */
    public final Integer f57045a;

    /* JADX INFO: renamed from: b */
    public final b62 f57046b;

    /* JADX INFO: renamed from: c */
    public final tdu f57047c;

    public e82(Integer num, b62 b62Var, tdu tduVar) {
        this.f57045a = num;
        this.f57046b = b62Var;
        this.f57047c = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e82)) {
            return false;
        }
        e82 e82Var = (e82) obj;
        return wj50.m88271j(this.f57045a, e82Var.f57045a) && this.f57046b == e82Var.f57046b && wj50.m88271j(this.f57047c, e82Var.f57047c);
    }

    public final int hashCode() {
        Integer num = this.f57045a;
        return this.f57047c.hashCode() + ((this.f57046b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31);
    }
}
