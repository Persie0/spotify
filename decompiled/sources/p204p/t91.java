package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t91 {

    /* JADX INFO: renamed from: a */
    public final int f218169a;

    /* JADX INFO: renamed from: b */
    public final c91 f218170b;

    /* JADX INFO: renamed from: c */
    public final k8j0 f218171c;

    public t91(int i, c91 c91Var, k8j0 k8j0Var) {
        this.f218169a = i;
        this.f218170b = c91Var;
        this.f218171c = k8j0Var;
    }

    /* JADX INFO: renamed from: a */
    public static t91 m80271a(t91 t91Var, int i) {
        c91 c91Var = t91Var.f218170b;
        k8j0 k8j0Var = t91Var.f218171c;
        t91Var.getClass();
        return new t91(i, c91Var, k8j0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t91)) {
            return false;
        }
        t91 t91Var = (t91) obj;
        return this.f218169a == t91Var.f218169a && wj50.m88271j(this.f218170b, t91Var.f218170b) && this.f218171c == t91Var.f218171c;
    }

    public final int hashCode() {
        return this.f218171c.hashCode() + ((this.f218170b.hashCode() + (edb.m38547C(this.f218169a) * 31)) * 31);
    }
}
