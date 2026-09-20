package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wn21 implements zn21 {

    /* JADX INFO: renamed from: a */
    public final it91 f253057a;

    public wn21(it91 it91Var) {
        this.f253057a = it91Var;
    }

    @Override // p204p.zn21
    /* JADX INFO: renamed from: a */
    public final it91 mo88575a() {
        return this.f253057a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn21) && wj50.m88271j(this.f253057a, ((wn21) obj).f253057a);
    }

    public final int hashCode() {
        it91 it91Var = this.f253057a;
        if (it91Var == null) {
            return 0;
        }
        return it91Var.hashCode();
    }
}
