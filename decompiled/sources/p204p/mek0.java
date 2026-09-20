package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mek0 implements nek0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f142751a;

    public mek0(lwb0 lwb0Var) {
        this.f142751a = lwb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mek0) && wj50.m88271j(this.f142751a, ((mek0) obj).f142751a);
    }

    public final int hashCode() {
        eh00 eh00Var = this.f142751a;
        if (eh00Var == null) {
            return 0;
        }
        return eh00Var.hashCode();
    }
}
