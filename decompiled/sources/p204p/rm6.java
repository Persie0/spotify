package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rm6 implements tm6 {

    /* JADX INFO: renamed from: a */
    public final mqm0 f200454a;

    public rm6(mqm0 mqm0Var) {
        this.f200454a = mqm0Var;
    }

    @Override // p204p.tm6
    /* JADX INFO: renamed from: a */
    public final mqm0 mo70274a() {
        return this.f200454a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm6) && wj50.m88271j(this.f200454a, ((rm6) obj).f200454a);
    }

    public final int hashCode() {
        mqm0 mqm0Var = this.f200454a;
        if (mqm0Var == null) {
            return 0;
        }
        return mqm0Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f200454a + ")";
    }
}
