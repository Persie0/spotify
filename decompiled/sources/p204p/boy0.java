package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class boy0 {

    /* JADX INFO: renamed from: a */
    public final zny0 f29277a;

    /* JADX INFO: renamed from: b */
    public final ncz0 f29278b;

    public boy0(zny0 zny0Var, ncz0 ncz0Var) {
        this.f29277a = zny0Var;
        this.f29278b = ncz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boy0)) {
            return false;
        }
        boy0 boy0Var = (boy0) obj;
        return wj50.m88271j(this.f29277a, boy0Var.f29277a) && wj50.m88271j(this.f29278b, boy0Var.f29278b);
    }

    public final int hashCode() {
        int iHashCode = this.f29277a.hashCode() * 31;
        ncz0 ncz0Var = this.f29278b;
        return iHashCode + (ncz0Var == null ? 0 : ncz0Var.hashCode());
    }
}
